from yaplLexer import yaplLexer
from yaplParser import yaplParser
from yaplListener import yaplListener

from antlr4 import FileStream, CommonTokenStream


class CompilerComponents:
    def __init__(self, input_stream: str = "", file_stream: FileStream = None) -> None:
        input_stream: FileStream = CompilerComponents.get_input_stream(
            input_stream=input_stream, file_stream=file_stream)
        lexer: yaplLexer = CompilerComponents.get_lexer(input_stream)
        stream: CommonTokenStream = CompilerComponents.get_stream(lexer)
        parser: yaplParser = CompilerComponents.get_parser(stream)

        self.InputStream = input_stream
        self.Lexer = lexer
        self.Stream = stream
        self.Parser = parser

    @staticmethod
    def get_input_stream(input_stream: str = "", file_stream: FileStream = None) -> FileStream:
        return file_stream if file_stream else FileStream(input_stream)

    @staticmethod
    def get_lexer(input_stream: FileStream) -> yaplLexer:
        return yaplLexer(input_stream)

    @staticmethod
    def get_stream(lexer: yaplLexer) -> CommonTokenStream:
        return CommonTokenStream(lexer)

    @staticmethod
    def get_parser(stream: CommonTokenStream) -> yaplParser:
        return yaplParser(stream)
