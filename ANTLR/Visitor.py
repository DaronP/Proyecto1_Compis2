from yaplVisitor import yaplVisitor


class Visitor(yaplVisitor):
    def __init__(self) -> None:
        self.symbols = []
        self.scope = "GLOBAL"
        self.x = 0
