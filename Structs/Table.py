from typing import Any
# from Console.Events import Console, Level
from Structs.Stack import Stack


# Try to make it so that instances are only data holders
class Symbol:
    def __init__(self, symbol_type: str = "", symbol_id: str = "", scope='global', offset: int = 0, line: int = -1, column: int = -1, inherits_from: str = None):
        self.type = symbol_type
        self.id = symbol_id
        # self.size = size
        self.offset = offset
        self.scope = scope
        self.line = line
        self.column = column
        self.inherits_from = inherits_from

    def get_type(self):
        return self.type

    def get_id(self):
        return self.id

    # def get_size(self):
        # return self.size

    def get_offset(self):
        return self.offset

    def get_scope(self):
        return self.scope

    def get_line(self):
        return self.line

    def get_column(self):
        return self.column

    def get_coords(self):
        return self.line, self.column

    def __str__(self) -> str:
        return '{}\t{}\t{}\t{}\t{}\t{}'.format(self.id, self.type, self.scope, self.line, self.column, self.inherits_from)

    def copy(self):
        return Symbol(self.type, self.id, self.scope, self.offset, self.line, self.column, self.inherits_from)


class Parameter:
    def __init__(self, name: str = "", param_type: str = "", default: Any = None) -> None:
        self._name = name
        self._param_type = param_type
        self._default = default

    def get_name(self):
        return self._name

    def get_param_type(self):
        return self._param_type

    def get_default(self):
        return self._default

    def __str__(self) -> str:

        return '<{}:{}={}>'.format(self._name, self._param_type, self._default) if self._default else '<{}:{}>'.format(self._name, self._param_type)


class Method:
    def __init__(self, body: str = "", scope: str = "", name: str = "", parameters=[], return_type="void", inherited_from: str = None) -> None:
        self.body = body
        self.scope = scope
        self.name = name
        self.parameters = parameters.copy()

        self.return_type = return_type
        self.inherited_from = inherited_from

    def copy(self):
        return Method(body=self.body, scope=self.scope, name=self.name, parameters=self.parameters, return_type=self.return_type, inherited_from=self.inherited_from)

    def __str__(self) -> str:
        params = [str(param) for param in self.parameters]
        fn_str = ''
        for i in range(len(params)):
            fn_str += params[i] + ','
        fn_str = f"({fn_str})"
        if fn_str == '()':
            fn_str = 'None'
        return '{}\t| {}\t| {}\t| {}\t| {}'.format(self.name, self.return_type, self.scope, fn_str, self.inherited_from)

    def same_signature(self, as_method):

        # Check for the parameter types rather than their names
        parameter_types = [parameter.get_param_type()
                           for parameter in self.parameters]
        parameter_types_incoming = [
            parameter.get_param_type() for parameter in as_method.parameters]

        parameters_have_same_types = parameter_types == parameter_types_incoming
        methods_have_same_return_type = self.return_type == as_method.return_type
        errors = []
        if not parameters_have_same_types:
            errors.append('Mismatching types in parameters')
        if not methods_have_same_return_type:
            errors.append('Mismatching return types')
        return parameters_have_same_types and methods_have_same_return_type, errors


class Table:
    def __init__(self) -> None:
        self.table: Stack = Stack()  # Works like a stack

    def pop(self):
        return self.table.pop()

    def push(self, new_element) -> None:
        return self.table.push(new_element)

    def find(self, find_element=None):
        raise NotImplementedError()

    def exists(self, element) -> bool:
        raise NotImplementedError()


class SymbolsTable(Table):
    def __init__(self) -> None:
        super().__init__()

    def pop(self) -> Symbol:
        return super().pop()

    def push(self, new_element: Symbol) -> None:
        if not isinstance(new_element, Symbol):
            raise "Trying to push a non-symbol into the symbols table"
        return super().push(new_element)

    def find(self, find_element: Symbol = None, element_name: str = None):
        if find_element:
            for symbol in self.table.get_content():
                current_symbol: Symbol = symbol
                if current_symbol.get_id() == find_element.get_id() and current_symbol.get_scope() == find_element.get_scope():
                    return current_symbol
            return None
        elif element_name:
            for symbol in self.table.get_content():
                if symbol.get_id() == element_name:
                    return symbol

        return None

    def exists(self, symbol: Symbol) -> bool:
        return self.find(symbol.id) is not None

    def __str__(self) -> str:
        element_list = [
            str(element) + '\n' for element in self.table.get_content()]
        final_str = '\n________________\nSYMBOLS TABLE\n________________\nNAME\tTYPE\tSCOPE\tLINE\tCOLUMN\tINHERITS FROM\n'
        for element in element_list:
            final_str += element
        return final_str


class MethodsTable(Table):
    def __init__(self) -> None:
        super().__init__()

    def pop(self) -> Method:
        return super().pop()

    def push(self, new_element: Method) -> None:
        if not isinstance(new_element, Method):
            raise "Trying to push a non-method into the methods table"
        return super().push(new_element)

    def find(self, find_element: Method = None):
        if find_element is None:
            return None
        for method in self.table.get_content():
            current_method: Method = method
            if current_method.name == find_element.name and current_method.scope == find_element.scope:
                return current_method
        return None

    def exists(self, method: Method) -> bool:
        return self.find(method) is not None

    def __str__(self) -> str:
        element_list = [
            str(element) + '\n' for element in self.table.get_content()]
        # self.name, self.return_type, self.scope, fn_str, self.inherited_from
        final_str = '\n________________\nMETHODS TABLE\n________________\n|NAME\t|RETS\t|SCOPE\t|PARAMS\t|INHERITS\n____________________________________\n'
        for element in element_list:
            final_str += '|' + element
        return final_str


class Scope:
    def __init__(self) -> None:
        self.scope = Stack()

    def get_scope(self) -> str:
        return self.scope.peek()

    def push_scope(self, scope: str) -> None:
        self.scope.push(scope)

    def pop_scope(self) -> bool:
        if not self.scope.empty():
            self.scope.pop()
            return True
        return False

    def go_back_scopes(self, number_of_scopes) -> None:
        for _ in range(number_of_scopes):
            if not self.pop_scope():  # Scope is empty, stop
                return

    def clean(self) -> None:
        while not self.scope.empty():
            self.pop_scope()
