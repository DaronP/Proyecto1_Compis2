# Generated from COOL.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,47,216,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,1,
        0,1,0,1,1,1,1,1,1,1,1,1,1,3,1,21,8,1,1,2,1,2,1,2,1,2,3,2,27,8,2,
        1,2,1,2,1,2,1,2,5,2,33,8,2,10,2,12,2,36,9,2,1,2,1,2,1,3,1,3,1,3,
        1,3,1,3,5,3,45,8,3,10,3,12,3,48,9,3,3,3,50,8,3,1,3,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,64,8,3,3,3,66,8,3,1,4,1,4,1,4,
        1,4,1,5,1,5,1,5,1,5,1,5,1,5,5,5,78,8,5,10,5,12,5,81,9,5,3,5,83,8,
        5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
        5,1,5,1,5,1,5,4,5,104,8,5,11,5,12,5,105,1,5,1,5,1,5,1,5,1,5,1,5,
        1,5,1,5,3,5,116,8,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,124,8,5,5,5,126,
        8,5,10,5,12,5,129,9,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
        5,1,5,4,5,143,8,5,11,5,12,5,144,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,169,
        8,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,195,8,5,1,5,1,5,1,5,1,5,
        1,5,1,5,5,5,203,8,5,10,5,12,5,206,9,5,3,5,208,8,5,1,5,5,5,211,8,
        5,10,5,12,5,214,9,5,1,5,0,1,10,6,0,2,4,6,8,10,0,0,250,0,12,1,0,0,
        0,2,20,1,0,0,0,4,22,1,0,0,0,6,65,1,0,0,0,8,67,1,0,0,0,10,168,1,0,
        0,0,12,13,3,2,1,0,13,14,5,0,0,1,14,1,1,0,0,0,15,16,3,4,2,0,16,17,
        5,1,0,0,17,18,3,2,1,0,18,21,1,0,0,0,19,21,5,0,0,1,20,15,1,0,0,0,
        20,19,1,0,0,0,21,3,1,0,0,0,22,23,5,10,0,0,23,26,5,31,0,0,24,25,5,
        16,0,0,25,27,5,31,0,0,26,24,1,0,0,0,26,27,1,0,0,0,27,28,1,0,0,0,
        28,34,5,2,0,0,29,30,3,6,3,0,30,31,5,1,0,0,31,33,1,0,0,0,32,29,1,
        0,0,0,33,36,1,0,0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,37,1,0,0,0,36,
        34,1,0,0,0,37,38,5,3,0,0,38,5,1,0,0,0,39,40,5,32,0,0,40,49,5,4,0,
        0,41,46,3,8,4,0,42,43,5,5,0,0,43,45,3,8,4,0,44,42,1,0,0,0,45,48,
        1,0,0,0,46,44,1,0,0,0,46,47,1,0,0,0,47,50,1,0,0,0,48,46,1,0,0,0,
        49,41,1,0,0,0,49,50,1,0,0,0,50,51,1,0,0,0,51,52,5,6,0,0,52,53,5,
        7,0,0,53,54,5,31,0,0,54,55,5,2,0,0,55,56,3,10,5,0,56,57,5,3,0,0,
        57,66,1,0,0,0,58,59,5,32,0,0,59,60,5,7,0,0,60,63,5,31,0,0,61,62,
        5,33,0,0,62,64,3,10,5,0,63,61,1,0,0,0,63,64,1,0,0,0,64,66,1,0,0,
        0,65,39,1,0,0,0,65,58,1,0,0,0,66,7,1,0,0,0,67,68,5,32,0,0,68,69,
        5,7,0,0,69,70,5,31,0,0,70,9,1,0,0,0,71,72,6,5,-1,0,72,73,5,32,0,
        0,73,82,5,4,0,0,74,79,3,10,5,0,75,76,5,5,0,0,76,78,3,10,5,0,77,75,
        1,0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,79,80,1,0,0,0,80,83,1,0,0,0,
        81,79,1,0,0,0,82,74,1,0,0,0,82,83,1,0,0,0,83,84,1,0,0,0,84,169,5,
        6,0,0,85,86,5,14,0,0,86,87,3,10,5,0,87,88,5,21,0,0,88,89,3,10,5,
        0,89,90,5,11,0,0,90,91,3,10,5,0,91,92,5,13,0,0,92,169,1,0,0,0,93,
        94,5,22,0,0,94,95,3,10,5,0,95,96,5,19,0,0,96,97,3,10,5,0,97,98,5,
        20,0,0,98,169,1,0,0,0,99,103,5,2,0,0,100,101,3,10,5,0,101,102,5,
        1,0,0,102,104,1,0,0,0,103,100,1,0,0,0,104,105,1,0,0,0,105,103,1,
        0,0,0,105,106,1,0,0,0,106,107,1,0,0,0,107,108,5,3,0,0,108,169,1,
        0,0,0,109,110,5,18,0,0,110,111,5,32,0,0,111,112,5,7,0,0,112,115,
        5,31,0,0,113,114,5,33,0,0,114,116,3,10,5,0,115,113,1,0,0,0,115,116,
        1,0,0,0,116,127,1,0,0,0,117,118,5,5,0,0,118,119,5,32,0,0,119,120,
        5,7,0,0,120,123,5,31,0,0,121,122,5,33,0,0,122,124,3,10,5,0,123,121,
        1,0,0,0,123,124,1,0,0,0,124,126,1,0,0,0,125,117,1,0,0,0,126,129,
        1,0,0,0,127,125,1,0,0,0,127,128,1,0,0,0,128,130,1,0,0,0,129,127,
        1,0,0,0,130,131,5,15,0,0,131,169,3,10,5,20,132,133,5,23,0,0,133,
        134,3,10,5,0,134,142,5,26,0,0,135,136,5,32,0,0,136,137,5,7,0,0,137,
        138,5,31,0,0,138,139,5,34,0,0,139,140,3,10,5,0,140,141,5,1,0,0,141,
        143,1,0,0,0,142,135,1,0,0,0,143,144,1,0,0,0,144,142,1,0,0,0,144,
        145,1,0,0,0,145,146,1,0,0,0,146,147,5,24,0,0,147,169,1,0,0,0,148,
        149,5,25,0,0,149,169,5,31,0,0,150,151,5,42,0,0,151,169,3,10,5,17,
        152,153,5,17,0,0,153,169,3,10,5,16,154,155,5,27,0,0,155,169,3,10,
        5,8,156,157,5,4,0,0,157,158,3,10,5,0,158,159,5,6,0,0,159,169,1,0,
        0,0,160,169,5,32,0,0,161,169,5,30,0,0,162,169,5,29,0,0,163,169,5,
        28,0,0,164,169,5,12,0,0,165,166,5,32,0,0,166,167,5,33,0,0,167,169,
        3,10,5,1,168,71,1,0,0,0,168,85,1,0,0,0,168,93,1,0,0,0,168,99,1,0,
        0,0,168,109,1,0,0,0,168,132,1,0,0,0,168,148,1,0,0,0,168,150,1,0,
        0,0,168,152,1,0,0,0,168,154,1,0,0,0,168,156,1,0,0,0,168,160,1,0,
        0,0,168,161,1,0,0,0,168,162,1,0,0,0,168,163,1,0,0,0,168,164,1,0,
        0,0,168,165,1,0,0,0,169,212,1,0,0,0,170,171,10,15,0,0,171,172,5,
        37,0,0,172,211,3,10,5,16,173,174,10,14,0,0,174,175,5,38,0,0,175,
        211,3,10,5,15,176,177,10,13,0,0,177,178,5,35,0,0,178,211,3,10,5,
        14,179,180,10,12,0,0,180,181,5,36,0,0,181,211,3,10,5,13,182,183,
        10,11,0,0,183,184,5,39,0,0,184,211,3,10,5,12,185,186,10,10,0,0,186,
        187,5,40,0,0,187,211,3,10,5,11,188,189,10,9,0,0,189,190,5,41,0,0,
        190,211,3,10,5,10,191,194,10,25,0,0,192,193,5,8,0,0,193,195,5,31,
        0,0,194,192,1,0,0,0,194,195,1,0,0,0,195,196,1,0,0,0,196,197,5,9,
        0,0,197,198,5,32,0,0,198,207,5,4,0,0,199,204,3,10,5,0,200,201,5,
        5,0,0,201,203,3,10,5,0,202,200,1,0,0,0,203,206,1,0,0,0,204,202,1,
        0,0,0,204,205,1,0,0,0,205,208,1,0,0,0,206,204,1,0,0,0,207,199,1,
        0,0,0,207,208,1,0,0,0,208,209,1,0,0,0,209,211,5,6,0,0,210,170,1,
        0,0,0,210,173,1,0,0,0,210,176,1,0,0,0,210,179,1,0,0,0,210,182,1,
        0,0,0,210,185,1,0,0,0,210,188,1,0,0,0,210,191,1,0,0,0,211,214,1,
        0,0,0,212,210,1,0,0,0,212,213,1,0,0,0,213,11,1,0,0,0,214,212,1,0,
        0,0,20,20,26,34,46,49,63,65,79,82,105,115,123,127,144,168,194,204,
        207,210,212
    ]

