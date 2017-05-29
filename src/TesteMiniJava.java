import java.util.Scanner;

import ast.*;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class TesteMiniJava {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ANTLRInputStream inputStream = new ANTLRInputStream(in.nextLine());
		
		iclLexer lexer = new iclLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		
		iclParser parser = new iclParser(tokenStream);
		
		Program program = MiniJavaAst.getProgram(parser.program());
		program.accept(new BuildSymbolTableVisitor());
		//program.accept(new PrettyPrintVisitor());
	}
}
