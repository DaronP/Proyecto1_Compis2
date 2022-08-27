import sys
from antlr4 import FileStream, CommonTokenStream
from ANTLR.Intermediate import Intermediate
from ANTLR.Visitor import Visitor
from Console.Console import Error
from antlr_out.COOLLexer import COOLLexer
from antlr_out.COOLParser import COOLParser


def main(argv: str):
    input_stream = FileStream(argv)
    lexer = COOLLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = COOLParser(stream)
    tree = parser.program()

    visitor = Visitor()
    visitor.visit(tree)

    symbols = visitor.get_symbols()
    methods = visitor.get_methods()
    types = visitor.get_types()
    errors = visitor.get_errors()

    intermediate_code = Intermediate(
        methods=methods, types=types, symbols=symbols)

    intermediate_code.visit(tree)
    print(symbols)
    print(methods)
    for err in errors:
        Error(err)
    print()


if __name__ == '__main__':
    main('example.txt')
    # main(sys.argv)
