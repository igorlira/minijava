// Generated from icl.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class iclParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, IDENTIFIER=36, INTEGER_LITERAL=37, 
		WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "IDENTIFIER", "INTEGER_LITERAL", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_formal = 4, RULE_methodDeclaration = 5, RULE_intArrayType = 6, RULE_booleanType = 7, 
		RULE_intType = 8, RULE_classType = 9, RULE_type = 10, RULE_blockStatement = 11, 
		RULE_ifStatement = 12, RULE_whileStatement = 13, RULE_printlnStatement = 14, 
		RULE_assignmentStatement = 15, RULE_arrAssignStatement = 16, RULE_statement = 17, 
		RULE_compareExpression = 18, RULE_arrAccessExpr = 19, RULE_lengthExpression = 20, 
		RULE_callExpression = 21, RULE_intLiteralExpr = 22, RULE_trueExpr = 23, 
		RULE_falseExpr = 24, RULE_identifierExpr = 25, RULE_thisExpr = 26, RULE_newIntArrExpr = 27, 
		RULE_newExpr = 28, RULE_negationExpr = 29, RULE_parExpr = 30, RULE_expression = 31, 
		RULE_identifier = 32;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDeclaration", "varDeclaration", "formal", 
		"methodDeclaration", "intArrayType", "booleanType", "intType", "classType", 
		"type", "blockStatement", "ifStatement", "whileStatement", "printlnStatement", 
		"assignmentStatement", "arrAssignStatement", "statement", "compareExpression", 
		"arrAccessExpr", "lengthExpression", "callExpression", "intLiteralExpr", 
		"trueExpr", "falseExpr", "identifierExpr", "thisExpr", "newIntArrExpr", 
		"newExpr", "negationExpr", "parExpr", "expression", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "icl.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public iclParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); mainClass();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(67); classDeclaration();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(T__29);
			setState(74); identifier();
			setState(75); match(T__25);
			setState(76); match(T__6);
			setState(77); match(T__4);
			setState(78); match(T__26);
			setState(79); match(T__34);
			setState(80); match(T__18);
			setState(81); match(T__8);
			setState(82); match(T__10);
			setState(83); match(T__7);
			setState(84); identifier();
			setState(85); match(T__2);
			setState(86); match(T__25);
			setState(87); statement();
			setState(88); match(T__21);
			setState(89); match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__29);
			setState(92); identifier();
			setState(95);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(93); match(T__22);
				setState(94); identifier();
				}
			}

			setState(97); match(T__25);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(98); varDeclaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(104); methodDeclaration();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); type();
			setState(113); identifier();
			setState(114); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); type();
			setState(117); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(T__6);
			setState(120); type();
			setState(121); identifier();
			setState(122); match(T__18);
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(123); formal();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(124); match(T__15);
					setState(125); formal();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133); match(T__2);
			setState(134); match(T__25);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); varDeclaration();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(141); statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(T__30);
			setState(148); expression(0);
			setState(149); match(T__27);
			setState(150); match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntArrayTypeContext extends ParserRuleContext {
		public IntArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIntArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIntArrayType(this);
		}
	}

	public final IntArrayTypeContext intArrayType() throws RecognitionException {
		IntArrayTypeContext _localctx = new IntArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(T__19);
			setState(153); match(T__10);
			setState(154); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitBooleanType(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntTypeContext extends ParserRuleContext {
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIntType(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164); intType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); classType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__25);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(169); statement();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(T__20);
			setState(178); match(T__18);
			setState(179); expression(0);
			setState(180); match(T__2);
			setState(181); statement();
			setState(182); match(T__3);
			setState(183); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__28);
			setState(186); match(T__18);
			setState(187); expression(0);
			setState(188); match(T__2);
			setState(189); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitPrintlnStatement(this);
		}
	}

	public final PrintlnStatementContext printlnStatement() throws RecognitionException {
		PrintlnStatementContext _localctx = new PrintlnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printlnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(T__11);
			setState(192); match(T__18);
			setState(193); expression(0);
			setState(194); match(T__2);
			setState(195); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); identifier();
			setState(198); match(T__23);
			setState(199); expression(0);
			setState(200); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrAssignStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrAssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrAssignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterArrAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitArrAssignStatement(this);
		}
	}

	public final ArrAssignStatementContext arrAssignStatement() throws RecognitionException {
		ArrAssignStatementContext _localctx = new ArrAssignStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrAssignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); identifier();
			setState(203); match(T__10);
			setState(204); expression(0);
			setState(205); match(T__7);
			setState(206); match(T__23);
			setState(207); expression(0);
			setState(208); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ArrAssignStatementContext arrAssignStatement() {
			return getRuleContext(ArrAssignStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public PrintlnStatementContext printlnStatement() {
			return getRuleContext(PrintlnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213); printlnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215); arrAssignStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitCompareExpression(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compareExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(219); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrAccessExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrAccessExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrAccessExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterArrAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitArrAccessExpr(this);
		}
	}

	public final ArrAccessExprContext arrAccessExpr() throws RecognitionException {
		ArrAccessExprContext _localctx = new ArrAccessExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrAccessExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(T__10);
			setState(222); expression(0);
			setState(223); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthExpressionContext extends ParserRuleContext {
		public LengthExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitLengthExpression(this);
		}
	}

	public final LengthExpressionContext lengthExpression() throws RecognitionException {
		LengthExpressionContext _localctx = new LengthExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lengthExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(T__13);
			setState(226); match(T__33);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitCallExpression(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(T__13);
			setState(229); identifier();
			setState(230); match(T__18);
			setState(239);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__5) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(231); expression(0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(232); match(T__15);
					setState(233); expression(0);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(241); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLiteralExprContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(iclParser.INTEGER_LITERAL, 0); }
		public IntLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteralExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIntLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIntLiteralExpr(this);
		}
	}

	public final IntLiteralExprContext intLiteralExpr() throws RecognitionException {
		IntLiteralExprContext _localctx = new IntLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intLiteralExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrueExprContext extends ParserRuleContext {
		public TrueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitTrueExpr(this);
		}
	}

	public final TrueExprContext trueExpr() throws RecognitionException {
		TrueExprContext _localctx = new TrueExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FalseExprContext extends ParserRuleContext {
		public FalseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitFalseExpr(this);
		}
	}

	public final FalseExprContext falseExpr() throws RecognitionException {
		FalseExprContext _localctx = new FalseExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_falseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIdentifierExpr(this);
		}
	}

	public final IdentifierExprContext identifierExpr() throws RecognitionException {
		IdentifierExprContext _localctx = new IdentifierExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_identifierExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisExprContext extends ParserRuleContext {
		public ThisExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitThisExpr(this);
		}
	}

	public final ThisExprContext thisExpr() throws RecognitionException {
		ThisExprContext _localctx = new ThisExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_thisExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewIntArrExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewIntArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newIntArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterNewIntArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitNewIntArrExpr(this);
		}
	}

	public final NewIntArrExprContext newIntArrExpr() throws RecognitionException {
		NewIntArrExprContext _localctx = new NewIntArrExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newIntArrExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(T__32);
			setState(254); match(T__19);
			setState(255); match(T__10);
			setState(256); expression(0);
			setState(257); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitNewExpr(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(T__32);
			setState(260); identifier();
			setState(261); match(T__18);
			setState(262); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegationExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterNegationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitNegationExpr(this);
		}
	}

	public final NegationExprContext negationExpr() throws RecognitionException {
		NegationExprContext _localctx = new NegationExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_negationExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(T__5);
			setState(265); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitParExpr(this);
		}
	}

	public final ParExprContext parExpr() throws RecognitionException {
		ParExprContext _localctx = new ParExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(T__18);
			setState(268); expression(0);
			setState(269); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArrAccessExprContext arrAccessExpr() {
			return getRuleContext(ArrAccessExprContext.class,0);
		}
		public NewIntArrExprContext newIntArrExpr() {
			return getRuleContext(NewIntArrExprContext.class,0);
		}
		public TrueExprContext trueExpr() {
			return getRuleContext(TrueExprContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public LengthExpressionContext lengthExpression() {
			return getRuleContext(LengthExpressionContext.class,0);
		}
		public IntLiteralExprContext intLiteralExpr() {
			return getRuleContext(IntLiteralExprContext.class,0);
		}
		public NegationExprContext negationExpr() {
			return getRuleContext(NegationExprContext.class,0);
		}
		public ThisExprContext thisExpr() {
			return getRuleContext(ThisExprContext.class,0);
		}
		public FalseExprContext falseExpr() {
			return getRuleContext(FalseExprContext.class,0);
		}
		public IdentifierExprContext identifierExpr() {
			return getRuleContext(IdentifierExprContext.class,0);
		}
		public ParExprContext parExpr() {
			return getRuleContext(ParExprContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(272); intLiteralExpr();
				}
				break;
			case 2:
				{
				setState(273); trueExpr();
				}
				break;
			case 3:
				{
				setState(274); falseExpr();
				}
				break;
			case 4:
				{
				setState(275); identifierExpr();
				}
				break;
			case 5:
				{
				setState(276); thisExpr();
				}
				break;
			case 6:
				{
				setState(277); newIntArrExpr();
				}
				break;
			case 7:
				{
				setState(278); newExpr();
				}
				break;
			case 8:
				{
				setState(279); negationExpr();
				}
				break;
			case 9:
				{
				setState(280); parExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(284); compareExpression();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(286); arrAccessExpr();
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(288); lengthExpression();
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290); callExpression();
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(iclParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iclListener ) ((iclListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u012d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7"+
		"\f\7\16\7\u0084\13\7\5\7\u0086\n\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7"+
		"\u008e\13\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a9\n"+
		"\f\3\r\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00db\n\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u00ed\n\27\f\27\16\27\u00f0\13\27\5\27\u00f2\n\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u011c\n!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0126\n!\f!\16!\u0129"+
		"\13!\3\"\3\"\3\"\2\3@#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@B\2\3\6\2\r\r\24\24\34\34$%\u012a\2D\3\2\2\2\4K\3\2"+
		"\2\2\6]\3\2\2\2\br\3\2\2\2\nv\3\2\2\2\fy\3\2\2\2\16\u009a\3\2\2\2\20\u009e"+
		"\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00bb\3\2\2\2\36\u00c1\3\2\2\2 \u00c7\3\2\2"+
		"\2\"\u00cc\3\2\2\2$\u00da\3\2\2\2&\u00dc\3\2\2\2(\u00df\3\2\2\2*\u00e3"+
		"\3\2\2\2,\u00e6\3\2\2\2.\u00f5\3\2\2\2\60\u00f7\3\2\2\2\62\u00f9\3\2\2"+
		"\2\64\u00fb\3\2\2\2\66\u00fd\3\2\2\28\u00ff\3\2\2\2:\u0105\3\2\2\2<\u010a"+
		"\3\2\2\2>\u010d\3\2\2\2@\u011b\3\2\2\2B\u012a\3\2\2\2DH\5\4\3\2EG\5\6"+
		"\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JH\3\2\2\2KL\7"+
		"\b\2\2LM\5B\"\2MN\7\f\2\2NO\7\37\2\2OP\7!\2\2PQ\7\13\2\2QR\7\3\2\2RS\7"+
		"\23\2\2ST\7\35\2\2TU\7\33\2\2UV\7\36\2\2VW\5B\"\2WX\7#\2\2XY\7\f\2\2Y"+
		"Z\5$\23\2Z[\7\20\2\2[\\\7\20\2\2\\\5\3\2\2\2]^\7\b\2\2^a\5B\"\2_`\7\17"+
		"\2\2`b\5B\"\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cg\7\f\2\2df\5\b\5\2ed\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3\2\2\2ig\3\2\2\2jl\5\f\7\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\20\2\2q\7\3"+
		"\2\2\2rs\5\26\f\2st\5B\"\2tu\7\n\2\2u\t\3\2\2\2vw\5\26\f\2wx\5B\"\2x\13"+
		"\3\2\2\2yz\7\37\2\2z{\5\26\f\2{|\5B\"\2|\u0085\7\23\2\2}\u0082\5\n\6\2"+
		"~\177\7\26\2\2\177\u0081\5\n\6\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085}\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\7#\2\2\u0088\u008c\7\f\2\2\u0089\u008b\5\b\5\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5$\23\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\7\2\2\u0096\u0097\5@!\2\u0097\u0098"+
		"\7\n\2\2\u0098\u0099\7\20\2\2\u0099\r\3\2\2\2\u009a\u009b\7\22\2\2\u009b"+
		"\u009c\7\33\2\2\u009c\u009d\7\36\2\2\u009d\17\3\2\2\2\u009e\u009f\7\31"+
		"\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\23\3\2\2\2\u00a2\u00a3"+
		"\5B\"\2\u00a3\25\3\2\2\2\u00a4\u00a9\5\16\b\2\u00a5\u00a9\5\20\t\2\u00a6"+
		"\u00a9\5\22\n\2\u00a7\u00a9\5\24\13\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\27\3\2\2\2\u00aa"+
		"\u00ae\7\f\2\2\u00ab\u00ad\5$\23\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\21"+
		"\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\5@!\2\u00b6\u00b7\7#\2\2\u00b7\u00b8"+
		"\5$\23\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\5$\23\2\u00ba\33\3\2\2\2\u00bb"+
		"\u00bc\7\t\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\5@!\2\u00be\u00bf\7#\2"+
		"\2\u00bf\u00c0\5$\23\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00c3"+
		"\7\23\2\2\u00c3\u00c4\5@!\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\7\n\2\2\u00c6"+
		"\37\3\2\2\2\u00c7\u00c8\5B\"\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\5@!\2"+
		"\u00ca\u00cb\7\n\2\2\u00cb!\3\2\2\2\u00cc\u00cd\5B\"\2\u00cd\u00ce\7\33"+
		"\2\2\u00ce\u00cf\5@!\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7\16\2\2\u00d1"+
		"\u00d2\5@!\2\u00d2\u00d3\7\n\2\2\u00d3#\3\2\2\2\u00d4\u00db\5\30\r\2\u00d5"+
		"\u00db\5\32\16\2\u00d6\u00db\5\34\17\2\u00d7\u00db\5\36\20\2\u00d8\u00db"+
		"\5 \21\2\u00d9\u00db\5\"\22\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2"+
		"\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db%\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\5@!\2\u00de\'"+
		"\3\2\2\2\u00df\u00e0\7\33\2\2\u00e0\u00e1\5@!\2\u00e1\u00e2\7\36\2\2\u00e2"+
		")\3\2\2\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\4\2\2\u00e5+\3\2\2\2\u00e6"+
		"\u00e7\7\30\2\2\u00e7\u00e8\5B\"\2\u00e8\u00f1\7\23\2\2\u00e9\u00ee\5"+
		"@!\2\u00ea\u00eb\7\26\2\2\u00eb\u00ed\5@!\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4-\3\2\2\2\u00f5\u00f6\7\'\2\2\u00f6"+
		"/\3\2\2\2\u00f7\u00f8\7\6\2\2\u00f8\61\3\2\2\2\u00f9\u00fa\7\27\2\2\u00fa"+
		"\63\3\2\2\2\u00fb\u00fc\5B\"\2\u00fc\65\3\2\2\2\u00fd\u00fe\7\25\2\2\u00fe"+
		"\67\3\2\2\2\u00ff\u0100\7\5\2\2\u0100\u0101\7\22\2\2\u0101\u0102\7\33"+
		"\2\2\u0102\u0103\5@!\2\u0103\u0104\7\36\2\2\u01049\3\2\2\2\u0105\u0106"+
		"\7\5\2\2\u0106\u0107\5B\"\2\u0107\u0108\7\23\2\2\u0108\u0109\7#\2\2\u0109"+
		";\3\2\2\2\u010a\u010b\7 \2\2\u010b\u010c\5@!\2\u010c=\3\2\2\2\u010d\u010e"+
		"\7\23\2\2\u010e\u010f\5@!\2\u010f\u0110\7#\2\2\u0110?\3\2\2\2\u0111\u0112"+
		"\b!\1\2\u0112\u011c\5.\30\2\u0113\u011c\5\60\31\2\u0114\u011c\5\62\32"+
		"\2\u0115\u011c\5\64\33\2\u0116\u011c\5\66\34\2\u0117\u011c\58\35\2\u0118"+
		"\u011c\5:\36\2\u0119\u011c\5<\37\2\u011a\u011c\5> \2\u011b\u0111\3\2\2"+
		"\2\u011b\u0113\3\2\2\2\u011b\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116"+
		"\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u0127\3\2\2\2\u011d\u011e\f\17\2\2\u011e\u0126\5"+
		"&\24\2\u011f\u0120\f\16\2\2\u0120\u0126\5(\25\2\u0121\u0122\f\r\2\2\u0122"+
		"\u0126\5*\26\2\u0123\u0124\f\f\2\2\u0124\u0126\5,\27\2\u0125\u011d\3\2"+
		"\2\2\u0125\u011f\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128A\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012b\7&\2\2\u012bC\3\2\2\2\22Hagm\u0082\u0085"+
		"\u008c\u0092\u00a8\u00ae\u00da\u00ee\u00f1\u011b\u0125\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}