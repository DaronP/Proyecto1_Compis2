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


class SymbolsTable:
    def __init__(self) -> None:
        self.table: Stack = Stack()  # Works like a stack

    def __add__(self, new_symbol: Symbol) -> None:
        if not isinstance(new_symbol, Symbol):
            raise "Attempting to add a non-Symbol to the Symbol's Table"
        self.table.push(new_symbol)

    def pop(self) -> Symbol:
        return self.table.pop()

    def push(self, new_symbol: Symbol) -> None:
        return self.table.push(new_symbol)

    def find(self, find_symbol: Symbol = None) -> (Symbol or None):
        for symbol in self.table.getContent():
            current_symbol: Symbol = symbol
            if current_symbol.get_id() == find_symbol.get_id() and current_symbol.get_scope() == find_symbol.get_scope():
                return current_symbol
        return None

    def symbol_exists(self, symbol: Symbol) -> bool:
        return self.find(symbol.id) is not None


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
