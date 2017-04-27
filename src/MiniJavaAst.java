import ast.*;

public class MiniJavaAst {
	public static Program getProgram(iclParser.ProgramContext context) {
		MainClass mainClass = getMainClass(context.mainClass());
		ClassDeclList classDeclList = getClassDeclList();
		
		return new Program(mainClass, classDeclList);
	}
	
	public static MainClass getMainClass(iclParser.MainClassContext context) {
		return new MainClass(getIdentifier(context.identifier(0)), getIdentifier(context.identifier(1)), getStatement(context.statement()));
	}
	
	public static Identifier getIdentifier(iclParser.IdentifierContext context) {
		return new Identifier(context.getText());
	}
	
	public static Statement getStatement(iclParser.StatementContext context) {
		if (context.ifStatement() != null) {
			return new If(getExpression(context.expression(0)), getStatement(context.statement(0)), getStatement(context.statement(1)));
		}
		else {
			return null;
		}
	}
	
	public static If getIfStatement(iclParser.IfStatementContext context) {
		return new If(getExpression(context.expression()), getStatement(context.statement(0)), getStatement(context.statement(1)));
	}
	
	public static ClassDeclList getClassDeclList() {
		return null;
	}
	
	public static Exp getExpression(iclParser.ExpressionContext context) {
		return null;
	}
}
