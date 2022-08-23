from SymbolTable import SymTable
from dist.yaplVisitor import yaplVisitor

ERRS = []
table_scope = SymTable()
scopes = [table_scope]
table_id = 0
symbol_id = 0
offset = 0
inst_id = 0

class VisitTree(yaplVisitor):
    def __init__(self):
        print(scopes)

    def visitingTree(self, ctx):
        self.visitChildren(ctx)