class COOLParser ( Parser ):

    grammarFileName = "COOL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'{'", "'}'", "'('", "','", "')'", 
                     "':'", "'@'", "'.'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'<-'", "'=>'", "'+'", "'-'", "'*'", "'/'", "'<'", 
                     "'<='", "'='", "'~'", "'(*'", "'*)'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "CLASS", "ELSE", "FALSE", 
                      "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", 
                      "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", 
                      "NOT", "TRUE", "STRING", "INT", "TYPEID", "OBJECTID", 
                      "ASSIGNMENT", "CASE_ARROW", "ADD", "MINUS", "MULTIPLY", 
                      "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", "INTEGER_NEGATIVE", 
                      "OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", 
                      "WHITESPACE" ]

    RULE_program = 0
    RULE_programBlocks = 1
    RULE_classDefine = 2
    RULE_feature = 3
    RULE_formal = 4
    RULE_expression = 5

    ruleNames =  [ "program", "programBlocks", "classDefine", "feature", 
                   "formal", "expression" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    CLASS=10
    ELSE=11
    FALSE=12
    FI=13
    IF=14
    IN=15
    INHERITS=16
    ISVOID=17
    LET=18
    LOOP=19
    POOL=20
    THEN=21
    WHILE=22
    CASE=23
    ESAC=24
    NEW=25
    OF=26
    NOT=27
    TRUE=28
    STRING=29
    INT=30
    TYPEID=31
    OBJECTID=32
    ASSIGNMENT=33
    CASE_ARROW=34
    ADD=35
    MINUS=36
    MULTIPLY=37
    DIVISION=38
    LESS_THAN=39
    LESS_EQUAL=40
    EQUAL=41
    INTEGER_NEGATIVE=42
    OPEN_COMMENT=43
    CLOSE_COMMENT=44
    COMMENT=45
    ONE_LINE_COMMENT=46
    WHITESPACE=47

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def programBlocks(self):
            return self.getTypedRuleContext(COOLParser.ProgramBlocksContext,0)


        def EOF(self):
            return self.getToken(COOLParser.EOF, 0)

        def getRuleIndex(self):
            return COOLParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = COOLParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.programBlocks()
            self.state = 13
            self.match(COOLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramBlocksContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return COOLParser.RULE_programBlocks

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ClassesContext(ProgramBlocksContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ProgramBlocksContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def classDefine(self):
            return self.getTypedRuleContext(COOLParser.ClassDefineContext,0)

        def programBlocks(self):
            return self.getTypedRuleContext(COOLParser.ProgramBlocksContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClasses" ):
                listener.enterClasses(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClasses" ):
                listener.exitClasses(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClasses" ):
                return visitor.visitClasses(self)
            else:
                return visitor.visitChildren(self)


    class EofContext(ProgramBlocksContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ProgramBlocksContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def EOF(self):
            return self.getToken(COOLParser.EOF, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEof" ):
                listener.enterEof(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEof" ):
                listener.exitEof(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEof" ):
                return visitor.visitEof(self)
            else:
                return visitor.visitChildren(self)



    def programBlocks(self):

        localctx = COOLParser.ProgramBlocksContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_programBlocks)
        try:
            self.state = 20
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [COOLParser.CLASS]:
                localctx = COOLParser.ClassesContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 15
                self.classDefine()
                self.state = 16
                self.match(COOLParser.T__0)
                self.state = 17
                self.programBlocks()
                pass
            elif token in [COOLParser.EOF]:
                localctx = COOLParser.EofContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 19
                self.match(COOLParser.EOF)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassDefineContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(COOLParser.CLASS, 0)

        def TYPEID(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.TYPEID)
            else:
                return self.getToken(COOLParser.TYPEID, i)

        def INHERITS(self):
            return self.getToken(COOLParser.INHERITS, 0)

        def feature(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.FeatureContext)
            else:
                return self.getTypedRuleContext(COOLParser.FeatureContext,i)


        def getRuleIndex(self):
            return COOLParser.RULE_classDefine

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassDefine" ):
                listener.enterClassDefine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassDefine" ):
                listener.exitClassDefine(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClassDefine" ):
                return visitor.visitClassDefine(self)
            else:
                return visitor.visitChildren(self)




    def classDefine(self):

        localctx = COOLParser.ClassDefineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_classDefine)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self.match(COOLParser.CLASS)
            self.state = 23
            self.match(COOLParser.TYPEID)
            self.state = 26
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==COOLParser.INHERITS:
                self.state = 24
                self.match(COOLParser.INHERITS)
                self.state = 25
                self.match(COOLParser.TYPEID)


            self.state = 28
            self.match(COOLParser.T__1)
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==COOLParser.OBJECTID:
                self.state = 29
                self.feature()
                self.state = 30
                self.match(COOLParser.T__0)
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 37
            self.match(COOLParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FeatureContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return COOLParser.RULE_feature

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class MethodContext(FeatureContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.FeatureContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)
        def TYPEID(self):
            return self.getToken(COOLParser.TYPEID, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)

        def formal(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.FormalContext)
            else:
                return self.getTypedRuleContext(COOLParser.FormalContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod" ):
                listener.enterMethod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod" ):
                listener.exitMethod(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod" ):
                return visitor.visitMethod(self)
            else:
                return visitor.visitChildren(self)


    class PropertyContext(FeatureContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.FeatureContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)
        def TYPEID(self):
            return self.getToken(COOLParser.TYPEID, 0)
        def ASSIGNMENT(self):
            return self.getToken(COOLParser.ASSIGNMENT, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProperty" ):
                listener.enterProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProperty" ):
                listener.exitProperty(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProperty" ):
                return visitor.visitProperty(self)
            else:
                return visitor.visitChildren(self)



    def feature(self):

        localctx = COOLParser.FeatureContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_feature)
        self._la = 0 # Token type
        try:
            self.state = 65
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                localctx = COOLParser.MethodContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 39
                self.match(COOLParser.OBJECTID)
                self.state = 40
                self.match(COOLParser.T__3)
                self.state = 49
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==COOLParser.OBJECTID:
                    self.state = 41
                    self.formal()
                    self.state = 46
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==COOLParser.T__4:
                        self.state = 42
                        self.match(COOLParser.T__4)
                        self.state = 43
                        self.formal()
                        self.state = 48
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)



                self.state = 51
                self.match(COOLParser.T__5)
                self.state = 52
                self.match(COOLParser.T__6)
                self.state = 53
                self.match(COOLParser.TYPEID)
                self.state = 54
                self.match(COOLParser.T__1)
                self.state = 55
                self.expression(0)
                self.state = 56
                self.match(COOLParser.T__2)
                pass

            elif la_ == 2:
                localctx = COOLParser.PropertyContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 58
                self.match(COOLParser.OBJECTID)
                self.state = 59
                self.match(COOLParser.T__6)
                self.state = 60
                self.match(COOLParser.TYPEID)
                self.state = 63
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==COOLParser.ASSIGNMENT:
                    self.state = 61
                    self.match(COOLParser.ASSIGNMENT)
                    self.state = 62
                    self.expression(0)


                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FormalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)

        def TYPEID(self):
            return self.getToken(COOLParser.TYPEID, 0)

        def getRuleIndex(self):
            return COOLParser.RULE_formal

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFormal" ):
                listener.enterFormal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFormal" ):
                listener.exitFormal(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFormal" ):
                return visitor.visitFormal(self)
            else:
                return visitor.visitChildren(self)




    def formal(self):

        localctx = COOLParser.FormalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_formal)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(COOLParser.OBJECTID)
            self.state = 68
            self.match(COOLParser.T__6)
            self.state = 69
            self.match(COOLParser.TYPEID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return COOLParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class LetInContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LET(self):
            return self.getToken(COOLParser.LET, 0)
        def OBJECTID(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.OBJECTID)
            else:
                return self.getToken(COOLParser.OBJECTID, i)
        def TYPEID(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.TYPEID)
            else:
                return self.getToken(COOLParser.TYPEID, i)
        def IN(self):
            return self.getToken(COOLParser.IN, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def ASSIGNMENT(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.ASSIGNMENT)
            else:
                return self.getToken(COOLParser.ASSIGNMENT, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLetIn" ):
                listener.enterLetIn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLetIn" ):
                listener.exitLetIn(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLetIn" ):
                return visitor.visitLetIn(self)
            else:
                return visitor.visitChildren(self)


    class MinusContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def MINUS(self):
            return self.getToken(COOLParser.MINUS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMinus" ):
                listener.enterMinus(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMinus" ):
                listener.exitMinus(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMinus" ):
                return visitor.visitMinus(self)
            else:
                return visitor.visitChildren(self)


    class StringContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(COOLParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterString" ):
                listener.enterString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitString" ):
                listener.exitString(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitString" ):
                return visitor.visitString(self)
            else:
                return visitor.visitChildren(self)


    class IsvoidContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ISVOID(self):
            return self.getToken(COOLParser.ISVOID, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIsvoid" ):
                listener.enterIsvoid(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIsvoid" ):
                listener.exitIsvoid(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIsvoid" ):
                return visitor.visitIsvoid(self)
            else:
                return visitor.visitChildren(self)


    class WhileContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WHILE(self):
            return self.getToken(COOLParser.WHILE, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def LOOP(self):
            return self.getToken(COOLParser.LOOP, 0)
        def POOL(self):
            return self.getToken(COOLParser.POOL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile" ):
                listener.enterWhile(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile" ):
                listener.exitWhile(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile" ):
                return visitor.visitWhile(self)
            else:
                return visitor.visitChildren(self)


    class DivisionContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def DIVISION(self):
            return self.getToken(COOLParser.DIVISION, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDivision" ):
                listener.enterDivision(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDivision" ):
                listener.exitDivision(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDivision" ):
                return visitor.visitDivision(self)
            else:
                return visitor.visitChildren(self)


    class NegativeContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INTEGER_NEGATIVE(self):
            return self.getToken(COOLParser.INTEGER_NEGATIVE, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNegative" ):
                listener.enterNegative(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNegative" ):
                listener.exitNegative(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNegative" ):
                return visitor.visitNegative(self)
            else:
                return visitor.visitChildren(self)


    class BoolNotContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NOT(self):
            return self.getToken(COOLParser.NOT, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolNot" ):
                listener.enterBoolNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolNot" ):
                listener.exitBoolNot(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBoolNot" ):
                return visitor.visitBoolNot(self)
            else:
                return visitor.visitChildren(self)


    class LessThanContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def LESS_THAN(self):
            return self.getToken(COOLParser.LESS_THAN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLessThan" ):
                listener.enterLessThan(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLessThan" ):
                listener.exitLessThan(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLessThan" ):
                return visitor.visitLessThan(self)
            else:
                return visitor.visitChildren(self)


    class BlockContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)


    class IdContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterId" ):
                listener.enterId(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitId" ):
                listener.exitId(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitId" ):
                return visitor.visitId(self)
            else:
                return visitor.visitChildren(self)


    class MultiplyContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def MULTIPLY(self):
            return self.getToken(COOLParser.MULTIPLY, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiply" ):
                listener.enterMultiply(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiply" ):
                listener.exitMultiply(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultiply" ):
                return visitor.visitMultiply(self)
            else:
                return visitor.visitChildren(self)


    class IfContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IF(self):
            return self.getToken(COOLParser.IF, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def THEN(self):
            return self.getToken(COOLParser.THEN, 0)
        def ELSE(self):
            return self.getToken(COOLParser.ELSE, 0)
        def FI(self):
            return self.getToken(COOLParser.FI, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf" ):
                listener.enterIf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf" ):
                listener.exitIf(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf" ):
                return visitor.visitIf(self)
            else:
                return visitor.visitChildren(self)


    class CaseContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def CASE(self):
            return self.getToken(COOLParser.CASE, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def OF(self):
            return self.getToken(COOLParser.OF, 0)
        def ESAC(self):
            return self.getToken(COOLParser.ESAC, 0)
        def OBJECTID(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.OBJECTID)
            else:
                return self.getToken(COOLParser.OBJECTID, i)
        def TYPEID(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.TYPEID)
            else:
                return self.getToken(COOLParser.TYPEID, i)
        def CASE_ARROW(self, i:int=None):
            if i is None:
                return self.getTokens(COOLParser.CASE_ARROW)
            else:
                return self.getToken(COOLParser.CASE_ARROW, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCase" ):
                listener.enterCase(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCase" ):
                listener.exitCase(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCase" ):
                return visitor.visitCase(self)
            else:
                return visitor.visitChildren(self)


    class OwnMethodCallContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)
        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOwnMethodCall" ):
                listener.enterOwnMethodCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOwnMethodCall" ):
                listener.exitOwnMethodCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOwnMethodCall" ):
                return visitor.visitOwnMethodCall(self)
            else:
                return visitor.visitChildren(self)


    class AddContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def ADD(self):
            return self.getToken(COOLParser.ADD, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd" ):
                listener.enterAdd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd" ):
                listener.exitAdd(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdd" ):
                return visitor.visitAdd(self)
            else:
                return visitor.visitChildren(self)


    class NewContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NEW(self):
            return self.getToken(COOLParser.NEW, 0)
        def TYPEID(self):
            return self.getToken(COOLParser.TYPEID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNew" ):
                listener.enterNew(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNew" ):
                listener.exitNew(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNew" ):
                return visitor.visitNew(self)
            else:
                return visitor.visitChildren(self)


    class ParenthesesContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParentheses" ):
                listener.enterParentheses(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParentheses" ):
                listener.exitParentheses(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParentheses" ):
                return visitor.visitParentheses(self)
            else:
                return visitor.visitChildren(self)


    class AssignmentContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)
        def ASSIGNMENT(self):
            return self.getToken(COOLParser.ASSIGNMENT, 0)
        def expression(self):
            return self.getTypedRuleContext(COOLParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)


    class FalseContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FALSE(self):
            return self.getToken(COOLParser.FALSE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFalse" ):
                listener.enterFalse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFalse" ):
                listener.exitFalse(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFalse" ):
                return visitor.visitFalse(self)
            else:
                return visitor.visitChildren(self)


    class IntContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(COOLParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInt" ):
                listener.enterInt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInt" ):
                listener.exitInt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInt" ):
                return visitor.visitInt(self)
            else:
                return visitor.visitChildren(self)


    class EqualContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def EQUAL(self):
            return self.getToken(COOLParser.EQUAL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEqual" ):
                listener.enterEqual(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEqual" ):
                listener.exitEqual(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEqual" ):
                return visitor.visitEqual(self)
            else:
                return visitor.visitChildren(self)


    class TrueContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def TRUE(self):
            return self.getToken(COOLParser.TRUE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTrue" ):
                listener.enterTrue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTrue" ):
                listener.exitTrue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTrue" ):
                return visitor.visitTrue(self)
            else:
                return visitor.visitChildren(self)


    class LessEqualContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def LESS_EQUAL(self):
            return self.getToken(COOLParser.LESS_EQUAL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLessEqual" ):
                listener.enterLessEqual(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLessEqual" ):
                listener.exitLessEqual(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLessEqual" ):
                return visitor.visitLessEqual(self)
            else:
                return visitor.visitChildren(self)


    class MethodCallContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a COOLParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(COOLParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(COOLParser.ExpressionContext,i)

        def OBJECTID(self):
            return self.getToken(COOLParser.OBJECTID, 0)
        def TYPEID(self):
            return self.getToken(COOLParser.TYPEID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodCall" ):
                listener.enterMethodCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodCall" ):
                listener.exitMethodCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodCall" ):
                return visitor.visitMethodCall(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = COOLParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 10
        self.enterRecursionRule(localctx, 10, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 168
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                localctx = COOLParser.OwnMethodCallContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 72
                self.match(COOLParser.OBJECTID)
                self.state = 73
                self.match(COOLParser.T__3)
                self.state = 82
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << COOLParser.T__1) | (1 << COOLParser.T__3) | (1 << COOLParser.FALSE) | (1 << COOLParser.IF) | (1 << COOLParser.ISVOID) | (1 << COOLParser.LET) | (1 << COOLParser.WHILE) | (1 << COOLParser.CASE) | (1 << COOLParser.NEW) | (1 << COOLParser.NOT) | (1 << COOLParser.TRUE) | (1 << COOLParser.STRING) | (1 << COOLParser.INT) | (1 << COOLParser.OBJECTID) | (1 << COOLParser.INTEGER_NEGATIVE))) != 0):
                    self.state = 74
                    self.expression(0)
                    self.state = 79
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    while _la==COOLParser.T__4:
                        self.state = 75
                        self.match(COOLParser.T__4)
                        self.state = 76
                        self.expression(0)
                        self.state = 81
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)



                self.state = 84
                self.match(COOLParser.T__5)
                pass

            elif la_ == 2:
                localctx = COOLParser.IfContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 85
                self.match(COOLParser.IF)
                self.state = 86
                self.expression(0)
                self.state = 87
                self.match(COOLParser.THEN)
                self.state = 88
                self.expression(0)
                self.state = 89
                self.match(COOLParser.ELSE)
                self.state = 90
                self.expression(0)
                self.state = 91
                self.match(COOLParser.FI)
                pass

            elif la_ == 3:
                localctx = COOLParser.WhileContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 93
                self.match(COOLParser.WHILE)
                self.state = 94
                self.expression(0)
                self.state = 95
                self.match(COOLParser.LOOP)
                self.state = 96
                self.expression(0)
                self.state = 97
                self.match(COOLParser.POOL)
                pass

            elif la_ == 4:
                localctx = COOLParser.BlockContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 99
                self.match(COOLParser.T__1)
                self.state = 103 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 100
                    self.expression(0)
                    self.state = 101
                    self.match(COOLParser.T__0)
                    self.state = 105 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << COOLParser.T__1) | (1 << COOLParser.T__3) | (1 << COOLParser.FALSE) | (1 << COOLParser.IF) | (1 << COOLParser.ISVOID) | (1 << COOLParser.LET) | (1 << COOLParser.WHILE) | (1 << COOLParser.CASE) | (1 << COOLParser.NEW) | (1 << COOLParser.NOT) | (1 << COOLParser.TRUE) | (1 << COOLParser.STRING) | (1 << COOLParser.INT) | (1 << COOLParser.OBJECTID) | (1 << COOLParser.INTEGER_NEGATIVE))) != 0)):
                        break

                self.state = 107
                self.match(COOLParser.T__2)
                pass

            elif la_ == 5:
                localctx = COOLParser.LetInContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 109
                self.match(COOLParser.LET)
                self.state = 110
                self.match(COOLParser.OBJECTID)
                self.state = 111
                self.match(COOLParser.T__6)
                self.state = 112
                self.match(COOLParser.TYPEID)
                self.state = 115
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==COOLParser.ASSIGNMENT:
                    self.state = 113
                    self.match(COOLParser.ASSIGNMENT)
                    self.state = 114
                    self.expression(0)


                self.state = 127
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==COOLParser.T__4:
                    self.state = 117
                    self.match(COOLParser.T__4)
                    self.state = 118
                    self.match(COOLParser.OBJECTID)
                    self.state = 119
                    self.match(COOLParser.T__6)
                    self.state = 120
                    self.match(COOLParser.TYPEID)
                    self.state = 123
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==COOLParser.ASSIGNMENT:
                        self.state = 121
                        self.match(COOLParser.ASSIGNMENT)
                        self.state = 122
                        self.expression(0)


                    self.state = 129
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 130
                self.match(COOLParser.IN)
                self.state = 131
                self.expression(20)
                pass

            elif la_ == 6:
                localctx = COOLParser.CaseContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 132
                self.match(COOLParser.CASE)
                self.state = 133
                self.expression(0)
                self.state = 134
                self.match(COOLParser.OF)
                self.state = 142 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 135
                    self.match(COOLParser.OBJECTID)
                    self.state = 136
                    self.match(COOLParser.T__6)
                    self.state = 137
                    self.match(COOLParser.TYPEID)
                    self.state = 138
                    self.match(COOLParser.CASE_ARROW)
                    self.state = 139
                    self.expression(0)
                    self.state = 140
                    self.match(COOLParser.T__0)
                    self.state = 144 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==COOLParser.OBJECTID):
                        break

                self.state = 146
                self.match(COOLParser.ESAC)
                pass

            elif la_ == 7:
                localctx = COOLParser.NewContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 148
                self.match(COOLParser.NEW)
                self.state = 149
                self.match(COOLParser.TYPEID)
                pass

            elif la_ == 8:
                localctx = COOLParser.NegativeContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 150
                self.match(COOLParser.INTEGER_NEGATIVE)
                self.state = 151
                self.expression(17)
                pass

            elif la_ == 9:
                localctx = COOLParser.IsvoidContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 152
                self.match(COOLParser.ISVOID)
                self.state = 153
                self.expression(16)
                pass

            elif la_ == 10:
                localctx = COOLParser.BoolNotContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 154
                self.match(COOLParser.NOT)
                self.state = 155
                self.expression(8)
                pass

            elif la_ == 11:
                localctx = COOLParser.ParenthesesContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 156
                self.match(COOLParser.T__3)
                self.state = 157
                self.expression(0)
                self.state = 158
                self.match(COOLParser.T__5)
                pass

            elif la_ == 12:
                localctx = COOLParser.IdContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 160
                self.match(COOLParser.OBJECTID)
                pass

            elif la_ == 13:
                localctx = COOLParser.IntContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 161
                self.match(COOLParser.INT)
                pass

            elif la_ == 14:
                localctx = COOLParser.StringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 162
                self.match(COOLParser.STRING)
                pass

            elif la_ == 15:
                localctx = COOLParser.TrueContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 163
                self.match(COOLParser.TRUE)
                pass

            elif la_ == 16:
                localctx = COOLParser.FalseContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 164
                self.match(COOLParser.FALSE)
                pass

            elif la_ == 17:
                localctx = COOLParser.AssignmentContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 165
                self.match(COOLParser.OBJECTID)
                self.state = 166
                self.match(COOLParser.ASSIGNMENT)
                self.state = 167
                self.expression(1)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 212
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,19,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 210
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
                    if la_ == 1:
                        localctx = COOLParser.MultiplyContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 170
                        if not self.precpred(self._ctx, 15):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 15)")
                        self.state = 171
                        self.match(COOLParser.MULTIPLY)
                        self.state = 172
                        self.expression(16)
                        pass

                    elif la_ == 2:
                        localctx = COOLParser.DivisionContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 173
                        if not self.precpred(self._ctx, 14):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 14)")
                        self.state = 174
                        self.match(COOLParser.DIVISION)
                        self.state = 175
                        self.expression(15)
                        pass

                    elif la_ == 3:
                        localctx = COOLParser.AddContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 176
                        if not self.precpred(self._ctx, 13):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 13)")
                        self.state = 177
                        self.match(COOLParser.ADD)
                        self.state = 178
                        self.expression(14)
                        pass

                    elif la_ == 4:
                        localctx = COOLParser.MinusContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 179
                        if not self.precpred(self._ctx, 12):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 12)")
                        self.state = 180
                        self.match(COOLParser.MINUS)
                        self.state = 181
                        self.expression(13)
                        pass

                    elif la_ == 5:
                        localctx = COOLParser.LessThanContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 182
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 183
                        self.match(COOLParser.LESS_THAN)
                        self.state = 184
                        self.expression(12)
                        pass

                    elif la_ == 6:
                        localctx = COOLParser.LessEqualContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 185
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 186
                        self.match(COOLParser.LESS_EQUAL)
                        self.state = 187
                        self.expression(11)
                        pass

                    elif la_ == 7:
                        localctx = COOLParser.EqualContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 188
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 189
                        self.match(COOLParser.EQUAL)
                        self.state = 190
                        self.expression(10)
                        pass

                    elif la_ == 8:
                        localctx = COOLParser.MethodCallContext(self, COOLParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 191
                        if not self.precpred(self._ctx, 25):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 25)")
                        self.state = 194
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if _la==COOLParser.T__7:
                            self.state = 192
                            self.match(COOLParser.T__7)
                            self.state = 193
                            self.match(COOLParser.TYPEID)


                        self.state = 196
                        self.match(COOLParser.T__8)
                        self.state = 197
                        self.match(COOLParser.OBJECTID)
                        self.state = 198
                        self.match(COOLParser.T__3)
                        self.state = 207
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << COOLParser.T__1) | (1 << COOLParser.T__3) | (1 << COOLParser.FALSE) | (1 << COOLParser.IF) | (1 << COOLParser.ISVOID) | (1 << COOLParser.LET) | (1 << COOLParser.WHILE) | (1 << COOLParser.CASE) | (1 << COOLParser.NEW) | (1 << COOLParser.NOT) | (1 << COOLParser.TRUE) | (1 << COOLParser.STRING) | (1 << COOLParser.INT) | (1 << COOLParser.OBJECTID) | (1 << COOLParser.INTEGER_NEGATIVE))) != 0):
                            self.state = 199
                            self.expression(0)
                            self.state = 204
                            self._errHandler.sync(self)
                            _la = self._input.LA(1)
                            while _la==COOLParser.T__4:
                                self.state = 200
                                self.match(COOLParser.T__4)
                                self.state = 201
                                self.expression(0)
                                self.state = 206
                                self._errHandler.sync(self)
                                _la = self._input.LA(1)



                        self.state = 209
                        self.match(COOLParser.T__5)
                        pass

             
                self.state = 214
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,19,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[5] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 15)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 14)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 13)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 12)
         

            if predIndex == 4:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 5:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 6:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 7:
                return self.precpred(self._ctx, 25)
         




