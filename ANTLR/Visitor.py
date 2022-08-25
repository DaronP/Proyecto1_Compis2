from Structs.SymbolsTable import *
from antlr_out.COOLLexer import COOLLexer
from antlr_out.COOLParser import COOLParser
from antlr_out.COOLVisitor import COOLVisitor

visitorClass = COOLVisitor
lexerClass = COOLLexer


class Visitor(visitorClass):
    def __init__(self) -> None:
        self._id = 0
        self._symbols = SymbolsTable()
        self._scope = Scope()
        self._methods = []
        self._types = []
        self._x = 0
        self._errors = []
        self._type_id = 0
        self.mainExists = False

    def get_symbols(self):
        return self._symbols

    def get_methods(self):
        return self._methods

    def get_types(self):
        return self._types

    def get_errors(self):
        return self._errors

    def visitClassDefine(self, ctx: COOLParser.ClassDefineContext):
        '''
        If C inherits from P:
        - P must be defined before C
        - C has all the features of P
        - After C has been injected with all of P's attributes, P is no longer needed for C
        '''
        # Everytime we are entering a class definition, we are inside the global scope
        self._scope.clean()
        self._scope.push_scope('global')

        name = ctx.TYPEID()[0].getText()  # The name of the class
        if name == 'Main':
            self.mainExists = True
        self._scope.push_scope(name)
        inherited = None if len(ctx.TYPEID()) == 1 else ctx.TYPEID()[  # The name of the inherited class (if any)
            1].getText()

        new_symbol = Symbol(
            symbol_type='class',
            symbol_id=name,
            scope=self._scope.get_scope(),
            line=ctx.start.line,
            column=ctx.TYPEID()[0].symbol.column + 1
        )

        # Find a symbol in the scope
        pre_existing_symbol = self._symbols.find(new_symbol)
        if pre_existing_symbol is not None:
            in_line, _ = pre_existing_symbol.get_coords()
            from_line, _ = new_symbol.get_coords()
            error = 'Error: Class {} defined in line {}, was already defined in line {}'.format(
                name,
                from_line,
                in_line)
            self._errors.append(error)
            print(error)
            return super().visitClassDefine(ctx)

        self._symbols.push(new_symbol)

        print(
            f"Found class >> {name} << {f'that inherites from >> {inherited} <<' if inherited else ''}")

        return super().visitClassDefine(ctx)

    def visitMethod(self, ctx: COOLParser.MethodContext):
        # self._scope.get_scope() -> Current Scope
        # ctx.OBJECTID().getText() -> method name
        # ctx.TYPEID().getText() -> method return type
        # ctx.expression().getText() -> method body
        # ctx.start.line -> line number
        # ctx.start.column -> column number
        # ctx.formal() -> LIST -> LIST[x].getText -> method formal parameters
        return super().visitMethod(ctx)
