# Generated from yapl.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .yaplParser import yaplParser
else:
    from yaplParser import yaplParser

# This class defines a complete listener for a parse tree produced by yaplParser.
class yaplListener(ParseTreeListener):

    # Enter a parse tree produced by yaplParser#program.
    def enterProgram(self, ctx:yaplParser.ProgramContext):
        pass

    # Exit a parse tree produced by yaplParser#program.
    def exitProgram(self, ctx:yaplParser.ProgramContext):
        pass


    # Enter a parse tree produced by yaplParser#declarationBlock.
    def enterDeclarationBlock(self, ctx:yaplParser.DeclarationBlockContext):
        pass

    # Exit a parse tree produced by yaplParser#declarationBlock.
    def exitDeclarationBlock(self, ctx:yaplParser.DeclarationBlockContext):
        pass


    # Enter a parse tree produced by yaplParser#constDeclaration.
    def enterConstDeclaration(self, ctx:yaplParser.ConstDeclarationContext):
        pass

    # Exit a parse tree produced by yaplParser#constDeclaration.
    def exitConstDeclaration(self, ctx:yaplParser.ConstDeclarationContext):
        pass


    # Enter a parse tree produced by yaplParser#varDeclaration.
    def enterVarDeclaration(self, ctx:yaplParser.VarDeclarationContext):
        pass

    # Exit a parse tree produced by yaplParser#varDeclaration.
    def exitVarDeclaration(self, ctx:yaplParser.VarDeclarationContext):
        pass


    # Enter a parse tree produced by yaplParser#recordDeclaration.
    def enterRecordDeclaration(self, ctx:yaplParser.RecordDeclarationContext):
        pass

    # Exit a parse tree produced by yaplParser#recordDeclaration.
    def exitRecordDeclaration(self, ctx:yaplParser.RecordDeclarationContext):
        pass


    # Enter a parse tree produced by yaplParser#procedure.
    def enterProcedure(self, ctx:yaplParser.ProcedureContext):
        pass

    # Exit a parse tree produced by yaplParser#procedure.
    def exitProcedure(self, ctx:yaplParser.ProcedureContext):
        pass


    # Enter a parse tree produced by yaplParser#param.
    def enterParam(self, ctx:yaplParser.ParamContext):
        pass

    # Exit a parse tree produced by yaplParser#param.
    def exitParam(self, ctx:yaplParser.ParamContext):
        pass


    # Enter a parse tree produced by yaplParser#procedureCall.
    def enterProcedureCall(self, ctx:yaplParser.ProcedureCallContext):
        pass

    # Exit a parse tree produced by yaplParser#procedureCall.
    def exitProcedureCall(self, ctx:yaplParser.ProcedureCallContext):
        pass


    # Enter a parse tree produced by yaplParser#returnStatement.
    def enterReturnStatement(self, ctx:yaplParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by yaplParser#returnStatement.
    def exitReturnStatement(self, ctx:yaplParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by yaplParser#block.
    def enterBlock(self, ctx:yaplParser.BlockContext):
        pass

    # Exit a parse tree produced by yaplParser#block.
    def exitBlock(self, ctx:yaplParser.BlockContext):
        pass


    # Enter a parse tree produced by yaplParser#statement.
    def enterStatement(self, ctx:yaplParser.StatementContext):
        pass

    # Exit a parse tree produced by yaplParser#statement.
    def exitStatement(self, ctx:yaplParser.StatementContext):
        pass


    # Enter a parse tree produced by yaplParser#statementList.
    def enterStatementList(self, ctx:yaplParser.StatementListContext):
        pass

    # Exit a parse tree produced by yaplParser#statementList.
    def exitStatementList(self, ctx:yaplParser.StatementListContext):
        pass


    # Enter a parse tree produced by yaplParser#assignment.
    def enterAssignment(self, ctx:yaplParser.AssignmentContext):
        pass

    # Exit a parse tree produced by yaplParser#assignment.
    def exitAssignment(self, ctx:yaplParser.AssignmentContext):
        pass


    # Enter a parse tree produced by yaplParser#ifStatement.
    def enterIfStatement(self, ctx:yaplParser.IfStatementContext):
        pass

    # Exit a parse tree produced by yaplParser#ifStatement.
    def exitIfStatement(self, ctx:yaplParser.IfStatementContext):
        pass


    # Enter a parse tree produced by yaplParser#whileStatement.
    def enterWhileStatement(self, ctx:yaplParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by yaplParser#whileStatement.
    def exitWhileStatement(self, ctx:yaplParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by yaplParser#writeStatement.
    def enterWriteStatement(self, ctx:yaplParser.WriteStatementContext):
        pass

    # Exit a parse tree produced by yaplParser#writeStatement.
    def exitWriteStatement(self, ctx:yaplParser.WriteStatementContext):
        pass


    # Enter a parse tree produced by yaplParser#ArithmeticExpr.
    def enterArithmeticExpr(self, ctx:yaplParser.ArithmeticExprContext):
        pass

    # Exit a parse tree produced by yaplParser#ArithmeticExpr.
    def exitArithmeticExpr(self, ctx:yaplParser.ArithmeticExprContext):
        pass


    # Enter a parse tree produced by yaplParser#Comparison.
    def enterComparison(self, ctx:yaplParser.ComparisonContext):
        pass

    # Exit a parse tree produced by yaplParser#Comparison.
    def exitComparison(self, ctx:yaplParser.ComparisonContext):
        pass


    # Enter a parse tree produced by yaplParser#CreationExpr.
    def enterCreationExpr(self, ctx:yaplParser.CreationExprContext):
        pass

    # Exit a parse tree produced by yaplParser#CreationExpr.
    def exitCreationExpr(self, ctx:yaplParser.CreationExprContext):
        pass


    # Enter a parse tree produced by yaplParser#UnaryExpr.
    def enterUnaryExpr(self, ctx:yaplParser.UnaryExprContext):
        pass

    # Exit a parse tree produced by yaplParser#UnaryExpr.
    def exitUnaryExpr(self, ctx:yaplParser.UnaryExprContext):
        pass


    # Enter a parse tree produced by yaplParser#EqualityComparison.
    def enterEqualityComparison(self, ctx:yaplParser.EqualityComparisonContext):
        pass

    # Exit a parse tree produced by yaplParser#EqualityComparison.
    def exitEqualityComparison(self, ctx:yaplParser.EqualityComparisonContext):
        pass


    # Enter a parse tree produced by yaplParser#BooleanExpr.
    def enterBooleanExpr(self, ctx:yaplParser.BooleanExprContext):
        pass

    # Exit a parse tree produced by yaplParser#BooleanExpr.
    def exitBooleanExpr(self, ctx:yaplParser.BooleanExprContext):
        pass


    # Enter a parse tree produced by yaplParser#primaryExpr.
    def enterPrimaryExpr(self, ctx:yaplParser.PrimaryExprContext):
        pass

    # Exit a parse tree produced by yaplParser#primaryExpr.
    def exitPrimaryExpr(self, ctx:yaplParser.PrimaryExprContext):
        pass


    # Enter a parse tree produced by yaplParser#arrayLength.
    def enterArrayLength(self, ctx:yaplParser.ArrayLengthContext):
        pass

    # Exit a parse tree produced by yaplParser#arrayLength.
    def exitArrayLength(self, ctx:yaplParser.ArrayLengthContext):
        pass


    # Enter a parse tree produced by yaplParser#fullIdentifier.
    def enterFullIdentifier(self, ctx:yaplParser.FullIdentifierContext):
        pass

    # Exit a parse tree produced by yaplParser#fullIdentifier.
    def exitFullIdentifier(self, ctx:yaplParser.FullIdentifierContext):
        pass


    # Enter a parse tree produced by yaplParser#selector.
    def enterSelector(self, ctx:yaplParser.SelectorContext):
        pass

    # Exit a parse tree produced by yaplParser#selector.
    def exitSelector(self, ctx:yaplParser.SelectorContext):
        pass


    # Enter a parse tree produced by yaplParser#returnType.
    def enterReturnType(self, ctx:yaplParser.ReturnTypeContext):
        pass

    # Exit a parse tree produced by yaplParser#returnType.
    def exitReturnType(self, ctx:yaplParser.ReturnTypeContext):
        pass


    # Enter a parse tree produced by yaplParser#type.
    def enterType(self, ctx:yaplParser.TypeContext):
        pass

    # Exit a parse tree produced by yaplParser#type.
    def exitType(self, ctx:yaplParser.TypeContext):
        pass


    # Enter a parse tree produced by yaplParser#baseType.
    def enterBaseType(self, ctx:yaplParser.BaseTypeContext):
        pass

    # Exit a parse tree produced by yaplParser#baseType.
    def exitBaseType(self, ctx:yaplParser.BaseTypeContext):
        pass


    # Enter a parse tree produced by yaplParser#literal.
    def enterLiteral(self, ctx:yaplParser.LiteralContext):
        pass

    # Exit a parse tree produced by yaplParser#literal.
    def exitLiteral(self, ctx:yaplParser.LiteralContext):
        pass



del yaplParser