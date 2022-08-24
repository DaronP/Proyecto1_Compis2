// Generated from /home/yagdrassyl/Documents/Code/University/Compiladores/Proyecto1_Compis2/typescript.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class typescriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, DOT=3, COLON=4, COMMA=5, SEMICOLON=6, PLUS=7, MINUS=8, 
		MUL=9, DIV=10, POWER=11, ROUND_LEFT=12, ROUND_RIGHT=13, CURLY_LEFT=14, 
		CURLY_RIGHT=15, BRACKET_LEFT=16, BRACKET_RIGHT=17, AND=18, OR=19, NOT=20, 
		OPTIONAL=21, EQ=22, STRICT_EQ=23, NEQ=24, STRICT_NEQ=25, LT=26, LE=27, 
		GT=28, GE=29, IF=30, ELSE=31, RETURN=32, FUNCTION=33, STRING=34, NUMBER=35, 
		BOOLEAN=36, ARROW=37, WHILE=38, FOR=39, IN=40, OF=41, CONST=42, VAR=43, 
		LET=44, EQUAL=45, BREAK=46, CONTINUE=47, DELETE=48, DO=49, IDENTIFIER=50, 
		CHARS=51, DIGITS=52, WS=53, LINE_COMMENT=54, WHITESPACE=55;
	public static final int
		RULE_sAll = 0, RULE_sOperand = 1, RULE_sOperator = 2, RULE_sExpression = 3, 
		RULE_sTerm = 4, RULE_sValue = 5, RULE_sInvocation = 6, RULE_sControl = 7, 
		RULE_sStatement = 8, RULE_sPlus = 9, RULE_sMinus = 10, RULE_sMul = 11, 
		RULE_sDiv = 12, RULE_sPower = 13, RULE_sAnd = 14, RULE_sOr = 15, RULE_sNot = 16, 
		RULE_sEquals = 17, RULE_sNotEquals = 18, RULE_sLowerThan = 19, RULE_sLowerEquals = 20, 
		RULE_sGreaterThan = 21, RULE_sGreaterEquals = 22, RULE_sArithmeticExpression = 23, 
		RULE_sArithmeticTerm = 24, RULE_sBooleanOperand = 25, RULE_sBooleanOperator = 26, 
		RULE_sBooleanExpression = 27, RULE_sBooleanTerm = 28, RULE_sNumberOperand = 29, 
		RULE_sNumberOperator = 30, RULE_sNumberExpression = 31, RULE_sNumberTerm = 32, 
		RULE_sStringOperand = 33, RULE_sStringOperator = 34, RULE_sStringExpression = 35, 
		RULE_sStringTerm = 36, RULE_sConcatOperand = 37, RULE_sConcatExpression = 38, 
		RULE_sConcatLeft = 39, RULE_sConcatRight = 40, RULE_sConcatBoth = 41, 
		RULE_sType = 42, RULE_sOptional = 43, RULE_sPropertyDelete = 44, RULE_sFunction = 45, 
		RULE_sFunctionArg = 46, RULE_sFunctionArgs = 47, RULE_sFunctionArgDef = 48, 
		RULE_sFunctionArgDefs = 49, RULE_sFunctionHead = 50, RULE_sFunctionTail = 51, 
		RULE_sFunctionCall = 52, RULE_sFunctionLambda = 53, RULE_sProperty = 54, 
		RULE_sPropertyAware = 55, RULE_sPropertyAccess = 56, RULE_sFunctionAware = 57, 
		RULE_sFunctionAccess = 58, RULE_sLine = 59, RULE_sBody = 60, RULE_sReturn = 61, 
		RULE_sIf = 62, RULE_sElse = 63, RULE_sElseIf = 64, RULE_sString = 65, 
		RULE_sNumber = 66, RULE_sBoolean = 67, RULE_sArray = 68, RULE_sMap = 69, 
		RULE_sEndlessLoop = 70, RULE_sWhile = 71, RULE_sDoWhile = 72, RULE_sFor = 73, 
		RULE_sForOf = 74, RULE_sForIn = 75, RULE_sLoopTail = 76, RULE_sContinue = 77, 
		RULE_sBreak = 78, RULE_sMutableVar = 79, RULE_sImmutableVar = 80, RULE_sAssignment = 81, 
		RULE_sIncrement = 82, RULE_sDecrement = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"sAll", "sOperand", "sOperator", "sExpression", "sTerm", "sValue", "sInvocation", 
			"sControl", "sStatement", "sPlus", "sMinus", "sMul", "sDiv", "sPower", 
			"sAnd", "sOr", "sNot", "sEquals", "sNotEquals", "sLowerThan", "sLowerEquals", 
			"sGreaterThan", "sGreaterEquals", "sArithmeticExpression", "sArithmeticTerm", 
			"sBooleanOperand", "sBooleanOperator", "sBooleanExpression", "sBooleanTerm", 
			"sNumberOperand", "sNumberOperator", "sNumberExpression", "sNumberTerm", 
			"sStringOperand", "sStringOperator", "sStringExpression", "sStringTerm", 
			"sConcatOperand", "sConcatExpression", "sConcatLeft", "sConcatRight", 
			"sConcatBoth", "sType", "sOptional", "sPropertyDelete", "sFunction", 
			"sFunctionArg", "sFunctionArgs", "sFunctionArgDef", "sFunctionArgDefs", 
			"sFunctionHead", "sFunctionTail", "sFunctionCall", "sFunctionLambda", 
			"sProperty", "sPropertyAware", "sPropertyAccess", "sFunctionAware", "sFunctionAccess", 
			"sLine", "sBody", "sReturn", "sIf", "sElse", "sElseIf", "sString", "sNumber", 
			"sBoolean", "sArray", "sMap", "sEndlessLoop", "sWhile", "sDoWhile", "sFor", 
			"sForOf", "sForIn", "sLoopTail", "sContinue", "sBreak", "sMutableVar", 
			"sImmutableVar", "sAssignment", "sIncrement", "sDecrement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'.'", "':'", "','", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'**'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'&&'", 
			"'||'", "'!'", "'?'", "'=='", "'==='", "'!='", "'!=='", "'<'", "'<='", 
			"'>'", "'>='", "'if'", "'else'", "'return'", "'function'", "'string'", 
			"'number'", "'boolean'", "'=>'", "'while'", "'for'", "'in'", "'of'", 
			"'const'", "'var'", "'let'", "'='", "'break'", "'continue'", "'delete'", 
			"'do'", null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "DOT", "COLON", "COMMA", "SEMICOLON", "PLUS", 
			"MINUS", "MUL", "DIV", "POWER", "ROUND_LEFT", "ROUND_RIGHT", "CURLY_LEFT", 
			"CURLY_RIGHT", "BRACKET_LEFT", "BRACKET_RIGHT", "AND", "OR", "NOT", "OPTIONAL", 
			"EQ", "STRICT_EQ", "NEQ", "STRICT_NEQ", "LT", "LE", "GT", "GE", "IF", 
			"ELSE", "RETURN", "FUNCTION", "STRING", "NUMBER", "BOOLEAN", "ARROW", 
			"WHILE", "FOR", "IN", "OF", "CONST", "VAR", "LET", "EQUAL", "BREAK", 
			"CONTINUE", "DELETE", "DO", "IDENTIFIER", "CHARS", "DIGITS", "WS", "LINE_COMMENT", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "typescript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public typescriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SAllContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(typescriptParser.EOF, 0); }
		public List<SInvocationContext> sInvocation() {
			return getRuleContexts(SInvocationContext.class);
		}
		public SInvocationContext sInvocation(int i) {
			return getRuleContext(SInvocationContext.class,i);
		}
		public List<SPropertyContext> sProperty() {
			return getRuleContexts(SPropertyContext.class);
		}
		public SPropertyContext sProperty(int i) {
			return getRuleContext(SPropertyContext.class,i);
		}
		public List<SExpressionContext> sExpression() {
			return getRuleContexts(SExpressionContext.class);
		}
		public SExpressionContext sExpression(int i) {
			return getRuleContext(SExpressionContext.class,i);
		}
		public List<STermContext> sTerm() {
			return getRuleContexts(STermContext.class);
		}
		public STermContext sTerm(int i) {
			return getRuleContext(STermContext.class,i);
		}
		public List<SValueContext> sValue() {
			return getRuleContexts(SValueContext.class);
		}
		public SValueContext sValue(int i) {
			return getRuleContext(SValueContext.class,i);
		}
		public List<SControlContext> sControl() {
			return getRuleContexts(SControlContext.class);
		}
		public SControlContext sControl(int i) {
			return getRuleContext(SControlContext.class,i);
		}
		public List<SReturnContext> sReturn() {
			return getRuleContexts(SReturnContext.class);
		}
		public SReturnContext sReturn(int i) {
			return getRuleContext(SReturnContext.class,i);
		}
		public List<SFunctionContext> sFunction() {
			return getRuleContexts(SFunctionContext.class);
		}
		public SFunctionContext sFunction(int i) {
			return getRuleContext(SFunctionContext.class,i);
		}
		public List<SStatementContext> sStatement() {
			return getRuleContexts(SStatementContext.class);
		}
		public SStatementContext sStatement(int i) {
			return getRuleContext(SStatementContext.class,i);
		}
		public SAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sAll; }
	}

	public final SAllContext sAll() throws RecognitionException {
		SAllContext _localctx = new SAllContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ROUND_LEFT) | (1L << CURLY_LEFT) | (1L << BRACKET_LEFT) | (1L << NOT) | (1L << IF) | (1L << RETURN) | (1L << FUNCTION) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << VAR) | (1L << LET) | (1L << BREAK) | (1L << CONTINUE) | (1L << DELETE) | (1L << DO) | (1L << IDENTIFIER) | (1L << CHARS) | (1L << DIGITS))) != 0)) {
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(168);
					sInvocation();
					}
					break;
				case 2:
					{
					setState(169);
					sProperty();
					}
					break;
				case 3:
					{
					setState(170);
					sExpression();
					}
					break;
				case 4:
					{
					setState(171);
					sTerm();
					}
					break;
				case 5:
					{
					setState(172);
					sValue();
					}
					break;
				case 6:
					{
					setState(173);
					sControl();
					}
					break;
				case 7:
					{
					setState(174);
					sReturn();
					}
					break;
				case 8:
					{
					setState(175);
					sFunction();
					}
					break;
				case 9:
					{
					setState(176);
					sStatement();
					}
					break;
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(EOF);
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

	public static class SOperandContext extends ParserRuleContext {
		public SNumberContext sNumber() {
			return getRuleContext(SNumberContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public SOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sOperand; }
	}

	public final SOperandContext sOperand() throws RecognitionException {
		SOperandContext _localctx = new SOperandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sOperand);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				sNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				sProperty();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				sInvocation();
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

	public static class SOperatorContext extends ParserRuleContext {
		public SPlusContext sPlus() {
			return getRuleContext(SPlusContext.class,0);
		}
		public SMinusContext sMinus() {
			return getRuleContext(SMinusContext.class,0);
		}
		public SMulContext sMul() {
			return getRuleContext(SMulContext.class,0);
		}
		public SDivContext sDiv() {
			return getRuleContext(SDivContext.class,0);
		}
		public SPowerContext sPower() {
			return getRuleContext(SPowerContext.class,0);
		}
		public SOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sOperator; }
	}

	public final SOperatorContext sOperator() throws RecognitionException {
		SOperatorContext _localctx = new SOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sOperator);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				sPlus();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				sMinus();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				sMul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				sDiv();
				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				sPower();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SExpressionContext extends ParserRuleContext {
		public SConcatExpressionContext sConcatExpression() {
			return getRuleContext(SConcatExpressionContext.class,0);
		}
		public SArithmeticExpressionContext sArithmeticExpression() {
			return getRuleContext(SArithmeticExpressionContext.class,0);
		}
		public SBooleanExpressionContext sBooleanExpression() {
			return getRuleContext(SBooleanExpressionContext.class,0);
		}
		public SNumberExpressionContext sNumberExpression() {
			return getRuleContext(SNumberExpressionContext.class,0);
		}
		public SStringExpressionContext sStringExpression() {
			return getRuleContext(SStringExpressionContext.class,0);
		}
		public SExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpression; }
	}

	public final SExpressionContext sExpression() throws RecognitionException {
		SExpressionContext _localctx = new SExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sExpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				sConcatExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				sArithmeticExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				sBooleanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				sNumberExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				sStringExpression();
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

	public static class STermContext extends ParserRuleContext {
		public SArithmeticTermContext sArithmeticTerm() {
			return getRuleContext(SArithmeticTermContext.class,0);
		}
		public SBooleanTermContext sBooleanTerm() {
			return getRuleContext(SBooleanTermContext.class,0);
		}
		public STermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sTerm; }
	}

	public final STermContext sTerm() throws RecognitionException {
		STermContext _localctx = new STermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sTerm);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				sArithmeticTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				sBooleanTerm();
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

	public static class SValueContext extends ParserRuleContext {
		public SNumberContext sNumber() {
			return getRuleContext(SNumberContext.class,0);
		}
		public SBooleanContext sBoolean() {
			return getRuleContext(SBooleanContext.class,0);
		}
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SArrayContext sArray() {
			return getRuleContext(SArrayContext.class,0);
		}
		public SMapContext sMap() {
			return getRuleContext(SMapContext.class,0);
		}
		public SValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sValue; }
	}

	public final SValueContext sValue() throws RecognitionException {
		SValueContext _localctx = new SValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sValue);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				sNumber();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				sBoolean();
				}
				break;
			case CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				sString();
				}
				break;
			case BRACKET_LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				sArray();
				}
				break;
			case CURLY_LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				sMap();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SInvocationContext extends ParserRuleContext {
		public SPropertyAccessContext sPropertyAccess() {
			return getRuleContext(SPropertyAccessContext.class,0);
		}
		public SFunctionAccessContext sFunctionAccess() {
			return getRuleContext(SFunctionAccessContext.class,0);
		}
		public SFunctionCallContext sFunctionCall() {
			return getRuleContext(SFunctionCallContext.class,0);
		}
		public SPropertyDeleteContext sPropertyDelete() {
			return getRuleContext(SPropertyDeleteContext.class,0);
		}
		public SInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sInvocation; }
	}

	public final SInvocationContext sInvocation() throws RecognitionException {
		SInvocationContext _localctx = new SInvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sInvocation);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				sPropertyAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				sFunctionAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				sFunctionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				sPropertyDelete();
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

	public static class SControlContext extends ParserRuleContext {
		public SIfContext sIf() {
			return getRuleContext(SIfContext.class,0);
		}
		public SWhileContext sWhile() {
			return getRuleContext(SWhileContext.class,0);
		}
		public SDoWhileContext sDoWhile() {
			return getRuleContext(SDoWhileContext.class,0);
		}
		public SForContext sFor() {
			return getRuleContext(SForContext.class,0);
		}
		public SForOfContext sForOf() {
			return getRuleContext(SForOfContext.class,0);
		}
		public SForInContext sForIn() {
			return getRuleContext(SForInContext.class,0);
		}
		public SEndlessLoopContext sEndlessLoop() {
			return getRuleContext(SEndlessLoopContext.class,0);
		}
		public SContinueContext sContinue() {
			return getRuleContext(SContinueContext.class,0);
		}
		public SBreakContext sBreak() {
			return getRuleContext(SBreakContext.class,0);
		}
		public SControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sControl; }
	}

	public final SControlContext sControl() throws RecognitionException {
		SControlContext _localctx = new SControlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sControl);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				sIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				sWhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				sDoWhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				sFor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				sForOf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				sForIn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				sEndlessLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				sContinue();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				sBreak();
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

	public static class SStatementContext extends ParserRuleContext {
		public SMutableVarContext sMutableVar() {
			return getRuleContext(SMutableVarContext.class,0);
		}
		public SImmutableVarContext sImmutableVar() {
			return getRuleContext(SImmutableVarContext.class,0);
		}
		public SAssignmentContext sAssignment() {
			return getRuleContext(SAssignmentContext.class,0);
		}
		public SStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sStatement; }
	}

	public final SStatementContext sStatement() throws RecognitionException {
		SStatementContext _localctx = new SStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sStatement);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				sMutableVar();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				sImmutableVar();
				}
				break;
			case IDENTIFIER:
			case CHARS:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				sAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SPlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(typescriptParser.PLUS, 0); }
		public SPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sPlus; }
	}

	public final SPlusContext sPlus() throws RecognitionException {
		SPlusContext _localctx = new SPlusContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(PLUS);
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

	public static class SMinusContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(typescriptParser.MINUS, 0); }
		public SMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sMinus; }
	}

	public final SMinusContext sMinus() throws RecognitionException {
		SMinusContext _localctx = new SMinusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(MINUS);
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

	public static class SMulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(typescriptParser.MUL, 0); }
		public SMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sMul; }
	}

	public final SMulContext sMul() throws RecognitionException {
		SMulContext _localctx = new SMulContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sMul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(MUL);
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

	public static class SDivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(typescriptParser.DIV, 0); }
		public SDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDiv; }
	}

	public final SDivContext sDiv() throws RecognitionException {
		SDivContext _localctx = new SDivContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sDiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(DIV);
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

	public static class SPowerContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(typescriptParser.POWER, 0); }
		public SPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sPower; }
	}

	public final SPowerContext sPower() throws RecognitionException {
		SPowerContext _localctx = new SPowerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(POWER);
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

	public static class SAndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(typescriptParser.AND, 0); }
		public SAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sAnd; }
	}

	public final SAndContext sAnd() throws RecognitionException {
		SAndContext _localctx = new SAndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(AND);
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

	public static class SOrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(typescriptParser.OR, 0); }
		public SOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sOr; }
	}

	public final SOrContext sOr() throws RecognitionException {
		SOrContext _localctx = new SOrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(OR);
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

	public static class SNotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(typescriptParser.NOT, 0); }
		public SNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNot; }
	}

	public final SNotContext sNot() throws RecognitionException {
		SNotContext _localctx = new SNotContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(NOT);
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

	public static class SEqualsContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(typescriptParser.EQ, 0); }
		public TerminalNode STRICT_EQ() { return getToken(typescriptParser.STRICT_EQ, 0); }
		public SEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sEquals; }
	}

	public final SEqualsContext sEquals() throws RecognitionException {
		SEqualsContext _localctx = new SEqualsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==STRICT_EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SNotEqualsContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(typescriptParser.NEQ, 0); }
		public TerminalNode STRICT_NEQ() { return getToken(typescriptParser.STRICT_NEQ, 0); }
		public SNotEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNotEquals; }
	}

	public final SNotEqualsContext sNotEquals() throws RecognitionException {
		SNotEqualsContext _localctx = new SNotEqualsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sNotEquals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !(_la==NEQ || _la==STRICT_NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SLowerThanContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(typescriptParser.LT, 0); }
		public SLowerThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sLowerThan; }
	}

	public final SLowerThanContext sLowerThan() throws RecognitionException {
		SLowerThanContext _localctx = new SLowerThanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sLowerThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(LT);
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

	public static class SLowerEqualsContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(typescriptParser.LE, 0); }
		public SLowerEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sLowerEquals; }
	}

	public final SLowerEqualsContext sLowerEquals() throws RecognitionException {
		SLowerEqualsContext _localctx = new SLowerEqualsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sLowerEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(LE);
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

	public static class SGreaterThanContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(typescriptParser.GT, 0); }
		public SGreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sGreaterThan; }
	}

	public final SGreaterThanContext sGreaterThan() throws RecognitionException {
		SGreaterThanContext _localctx = new SGreaterThanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sGreaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(GT);
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

	public static class SGreaterEqualsContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(typescriptParser.GE, 0); }
		public SGreaterEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sGreaterEquals; }
	}

	public final SGreaterEqualsContext sGreaterEquals() throws RecognitionException {
		SGreaterEqualsContext _localctx = new SGreaterEqualsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sGreaterEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(GE);
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

	public static class SArithmeticExpressionContext extends ParserRuleContext {
		public List<SOperandContext> sOperand() {
			return getRuleContexts(SOperandContext.class);
		}
		public SOperandContext sOperand(int i) {
			return getRuleContext(SOperandContext.class,i);
		}
		public List<SArithmeticTermContext> sArithmeticTerm() {
			return getRuleContexts(SArithmeticTermContext.class);
		}
		public SArithmeticTermContext sArithmeticTerm(int i) {
			return getRuleContext(SArithmeticTermContext.class,i);
		}
		public List<SOperatorContext> sOperator() {
			return getRuleContexts(SOperatorContext.class);
		}
		public SOperatorContext sOperator(int i) {
			return getRuleContext(SOperatorContext.class,i);
		}
		public SArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sArithmeticExpression; }
	}

	public final SArithmeticExpressionContext sArithmeticExpression() throws RecognitionException {
		SArithmeticExpressionContext _localctx = new SArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sArithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_LEFT:
			case DELETE:
			case IDENTIFIER:
			case CHARS:
			case DIGITS:
				{
				setState(264);
				sOperand();
				}
				break;
			case ROUND_LEFT:
				{
				setState(265);
				sArithmeticTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				sOperator();
				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BRACKET_LEFT:
				case DELETE:
				case IDENTIFIER:
				case CHARS:
				case DIGITS:
					{
					setState(269);
					sOperand();
					}
					break;
				case ROUND_LEFT:
					{
					setState(270);
					sArithmeticTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << POWER))) != 0) );
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

	public static class SArithmeticTermContext extends ParserRuleContext {
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SArithmeticTermContext sArithmeticTerm() {
			return getRuleContext(SArithmeticTermContext.class,0);
		}
		public List<SOperandContext> sOperand() {
			return getRuleContexts(SOperandContext.class);
		}
		public SOperandContext sOperand(int i) {
			return getRuleContext(SOperandContext.class,i);
		}
		public List<SOperatorContext> sOperator() {
			return getRuleContexts(SOperatorContext.class);
		}
		public SOperatorContext sOperator(int i) {
			return getRuleContext(SOperatorContext.class,i);
		}
		public SArithmeticTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sArithmeticTerm; }
	}

	public final SArithmeticTermContext sArithmeticTerm() throws RecognitionException {
		SArithmeticTermContext _localctx = new SArithmeticTermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sArithmeticTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ROUND_LEFT);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_LEFT:
			case DELETE:
			case IDENTIFIER:
			case CHARS:
			case DIGITS:
				{
				{
				setState(278);
				sOperand();
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(279);
					sOperator();
					setState(280);
					sOperand();
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << POWER))) != 0) );
				}
				}
				break;
			case ROUND_LEFT:
				{
				setState(286);
				sArithmeticTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(289);
			match(ROUND_RIGHT);
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

	public static class SBooleanOperandContext extends ParserRuleContext {
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public List<SNotContext> sNot() {
			return getRuleContexts(SNotContext.class);
		}
		public SNotContext sNot(int i) {
			return getRuleContext(SNotContext.class,i);
		}
		public SBooleanOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBooleanOperand; }
	}

	public final SBooleanOperandContext sBooleanOperand() throws RecognitionException {
		SBooleanOperandContext _localctx = new SBooleanOperandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sBooleanOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(291);
				sNot();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(297);
				sValue();
				}
				break;
			case 2:
				{
				setState(298);
				sProperty();
				}
				break;
			case 3:
				{
				setState(299);
				sInvocation();
				}
				break;
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

	public static class SBooleanOperatorContext extends ParserRuleContext {
		public SAndContext sAnd() {
			return getRuleContext(SAndContext.class,0);
		}
		public SOrContext sOr() {
			return getRuleContext(SOrContext.class,0);
		}
		public SNotContext sNot() {
			return getRuleContext(SNotContext.class,0);
		}
		public SEqualsContext sEquals() {
			return getRuleContext(SEqualsContext.class,0);
		}
		public SNotEqualsContext sNotEquals() {
			return getRuleContext(SNotEqualsContext.class,0);
		}
		public SBooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBooleanOperator; }
	}

	public final SBooleanOperatorContext sBooleanOperator() throws RecognitionException {
		SBooleanOperatorContext _localctx = new SBooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sBooleanOperator);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				sAnd();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				sOr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				sNot();
				}
				break;
			case EQ:
			case STRICT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				sEquals();
				}
				break;
			case NEQ:
			case STRICT_NEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				sNotEquals();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SBooleanExpressionContext extends ParserRuleContext {
		public List<SBooleanTermContext> sBooleanTerm() {
			return getRuleContexts(SBooleanTermContext.class);
		}
		public SBooleanTermContext sBooleanTerm(int i) {
			return getRuleContext(SBooleanTermContext.class,i);
		}
		public List<SBooleanOperatorContext> sBooleanOperator() {
			return getRuleContexts(SBooleanOperatorContext.class);
		}
		public SBooleanOperatorContext sBooleanOperator(int i) {
			return getRuleContext(SBooleanOperatorContext.class,i);
		}
		public List<SBooleanOperandContext> sBooleanOperand() {
			return getRuleContexts(SBooleanOperandContext.class);
		}
		public SBooleanOperandContext sBooleanOperand(int i) {
			return getRuleContext(SBooleanOperandContext.class,i);
		}
		public SBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBooleanExpression; }
	}

	public final SBooleanExpressionContext sBooleanExpression() throws RecognitionException {
		SBooleanExpressionContext _localctx = new SBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sBooleanExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CURLY_LEFT:
			case BRACKET_LEFT:
			case NOT:
			case DELETE:
			case IDENTIFIER:
			case CHARS:
			case DIGITS:
				{
				{
				setState(309);
				sBooleanOperand();
				}
				}
				break;
			case ROUND_LEFT:
				{
				setState(310);
				sBooleanTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					sBooleanOperator();
					setState(316);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case CURLY_LEFT:
					case BRACKET_LEFT:
					case NOT:
					case DELETE:
					case IDENTIFIER:
					case CHARS:
					case DIGITS:
						{
						setState(314);
						sBooleanOperand();
						}
						break;
					case ROUND_LEFT:
						{
						setState(315);
						sBooleanTerm();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class SBooleanTermContext extends ParserRuleContext {
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SBooleanTermContext sBooleanTerm() {
			return getRuleContext(SBooleanTermContext.class,0);
		}
		public List<SBooleanOperandContext> sBooleanOperand() {
			return getRuleContexts(SBooleanOperandContext.class);
		}
		public SBooleanOperandContext sBooleanOperand(int i) {
			return getRuleContext(SBooleanOperandContext.class,i);
		}
		public List<SBooleanOperatorContext> sBooleanOperator() {
			return getRuleContexts(SBooleanOperatorContext.class);
		}
		public SBooleanOperatorContext sBooleanOperator(int i) {
			return getRuleContext(SBooleanOperatorContext.class,i);
		}
		public SBooleanTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBooleanTerm; }
	}

	public final SBooleanTermContext sBooleanTerm() throws RecognitionException {
		SBooleanTermContext _localctx = new SBooleanTermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sBooleanTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ROUND_LEFT);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CURLY_LEFT:
			case BRACKET_LEFT:
			case NOT:
			case DELETE:
			case IDENTIFIER:
			case CHARS:
			case DIGITS:
				{
				{
				setState(324);
				sBooleanOperand();
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(325);
					sBooleanOperator();
					setState(326);
					sBooleanOperand();
					}
					}
					setState(330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << EQ) | (1L << STRICT_EQ) | (1L << NEQ) | (1L << STRICT_NEQ))) != 0) );
				}
				}
				break;
			case ROUND_LEFT:
				{
				setState(332);
				sBooleanTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
			match(ROUND_RIGHT);
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

	public static class SNumberOperandContext extends ParserRuleContext {
		public SNumberContext sNumber() {
			return getRuleContext(SNumberContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SNumberOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNumberOperand; }
	}

	public final SNumberOperandContext sNumberOperand() throws RecognitionException {
		SNumberOperandContext _localctx = new SNumberOperandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sNumberOperand);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				sNumber();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				sProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SNumberOperatorContext extends ParserRuleContext {
		public SEqualsContext sEquals() {
			return getRuleContext(SEqualsContext.class,0);
		}
		public SNotEqualsContext sNotEquals() {
			return getRuleContext(SNotEqualsContext.class,0);
		}
		public SLowerThanContext sLowerThan() {
			return getRuleContext(SLowerThanContext.class,0);
		}
		public SLowerEqualsContext sLowerEquals() {
			return getRuleContext(SLowerEqualsContext.class,0);
		}
		public SGreaterThanContext sGreaterThan() {
			return getRuleContext(SGreaterThanContext.class,0);
		}
		public SGreaterEqualsContext sGreaterEquals() {
			return getRuleContext(SGreaterEqualsContext.class,0);
		}
		public SNumberOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNumberOperator; }
	}

	public final SNumberOperatorContext sNumberOperator() throws RecognitionException {
		SNumberOperatorContext _localctx = new SNumberOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sNumberOperator);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case STRICT_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				sEquals();
				}
				break;
			case NEQ:
			case STRICT_NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				sNotEquals();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				sLowerThan();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				sLowerEquals();
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				sGreaterThan();
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				sGreaterEquals();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SNumberExpressionContext extends ParserRuleContext {
		public List<SNumberOperandContext> sNumberOperand() {
			return getRuleContexts(SNumberOperandContext.class);
		}
		public SNumberOperandContext sNumberOperand(int i) {
			return getRuleContext(SNumberOperandContext.class,i);
		}
		public List<SNumberTermContext> sNumberTerm() {
			return getRuleContexts(SNumberTermContext.class);
		}
		public SNumberTermContext sNumberTerm(int i) {
			return getRuleContext(SNumberTermContext.class,i);
		}
		public List<SNumberOperatorContext> sNumberOperator() {
			return getRuleContexts(SNumberOperatorContext.class);
		}
		public SNumberOperatorContext sNumberOperator(int i) {
			return getRuleContext(SNumberOperatorContext.class,i);
		}
		public SNumberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNumberExpression; }
	}

	public final SNumberExpressionContext sNumberExpression() throws RecognitionException {
		SNumberExpressionContext _localctx = new SNumberExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sNumberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DIGITS:
				{
				setState(349);
				sNumberOperand();
				}
				break;
			case ROUND_LEFT:
				{
				setState(350);
				sNumberTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(353);
				sNumberOperator();
				setState(356);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case DIGITS:
					{
					setState(354);
					sNumberOperand();
					}
					break;
				case ROUND_LEFT:
					{
					setState(355);
					sNumberTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << STRICT_EQ) | (1L << NEQ) | (1L << STRICT_NEQ) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0) );
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

	public static class SNumberTermContext extends ParserRuleContext {
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SNumberTermContext sNumberTerm() {
			return getRuleContext(SNumberTermContext.class,0);
		}
		public List<SNumberOperandContext> sNumberOperand() {
			return getRuleContexts(SNumberOperandContext.class);
		}
		public SNumberOperandContext sNumberOperand(int i) {
			return getRuleContext(SNumberOperandContext.class,i);
		}
		public List<SNumberOperatorContext> sNumberOperator() {
			return getRuleContexts(SNumberOperatorContext.class);
		}
		public SNumberOperatorContext sNumberOperator(int i) {
			return getRuleContext(SNumberOperatorContext.class,i);
		}
		public SNumberTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNumberTerm; }
	}

	public final SNumberTermContext sNumberTerm() throws RecognitionException {
		SNumberTermContext _localctx = new SNumberTermContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sNumberTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ROUND_LEFT);
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DIGITS:
				{
				{
				setState(363);
				sNumberOperand();
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(364);
					sNumberOperator();
					setState(365);
					sNumberOperand();
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << STRICT_EQ) | (1L << NEQ) | (1L << STRICT_NEQ) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0) );
				}
				}
				break;
			case ROUND_LEFT:
				{
				setState(371);
				sNumberTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374);
			match(ROUND_RIGHT);
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

	public static class SStringOperandContext extends ParserRuleContext {
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SStringOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sStringOperand; }
	}

	public final SStringOperandContext sStringOperand() throws RecognitionException {
		SStringOperandContext _localctx = new SStringOperandContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sStringOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			sString();
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

	public static class SStringOperatorContext extends ParserRuleContext {
		public SEqualsContext sEquals() {
			return getRuleContext(SEqualsContext.class,0);
		}
		public SNotEqualsContext sNotEquals() {
			return getRuleContext(SNotEqualsContext.class,0);
		}
		public SStringOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sStringOperator; }
	}

	public final SStringOperatorContext sStringOperator() throws RecognitionException {
		SStringOperatorContext _localctx = new SStringOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sStringOperator);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case STRICT_EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				sEquals();
				}
				break;
			case NEQ:
			case STRICT_NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				sNotEquals();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SStringExpressionContext extends ParserRuleContext {
		public List<SStringOperandContext> sStringOperand() {
			return getRuleContexts(SStringOperandContext.class);
		}
		public SStringOperandContext sStringOperand(int i) {
			return getRuleContext(SStringOperandContext.class,i);
		}
		public List<SStringTermContext> sStringTerm() {
			return getRuleContexts(SStringTermContext.class);
		}
		public SStringTermContext sStringTerm(int i) {
			return getRuleContext(SStringTermContext.class,i);
		}
		public List<SStringOperatorContext> sStringOperator() {
			return getRuleContexts(SStringOperatorContext.class);
		}
		public SStringOperatorContext sStringOperator(int i) {
			return getRuleContext(SStringOperatorContext.class,i);
		}
		public SStringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sStringExpression; }
	}

	public final SStringExpressionContext sStringExpression() throws RecognitionException {
		SStringExpressionContext _localctx = new SStringExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sStringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				setState(382);
				sStringOperand();
				}
				break;
			case ROUND_LEFT:
				{
				setState(383);
				sStringTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(386);
				sStringOperator();
				setState(389);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHARS:
					{
					setState(387);
					sStringOperand();
					}
					break;
				case ROUND_LEFT:
					{
					setState(388);
					sStringTerm();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << STRICT_EQ) | (1L << NEQ) | (1L << STRICT_NEQ))) != 0) );
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

	public static class SStringTermContext extends ParserRuleContext {
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SStringTermContext sStringTerm() {
			return getRuleContext(SStringTermContext.class,0);
		}
		public List<SStringOperandContext> sStringOperand() {
			return getRuleContexts(SStringOperandContext.class);
		}
		public SStringOperandContext sStringOperand(int i) {
			return getRuleContext(SStringOperandContext.class,i);
		}
		public List<SStringOperatorContext> sStringOperator() {
			return getRuleContexts(SStringOperatorContext.class);
		}
		public SStringOperatorContext sStringOperator(int i) {
			return getRuleContext(SStringOperatorContext.class,i);
		}
		public SStringTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sStringTerm; }
	}

	public final SStringTermContext sStringTerm() throws RecognitionException {
		SStringTermContext _localctx = new SStringTermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sStringTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(ROUND_LEFT);
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				{
				{
				setState(396);
				sStringOperand();
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(397);
					sStringOperator();
					setState(398);
					sStringOperand();
					}
					}
					setState(402); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << STRICT_EQ) | (1L << NEQ) | (1L << STRICT_NEQ))) != 0) );
				}
				}
				break;
			case ROUND_LEFT:
				{
				setState(404);
				sStringTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			match(ROUND_RIGHT);
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

	public static class SConcatOperandContext extends ParserRuleContext {
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SConcatOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sConcatOperand; }
	}

	public final SConcatOperandContext sConcatOperand() throws RecognitionException {
		SConcatOperandContext _localctx = new SConcatOperandContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sConcatOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			sString();
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

	public static class SConcatExpressionContext extends ParserRuleContext {
		public SConcatBothContext sConcatBoth() {
			return getRuleContext(SConcatBothContext.class,0);
		}
		public SConcatLeftContext sConcatLeft() {
			return getRuleContext(SConcatLeftContext.class,0);
		}
		public SConcatRightContext sConcatRight() {
			return getRuleContext(SConcatRightContext.class,0);
		}
		public SConcatExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sConcatExpression; }
	}

	public final SConcatExpressionContext sConcatExpression() throws RecognitionException {
		SConcatExpressionContext _localctx = new SConcatExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sConcatExpression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				sConcatBoth();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				sConcatLeft();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				sConcatRight();
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

	public static class SConcatLeftContext extends ParserRuleContext {
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SPlusContext sPlus() {
			return getRuleContext(SPlusContext.class,0);
		}
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SConcatLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sConcatLeft; }
	}

	public final SConcatLeftContext sConcatLeft() throws RecognitionException {
		SConcatLeftContext _localctx = new SConcatLeftContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sConcatLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			sString();
			setState(417);
			sPlus();
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case CURLY_LEFT:
			case BRACKET_LEFT:
			case CHARS:
			case DIGITS:
				{
				setState(418);
				sValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(419);
				sProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SConcatRightContext extends ParserRuleContext {
		public SPlusContext sPlus() {
			return getRuleContext(SPlusContext.class,0);
		}
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SConcatRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sConcatRight; }
	}

	public final SConcatRightContext sConcatRight() throws RecognitionException {
		SConcatRightContext _localctx = new SConcatRightContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sConcatRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(422);
				sInvocation();
				}
				break;
			case 2:
				{
				setState(423);
				sProperty();
				}
				break;
			}
			setState(426);
			sPlus();
			setState(427);
			sString();
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

	public static class SConcatBothContext extends ParserRuleContext {
		public List<SStringContext> sString() {
			return getRuleContexts(SStringContext.class);
		}
		public SStringContext sString(int i) {
			return getRuleContext(SStringContext.class,i);
		}
		public List<SPlusContext> sPlus() {
			return getRuleContexts(SPlusContext.class);
		}
		public SPlusContext sPlus(int i) {
			return getRuleContext(SPlusContext.class,i);
		}
		public SConcatBothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sConcatBoth; }
	}

	public final SConcatBothContext sConcatBoth() throws RecognitionException {
		SConcatBothContext _localctx = new SConcatBothContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sConcatBoth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			sString();
			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(430);
				sPlus();
				setState(431);
				sString();
				}
				}
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PLUS );
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

	public static class STypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(typescriptParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(typescriptParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(typescriptParser.BOOLEAN, 0); }
		public STypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sType; }
	}

	public final STypeContext sType() throws RecognitionException {
		STypeContext _localctx = new STypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SOptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(typescriptParser.OPTIONAL, 0); }
		public SOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sOptional; }
	}

	public final SOptionalContext sOptional() throws RecognitionException {
		SOptionalContext _localctx = new SOptionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sOptional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(OPTIONAL);
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

	public static class SPropertyDeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(typescriptParser.DELETE, 0); }
		public SPropertyAccessContext sPropertyAccess() {
			return getRuleContext(SPropertyAccessContext.class,0);
		}
		public SPropertyDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sPropertyDelete; }
	}

	public final SPropertyDeleteContext sPropertyDelete() throws RecognitionException {
		SPropertyDeleteContext _localctx = new SPropertyDeleteContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sPropertyDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(DELETE);
			setState(442);
			sPropertyAccess();
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

	public static class SFunctionContext extends ParserRuleContext {
		public SFunctionHeadContext sFunctionHead() {
			return getRuleContext(SFunctionHeadContext.class,0);
		}
		public SFunctionTailContext sFunctionTail() {
			return getRuleContext(SFunctionTailContext.class,0);
		}
		public SFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunction; }
	}

	public final SFunctionContext sFunction() throws RecognitionException {
		SFunctionContext _localctx = new SFunctionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			sFunctionHead();
			setState(445);
			sFunctionTail();
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

	public static class SFunctionArgContext extends ParserRuleContext {
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SFunctionLambdaContext sFunctionLambda() {
			return getRuleContext(SFunctionLambdaContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public SFunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionArg; }
	}

	public final SFunctionArgContext sFunctionArg() throws RecognitionException {
		SFunctionArgContext _localctx = new SFunctionArgContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sFunctionArg);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				sValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				sExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				sFunctionLambda();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				sInvocation();
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

	public static class SFunctionArgsContext extends ParserRuleContext {
		public List<SFunctionArgContext> sFunctionArg() {
			return getRuleContexts(SFunctionArgContext.class);
		}
		public SFunctionArgContext sFunctionArg(int i) {
			return getRuleContext(SFunctionArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptParser.COMMA, i);
		}
		public SFunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionArgs; }
	}

	public final SFunctionArgsContext sFunctionArgs() throws RecognitionException {
		SFunctionArgsContext _localctx = new SFunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sFunctionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			sFunctionArg();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(454);
				match(COMMA);
				setState(455);
				sFunctionArg();
				}
				}
				setState(460);
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

	public static class SFunctionArgDefContext extends ParserRuleContext {
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(typescriptParser.COLON, 0); }
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public SFunctionArgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionArgDef; }
	}

	public final SFunctionArgDefContext sFunctionArgDef() throws RecognitionException {
		SFunctionArgDefContext _localctx = new SFunctionArgDefContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sFunctionArgDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			sProperty();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(462);
				match(COLON);
				setState(463);
				sType();
				}
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

	public static class SFunctionArgDefsContext extends ParserRuleContext {
		public List<SFunctionArgDefContext> sFunctionArgDef() {
			return getRuleContexts(SFunctionArgDefContext.class);
		}
		public SFunctionArgDefContext sFunctionArgDef(int i) {
			return getRuleContext(SFunctionArgDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptParser.COMMA, i);
		}
		public SFunctionArgDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionArgDefs; }
	}

	public final SFunctionArgDefsContext sFunctionArgDefs() throws RecognitionException {
		SFunctionArgDefsContext _localctx = new SFunctionArgDefsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sFunctionArgDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			sFunctionArgDef();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(467);
				match(COMMA);
				setState(468);
				sFunctionArgDef();
				}
				}
				setState(473);
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

	public static class SFunctionHeadContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(typescriptParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SFunctionArgDefsContext sFunctionArgDefs() {
			return getRuleContext(SFunctionArgDefsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(typescriptParser.COLON, 0); }
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public SFunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionHead; }
	}

	public final SFunctionHeadContext sFunctionHead() throws RecognitionException {
		SFunctionHeadContext _localctx = new SFunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sFunctionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(FUNCTION);
			setState(475);
			match(IDENTIFIER);
			setState(476);
			match(ROUND_LEFT);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(477);
				sFunctionArgDefs();
				}
			}

			setState(480);
			match(ROUND_RIGHT);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(481);
				match(COLON);
				setState(482);
				sType();
				}
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

	public static class SFunctionTailContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public SBodyContext sBody() {
			return getRuleContext(SBodyContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public SFunctionTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionTail; }
	}

	public final SFunctionTailContext sFunctionTail() throws RecognitionException {
		SFunctionTailContext _localctx = new SFunctionTailContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sFunctionTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(CURLY_LEFT);
			setState(486);
			sBody();
			setState(487);
			match(CURLY_RIGHT);
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

	public static class SFunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SFunctionArgsContext sFunctionArgs() {
			return getRuleContext(SFunctionArgsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionCall; }
	}

	public final SFunctionCallContext sFunctionCall() throws RecognitionException {
		SFunctionCallContext _localctx = new SFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(IDENTIFIER);
			setState(490);
			match(ROUND_LEFT);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ROUND_LEFT) | (1L << CURLY_LEFT) | (1L << BRACKET_LEFT) | (1L << NOT) | (1L << DELETE) | (1L << IDENTIFIER) | (1L << CHARS) | (1L << DIGITS))) != 0)) {
				{
				setState(491);
				sFunctionArgs();
				}
			}

			setState(494);
			match(ROUND_RIGHT);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(495);
				match(SEMICOLON);
				}
				break;
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

	public static class SFunctionLambdaContext extends ParserRuleContext {
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SFunctionArgDefsContext sFunctionArgDefs() {
			return getRuleContext(SFunctionArgDefsContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public TerminalNode ARROW() { return getToken(typescriptParser.ARROW, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SFunctionTailContext sFunctionTail() {
			return getRuleContext(SFunctionTailContext.class,0);
		}
		public SFunctionLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionLambda; }
	}

	public final SFunctionLambdaContext sFunctionLambda() throws RecognitionException {
		SFunctionLambdaContext _localctx = new SFunctionLambdaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sFunctionLambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ROUND_LEFT);
			setState(499);
			sFunctionArgDefs();
			setState(500);
			match(ROUND_RIGHT);
			setState(501);
			match(ARROW);
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(502);
				sExpression();
				}
				break;
			case 2:
				{
				setState(503);
				sFunctionTail();
				}
				break;
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

	public static class SPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public SPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sProperty; }
	}

	public final SPropertyContext sProperty() throws RecognitionException {
		SPropertyContext _localctx = new SPropertyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(IDENTIFIER);
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

	public static class SPropertyAwareContext extends ParserRuleContext {
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SPropertyAwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sPropertyAware; }
	}

	public final SPropertyAwareContext sPropertyAware() throws RecognitionException {
		SPropertyAwareContext _localctx = new SPropertyAwareContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sPropertyAware);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				sString();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				sProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SPropertyAccessContext extends ParserRuleContext {
		public SPropertyAwareContext sPropertyAware() {
			return getRuleContext(SPropertyAwareContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(typescriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(typescriptParser.DOT, i);
		}
		public List<SPropertyContext> sProperty() {
			return getRuleContexts(SPropertyContext.class);
		}
		public SPropertyContext sProperty(int i) {
			return getRuleContext(SPropertyContext.class,i);
		}
		public List<TerminalNode> BRACKET_LEFT() { return getTokens(typescriptParser.BRACKET_LEFT); }
		public TerminalNode BRACKET_LEFT(int i) {
			return getToken(typescriptParser.BRACKET_LEFT, i);
		}
		public List<TerminalNode> BRACKET_RIGHT() { return getTokens(typescriptParser.BRACKET_RIGHT); }
		public TerminalNode BRACKET_RIGHT(int i) {
			return getToken(typescriptParser.BRACKET_RIGHT, i);
		}
		public List<SOptionalContext> sOptional() {
			return getRuleContexts(SOptionalContext.class);
		}
		public SOptionalContext sOptional(int i) {
			return getRuleContext(SOptionalContext.class,i);
		}
		public List<SNumberContext> sNumber() {
			return getRuleContexts(SNumberContext.class);
		}
		public SNumberContext sNumber(int i) {
			return getRuleContext(SNumberContext.class,i);
		}
		public List<SStringContext> sString() {
			return getRuleContexts(SStringContext.class);
		}
		public SStringContext sString(int i) {
			return getRuleContext(SStringContext.class,i);
		}
		public SPropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sPropertyAccess; }
	}

	public final SPropertyAccessContext sPropertyAccess() throws RecognitionException {
		SPropertyAccessContext _localctx = new SPropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sPropertyAccess);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			sPropertyAware();
			setState(525); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(525);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case OPTIONAL:
						{
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OPTIONAL) {
							{
							setState(513);
							sOptional();
							}
						}

						{
						setState(516);
						match(DOT);
						setState(517);
						sProperty();
						}
						}
						break;
					case BRACKET_LEFT:
						{
						{
						setState(518);
						match(BRACKET_LEFT);
						setState(521);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DIGITS:
							{
							setState(519);
							sNumber();
							}
							break;
						case CHARS:
							{
							setState(520);
							sString();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(523);
						match(BRACKET_RIGHT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(527); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SFunctionAwareContext extends ParserRuleContext {
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SArrayContext sArray() {
			return getRuleContext(SArrayContext.class,0);
		}
		public SFunctionAwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionAware; }
	}

	public final SFunctionAwareContext sFunctionAware() throws RecognitionException {
		SFunctionAwareContext _localctx = new SFunctionAwareContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sFunctionAware);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARS:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				sString();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				sProperty();
				}
				break;
			case BRACKET_LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				sArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SFunctionAccessContext extends ParserRuleContext {
		public SFunctionAwareContext sFunctionAware() {
			return getRuleContext(SFunctionAwareContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(typescriptParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(typescriptParser.DOT, i);
		}
		public List<SFunctionCallContext> sFunctionCall() {
			return getRuleContexts(SFunctionCallContext.class);
		}
		public SFunctionCallContext sFunctionCall(int i) {
			return getRuleContext(SFunctionCallContext.class,i);
		}
		public SFunctionAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFunctionAccess; }
	}

	public final SFunctionAccessContext sFunctionAccess() throws RecognitionException {
		SFunctionAccessContext _localctx = new SFunctionAccessContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sFunctionAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			sFunctionAware();
			setState(537); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(535);
				match(DOT);
				setState(536);
				sFunctionCall();
				}
				}
				setState(539); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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

	public static class SLineContext extends ParserRuleContext {
		public SControlContext sControl() {
			return getRuleContext(SControlContext.class,0);
		}
		public SAssignmentContext sAssignment() {
			return getRuleContext(SAssignmentContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public SReturnContext sReturn() {
			return getRuleContext(SReturnContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sLine; }
	}

	public final SLineContext sLine() throws RecognitionException {
		SLineContext _localctx = new SLineContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(541);
				sControl();
				}
				break;
			case 2:
				{
				setState(542);
				sAssignment();
				}
				break;
			case 3:
				{
				setState(543);
				sInvocation();
				}
				break;
			case 4:
				{
				setState(544);
				sReturn();
				}
				break;
			}
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(547);
				match(SEMICOLON);
				}
				break;
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

	public static class SBodyContext extends ParserRuleContext {
		public List<SControlContext> sControl() {
			return getRuleContexts(SControlContext.class);
		}
		public SControlContext sControl(int i) {
			return getRuleContext(SControlContext.class,i);
		}
		public List<SAssignmentContext> sAssignment() {
			return getRuleContexts(SAssignmentContext.class);
		}
		public SAssignmentContext sAssignment(int i) {
			return getRuleContext(SAssignmentContext.class,i);
		}
		public List<SInvocationContext> sInvocation() {
			return getRuleContexts(SInvocationContext.class);
		}
		public SInvocationContext sInvocation(int i) {
			return getRuleContext(SInvocationContext.class,i);
		}
		public SReturnContext sReturn() {
			return getRuleContext(SReturnContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBody; }
	}

	public final SBodyContext sBody() throws RecognitionException {
		SBodyContext _localctx = new SBodyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRACKET_LEFT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << DELETE) | (1L << DO) | (1L << IDENTIFIER) | (1L << CHARS))) != 0)) {
				{
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(550);
					sControl();
					}
					break;
				case 2:
					{
					setState(551);
					sAssignment();
					}
					break;
				case 3:
					{
					setState(552);
					sInvocation();
					}
					break;
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(558);
				sReturn();
				}
			}

			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(561);
				match(SEMICOLON);
				}
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

	public static class SReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(typescriptParser.RETURN, 0); }
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public SReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sReturn; }
	}

	public final SReturnContext sReturn() throws RecognitionException {
		SReturnContext _localctx = new SReturnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(RETURN);
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(565);
				sValue();
				}
				break;
			case 2:
				{
				setState(566);
				sExpression();
				}
				break;
			case 3:
				{
				setState(567);
				sProperty();
				}
				break;
			case 4:
				{
				setState(568);
				sInvocation();
				}
				break;
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

	public static class SIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(typescriptParser.IF, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SLineContext sLine() {
			return getRuleContext(SLineContext.class,0);
		}
		public List<SElseIfContext> sElseIf() {
			return getRuleContexts(SElseIfContext.class);
		}
		public SElseIfContext sElseIf(int i) {
			return getRuleContext(SElseIfContext.class,i);
		}
		public SElseContext sElse() {
			return getRuleContext(SElseContext.class,0);
		}
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public SBodyContext sBody() {
			return getRuleContext(SBodyContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public SIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sIf; }
	}

	public final SIfContext sIf() throws RecognitionException {
		SIfContext _localctx = new SIfContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(IF);
			setState(572);
			match(ROUND_LEFT);
			setState(573);
			sExpression();
			setState(574);
			match(ROUND_RIGHT);
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_LEFT:
			case IF:
			case RETURN:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case DELETE:
			case DO:
			case IDENTIFIER:
			case CHARS:
				{
				setState(575);
				sLine();
				}
				break;
			case CURLY_LEFT:
				{
				{
				setState(576);
				match(CURLY_LEFT);
				setState(577);
				sBody();
				setState(578);
				match(CURLY_RIGHT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					sElseIf();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(588);
				sElse();
				}
				break;
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

	public static class SElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(typescriptParser.ELSE, 0); }
		public SReturnContext sReturn() {
			return getRuleContext(SReturnContext.class,0);
		}
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public SBodyContext sBody() {
			return getRuleContext(SBodyContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public SElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sElse; }
	}

	public final SElseContext sElse() throws RecognitionException {
		SElseContext _localctx = new SElseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(ELSE);
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(592);
				sReturn();
				}
				break;
			case CURLY_LEFT:
				{
				{
				setState(593);
				match(CURLY_LEFT);
				setState(594);
				sBody();
				setState(595);
				match(CURLY_RIGHT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SElseIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(typescriptParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(typescriptParser.IF, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SBooleanExpressionContext sBooleanExpression() {
			return getRuleContext(SBooleanExpressionContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SReturnContext sReturn() {
			return getRuleContext(SReturnContext.class,0);
		}
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public SBodyContext sBody() {
			return getRuleContext(SBodyContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public SElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sElseIf; }
	}

	public final SElseIfContext sElseIf() throws RecognitionException {
		SElseIfContext _localctx = new SElseIfContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sElseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(ELSE);
			setState(600);
			match(IF);
			setState(601);
			match(ROUND_LEFT);
			setState(602);
			sBooleanExpression();
			setState(603);
			match(ROUND_RIGHT);
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(604);
				sReturn();
				}
				break;
			case CURLY_LEFT:
				{
				{
				setState(605);
				match(CURLY_LEFT);
				setState(606);
				sBody();
				setState(607);
				match(CURLY_RIGHT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SStringContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(typescriptParser.CHARS, 0); }
		public SStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sString; }
	}

	public final SStringContext sString() throws RecognitionException {
		SStringContext _localctx = new SStringContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(CHARS);
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

	public static class SNumberContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(typescriptParser.DIGITS, 0); }
		public SNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sNumber; }
	}

	public final SNumberContext sNumber() throws RecognitionException {
		SNumberContext _localctx = new SNumberContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(DIGITS);
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

	public static class SBooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(typescriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(typescriptParser.FALSE, 0); }
		public SBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBoolean; }
	}

	public final SBooleanContext sBoolean() throws RecognitionException {
		SBooleanContext _localctx = new SBooleanContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_sBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SArrayContext extends ParserRuleContext {
		public TerminalNode BRACKET_LEFT() { return getToken(typescriptParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(typescriptParser.BRACKET_RIGHT, 0); }
		public List<SValueContext> sValue() {
			return getRuleContexts(SValueContext.class);
		}
		public SValueContext sValue(int i) {
			return getRuleContext(SValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptParser.COMMA, i);
		}
		public SArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sArray; }
	}

	public final SArrayContext sArray() throws RecognitionException {
		SArrayContext _localctx = new SArrayContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_sArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(BRACKET_LEFT);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << CURLY_LEFT) | (1L << BRACKET_LEFT) | (1L << CHARS) | (1L << DIGITS))) != 0)) {
				{
				setState(618);
				sValue();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(619);
					match(COMMA);
					setState(620);
					sValue();
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(628);
			match(BRACKET_RIGHT);
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

	public static class SMapContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public List<SStringContext> sString() {
			return getRuleContexts(SStringContext.class);
		}
		public SStringContext sString(int i) {
			return getRuleContext(SStringContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(typescriptParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(typescriptParser.COLON, i);
		}
		public List<SValueContext> sValue() {
			return getRuleContexts(SValueContext.class);
		}
		public SValueContext sValue(int i) {
			return getRuleContext(SValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptParser.COMMA, i);
		}
		public SMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sMap; }
	}

	public final SMapContext sMap() throws RecognitionException {
		SMapContext _localctx = new SMapContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sMap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(CURLY_LEFT);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHARS) {
				{
				setState(631);
				sString();
				setState(632);
				match(COLON);
				setState(633);
				sValue();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(634);
					match(COMMA);
					setState(635);
					sString();
					setState(636);
					match(COLON);
					setState(637);
					sValue();
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(646);
			match(CURLY_RIGHT);
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

	public static class SEndlessLoopContext extends ParserRuleContext {
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(typescriptParser.WHILE, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode TRUE() { return getToken(typescriptParser.TRUE, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public TerminalNode FOR() { return getToken(typescriptParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(typescriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(typescriptParser.SEMICOLON, i);
		}
		public SEndlessLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sEndlessLoop; }
	}

	public final SEndlessLoopContext sEndlessLoop() throws RecognitionException {
		SEndlessLoopContext _localctx = new SEndlessLoopContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_sEndlessLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				{
				setState(648);
				match(WHILE);
				setState(649);
				match(ROUND_LEFT);
				setState(650);
				match(TRUE);
				setState(651);
				match(ROUND_RIGHT);
				}
				}
				break;
			case FOR:
				{
				{
				setState(652);
				match(FOR);
				setState(653);
				match(ROUND_LEFT);
				setState(654);
				match(SEMICOLON);
				setState(655);
				match(SEMICOLON);
				setState(656);
				match(ROUND_RIGHT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			sLoopTail();
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

	public static class SWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(typescriptParser.WHILE, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public SWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sWhile; }
	}

	public final SWhileContext sWhile() throws RecognitionException {
		SWhileContext _localctx = new SWhileContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(WHILE);
			setState(662);
			match(ROUND_LEFT);
			setState(663);
			sExpression();
			setState(664);
			match(ROUND_RIGHT);
			setState(665);
			sLoopTail();
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

	public static class SDoWhileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(typescriptParser.DO, 0); }
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(typescriptParser.WHILE, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDoWhile; }
	}

	public final SDoWhileContext sDoWhile() throws RecognitionException {
		SDoWhileContext _localctx = new SDoWhileContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_sDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(DO);
			setState(668);
			sLoopTail();
			setState(669);
			match(WHILE);
			setState(670);
			match(ROUND_LEFT);
			setState(671);
			sExpression();
			setState(672);
			match(ROUND_RIGHT);
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

	public static class SForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(typescriptParser.FOR, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public SStatementContext sStatement() {
			return getRuleContext(SStatementContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(typescriptParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(typescriptParser.SEMICOLON, i);
		}
		public SNumberExpressionContext sNumberExpression() {
			return getRuleContext(SNumberExpressionContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public SIncrementContext sIncrement() {
			return getRuleContext(SIncrementContext.class,0);
		}
		public SDecrementContext sDecrement() {
			return getRuleContext(SDecrementContext.class,0);
		}
		public SForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFor; }
	}

	public final SForContext sFor() throws RecognitionException {
		SForContext _localctx = new SForContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_sFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(FOR);
			setState(675);
			match(ROUND_LEFT);
			setState(676);
			sStatement();
			setState(677);
			match(SEMICOLON);
			setState(678);
			sNumberExpression();
			setState(679);
			match(SEMICOLON);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(680);
				sIncrement();
				}
				break;
			case 2:
				{
				setState(681);
				sDecrement();
				}
				break;
			}
			setState(684);
			match(ROUND_RIGHT);
			setState(685);
			sLoopTail();
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

	public static class SForOfContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(typescriptParser.FOR, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode OF() { return getToken(typescriptParser.OF, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public TerminalNode VAR() { return getToken(typescriptParser.VAR, 0); }
		public TerminalNode LET() { return getToken(typescriptParser.LET, 0); }
		public SArrayContext sArray() {
			return getRuleContext(SArrayContext.class,0);
		}
		public SStringContext sString() {
			return getRuleContext(SStringContext.class,0);
		}
		public SForOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sForOf; }
	}

	public final SForOfContext sForOf() throws RecognitionException {
		SForOfContext _localctx = new SForOfContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_sForOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(FOR);
			setState(688);
			match(ROUND_LEFT);
			setState(689);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(690);
			match(IDENTIFIER);
			setState(691);
			match(OF);
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_LEFT:
				{
				setState(692);
				sArray();
				}
				break;
			case CHARS:
				{
				setState(693);
				sString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(696);
			match(ROUND_RIGHT);
			setState(697);
			sLoopTail();
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

	public static class SForInContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(typescriptParser.FOR, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(typescriptParser.ROUND_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(typescriptParser.IN, 0); }
		public SArrayContext sArray() {
			return getRuleContext(SArrayContext.class,0);
		}
		public TerminalNode ROUND_RIGHT() { return getToken(typescriptParser.ROUND_RIGHT, 0); }
		public SLoopTailContext sLoopTail() {
			return getRuleContext(SLoopTailContext.class,0);
		}
		public TerminalNode VAR() { return getToken(typescriptParser.VAR, 0); }
		public TerminalNode LET() { return getToken(typescriptParser.LET, 0); }
		public SForInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sForIn; }
	}

	public final SForInContext sForIn() throws RecognitionException {
		SForInContext _localctx = new SForInContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_sForIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(FOR);
			setState(700);
			match(ROUND_LEFT);
			setState(701);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(702);
			match(IDENTIFIER);
			setState(703);
			match(IN);
			setState(704);
			sArray();
			setState(705);
			match(ROUND_RIGHT);
			setState(706);
			sLoopTail();
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

	public static class SLoopTailContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(typescriptParser.CURLY_LEFT, 0); }
		public SBodyContext sBody() {
			return getRuleContext(SBodyContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(typescriptParser.CURLY_RIGHT, 0); }
		public SLoopTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sLoopTail; }
	}

	public final SLoopTailContext sLoopTail() throws RecognitionException {
		SLoopTailContext _localctx = new SLoopTailContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sLoopTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(CURLY_LEFT);
			setState(709);
			sBody();
			setState(710);
			match(CURLY_RIGHT);
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

	public static class SContinueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(typescriptParser.CONTINUE, 0); }
		public SContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sContinue; }
	}

	public final SContinueContext sContinue() throws RecognitionException {
		SContinueContext _localctx = new SContinueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_sContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(CONTINUE);
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

	public static class SBreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(typescriptParser.BREAK, 0); }
		public SBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sBreak; }
	}

	public final SBreakContext sBreak() throws RecognitionException {
		SBreakContext _localctx = new SBreakContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_sBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(BREAK);
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

	public static class SMutableVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(typescriptParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(typescriptParser.VAR, 0); }
		public TerminalNode LET() { return getToken(typescriptParser.LET, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SMutableVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sMutableVar; }
	}

	public final SMutableVarContext sMutableVar() throws RecognitionException {
		SMutableVarContext _localctx = new SMutableVarContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sMutableVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(717);
			match(IDENTIFIER);
			setState(718);
			match(EQUAL);
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(719);
				sExpression();
				}
				break;
			case 2:
				{
				setState(720);
				sValue();
				}
				break;
			case 3:
				{
				setState(721);
				sInvocation();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(724);
				match(SEMICOLON);
				}
				break;
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

	public static class SImmutableVarContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(typescriptParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(typescriptParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(typescriptParser.EQUAL, 0); }
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SImmutableVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sImmutableVar; }
	}

	public final SImmutableVarContext sImmutableVar() throws RecognitionException {
		SImmutableVarContext _localctx = new SImmutableVarContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_sImmutableVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(CONST);
			setState(728);
			match(IDENTIFIER);
			setState(729);
			match(EQUAL);
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(730);
				sExpression();
				}
				break;
			case 2:
				{
				setState(731);
				sValue();
				}
				break;
			case 3:
				{
				setState(732);
				sInvocation();
				}
				break;
			}
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(735);
				match(SEMICOLON);
				}
				break;
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

	public static class SAssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(typescriptParser.EQUAL, 0); }
		public List<SPropertyContext> sProperty() {
			return getRuleContexts(SPropertyContext.class);
		}
		public SPropertyContext sProperty(int i) {
			return getRuleContext(SPropertyContext.class,i);
		}
		public SPropertyAccessContext sPropertyAccess() {
			return getRuleContext(SPropertyAccessContext.class,0);
		}
		public SValueContext sValue() {
			return getRuleContext(SValueContext.class,0);
		}
		public SExpressionContext sExpression() {
			return getRuleContext(SExpressionContext.class,0);
		}
		public SInvocationContext sInvocation() {
			return getRuleContext(SInvocationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sAssignment; }
	}

	public final SAssignmentContext sAssignment() throws RecognitionException {
		SAssignmentContext _localctx = new SAssignmentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(738);
				sProperty();
				}
				break;
			case 2:
				{
				setState(739);
				sPropertyAccess();
				}
				break;
			}
			setState(742);
			match(EQUAL);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(743);
				sValue();
				}
				break;
			case 2:
				{
				setState(744);
				sExpression();
				}
				break;
			case 3:
				{
				setState(745);
				sInvocation();
				}
				break;
			case 4:
				{
				setState(746);
				sProperty();
				}
				break;
			}
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(749);
				match(SEMICOLON);
				}
				break;
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

	public static class SIncrementContext extends ParserRuleContext {
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(typescriptParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(typescriptParser.PLUS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sIncrement; }
	}

	public final SIncrementContext sIncrement() throws RecognitionException {
		SIncrementContext _localctx = new SIncrementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sIncrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			sProperty();
			setState(753);
			match(PLUS);
			setState(754);
			match(PLUS);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(755);
				match(SEMICOLON);
				}
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

	public static class SDecrementContext extends ParserRuleContext {
		public SPropertyContext sProperty() {
			return getRuleContext(SPropertyContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(typescriptParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(typescriptParser.MINUS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptParser.SEMICOLON, 0); }
		public SDecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDecrement; }
	}

	public final SDecrementContext sDecrement() throws RecognitionException {
		SDecrementContext _localctx = new SDecrementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_sDecrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			sProperty();
			setState(759);
			match(MINUS);
			setState(760);
			match(MINUS);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(761);
				match(SEMICOLON);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u02ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00b4\n\2\f\2\16\2\u00b7"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\5\3\u00be\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u00c5"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u00cc\n\5\3\6\3\6\5\6\u00d0\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00d7\n\7\3\b\3\b\3\b\3\b\5\b\u00dd\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00e8\n\t\3\n\3\n\3\n\5\n\u00ed\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31"+
		"\u010d\n\31\3\31\3\31\3\31\5\31\u0112\n\31\6\31\u0114\n\31\r\31\16\31"+
		"\u0115\3\32\3\32\3\32\3\32\3\32\6\32\u011d\n\32\r\32\16\32\u011e\3\32"+
		"\5\32\u0122\n\32\3\32\3\32\3\33\7\33\u0127\n\33\f\33\16\33\u012a\13\33"+
		"\3\33\3\33\3\33\5\33\u012f\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0136\n"+
		"\34\3\35\3\35\5\35\u013a\n\35\3\35\3\35\3\35\5\35\u013f\n\35\7\35\u0141"+
		"\n\35\f\35\16\35\u0144\13\35\3\36\3\36\3\36\3\36\3\36\6\36\u014b\n\36"+
		"\r\36\16\36\u014c\3\36\5\36\u0150\n\36\3\36\3\36\3\37\3\37\5\37\u0156"+
		"\n\37\3 \3 \3 \3 \3 \3 \5 \u015e\n \3!\3!\5!\u0162\n!\3!\3!\3!\5!\u0167"+
		"\n!\6!\u0169\n!\r!\16!\u016a\3\"\3\"\3\"\3\"\3\"\6\"\u0172\n\"\r\"\16"+
		"\"\u0173\3\"\5\"\u0177\n\"\3\"\3\"\3#\3#\3$\3$\5$\u017f\n$\3%\3%\5%\u0183"+
		"\n%\3%\3%\3%\5%\u0188\n%\6%\u018a\n%\r%\16%\u018b\3&\3&\3&\3&\3&\6&\u0193"+
		"\n&\r&\16&\u0194\3&\5&\u0198\n&\3&\3&\3\'\3\'\3(\3(\3(\5(\u01a1\n(\3)"+
		"\3)\3)\3)\5)\u01a7\n)\3*\3*\5*\u01ab\n*\3*\3*\3*\3+\3+\3+\3+\6+\u01b4"+
		"\n+\r+\16+\u01b5\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\5\60"+
		"\u01c6\n\60\3\61\3\61\3\61\7\61\u01cb\n\61\f\61\16\61\u01ce\13\61\3\62"+
		"\3\62\3\62\5\62\u01d3\n\62\3\63\3\63\3\63\7\63\u01d8\n\63\f\63\16\63\u01db"+
		"\13\63\3\64\3\64\3\64\3\64\5\64\u01e1\n\64\3\64\3\64\3\64\5\64\u01e6\n"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u01ef\n\66\3\66\3\66\5\66"+
		"\u01f3\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01fb\n\67\38\38\39\39"+
		"\59\u0201\n9\3:\3:\5:\u0205\n:\3:\3:\3:\3:\3:\5:\u020c\n:\3:\3:\6:\u0210"+
		"\n:\r:\16:\u0211\3;\3;\3;\5;\u0217\n;\3<\3<\3<\6<\u021c\n<\r<\16<\u021d"+
		"\3=\3=\3=\3=\5=\u0224\n=\3=\5=\u0227\n=\3>\3>\3>\7>\u022c\n>\f>\16>\u022f"+
		"\13>\3>\5>\u0232\n>\3>\5>\u0235\n>\3?\3?\3?\3?\3?\5?\u023c\n?\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\5@\u0247\n@\3@\7@\u024a\n@\f@\16@\u024d\13@\3@\5@"+
		"\u0250\n@\3A\3A\3A\3A\3A\3A\5A\u0258\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\5B\u0264\nB\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\7F\u0270\nF\fF\16F\u0273\13"+
		"F\5F\u0275\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0282\nG\fG\16G\u0285"+
		"\13G\5G\u0287\nG\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0294\nH\3H\3H\3"+
		"I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\5K\u02ad"+
		"\nK\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\5L\u02b9\nL\3L\3L\3L\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02d5\nQ\3Q"+
		"\5Q\u02d8\nQ\3R\3R\3R\3R\3R\3R\5R\u02e0\nR\3R\5R\u02e3\nR\3S\3S\5S\u02e7"+
		"\nS\3S\3S\3S\3S\3S\5S\u02ee\nS\3S\5S\u02f1\nS\3T\3T\3T\3T\5T\u02f7\nT"+
		"\3U\3U\3U\3U\5U\u02fd\nU\3U\2\2V\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\7\3\2\30\31\3\2\32\33\3\2"+
		"$&\3\2\3\4\3\2-.\2\u032e\2\u00b5\3\2\2\2\4\u00bd\3\2\2\2\6\u00c4\3\2\2"+
		"\2\b\u00cb\3\2\2\2\n\u00cf\3\2\2\2\f\u00d6\3\2\2\2\16\u00dc\3\2\2\2\20"+
		"\u00e7\3\2\2\2\22\u00ec\3\2\2\2\24\u00ee\3\2\2\2\26\u00f0\3\2\2\2\30\u00f2"+
		"\3\2\2\2\32\u00f4\3\2\2\2\34\u00f6\3\2\2\2\36\u00f8\3\2\2\2 \u00fa\3\2"+
		"\2\2\"\u00fc\3\2\2\2$\u00fe\3\2\2\2&\u0100\3\2\2\2(\u0102\3\2\2\2*\u0104"+
		"\3\2\2\2,\u0106\3\2\2\2.\u0108\3\2\2\2\60\u010c\3\2\2\2\62\u0117\3\2\2"+
		"\2\64\u0128\3\2\2\2\66\u0135\3\2\2\28\u0139\3\2\2\2:\u0145\3\2\2\2<\u0155"+
		"\3\2\2\2>\u015d\3\2\2\2@\u0161\3\2\2\2B\u016c\3\2\2\2D\u017a\3\2\2\2F"+
		"\u017e\3\2\2\2H\u0182\3\2\2\2J\u018d\3\2\2\2L\u019b\3\2\2\2N\u01a0\3\2"+
		"\2\2P\u01a2\3\2\2\2R\u01aa\3\2\2\2T\u01af\3\2\2\2V\u01b7\3\2\2\2X\u01b9"+
		"\3\2\2\2Z\u01bb\3\2\2\2\\\u01be\3\2\2\2^\u01c5\3\2\2\2`\u01c7\3\2\2\2"+
		"b\u01cf\3\2\2\2d\u01d4\3\2\2\2f\u01dc\3\2\2\2h\u01e7\3\2\2\2j\u01eb\3"+
		"\2\2\2l\u01f4\3\2\2\2n\u01fc\3\2\2\2p\u0200\3\2\2\2r\u0202\3\2\2\2t\u0216"+
		"\3\2\2\2v\u0218\3\2\2\2x\u0223\3\2\2\2z\u022d\3\2\2\2|\u0236\3\2\2\2~"+
		"\u023d\3\2\2\2\u0080\u0251\3\2\2\2\u0082\u0259\3\2\2\2\u0084\u0265\3\2"+
		"\2\2\u0086\u0267\3\2\2\2\u0088\u0269\3\2\2\2\u008a\u026b\3\2\2\2\u008c"+
		"\u0278\3\2\2\2\u008e\u0293\3\2\2\2\u0090\u0297\3\2\2\2\u0092\u029d\3\2"+
		"\2\2\u0094\u02a4\3\2\2\2\u0096\u02b1\3\2\2\2\u0098\u02bd\3\2\2\2\u009a"+
		"\u02c6\3\2\2\2\u009c\u02ca\3\2\2\2\u009e\u02cc\3\2\2\2\u00a0\u02ce\3\2"+
		"\2\2\u00a2\u02d9\3\2\2\2\u00a4\u02e6\3\2\2\2\u00a6\u02f2\3\2\2\2\u00a8"+
		"\u02f8\3\2\2\2\u00aa\u00b4\5\16\b\2\u00ab\u00b4\5n8\2\u00ac\u00b4\5\b"+
		"\5\2\u00ad\u00b4\5\n\6\2\u00ae\u00b4\5\f\7\2\u00af\u00b4\5\20\t\2\u00b0"+
		"\u00b4\5|?\2\u00b1\u00b4\5\\/\2\u00b2\u00b4\5\22\n\2\u00b3\u00aa\3\2\2"+
		"\2\u00b3\u00ab\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00ae"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\2\2\3\u00b9"+
		"\3\3\2\2\2\u00ba\u00be\5\u0086D\2\u00bb\u00be\5n8\2\u00bc\u00be\5\16\b"+
		"\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\5"+
		"\3\2\2\2\u00bf\u00c5\5\24\13\2\u00c0\u00c5\5\26\f\2\u00c1\u00c5\5\30\r"+
		"\2\u00c2\u00c5\5\32\16\2\u00c3\u00c5\5\34\17\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\7\3\2\2\2\u00c6\u00cc\5N(\2\u00c7\u00cc\5\60\31\2\u00c8\u00cc"+
		"\58\35\2\u00c9\u00cc\5@!\2\u00ca\u00cc\5H%\2\u00cb\u00c6\3\2\2\2\u00cb"+
		"\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\t\3\2\2\2\u00cd\u00d0\5\62\32\2\u00ce\u00d0\5:\36\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\13\3\2\2\2\u00d1\u00d7\5\u0086D\2\u00d2"+
		"\u00d7\5\u0088E\2\u00d3\u00d7\5\u0084C\2\u00d4\u00d7\5\u008aF\2\u00d5"+
		"\u00d7\5\u008cG\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\r\3\2\2\2\u00d8"+
		"\u00dd\5r:\2\u00d9\u00dd\5v<\2\u00da\u00dd\5j\66\2\u00db\u00dd\5Z.\2\u00dc"+
		"\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\17\3\2\2\2\u00de\u00e8\5~@\2\u00df\u00e8\5\u0090I\2\u00e0\u00e8"+
		"\5\u0092J\2\u00e1\u00e8\5\u0094K\2\u00e2\u00e8\5\u0096L\2\u00e3\u00e8"+
		"\5\u0098M\2\u00e4\u00e8\5\u008eH\2\u00e5\u00e8\5\u009cO\2\u00e6\u00e8"+
		"\5\u009eP\2\u00e7\u00de\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2"+
		"\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\21\3\2\2\2\u00e9"+
		"\u00ed\5\u00a0Q\2\u00ea\u00ed\5\u00a2R\2\u00eb\u00ed\5\u00a4S\2\u00ec"+
		"\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\23\3\2\2"+
		"\2\u00ee\u00ef\7\t\2\2\u00ef\25\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1\27\3"+
		"\2\2\2\u00f2\u00f3\7\13\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5"+
		"\33\3\2\2\2\u00f6\u00f7\7\r\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7\24\2\2"+
		"\u00f9\37\3\2\2\2\u00fa\u00fb\7\25\2\2\u00fb!\3\2\2\2\u00fc\u00fd\7\26"+
		"\2\2\u00fd#\3\2\2\2\u00fe\u00ff\t\2\2\2\u00ff%\3\2\2\2\u0100\u0101\t\3"+
		"\2\2\u0101\'\3\2\2\2\u0102\u0103\7\34\2\2\u0103)\3\2\2\2\u0104\u0105\7"+
		"\35\2\2\u0105+\3\2\2\2\u0106\u0107\7\36\2\2\u0107-\3\2\2\2\u0108\u0109"+
		"\7\37\2\2\u0109/\3\2\2\2\u010a\u010d\5\4\3\2\u010b\u010d\5\62\32\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0113\3\2\2\2\u010e\u0111\5\6"+
		"\4\2\u010f\u0112\5\4\3\2\u0110\u0112\5\62\32\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u010e\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\61\3\2\2\2\u0117\u0121"+
		"\7\16\2\2\u0118\u011c\5\4\3\2\u0119\u011a\5\6\4\2\u011a\u011b\5\4\3\2"+
		"\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0122\5\62\32\2"+
		"\u0121\u0118\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\7\17\2\2\u0124\63\3\2\2\2\u0125\u0127\5\"\22\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012f\5\f\7\2\u012c\u012f\5n8\2\u012d\u012f"+
		"\5\16\b\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2"+
		"\u012f\65\3\2\2\2\u0130\u0136\5\36\20\2\u0131\u0136\5 \21\2\u0132\u0136"+
		"\5\"\22\2\u0133\u0136\5$\23\2\u0134\u0136\5&\24\2\u0135\u0130\3\2\2\2"+
		"\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\67\3\2\2\2\u0137\u013a\5\64\33\2\u0138\u013a\5:\36\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u0142\3\2\2\2\u013b\u013e\5\66"+
		"\34\2\u013c\u013f\5\64\33\2\u013d\u013f\5:\36\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013b\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u014f\7\16\2\2\u0146\u014a\5\64\33\2\u0147\u0148\5\66\34"+
		"\2\u0148\u0149\5\64\33\2\u0149\u014b\3\2\2\2\u014a\u0147\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2"+
		"\2\2\u014e\u0150\5:\36\2\u014f\u0146\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7\17\2\2\u0152;\3\2\2\2\u0153\u0156\5\u0086"+
		"D\2\u0154\u0156\5n8\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156=\3"+
		"\2\2\2\u0157\u015e\5$\23\2\u0158\u015e\5&\24\2\u0159\u015e\5(\25\2\u015a"+
		"\u015e\5*\26\2\u015b\u015e\5,\27\2\u015c\u015e\5.\30\2\u015d\u0157\3\2"+
		"\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e?\3\2\2\2\u015f\u0162\5<\37\2"+
		"\u0160\u0162\5B\"\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0168"+
		"\3\2\2\2\u0163\u0166\5> \2\u0164\u0167\5<\37\2\u0165\u0167\5B\"\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0163\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"A\3\2\2\2\u016c\u0176\7\16\2\2\u016d\u0171\5<\37\2\u016e\u016f\5> \2\u016f"+
		"\u0170\5<\37\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0177\5B\"\2\u0176\u016d\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\7\17\2\2\u0179C\3\2\2\2\u017a\u017b\5\u0084C\2\u017b"+
		"E\3\2\2\2\u017c\u017f\5$\23\2\u017d\u017f\5&\24\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017d\3\2\2\2\u017fG\3\2\2\2\u0180\u0183\5D#\2\u0181\u0183\5J&"+
		"\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0189\3\2\2\2\u0184\u0187"+
		"\5F$\2\u0185\u0188\5D#\2\u0186\u0188\5J&\2\u0187\u0185\3\2\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0184\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cI\3\2\2\2\u018d\u0197\7\16\2\2"+
		"\u018e\u0192\5D#\2\u018f\u0190\5F$\2\u0190\u0191\5D#\2\u0191\u0193\3\2"+
		"\2\2\u0192\u018f\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0198\5J&\2\u0197\u018e\3\2\2"+
		"\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7\17\2\2\u019a"+
		"K\3\2\2\2\u019b\u019c\5\u0084C\2\u019cM\3\2\2\2\u019d\u01a1\5T+\2\u019e"+
		"\u01a1\5P)\2\u019f\u01a1\5R*\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2"+
		"\u01a0\u019f\3\2\2\2\u01a1O\3\2\2\2\u01a2\u01a3\5\u0084C\2\u01a3\u01a6"+
		"\5\24\13\2\u01a4\u01a7\5\f\7\2\u01a5\u01a7\5n8\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7Q\3\2\2\2\u01a8\u01ab\5\16\b\2\u01a9\u01ab\5n8\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\5\24"+
		"\13\2\u01ad\u01ae\5\u0084C\2\u01aeS\3\2\2\2\u01af\u01b3\5\u0084C\2\u01b0"+
		"\u01b1\5\24\13\2\u01b1\u01b2\5\u0084C\2\u01b2\u01b4\3\2\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"U\3\2\2\2\u01b7\u01b8\t\4\2\2\u01b8W\3\2\2\2\u01b9\u01ba\7\27\2\2\u01ba"+
		"Y\3\2\2\2\u01bb\u01bc\7\62\2\2\u01bc\u01bd\5r:\2\u01bd[\3\2\2\2\u01be"+
		"\u01bf\5f\64\2\u01bf\u01c0\5h\65\2\u01c0]\3\2\2\2\u01c1\u01c6\5\f\7\2"+
		"\u01c2\u01c6\5\b\5\2\u01c3\u01c6\5l\67\2\u01c4\u01c6\5\16\b\2\u01c5\u01c1"+
		"\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"_\3\2\2\2\u01c7\u01cc\5^\60\2\u01c8\u01c9\7\7\2\2\u01c9\u01cb\5^\60\2"+
		"\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cda\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\5n8\2\u01d0\u01d1"+
		"\7\6\2\2\u01d1\u01d3\5V,\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"c\3\2\2\2\u01d4\u01d9\5b\62\2\u01d5\u01d6\7\7\2\2\u01d6\u01d8\5b\62\2"+
		"\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01dae\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7#\2\2\u01dd\u01de"+
		"\7\64\2\2\u01de\u01e0\7\16\2\2\u01df\u01e1\5d\63\2\u01e0\u01df\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\7\17\2\2\u01e3\u01e4"+
		"\7\6\2\2\u01e4\u01e6\5V,\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"g\3\2\2\2\u01e7\u01e8\7\20\2\2\u01e8\u01e9\5z>\2\u01e9\u01ea\7\21\2\2"+
		"\u01eai\3\2\2\2\u01eb\u01ec\7\64\2\2\u01ec\u01ee\7\16\2\2\u01ed\u01ef"+
		"\5`\61\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\7\17\2\2\u01f1\u01f3\7\b\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3"+
		"\2\2\2\u01f3k\3\2\2\2\u01f4\u01f5\7\16\2\2\u01f5\u01f6\5d\63\2\u01f6\u01f7"+
		"\7\17\2\2\u01f7\u01fa\7\'\2\2\u01f8\u01fb\5\b\5\2\u01f9\u01fb\5h\65\2"+
		"\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbm\3\2\2\2\u01fc\u01fd\7"+
		"\64\2\2\u01fdo\3\2\2\2\u01fe\u0201\5\u0084C\2\u01ff\u0201\5n8\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201q\3\2\2\2\u0202\u020f\5p9\2\u0203"+
		"\u0205\5X-\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2"+
		"\2\u0206\u0207\7\5\2\2\u0207\u0210\5n8\2\u0208\u020b\7\22\2\2\u0209\u020c"+
		"\5\u0086D\2\u020a\u020c\5\u0084C\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7\23\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u0204\3\2\2\2\u020f\u0208\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212s\3\2\2\2\u0213\u0217\5\u0084C\2\u0214\u0217"+
		"\5n8\2\u0215\u0217\5\u008aF\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2"+
		"\u0216\u0215\3\2\2\2\u0217u\3\2\2\2\u0218\u021b\5t;\2\u0219\u021a\7\5"+
		"\2\2\u021a\u021c\5j\66\2\u021b\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021ew\3\2\2\2\u021f\u0224\5\20\t\2"+
		"\u0220\u0224\5\u00a4S\2\u0221\u0224\5\16\b\2\u0222\u0224\5|?\2\u0223\u021f"+
		"\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0226\3\2\2\2\u0225\u0227\7\b\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227y\3\2\2\2\u0228\u022c\5\20\t\2\u0229\u022c\5\u00a4S\2\u022a"+
		"\u022c\5\16\b\2\u022b\u0228\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a\3"+
		"\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0232\5|?\2\u0231\u0230\3\2\2"+
		"\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235\7\b\2\2\u0234\u0233"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235{\3\2\2\2\u0236\u023b\7\"\2\2\u0237"+
		"\u023c\5\f\7\2\u0238\u023c\5\b\5\2\u0239\u023c\5n8\2\u023a\u023c\5\16"+
		"\b\2\u023b\u0237\3\2\2\2\u023b\u0238\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023a\3\2\2\2\u023c}\3\2\2\2\u023d\u023e\7 \2\2\u023e\u023f\7\16\2\2"+
		"\u023f\u0240\5\b\5\2\u0240\u0246\7\17\2\2\u0241\u0247\5x=\2\u0242\u0243"+
		"\7\20\2\2\u0243\u0244\5z>\2\u0244\u0245\7\21\2\2\u0245\u0247\3\2\2\2\u0246"+
		"\u0241\3\2\2\2\u0246\u0242\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u024a\5\u0082"+
		"B\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\5\u0080"+
		"A\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\177\3\2\2\2\u0251\u0257"+
		"\7!\2\2\u0252\u0258\5|?\2\u0253\u0254\7\20\2\2\u0254\u0255\5z>\2\u0255"+
		"\u0256\7\21\2\2\u0256\u0258\3\2\2\2\u0257\u0252\3\2\2\2\u0257\u0253\3"+
		"\2\2\2\u0258\u0081\3\2\2\2\u0259\u025a\7!\2\2\u025a\u025b\7 \2\2\u025b"+
		"\u025c\7\16\2\2\u025c\u025d\58\35\2\u025d\u0263\7\17\2\2\u025e\u0264\5"+
		"|?\2\u025f\u0260\7\20\2\2\u0260\u0261\5z>\2\u0261\u0262\7\21\2\2\u0262"+
		"\u0264\3\2\2\2\u0263\u025e\3\2\2\2\u0263\u025f\3\2\2\2\u0264\u0083\3\2"+
		"\2\2\u0265\u0266\7\65\2\2\u0266\u0085\3\2\2\2\u0267\u0268\7\66\2\2\u0268"+
		"\u0087\3\2\2\2\u0269\u026a\t\5\2\2\u026a\u0089\3\2\2\2\u026b\u0274\7\22"+
		"\2\2\u026c\u0271\5\f\7\2\u026d\u026e\7\7\2\2\u026e\u0270\5\f\7\2\u026f"+
		"\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u026c\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\7\23\2\2\u0277\u008b\3"+
		"\2\2\2\u0278\u0286\7\20\2\2\u0279\u027a\5\u0084C\2\u027a\u027b\7\6\2\2"+
		"\u027b\u0283\5\f\7\2\u027c\u027d\7\7\2\2\u027d\u027e\5\u0084C\2\u027e"+
		"\u027f\7\6\2\2\u027f\u0280\5\f\7\2\u0280\u0282\3\2\2\2\u0281\u027c\3\2"+
		"\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0279\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7\21\2\2\u0289\u008d\3\2\2\2\u028a"+
		"\u028b\7(\2\2\u028b\u028c\7\16\2\2\u028c\u028d\7\3\2\2\u028d\u0294\7\17"+
		"\2\2\u028e\u028f\7)\2\2\u028f\u0290\7\16\2\2\u0290\u0291\7\b\2\2\u0291"+
		"\u0292\7\b\2\2\u0292\u0294\7\17\2\2\u0293\u028a\3\2\2\2\u0293\u028e\3"+
		"\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5\u009aN\2\u0296\u008f\3\2\2\2"+
		"\u0297\u0298\7(\2\2\u0298\u0299\7\16\2\2\u0299\u029a\5\b\5\2\u029a\u029b"+
		"\7\17\2\2\u029b\u029c\5\u009aN\2\u029c\u0091\3\2\2\2\u029d\u029e\7\63"+
		"\2\2\u029e\u029f\5\u009aN\2\u029f\u02a0\7(\2\2\u02a0\u02a1\7\16\2\2\u02a1"+
		"\u02a2\5\b\5\2\u02a2\u02a3\7\17\2\2\u02a3\u0093\3\2\2\2\u02a4\u02a5\7"+
		")\2\2\u02a5\u02a6\7\16\2\2\u02a6\u02a7\5\22\n\2\u02a7\u02a8\7\b\2\2\u02a8"+
		"\u02a9\5@!\2\u02a9\u02ac\7\b\2\2\u02aa\u02ad\5\u00a6T\2\u02ab\u02ad\5"+
		"\u00a8U\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2"+
		"\u02ae\u02af\7\17\2\2\u02af\u02b0\5\u009aN\2\u02b0\u0095\3\2\2\2\u02b1"+
		"\u02b2\7)\2\2\u02b2\u02b3\7\16\2\2\u02b3\u02b4\t\6\2\2\u02b4\u02b5\7\64"+
		"\2\2\u02b5\u02b8\7+\2\2\u02b6\u02b9\5\u008aF\2\u02b7\u02b9\5\u0084C\2"+
		"\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb"+
		"\7\17\2\2\u02bb\u02bc\5\u009aN\2\u02bc\u0097\3\2\2\2\u02bd\u02be\7)\2"+
		"\2\u02be\u02bf\7\16\2\2\u02bf\u02c0\t\6\2\2\u02c0\u02c1\7\64\2\2\u02c1"+
		"\u02c2\7*\2\2\u02c2\u02c3\5\u008aF\2\u02c3\u02c4\7\17\2\2\u02c4\u02c5"+
		"\5\u009aN\2\u02c5\u0099\3\2\2\2\u02c6\u02c7\7\20\2\2\u02c7\u02c8\5z>\2"+
		"\u02c8\u02c9\7\21\2\2\u02c9\u009b\3\2\2\2\u02ca\u02cb\7\61\2\2\u02cb\u009d"+
		"\3\2\2\2\u02cc\u02cd\7\60\2\2\u02cd\u009f\3\2\2\2\u02ce\u02cf\t\6\2\2"+
		"\u02cf\u02d0\7\64\2\2\u02d0\u02d4\7/\2\2\u02d1\u02d5\5\b\5\2\u02d2\u02d5"+
		"\5\f\7\2\u02d3\u02d5\5\16\b\2\u02d4\u02d1\3\2\2\2\u02d4\u02d2\3\2\2\2"+
		"\u02d4\u02d3\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d8\7\b\2\2\u02d7\u02d6"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u00a1\3\2\2\2\u02d9\u02da\7,\2\2\u02da"+
		"\u02db\7\64\2\2\u02db\u02df\7/\2\2\u02dc\u02e0\5\b\5\2\u02dd\u02e0\5\f"+
		"\7\2\u02de\u02e0\5\16\b\2\u02df\u02dc\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02de\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02e3\7\b\2\2\u02e2\u02e1\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u00a3\3\2\2\2\u02e4\u02e7\5n8\2\u02e5\u02e7"+
		"\5r:\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02ed\7/\2\2\u02e9\u02ee\5\f\7\2\u02ea\u02ee\5\b\5\2\u02eb\u02ee\5\16"+
		"\b\2\u02ec\u02ee\5n8\2\u02ed\u02e9\3\2\2\2\u02ed\u02ea\3\2\2\2\u02ed\u02eb"+
		"\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02f1\7\b\2\2\u02f0"+
		"\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u00a5\3\2\2\2\u02f2\u02f3\5n"+
		"8\2\u02f3\u02f4\7\t\2\2\u02f4\u02f6\7\t\2\2\u02f5\u02f7\7\b\2\2\u02f6"+
		"\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u00a7\3\2\2\2\u02f8\u02f9\5n"+
		"8\2\u02f9\u02fa\7\n\2\2\u02fa\u02fc\7\n\2\2\u02fb\u02fd\7\b\2\2\u02fc"+
		"\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u00a9\3\2\2\2V\u00b3\u00b5\u00bd"+
		"\u00c4\u00cb\u00cf\u00d6\u00dc\u00e7\u00ec\u010c\u0111\u0115\u011e\u0121"+
		"\u0128\u012e\u0135\u0139\u013e\u0142\u014c\u014f\u0155\u015d\u0161\u0166"+
		"\u016a\u0173\u0176\u017e\u0182\u0187\u018b\u0194\u0197\u01a0\u01a6\u01aa"+
		"\u01b5\u01c5\u01cc\u01d2\u01d9\u01e0\u01e5\u01ee\u01f2\u01fa\u0200\u0204"+
		"\u020b\u020f\u0211\u0216\u021d\u0223\u0226\u022b\u022d\u0231\u0234\u023b"+
		"\u0246\u024b\u024f\u0257\u0263\u0271\u0274\u0283\u0286\u0293\u02ac\u02b8"+
		"\u02d4\u02d7\u02df\u02e2\u02e6\u02ed\u02f0\u02f6\u02fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}