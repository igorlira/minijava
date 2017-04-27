// Generated from icl.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iclParser}.
 */
public interface iclListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link iclParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(@NotNull iclParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link iclParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(@NotNull iclParser.PrintlnStatementContext ctx);
}