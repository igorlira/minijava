// Generated from icl.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iclParser}.
 */
public interface iclListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iclParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(@NotNull iclParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#newExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(@NotNull iclParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#thisExpr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(@NotNull iclParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#thisExpr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(@NotNull iclParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull iclParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull iclParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull iclParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull iclParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#trueExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(@NotNull iclParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#trueExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(@NotNull iclParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(@NotNull iclParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(@NotNull iclParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull iclParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull iclParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull iclParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull iclParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#lengthExpression}.
	 * @param ctx the parse tree
	 */
	void enterLengthExpression(@NotNull iclParser.LengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#lengthExpression}.
	 * @param ctx the parse tree
	 */
	void exitLengthExpression(@NotNull iclParser.LengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull iclParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull iclParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull iclParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull iclParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#intLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteralExpr(@NotNull iclParser.IntLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#intLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteralExpr(@NotNull iclParser.IntLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull iclParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull iclParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#falseExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(@NotNull iclParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#falseExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(@NotNull iclParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull iclParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull iclParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull iclParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull iclParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull iclParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull iclParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#negationExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpr(@NotNull iclParser.NegationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#negationExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpr(@NotNull iclParser.NegationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull iclParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull iclParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull iclParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull iclParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(@NotNull iclParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(@NotNull iclParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#arrAccessExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrAccessExpr(@NotNull iclParser.ArrAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#arrAccessExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrAccessExpr(@NotNull iclParser.ArrAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull iclParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull iclParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull iclParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull iclParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull iclParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull iclParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull iclParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull iclParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(@NotNull iclParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(@NotNull iclParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#arrAssignStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrAssignStatement(@NotNull iclParser.ArrAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#arrAssignStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrAssignStatement(@NotNull iclParser.ArrAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(@NotNull iclParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(@NotNull iclParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(@NotNull iclParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(@NotNull iclParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull iclParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull iclParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#identifierExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(@NotNull iclParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#identifierExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(@NotNull iclParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link iclParser#newIntArrExpr}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrExpr(@NotNull iclParser.NewIntArrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#newIntArrExpr}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrExpr(@NotNull iclParser.NewIntArrExprContext ctx);
}