# Generated from yapl.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .yaplParser import yaplParser
else:
    from yaplParser import yaplParser

# This class defines a complete generic visitor for a parse tree produced by yaplParser.

class yaplVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by yaplParser#program.
    def visitProgram(self, ctx:yaplParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#declarationBlock.
    def visitDeclarationBlock(self, ctx:yaplParser.DeclarationBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#constDeclaration.
    def visitConstDeclaration(self, ctx:yaplParser.ConstDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#varDeclaration.
    def visitVarDeclaration(self, ctx:yaplParser.VarDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#recordDeclaration.
    def visitRecordDeclaration(self, ctx:yaplParser.RecordDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#procedure.
    def visitProcedure(self, ctx:yaplParser.ProcedureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#param.
    def visitParam(self, ctx:yaplParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#procedureCall.
    def visitProcedureCall(self, ctx:yaplParser.ProcedureCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#returnStatement.
    def visitReturnStatement(self, ctx:yaplParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#block.
    def visitBlock(self, ctx:yaplParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#statement.
    def visitStatement(self, ctx:yaplParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#statementList.
    def visitStatementList(self, ctx:yaplParser.StatementListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#assignment.
    def visitAssignment(self, ctx:yaplParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#ifStatement.
    def visitIfStatement(self, ctx:yaplParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#whileStatement.
    def visitWhileStatement(self, ctx:yaplParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#writeStatement.
    def visitWriteStatement(self, ctx:yaplParser.WriteStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#ArithmeticExpr.
    def visitArithmeticExpr(self, ctx:yaplParser.ArithmeticExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#Comparison.
    def visitComparison(self, ctx:yaplParser.ComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#CreationExpr.
    def visitCreationExpr(self, ctx:yaplParser.CreationExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#UnaryExpr.
    def visitUnaryExpr(self, ctx:yaplParser.UnaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#EqualityComparison.
    def visitEqualityComparison(self, ctx:yaplParser.EqualityComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#BooleanExpr.
    def visitBooleanExpr(self, ctx:yaplParser.BooleanExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#primaryExpr.
    def visitPrimaryExpr(self, ctx:yaplParser.PrimaryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#arrayLength.
    def visitArrayLength(self, ctx:yaplParser.ArrayLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#fullIdentifier.
    def visitFullIdentifier(self, ctx:yaplParser.FullIdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#selector.
    def visitSelector(self, ctx:yaplParser.SelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#returnType.
    def visitReturnType(self, ctx:yaplParser.ReturnTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#type.
    def visitType(self, ctx:yaplParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#baseType.
    def visitBaseType(self, ctx:yaplParser.BaseTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by yaplParser#literal.
    def visitLiteral(self, ctx:yaplParser.LiteralContext):
        return self.visitChildren(ctx)



del yaplParser