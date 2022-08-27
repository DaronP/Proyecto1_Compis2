from ANTLR.HelperFunctions.VisitMethod import get_type
from Structs.Table import *
from antlr_out.COOLLexer import COOLLexer
from antlr_out.COOLParser import COOLParser
from antlr_out.COOLVisitor import COOLVisitor
from Console.Console import Error
import sys
visitorClass = COOLVisitor
lexerClass = COOLLexer


class Visitor(visitorClass):
    def __init__(self) -> None:
        self._id = 0
        self._symbols = SymbolsTable()
        self._scope = ScopeStack()
        self._methods = MethodsTable()
        self._types = []
        self._x = 0
        self._errors = []
        self._type_id = 0
        self.mainExists = False
        self.mainMethodExists = False

    # region getters
    def get_symbols(self):
        return self._symbols

    def get_methods(self):
        return self._methods

    def get_types(self):
        return self._types

    def get_errors(self):
        return self._errors

    # endregion

    def visitClassDefine(self, ctx: COOLParser.ClassDefineContext):
        '''
        If C inherits from P:
        - P must be defined before C
        - C has all the features of P
        - After C has been injected with all of P's attributes, P is no longer needed for C
        '''
        # Everytime we are entering a class definition, we are inside the global scope (Classes can't be declared in any other scope)
        self._scope.clean()
        self._scope.push_scope(Scope('global', 'global'))

        name = ctx.TYPEID()[0].getText()  # The name of the class
        if name == 'Main':
            self.mainExists = True
        inherited = None if len(ctx.TYPEID()) == 1 else ctx.TYPEID()[  # The name of the inherited class (if any)
            1].getText()

        new_symbol = Symbol(
            symbol_type='class',
            symbol_id=name,
            scope=Scope('global', 'global'),
            line=ctx.start.line,
            column=ctx.TYPEID()[0].symbol.column + 1,
            inherits_from=inherited
        )

        # Find a symbol in the scope
        pre_existing_symbol = self._symbols.find(find_element=new_symbol)
        if pre_existing_symbol is not None:
            in_line, _ = pre_existing_symbol.get_coords()
            from_line, _ = new_symbol.get_coords()
            error = 'Error: Class {} defined in line {}, was already defined in line {}'.format(
                name,
                from_line,
                in_line)
            self._errors.append(error)
            Error(error)
            return super().visitClassDefine(ctx)

        self._scope.push_scope(Scope(name, 'class'))
        self._symbols.push(new_symbol)
        if inherited:
            inherited_symbol = self._symbols.find(element_name=inherited)
            if inherited_symbol is None:
                error = 'Class {} not yet defined (required by {} in line)'.format(
                    inherited, name)
                self._errors.append(error)
                Error(error)
                return super().visitClassDefine(ctx)
            inherited_symbol_scope = inherited_symbol.id
            for method in self._methods.table.get_content():
                if method.scope.name == inherited_symbol_scope:
                    new_method = method.copy()
                    new_method.scope = Scope(name, 'method')
                    new_method.inherited_from = inherited
                    self._methods.push(new_method)

            for symbol in self._symbols.table.get_content():
                if symbol.scope.name == inherited_symbol_scope:
                    new_symbol = symbol.copy()
                    new_symbol.scope = Scope(name, 'symbol')
                    new_symbol.inherits_from = inherited
                    print('Migrating symbol {} from {} to {}'.format(
                        new_symbol.id, inherited, name))
                    self._symbols.push(new_symbol)

        print(
            f"Found class >> {name} << {f'that inherits from >> {inherited} <<' if inherited else ''}")

        symbols_content = []            
        for sc in self.get_symbols().table._content:
            if sc.id == 'self' and sc.type:
                error = 'Invalid attribute declaration in {}: self attribute is reserved exclusively for SELF_TYPE class.'.format(
                    sc.scope,
                )
                self._errors.append(error)
                Error(error)
                sys.exit()
            symbols_content.append([sc.id, sc.type])

        return super().visitClassDefine(ctx)

    def verify_returns(self, sym_content=list(), id='', block='', return_type='', scope='', isVoid=False):
        if id == 'main':
            return True

        if ';' in block:
            block = block.split(';')[-2]

        if block.isalnum():
            chill = False
            for p in sym_content:
                if block in p and return_type in p or (block == 'true' and return_type == 'Bool') or (block == '1' and return_type == 'Bool') or (block == 'false' and return_type == 'Bool') or (block == '0' and return_type == 'Bool'):
                    chill = True
            if (block == 'true' and return_type != 'Bool') or (block == 'false' and return_type != 'Bool'):
                error = 'Method {} from {} is returning attr or expression of type {}. Expected {}'.format(
                    id,
                    scope,
                    'Bool',
                    return_type
                )
                return error
            if not chill and p[1] != 'class':
                error = 'Method {} from {} is returning attr or expression of type {}. Expected {}'.format(
                    id,
                    scope,
                    p[1],
                    return_type
                )
                return error
            else:
                return True

        else:
            if '+' in block:
                block_spl = block.split('+')
                chill = False
                for b in block_spl:
                    for p in sym_content:
                        if b == p[0] and return_type == p[1]:
                            chill = True
                if not chill and p[1] != 'class':
                    error = 'Method {} from {} is returning attr or expression of type {}. Expected {}'.format(
                        id,
                        scope,
                        p[1],
                        return_type
                    )
                    return error
                else:
                    return True

            if '-' in block:
                block_spl = block.split('-')
                chill = False
                for b in block_spl:
                    for p in sym_content:
                        if b == p[0] and return_type == p[1]:
                            chill = True
                if not chill and p[1] != 'class':
                    error = 'Method {} from {} is returning attr or expression of type {}. Expected {}'.format(
                        id,
                        scope,
                        p[1],
                        return_type
                    )
                    return error
                else:
                    return True

            if '*' in block:
                block_spl = block.split('*')
                chill = False
                for b in block_spl:
                    for p in sym_content:
                        if b == p[0] and return_type == p[1]:
                            chill = True
                if not chill and p[1] != 'class':
                    error = 'Method {} fro {} is returning attr or expression of type {}. Expected {}'.format(
                        id,
                        scope,
                        p[1],
                        return_type
                    )
                    return error
                else:
                    return True

            if '/' in block:
                block_spl = block.split('/')
                chill = False
                for b in block_spl:
                    for p in sym_content:
                        if b == p[0] and return_type == p[1]:
                            chill = True
                if not chill and p[1] != 'class':
                    error = 'Method {} from {} is returning attr or expression of type {}. Expected {}'.format(
                        id,
                        scope,
                        p[1],
                        return_type
                    )
                    return error
                else:
                    return True

        if isVoid:
            block = block.split(';')[-2]
            if block:
                error = 'Invalid expression. Void method {} from {} is trying to return a value.'.format(
                    id,
                    scope
                )
                return error

    def visitMethod(self, ctx: COOLParser.MethodContext):
        # self._scope.get_scope() -> Current Scope
        # ctx.OBJECTID().getText() -> method name
        # ctx.TYPEID().getText() -> method return type
        # ctx.expression().getText() -> method body
        # ctx.start.line -> line number
        # ctx.start.column -> column number
        # ctx.formal() -> LIST -> LIST[x].getText -> method formal parameters
        scope = self._scope.get_scope()
        # Check if the current scope is a method

        # region Info
        id = ctx.OBJECTID().getText()
        last_scope = self._scope.get_scope()
        # if we are entering a new function, exit the scope of the previous function and enter a new one
        if last_scope.type == 'method':
            print('Pooped scope {}'.format(last_scope.name))
            self._scope.pop_scope()
        print('Entering scope {} from scope {}'.format(id, last_scope.name))
        self._scope.push_scope(Scope(id, 'method'))
        # if self._methods.exists(method_name=id, scope=scope):
        # pass
        return_type = ctx.TYPEID().getText()
        block = ctx.expression().getText()
        in_line = ctx.start.line
        parameters: list(Parameter) = []
        isVoid = False

        # REQUIREMENTS

        # - Methods can't be repeated in the same scope
        # - Overriding methods must have the same signature

        # Checking if void
        if return_type == 'VOID':
            isVoid = True

        # endregion
        # region Parameters
        for i in ctx.formal():
            if i.getText() == 'self':
                continue
            name, param_type = i.getText().split(':')
            if name == 'self' and param_type:
                error = 'Attribute in {} from {} is trying to overwrite self type class'.format(
                    id,
                    scope
                )
                self._errors.append(error)
                Error(error)
            new_param = Parameter(name=name, param_type=param_type)
            parameters.append(new_param)

        # Checking for duplicated formal params

        newlist: list(Parameter) = []
        duplist: list(Parameter) = []
        for param in parameters:
            if param not in newlist:
                newlist.append(param)
            else:
                duplist.append(param)

        if duplist:
            self._errors.extend(['A method parameter >> {} << is repeated inside the method >> {} << from the >> {} << class,  (line {})'.format(
                dup.get_name(),
                id,
                scope,
                in_line
            ) for dup in duplist])
            return super().visitMethod(ctx)
        # endregion
        for meth in self._methods.table.get_content():
            if meth.return_type == 'SELF_TYPE':
                meth.return_type = meth.scope
        # region Duplicate checking
        new_method = Method(
            body=block,
            name=id,
            parameters=parameters,
            scope=scope,
            return_type=return_type,
        )

        previous_existing_method: Method = self._methods.find(new_method)

        # The method existed already, either by inheritance or by redefinition
        if previous_existing_method is not None:
            # It is by inheritance
            if previous_existing_method.inherited_from is not None:
                # The method is overriding a method from a parent class if they have the same signature
                # If they have the same signature, it is overriding
                signature_is_same, errors = previous_existing_method.same_signature(
                    new_method)
                if signature_is_same:
                    # If they have the same signature, allow for the implementation by modifying the existing method
                    # Name, scope, param types (but not names), return type should be the same should be the same as the previous method
                    previous_existing_method.body = new_method.body
                    previous_existing_method.parameters = new_method.parameters.copy()
                    # Make it so that the method is not "inherited" anymore
                    previous_existing_method.inherited_from = None

                    # If they do not have the same signature, then it is an error
                else:
                    for suberror in errors:
                        error = 'Method {} signature (class {}) is not the same as the parent\'s (class {}): {}'.format(
                            id, scope, previous_existing_method.inherited_from, suberror)
                        self._errors.append(error)
                        Error(error)
                    return super().visitMethod(ctx)

            # It is by redefinition
            else:
                error = 'Redefinition of method {} in "{}"\'s scope'.format(
                    id, scope)
                self._errors.append(error)
                Error(error)
        else:
            self._methods.push(new_method)
        # self._methods.append(id)

        # endregion
        # region Return type checking
        if scope == 'Main' and id == 'main':
            self.mainMethodExists = True
        # endregion
        # region Return Type Check
        symbols_content = []

        # Grab the last symbol
        print()
        for sc in self._symbols.table.get_content():
            symbols_content.append([sc.id, sc.type])

        return_checked = self.verify_returns(
            symbols_content, id, block, return_type, scope, isVoid)
        if return_checked != True:
            if return_checked == None:
                print(symbols_content, id, block, return_type, scope)
            else:
                self._errors.append(return_checked)
                Error(return_checked)
        # endregion
        # print(parameters)
        return super().visitMethod(ctx)

    def visitProperty(self, ctx: COOLParser.PropertyContext):

        name = ctx.OBJECTID().getText()
        line = ctx.start.line
        column = ctx.start.column
        scope = self._scope.get_scope()
        symbol_type = ctx.TYPEID().getText()

        new_symbol = Symbol(
            symbol_id=name,
            line=line,
            column=column,
            inherits_from=None,
            scope=scope,
            offset=0,
            symbol_type=symbol_type
        )

        existing_symbol = self._symbols.find(new_symbol)
        if existing_symbol:
            if existing_symbol.inherits_from is None:
                error = 'Redefinition of property {} in "{}"\'s scope'.format(
                    name, scope)
                self._errors.append(error)
                Error(error)
                return super().visitProperty(ctx)
            elif existing_symbol.type != new_symbol.type:
                error = 'Symbol "{}" of type "{}" in scope "{}" is already defined as type "{}" in scope "{}"'.format(
                    new_symbol.id,
                    new_symbol.type,
                    new_symbol.scope,
                    existing_symbol.type,
                    existing_symbol.inherits_from
                )
                self._errors.append(error)
                Error(error)
                return super().visitProperty(ctx)
            existing_symbol.inherits_from = None
        self._symbols.push(new_symbol)
        print(new_symbol)
        return super().visitProperty(ctx)

    def visitMinus(self, ctx: COOLParser.MinusContext):
        operand, operating = ctx.expression()
        operand = operand.getText()
        operating = operating.getText()

        reverse_scopes = self._scope.scope.get_content()[::-1]
        type_operand = get_type(operand)
        type_operating = get_type(operating)

        if type_operand == 'VAR':
            # Look up the symbol in the table
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operand, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operand, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitMinus(ctx)
            type_operand = lookup_symbol.type
        
        if type_operating == 'VAR':
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operating, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operating, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitMinus(ctx)
            type_operating = lookup_symbol.type
        
        if type_operand != type_operating:
            error = 'Operands "{}" and "{}" have different types "{}" and "{}" (Implicit Casting!)'.format(
                operand, operating, type_operand, type_operating)
            self._errors.append(error)
            Error(error)
            return super().visitMinus(ctx)
        return super().visitMinus(ctx)

    def visitAdd(self, ctx: COOLParser.AddContext):
        operand, operating = ctx.expression()
        operand = operand.getText()
        operating = operating.getText()

        reverse_scopes = self._scope.scope.get_content()[::-1]
        type_operand = get_type(operand)
        type_operating = get_type(operating)

        if type_operand == 'VAR':
            # Look up the symbol in the table
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operand, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operand, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitAdd(ctx)
            type_operand = lookup_symbol.type
        
        if type_operating == 'VAR':
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operating, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operating, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitAdd(ctx)
            type_operating = lookup_symbol.type
        
        if type_operand != type_operating:
            error = 'Operands "{}" and "{}" have different types "{}" and "{}" (Implicit Casting!)'.format(
                operand, operating, type_operand, type_operating)
            self._errors.append(error)
            Error(error)
            return super().visitAdd(ctx)
        return super().visitAdd(ctx)

    def visitMultiply(self, ctx: COOLParser.MultiplyContext):
        operand, operating = ctx.expression()
        operand = operand.getText()
        operating = operating.getText()

        reverse_scopes = self._scope.scope.get_content()[::-1]
        type_operand = get_type(operand)
        type_operating = get_type(operating)

        if type_operand == 'VAR':
            # Look up the symbol in the table
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operand, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operand, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitMultiply(ctx)
            type_operand = lookup_symbol.type
        
        if type_operating == 'VAR':
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operating, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operating, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitMultiply(ctx)
            type_operating = lookup_symbol.type
        
        if type_operand != type_operating:
            error = 'Operands "{}" and "{}" have different types "{}" and "{}" (Implicit Casting!)'.format(
                operand, operating, type_operand, type_operating)
            self._errors.append(error)
            Error(error)
            return super().visitMultiply(ctx)
        return super().visitMultiply(ctx)

    def visitDivision(self, ctx: COOLParser.DivisionContext):
        operand, operating = ctx.expression()
        operand = operand.getText()
        operating = operating.getText()

        reverse_scopes = self._scope.scope.get_content()[::-1]
        type_operand = get_type(operand)
        type_operating = get_type(operating)

        if type_operand == 'VAR':
            # Look up the symbol in the table
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operand, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operand, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitDivision(ctx)
            type_operand = lookup_symbol.type
        
        if type_operating == 'VAR':
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operating, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operating, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitDivision(ctx)
            type_operating = lookup_symbol.type
        
        if type_operand != type_operating:
            error = 'Operands "{}" and "{}" have different types "{}" and "{}" (Implicit Casting!)'.format(
                operand, operating, type_operand, type_operating)
            self._errors.append(error)
            Error(error)
            return super().visitDivision(ctx)
        return super().visitDivision(ctx)

    def visitAssignment(self, ctx: COOLParser.AssignmentContext):
        operand = ctx.OBJECTID().getText()
        operating = ctx.expression().getText()

        reverse_scopes = self._scope.scope.get_content()[::-1]
        type_operand = get_type(operand)
        type_operating = get_type(operating)

        if type_operand == 'VAR':
            # Look up the symbol in the table
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operand, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operand, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitAssignment(ctx)
            type_operand = lookup_symbol.type
        
        if type_operating == 'VAR':
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=operating, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    operating, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitAssignment(ctx)
            type_operating = lookup_symbol.type
        
        if type_operand != type_operating:
            if type_operand == 'INT' and type_operating == 'BOOL':
                error = 'Implicit casting of BOOL to INT'
                self._errors.append(error)
                Error(error)
            elif type_operand == 'BOOL' and type_operating == 'INT':
                error = 'Implicit casting of INT to BOOL'
                self._errors.append(error)
                Error(error)
            else:
                error = 'Operands "{}" and "{}" have different types "{}" and "{}" ()'.format(
                operand, operating, type_operand, type_operating)
                self._errors.append(error)
                Error(error)
            return super().visitAssignment(ctx)
        return super().visitAssignment(ctx)


    def visitIf(self, ctx: COOLParser.IfContext):
        condition = ctx.expression()[0].getText()
        if condition not in ['true', 'false']:
            # Try to look up the symbol in the table
            reverse_scopes = self._scope.scope.get_content()[::-1]
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=condition, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    condition, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitIf(ctx)
            if lookup_symbol.type != 'Bool':
                error = 'Condition "{}" has type "{}" instead of "Bool"'.format(
                    condition, lookup_symbol.type)
                self._errors.append(error)
                Error(error)
                return super().visitIf(ctx) 


        

        return super().visitIf(ctx)
        
    def visitWhile(self, ctx: COOLParser.WhileContext):
        condition = ctx.expression()[0].getText()
        if condition not in ['true', 'false']:
            # Try to look up the symbol in the table
            reverse_scopes = self._scope.scope.get_content()[::-1]
            found = False
            for scope in reverse_scopes:
                lookup_symbol = self._symbols.find(Symbol(symbol_id=condition, scope=scope))
                if lookup_symbol:
                    found = True
                    break
            if not found:
                error = 'Symbol "{}" not found in scope "{}"'.format(
                    condition, self._scope.get_scope())
                self._errors.append(error)
                Error(error)
                return super().visitWhile(ctx)
            if lookup_symbol.type != 'Bool':
                error = 'Condition "{}" has type "{}" instead of "Bool"'.format(
                    condition, lookup_symbol.type)
                self._errors.append(error)
                Error(error)
                return super().visitWhile(ctx)
        return super().visitWhile(ctx)

    def visitMethodCall(self, ctx: COOLParser.MethodCallContext):
        print(ctx.expression())

    
    def visitOwnMethodCall(self, ctx: COOLParser.OwnMethodCallContext):
        reverse_methods = self._methods.table.get_content()[::-1]
        body = reverse_methods[0].body.replace('(', '-')
        body = body.replace(')', '')
        body = body.split('-')
        try:
            body[-1] = body[-1].split(',')
        except:
            pass

        for meth in reverse_methods:
            if meth.name == body[0]:
                if len(meth.parameters) == len(body[1]):
                    print('AWEBO')
                else:
                    error = 'Method {} from {} is missing {} required argument. Expecting {} arguments.'.format(
                        body[0],
                        reverse_methods[0].name,
                        (len(meth.parameters) - len(body[1])),
                        len(meth.parameters)
                    )
                    self._errors.append(error)
            else:
                error = 'Method {} from {} is beign called before decalration'.format(
                        body[0],
                        reverse_methods[0].name
                    )
                self._errors.append(error)
        pass
