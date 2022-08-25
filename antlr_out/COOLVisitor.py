# Generated from COOL.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .COOLParser import COOLParser
else:
    from COOLParser import COOLParser

# This class defines a complete generic visitor for a parse tree produced by COOLParser.


class COOLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by COOLParser#program.
    def visitProgram(self, ctx: COOLParser.ProgramContext):
        """
        program: programBlocks EOF;
        """
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#classes.
    def visitClasses(self, ctx: COOLParser.ClassesContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#eof.
    def visitEof(self, ctx: COOLParser.EofContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#classDefine.
    def visitClassDefine(self, ctx: COOLParser.ClassDefineContext):
        """
        CLASS TYPEID (INHERITS TYPEID)? { feature ;)* }

        """

        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#method.
    def visitMethod(self, ctx: COOLParser.MethodContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#property.
    def visitProperty(self, ctx: COOLParser.PropertyContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#formal.
    def visitFormal(self, ctx: COOLParser.FormalContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#letIn.
    def visitLetIn(self, ctx: COOLParser.LetInContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#minus.
    def visitMinus(self, ctx: COOLParser.MinusContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#string.
    def visitString(self, ctx: COOLParser.StringContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#isvoid.
    def visitIsvoid(self, ctx: COOLParser.IsvoidContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#while.
    def visitWhile(self, ctx: COOLParser.WhileContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#division.
    def visitDivision(self, ctx: COOLParser.DivisionContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#negative.
    def visitNegative(self, ctx: COOLParser.NegativeContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#boolNot.
    def visitBoolNot(self, ctx: COOLParser.BoolNotContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#lessThan.
    def visitLessThan(self, ctx: COOLParser.LessThanContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#block.
    def visitBlock(self, ctx: COOLParser.BlockContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#id.
    def visitId(self, ctx: COOLParser.IdContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#multiply.
    def visitMultiply(self, ctx: COOLParser.MultiplyContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#if.
    def visitIf(self, ctx: COOLParser.IfContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#case.
    def visitCase(self, ctx: COOLParser.CaseContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#ownMethodCall.
    def visitOwnMethodCall(self, ctx: COOLParser.OwnMethodCallContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#add.
    def visitAdd(self, ctx: COOLParser.AddContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#new.
    def visitNew(self, ctx: COOLParser.NewContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#parentheses.
    def visitParentheses(self, ctx: COOLParser.ParenthesesContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#assignment.
    def visitAssignment(self, ctx: COOLParser.AssignmentContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#false.
    def visitFalse(self, ctx: COOLParser.FalseContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#int.
    def visitInt(self, ctx: COOLParser.IntContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#equal.
    def visitEqual(self, ctx: COOLParser.EqualContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#true.
    def visitTrue(self, ctx: COOLParser.TrueContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#lessEqual.
    def visitLessEqual(self, ctx: COOLParser.LessEqualContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#methodCall.
    def visitMethodCall(self, ctx: COOLParser.MethodCallContext):
        return self.visitChildren(ctx)


del COOLParser
