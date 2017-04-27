import java.util.List;

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
		return null;
	}
	
	public static VarDecl getVarDecl(iclParser.VarDeclarationContext context) {
		return null;
	}
	
	public static MethodDecl getMethodDecl(iclParser.MethodDeclarationContext context) {
		return null;
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
	
	public static Exp getCompareExpression(Exp leftSide, iclParser.CompareExpressionContext context) {
		switch (context.getText().charAt(0)) {
		case '&':
			return new And(leftSide, getExpression(context.expression()));
		case '<':
			return new LessThan(leftSide, getExpression(context.expression()));
		case '+':
			return new Plus(leftSide, getExpression(context.expression()));
		case '-':
			return new Minus(leftSide, getExpression(context.expression()));
		case '*':
			return new Times(leftSide, getExpression(context.expression()));
		}
		
		throw new RuntimeException("Invalid compare expression: " + context);
	}
	
	public static ArrayLookup getArrayAccessExpression(Exp leftSide, iclParser.ArrAccessExprContext context) {
		return new ArrayLookup(leftSide, getExpression(context.expression()));
	}
	
	public static ArrayLength getLengthExpression(Exp leftSide, iclParser.LengthExpressionContext context) {
		return new ArrayLength(leftSide);
	}
	
	public static Call getCallExpression(Exp leftSide, iclParser.CallExpressionContext context) {
		return new Call(leftSide, getIdentifier(context.identifier()), getExpressionList(context.expression()));
	}
	
	public static IntegerLiteral getIntLiteralExpression(iclParser.IntLiteralExprContext context) {
		return new IntegerLiteral(Integer.parseInt(context.INTEGER_LITERAL().getText()));
	}
	
	public static Exp getExpression(iclParser.ExpressionContext context) {
		if (context.compareExpression() != null) {
			return getCompareExpression(getExpression(context.expression()), context.compareExpression());
		}
		else if (context.arrAccessExpr() != null) {
			return getArrayAccessExpression(getExpression(context.expression()), context.arrAccessExpr());
		}
		else if (context.lengthExpression() != null) {
			return getLengthExpression(getExpression(context.expression()), context.lengthExpression());
		}
		else if (context.callExpression() != null) {
			return getCallExpression(getExpression(context.expression()), context.callExpression());
		}
		else if (context.intLiteralExpr() != null) {
			return getIntLiteralExpression(context.intLiteralExpr());
		}
		else if (context.trueExpr() != null) {
			return new True();
		}
		else if (context.falseExpr() != null) {
			return new False();
		}
		else if (context.identifierExpr() != null) {
			return new IdentifierExp(context.identifierExpr().getText());
		}
		else if (context.thisExpr() != null) {
			return new This();
		}
		else if (context.newIntArrExpr() != null) {
			return new NewArray(getExpression(context.newIntArrExpr().expression()));
		}
		else if (context.newExpr() != null) {
			return new NewObject(getIdentifier(context.newExpr().identifier()));
		}
		else if (context.negationExpr() != null) {
			return new Not(getExpression(context.negationExpr().expression()));
		}
		else if (context.parExpr() != null) {
			return getExpression(context.parExpr().expression());
		}
		else {
			throw new RuntimeException("Invalid expression: " + context);
		}
	}
	
	public static Identifier getIdentifier(iclParser.IdentifierContext context) {
		return new Identifier(context.getText());
	}
	
	public static ClassDeclList getClassDeclList() {
		return null;
	}
	
	public static ExpList getExpressionList(List<iclParser.ExpressionContext> list) {
		ExpList result = new ExpList();
		for (iclParser.ExpressionContext expr : list) {
			result.addElement(getExpression(expr));
		}
		
		return result;
	}
}
