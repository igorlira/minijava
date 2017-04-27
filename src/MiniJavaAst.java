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
	
	public static ClassDecl getClassDecl(iclParser.ClassDeclarationContext context) {
		
	}
	
	public static VarDecl getVarDecl(iclParser.VarDeclarationContext context) {
		
	}
	
	public static MethodDecl getMethodDecl(iclParser.MethodDeclarationContext context) {
		
	}
	
	public static Type getType(iclParser.TypeContext context) {
		if (context.intArrayType() != null) {
			return new IntArrayType();
		}
		else if (context.booleanType() != null) {
			return new BooleanType();
		}
		else if (context.intType() != null) {
			return new IntegerType();
		}
		else if (context.classType() != null) {
			return new IdentifierType(context.classType().identifier().getText());
		}
		else {
			throw new Exception("Invalid type": context);
		}
	}
	
	public static Identifier getIdentifier(iclParser.IdentifierContext context) {
		return new Identifier(context.getText());
	}
	
	public static Statement getStatement(iclParser.StatementContext context) {
		if (context.blockStatement() != null) {
			return getBlockStatement(context.blockStatement());
		}
		else if (context.ifStatement() != null) {
			return getIfStatement(context.ifStatement());
		}
		else {
			return null;
		}
	}
	
	public static Block getBlockStatement(iclParser.BlockStatementContext context) {
		StatementList list = new StatementList();
		for (iclParser.StatementContext statement : context.statement()) {
			list.addElement(getStatement(statement));
		}
		
		return new Block(list);
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
