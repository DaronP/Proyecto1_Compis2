from Console.Events import Console, Level
from Stack import Stack


# Try to make it so that instances are only data holders
class Symbol:
    @staticmethod
    def generate_new_symbol(symbol_type: str, symbol_id: str, size: int, offset: int = 0, is_param: bool = False):
        for param in [symbol_type, symbol_id, size]:
            if not param:
                raise "Invalid param"

        Console.emit(Level.INFO, f"Instanced a new Symbol of type {symbol_type}")
        return Symbol(symbol_type, symbol_id, size, offset, is_param)

    def __init__(self, symbol_type: str, symbol_id: str, size: int, offset: int, is_param: bool):
        self.type = symbol_type
        self.id = symbol_id
        self.size = size
        self.offset = offset
        self.is_param = is_param

    def get_type(self):
        return self.type

    def get_id(self):
        return self.id

    def get_size(self):
        return self.size

    def get_offset(self):
        return self.offset

    def is_parameter(self):
        return self.is_param


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
        return self.__add__(new_symbol)

    def find(self, symbol_id: str = None, find_symbol: Symbol = None) -> (Symbol or None):
        if symbol_id:
            return self.table.find(symbol_id, lambda a, b: a.id == b)
        elif find_symbol:
            return self.table.find(find_symbol, lambda a, b: a.id == b.id)
        return None
