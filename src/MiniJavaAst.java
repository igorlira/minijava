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
			throw new RuntimeException("Invalid type:" + context);
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
	
	public static While getWhileStatement(iclParser.WhileStatementContext context) {
		return new While(getExpression(context.expression()), getStatement(context.statement()));
	}
	
	public static Print getPrintStatement(iclParser.PrintlnStatementContext context) {
		return new Print(getExpression(context.expression()));
	}
	
	public static Assign getAssignStatement(iclParser.AssignmentStatementContext context) {
		return new Assign(getIdentifier(context.identifier()), getExpression(context.expression()));
	}
	
	public static ArrayAssign getArrayAssignStatement(iclParser.ArrAssignStatementContext context) {
		return new ArrayAssign(getIdentifier(context.identifier()), getExpression(context.expression(0)), getExpression(context.expression(1)));
	}
	
	public static Statement getStatement(iclParser.StatementContext context) {
		if (context.blockStatement() != null) {
			return getBlockStatement(context.blockStatement());
		}
		else if (context.ifStatement() != null) {
			return getIfStatement(context.ifStatement());
		}
		else if (context.whileStatement() != null) {
			return getWhileStatement(context.whileStatement());
		}
		else if (context.printlnStatement() != null) {
			return getPrintStatement(context.printlnStatement());
		}
		else if (context.assignmentStatement() != null) {
			return getAssignStatement(context.assignmentStatement());
		}
		else if (context.arrAssignStatement() != null) {
			return getArrayAssignStatement(context.arrAssignStatement());
		}
		else {
			throw new RuntimeException("Invalid statement: " + context);
		}
	}
	
	public static Identifier getIdentifier(iclParser.IdentifierContext context) {
		return new Identifier(context.getText());
	}
	
	public static ClassDeclList getClassDeclList() {
		return null;
	}
	
	public static Exp getExpression(iclParser.ExpressionContext context) {
		return null;
	}
}
