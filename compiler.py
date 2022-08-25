'''
Jorge Andres Perez - 16362
Andres Quan - 17652
'''



import antlr4
import sys
from antlr4 import *
from dist.typescriptLexer import typescriptLexer
from dist.typescriptParser import typescriptParser
from dist.typescriptVisitor import typescriptVisitor
from dist.typescriptListener import typescriptListener
from antlr4.tree.Trees import Trees

from dist.yaplLexer import yaplLexer
from dist.yaplParser import yaplParser
from dist.yaplVisitor import yaplVisitor
from dist.yaplListener import yaplListener

import visitor as visiter

#antlr4 -Dlanguage=Python3 .\typescript.g4 -visitor -o dist

class YAPLfPrintListener(yaplListener):
    pass

class TSfPrintListener(typescriptListener):
    pass


def Compile(program):
    text = program
    inputStream =  antlr4.InputStream(text)

    # lexer
    lexer = yaplLexer(inputStream)
    stream = CommonTokenStream(lexer)

    # parser
    parser = yaplParser(stream)
    tree = parser.program()

    # evaluator
    printer = yaplListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    visitor = visiter.VisitTree()
    visitor.visit(tree)
    errors = visiter.ERRS
    print(errors)
