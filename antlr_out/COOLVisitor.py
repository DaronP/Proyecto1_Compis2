# Generated from COOL.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .COOLParser import COOLParser
else:
    from COOLParser import COOLParser

# This class defines a complete generic visitor for a parse tree produced by COOLParser.


class COOLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by COOLParser#program.
    def visitProgram(self, ctx: COOLParser.ProgramContext): # Not needed
        """
        program: programBlocks EOF;
        """
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#classes.
    def visitClasses(self, ctx: COOLParser.ClassesContext): # Not Implemented. Class definition implemented.
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#eof.
    def visitEof(self, ctx: COOLParser.EofContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#classDefine.
    def visitClassDefine(self, ctx: COOLParser.ClassDefineContext): # Implemented
        """
        CLASS TYPEID (INHERITS TYPEID)? { feature ;)* }

        """
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#method.
    def visitMethod(self, ctx: COOLParser.MethodContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#property.
    def visitProperty(self, ctx: COOLParser.PropertyContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#formal.
    def visitFormal(self, ctx: COOLParser.FormalContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#letIn.
    def visitLetIn(self, ctx: COOLParser.LetInContext): # Not implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#minus.
    def visitMinus(self, ctx: COOLParser.MinusContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#string.
    def visitString(self, ctx: COOLParser.StringContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#isvoid.
    def visitIsvoid(self, ctx: COOLParser.IsvoidContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#while.
    def visitWhile(self, ctx: COOLParser.WhileContext): # Pending
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#division.
    def visitDivision(self, ctx: COOLParser.DivisionContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#negative.
    def visitNegative(self, ctx: COOLParser.NegativeContext): # Not Needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#boolNot.
    def visitBoolNot(self, ctx: COOLParser.BoolNotContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#lessThan.
    def visitLessThan(self, ctx: COOLParser.LessThanContext): # Not Needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#block.
    def visitBlock(self, ctx: COOLParser.BlockContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#id.
    def visitId(self, ctx: COOLParser.IdContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#multiply.
    def visitMultiply(self, ctx: COOLParser.MultiplyContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#if.
    def visitIf(self, ctx: COOLParser.IfContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#case.
    def visitCase(self, ctx: COOLParser.CaseContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#ownMethodCall.
    def visitOwnMethodCall(self, ctx: COOLParser.OwnMethodCallContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#add.
    def visitAdd(self, ctx: COOLParser.AddContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#new.
    def visitNew(self, ctx: COOLParser.NewContext): # Not Needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#parentheses.
    def visitParentheses(self, ctx: COOLParser.ParenthesesContext): # Not Needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#assignment.
    def visitAssignment(self, ctx: COOLParser.AssignmentContext): # Implemented
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#false.
    def visitFalse(self, ctx: COOLParser.FalseContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#int.
    def visitInt(self, ctx: COOLParser.IntContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#equal.
    def visitEqual(self, ctx: COOLParser.EqualContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#true.
    def visitTrue(self, ctx: COOLParser.TrueContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#lessEqual.
    def visitLessEqual(self, ctx: COOLParser.LessEqualContext): # Not needed
        return self.visitChildren(ctx)

    # Visit a parse tree produced by COOLParser#methodCall.
    def visitMethodCall(self, ctx: COOLParser.MethodCallContext): # Not needed
        return self.visitChildren(ctx)


del COOLParser
