from antlr_out.COOLVisitor import COOLVisitor


class Intermediate(COOLVisitor):
    def __init__(self, types=[], methods=[], symbols=[]) -> None:
        super().__init__()
        self._types = types
        self._methods = methods
        self._symbols = symbols
        # TODO: Missing implementation here
