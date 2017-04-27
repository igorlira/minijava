grammar icl;

program:			mainClass (classDeclaration)*;

mainClass: 			'class' identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' identifier ')' '{' statement '}' '}';

classDeclaration: 	'class' identifier ('extends' identifier)? '{' (varDeclaration)* (methodDeclaration)* '}';

varDeclaration: 	type identifier ';';

methodDeclaration: 	'public' type identifier '(' (type identifier (',' type identifier)*)? ')' '{' (varDeclaration)* (statement)* 'return' expression ';' '}';

intArrayType:		'int' '[' ']';
booleanType:		'boolean';
intType:			'int';
classType:			identifier;

type: 				intArrayType |
					booleanType |
					intType |
					classType;

blockStatement:		'{' (statement)* '}';
ifStatement:		'if' '(' expression ')' statement 'else' statement;
whileStatement:		'while' '(' expression ')' statement;
printlnStatement:	'System.out.println' '(' expression ')' ';';
assignmentStatement:identifier '=' expression ';';
arrAssignStatement:	identifier '[' expression ']' '=' expression ';';

statement:			blockStatement |
					ifStatement |
					whileStatement |
					printlnStatement |
					assignmentStatement |
					arrAssignStatement;
					
compareExpression:	('&&' | '<' | '+' | '-' | '*') expression;
arrAccessExpr:		'[' expression ']';
lengthExpression:	'.' 'length';
callExpression:		'.' identifier '(' (expression (',' expression)*)? ')';
intLiteralExpr:		INTEGER_LITERAL;
trueExpr:			'true';
falseExpr:			'false';
identifierExpr:		identifier;
thisExpr:			'this';
newIntArrExpr:		'new' 'int' '[' expression ']';
newExpr:			'new' identifier '(' ')';
negationExpr:		'!' expression;
parExpr:			'(' expression ')';

expression:			expression compareExpression |
					expression arrAccessExpr |
					expression lengthExpression |
					expression callExpression |
					intLiteralExpr |
					trueExpr |
					falseExpr |
					identifierExpr |
					thisExpr |
					newIntArrExpr |
					newExpr |
					negationExpr |
					parExpr;

identifier:			IDENTIFIER;

IDENTIFIER:			[a-zA-Z_][a-zA-Z0-9_]*;
INTEGER_LITERAL: 	('0'..'9')+;
WS:					[ \t\r\n]+ -> skip;