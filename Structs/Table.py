from typing import Any
from Console.Events import Console, Level
from Structs.Stack import Stack


# Try to make it so that instances are only data holders
class Symbol:
    def __init__(self, symbol_type: str = "", symbol_id: str = "", scope='global', offset: int = 0, line: int = -1, column: int = -1):
        self.type = symbol_type
        self.id = symbol_id
        # self.size = size
        self.offset = offset
        self.scope = scope
        self.line = line
        self.column = column

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


class Method:
    def __init__(self, body: str = "", scope: str = "", name: str = "", parameters=[], return_type="void") -> None:
        self.body = body
        self.scope = scope
        self.name = name
        self.parameters = parameters.copy()
        self.return_type = return_type


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

    def find(self, find_element: Symbol = None):
        if find_element is None:
            return None
        for symbol in self.table.getContent():
            current_symbol: Symbol = symbol
            if current_symbol.get_id() == find_element.get_id() and current_symbol.get_scope() == find_element.get_scope():
                return current_symbol
        return None

    def exists(self, symbol: Symbol) -> bool:
        return self.find(symbol.id) is not None


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
        for method in self.table.getContent():
            current_method: Method = method
            if current_method.name == find_element.name and current_method.scope == find_element.scope:
                return current_method
        return None

    def exists(self, method: Method) -> bool:
        return self.find(method) is not None


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
