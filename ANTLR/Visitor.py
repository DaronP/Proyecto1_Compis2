from Structs.Table import *
from antlr_out.COOLLexer import COOLLexer
from antlr_out.COOLParser import COOLParser
from antlr_out.COOLVisitor import COOLVisitor
from Console.Console import Error
visitorClass = COOLVisitor
lexerClass = COOLLexer


class Visitor(visitorClass):
    def __init__(self) -> None:
        self._id = 0
        self._symbols = SymbolsTable()
        self._scope = Scope()
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
        self._scope.push_scope('global')

        name = ctx.TYPEID()[0].getText()  # The name of the class
        if name == 'Main':
            self.mainExists = True
        inherited = None if len(ctx.TYPEID()) == 1 else ctx.TYPEID()[  # The name of the inherited class (if any)
            1].getText()

        new_symbol = Symbol(
            symbol_type='class',
            symbol_id=name,
            scope='global',
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

        self._scope.push_scope(name)
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
                if method.scope == inherited_symbol_scope:
                    new_method = method.copy()
                    new_method.scope = name
                    new_method.inherited_from = inherited
                    self._methods.push(new_method)

            for symbol in self._symbols.table.get_content():
                if symbol.scope == inherited_symbol_scope:
                    new_symbol = symbol.copy()
                    new_symbol.scope = name
                    new_symbol.inherits_from = inherited
                    print('Migrating symbol {} from {} to {}'.format(
                        new_symbol.id, inherited, name))
                    self._symbols.push(new_symbol)

        print(
            f"Found class >> {name} << {f'that inherits from >> {inherited} <<' if inherited else ''}")

        return super().visitClassDefine(ctx)

    def visitMethod(self, ctx: COOLParser.MethodContext):
        # self._scope.get_scope() -> Current Scope
        # ctx.OBJECTID().getText() -> method name
        # ctx.TYPEID().getText() -> method return type
        # ctx.expression().getText() -> method body
        # ctx.start.line -> line number
        # ctx.start.column -> column number
        # ctx.formal() -> LIST -> LIST[x].getText -> method formal parameters
        scope = self._scope.get_scope()
        id = ctx.OBJECTID().getText()
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

        # Parameters
        for i in ctx.formal():
            name, param_type = i.getText().split(':')
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
            # print(error)
            return super().visitMethod(ctx)

        # Checking if main method
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
        if scope == 'Main' and id == 'main':
            self.mainMethodExists = True

        # Checking return type

        if self.mainMethodExists is not True and scope == 'Main':
            error = 'No main method found'
            self._errors.append(error)
            Error(error)
            return super().visitMethod(ctx)

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

        print(ctx.getText())
        operand, operating = ctx.expression()
        operand = operand.getText()
        operating = operating.getText()
        current_offset = -1
        scope = self._scope.get_scope(current_offset)
        self._scope.get_scope()

        return super().visitMinus(ctx)
