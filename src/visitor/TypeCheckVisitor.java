package visitor;

import symboltable.SymbolTable;
import symboltable.Variable;

import com.sun.org.apache.xpath.internal.operations.Bool;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;
import symboltable.Class;
import symboltable.Method;

public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;
	private Class currentClass;
	private Method currentMethod;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		n.i.accept(this);
		
		this.currentClass = this.symbolTable.getClass(n.i.s);
		this.currentMethod = null;
		
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		
		this.currentClass = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		n.i.accept(this);
		n.j.accept(this);
		
		this.currentClass = this.symbolTable.getClass(n.i.s);
		this.currentMethod = null;
		
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		
		this.currentClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		
		this.currentMethod = this.currentClass.getMethod(n.i.s);
		
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		
		if (!n.e.accept(this).equals(n.t)) {
			System.out.println();
			throw new RuntimeException("Return expression type doesn't match method type in " + n.i.s);
		}
		
		this.currentMethod = null;
		
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if (!n.e.accept(this).equals(new BooleanType())) {
			System.out.println();
			throw new RuntimeException("Expected boolean on if expression");
		}
		
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		if (!n.e.accept(this).equals(new BooleanType())) {
			System.out.println();
			throw new RuntimeException("Expected boolean on while expression");
		}
		
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		n.i.accept(this);
		
		Type varType = this.symbolTable.getVarType(this.currentMethod, this.currentClass, n.i.s);
		if (!n.e.accept(this).equals(varType)) {
			System.out.println();
			throw new RuntimeException("Assigning " + n.e + " to " + varType + " variable");
		}
		
		return varType;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		n.i.accept(this);
		
		Type varType = this.symbolTable.getVarType(this.currentMethod, this.currentClass, n.i.s);
		if (!varType.equals(new IntArrayType())) {
			System.out.println();
			throw new RuntimeException("Variable is not an integer array");
		}
		
		if (!n.e1.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("Array index must be an integer");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("Array assignment expression must be an integer");
		}
		
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(And n) {
		if (!n.e1.accept(this).equals(new BooleanType())) {
			System.out.println();
			throw new RuntimeException("AND Logic operator item must be a boolean");
		}
		
		if (!n.e2.accept(this).equals(new BooleanType())) {
			System.out.println();
			throw new RuntimeException("AND Logic operator item must be a boolean");
		}
		
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		if (!n.e1.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("< operator item must be an integer");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("< operator item must be an integer");
		}
		
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		if (!n.e1.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("+ operator item must be an integer");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("+ operator item must be an integer");
		}
		
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		if (!n.e1.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("- operator item must be an integer");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("- operator item must be an integer");
		}
		
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		if (!n.e1.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("* operator item must be an integer");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("* operator item must be an integer");
		}
		
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		if (!n.e1.accept(this).equals(new IntArrayType())) {
			System.out.println();
			throw new RuntimeException("Expression is not an integer array");
		}
		
		if (!n.e2.accept(this).equals(new IntegerType())) {
			System.out.println();
			throw new RuntimeException("Array index must be an integer");
		}
	
		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		if (!n.e.accept(this).equals(new IntArrayType())) {
			System.out.println();
			throw new RuntimeException("Expression is not an integer array");
		}
		
		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		Type receiverType = n.e.accept(this);
		Variable receiverVar = null;
		
		if (receiverType instanceof IdentifierType) {
			IdentifierExp iExp = (IdentifierExp) n.e;
			
			if (this.currentMethod != null) {
				receiverVar = this.currentMethod.getVar(iExp.s);
				
				if (receiverVar == null) {
					receiverVar = this.currentMethod.getParam(iExp.s);
				}
			}
			if (receiverVar == null && this.currentClass != null) {
				receiverVar = this.currentClass.getVar(iExp.s);
			}
		}
		
		Class receiverClass = null;
		if (receiverVar != null && (receiverVar.type() instanceof IdentifierType)) {
			IdentifierType receiverTypeId = (IdentifierType) receiverVar.type();
			receiverClass = this.symbolTable.getClass(receiverTypeId.s);
		}
		
		n.i.accept(this);
		
		Method receiverMethod = null;
		if (receiverClass != null) {
			receiverMethod = receiverClass.getMethod(n.i.s);
		}

		if (receiverMethod != null) {
			for (int i = 0; i < n.el.size(); i++) {
				Variable param = receiverMethod.getParamAt(i);
				if (param == null) {
					System.out.println();
					throw new RuntimeException("Method call has more arguments than method declaration");
				}
				
				Type argType = n.el.elementAt(i).accept(this);
				if (!param.type().equals(argType)) {
					System.out.println();
					throw new RuntimeException("Method call argument #" + i + " does not match method declaration type");
				}
			}
		}
		
		if (receiverMethod != null) {
			return receiverMethod.type();
		}
		else {
			return null;
		}
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return this.symbolTable.getVarType(this.currentMethod, this.currentClass, n.s);
		//return new IdentifierType(n.s);
	}

	public Type visit(This n) {
		if (this.currentClass != null) {
			return this.currentClass.type();
		}
		else {
			throw new RuntimeException("`this` is undefined in this scope");
		}
	}

	// Exp e;
	public Type visit(NewArray n) {
		n.e.accept(this);
		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {
		if (!n.e.accept(this).equals(new BooleanType())) {
			System.out.println();
			throw new RuntimeException("NOT Logic operator item must be a boolean");
		}
		
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return new IdentifierType(n.s);
	}
}
