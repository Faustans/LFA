// Generated from Interpreter.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CSV=20, ID=21, INT=22, WS=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assign = 3, RULE_expr = 4, 
		RULE_load = 5, RULE_save = 6, RULE_arithmetic = 7, RULE_textExpr = 8, 
		RULE_selectC = 9, RULE_unite = 10, RULE_access = 11;
	public static final String[] ruleNames = {
		"program", "stat", "print", "assign", "expr", "load", "save", "arithmetic", 
		"textExpr", "selectC", "unite", "access"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "';'", "'printFile'", "'='", "'load('", "')'", "'save('", 
		"'*'", "'/'", "'%'", "'^'", "'+'", "'-'", "'<<'", "'selectC('", "','", 
		"'unite('", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CSV", "ID", "INT", "WS", 
		"COMMENT"
	};
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
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InterpreterParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatSaveContext extends StatContext {
		public SaveContext save() {
			return getRuleContext(SaveContext.class,0);
		}
		public StatSaveContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatSave(this);
		}
	}
	public static class StatAssignContext extends StatContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatAssign(this);
		}
	}
	public static class StatExprContext extends StatContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatExpr(this);
		}
	}
	public static class StatLoadContext extends StatContext {
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public StatLoadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatLoad(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				assign();
				}
				break;
			case T__0:
			case T__2:
				_localctx = new StatExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				print();
				}
				break;
			case T__4:
				_localctx = new StatLoadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				load();
				}
				break;
			case T__6:
				_localctx = new StatSaveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				save();
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__0);
				setState(39);
				expr();
				setState(40);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__2);
				setState(43);
				expr();
				setState(44);
				match(T__1);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignCSVContext extends AssignContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode CSV() { return getToken(InterpreterParser.CSV, 0); }
		public AssignCSVContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAssignCSV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAssignCSV(this);
		}
	}
	public static class AssignExprContext extends AssignContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(ID);
				setState(49);
				match(T__3);
				setState(50);
				expr();
				setState(51);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AssignCSVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__3);
				setState(55);
				match(CSV);
				setState(56);
				match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public SelectCContext selectC() {
			return getRuleContext(SelectCContext.class,0);
		}
		public UniteContext unite() {
			return getRuleContext(UniteContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TextExprContext textExpr() {
			return getRuleContext(TextExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode CSV() { return getToken(InterpreterParser.CSV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				selectC();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				unite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				arithmetic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				textExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(CSV);
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

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitLoad(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__4);
			setState(68);
			match(ID);
			setState(69);
			match(T__5);
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

	public static class SaveContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public SaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterSave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitSave(this);
		}
	}

	public final SaveContext save() throws RecognitionException {
		SaveContext _localctx = new SaveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__6);
			setState(72);
			match(ID);
			setState(73);
			match(T__5);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivArContext extends ArithmeticContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public DivArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterDivAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitDivAr(this);
		}
	}
	public static class MultArContext extends ArithmeticContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public MultArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterMultAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitMultAr(this);
		}
	}
	public static class PowerArContext extends ArithmeticContext {
		public Token op;
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public PowerArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterPowerAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitPowerAr(this);
		}
	}
	public static class MinusArContext extends ArithmeticContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public MinusArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterMinusAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitMinusAr(this);
		}
	}
	public static class PlusArContext extends ArithmeticContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public PlusArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterPlusAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitPlusAr(this);
		}
	}
	public static class RemArContext extends ArithmeticContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public RemArContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterRemAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitRemAr(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arithmetic);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MultArContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				access();
				setState(76);
				match(T__7);
				setState(77);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DivArContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				access();
				setState(80);
				match(T__8);
				setState(81);
				match(INT);
				}
				break;
			case 3:
				_localctx = new RemArContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				access();
				setState(84);
				match(T__9);
				setState(85);
				match(INT);
				}
				break;
			case 4:
				_localctx = new PowerArContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				access();
				setState(88);
				match(T__10);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(89);
					((PowerArContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
						((PowerArContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(92);
				match(INT);
				}
				break;
			case 5:
				_localctx = new PlusArContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				access();
				setState(95);
				match(T__11);
				setState(96);
				match(INT);
				}
				break;
			case 6:
				_localctx = new MinusArContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				access();
				setState(99);
				match(T__12);
				setState(100);
				match(INT);
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

	public static class TextExprContext extends ParserRuleContext {
		public TextExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textExpr; }
	 
		public TextExprContext() { }
		public void copyFrom(TextExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteExprContext extends TextExprContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public DeleteExprContext(TextExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterDeleteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitDeleteExpr(this);
		}
	}
	public static class InvertExprContext extends TextExprContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public InvertExprContext(TextExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterInvertExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitInvertExpr(this);
		}
	}
	public static class ConcatExprContext extends TextExprContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ConcatExprContext(TextExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConcatExpr(this);
		}
	}

	public final TextExprContext textExpr() throws RecognitionException {
		TextExprContext _localctx = new TextExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_textExpr);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ConcatExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				access();
				setState(105);
				match(T__11);
				setState(106);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeleteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				access();
				setState(109);
				match(T__12);
				setState(110);
				match(ID);
				}
				break;
			case 3:
				_localctx = new InvertExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				access();
				setState(113);
				match(T__13);
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

	public static class SelectCContext extends ParserRuleContext {
		public TerminalNode CSV() { return getToken(InterpreterParser.CSV, 0); }
		public List<TerminalNode> INT() { return getTokens(InterpreterParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterpreterParser.INT, i);
		}
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public SelectCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterSelectC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitSelectC(this);
		}
	}

	public final SelectCContext selectC() throws RecognitionException {
		SelectCContext _localctx = new SelectCContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectC);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__14);
				setState(118);
				match(CSV);
				setState(119);
				match(T__15);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(120);
					match(INT);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(121);
						match(T__15);
						setState(122);
						match(INT);
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(130);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__14);
				setState(132);
				match(ID);
				setState(133);
				match(T__15);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(134);
					match(INT);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(135);
						match(T__15);
						setState(136);
						match(INT);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(144);
				match(T__5);
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

	public static class UniteContext extends ParserRuleContext {
		public List<TerminalNode> CSV() { return getTokens(InterpreterParser.CSV); }
		public TerminalNode CSV(int i) {
			return getToken(InterpreterParser.CSV, i);
		}
		public List<TerminalNode> INT() { return getTokens(InterpreterParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterpreterParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public UniteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterUnite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitUnite(this);
		}
	}

	public final UniteContext unite() throws RecognitionException {
		UniteContext _localctx = new UniteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unite);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__16);
				setState(148);
				match(CSV);
				setState(149);
				match(T__15);
				setState(150);
				match(CSV);
				setState(151);
				match(T__15);
				setState(152);
				match(INT);
				setState(153);
				match(T__15);
				setState(154);
				match(INT);
				setState(155);
				match(T__15);
				setState(156);
				match(INT);
				setState(157);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__16);
				setState(159);
				match(ID);
				setState(160);
				match(T__15);
				setState(161);
				match(ID);
				setState(162);
				match(T__15);
				setState(163);
				match(INT);
				setState(164);
				match(T__15);
				setState(165);
				match(INT);
				setState(166);
				match(T__15);
				setState(167);
				match(INT);
				setState(168);
				match(T__5);
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

	public static class AccessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
		public TerminalNode CSV() { return getToken(InterpreterParser.CSV, 0); }
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAccess(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_access);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__17);
				setState(173);
				match(INT);
				setState(174);
				match(T__18);
				}
				break;
			case CSV:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(CSV);
				setState(176);
				match(T__17);
				setState(177);
				match(INT);
				setState(178);
				match(T__18);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t]\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13\5\13\u0083"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008c\n\13\f\13\16\13\u008f"+
		"\13\13\5\13\u0091\n\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ac"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\2\2\16\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\2\3\3\2\16\17\2\u00c5\2\35\3\2\2\2\4&\3\2\2\2\6"+
		"\60\3\2\2\2\b;\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16I\3\2\2\2\20h\3\2\2\2\22"+
		"u\3\2\2\2\24\u0093\3\2\2\2\26\u00ab\3\2\2\2\30\u00b5\3\2\2\2\32\34\5\4"+
		"\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2"+
		"\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"\'\5\b\5\2#\'\5\6\4\2$\'\5\f\7"+
		"\2%\'\5\16\b\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()"+
		"\7\3\2\2)*\5\n\6\2*+\7\4\2\2+\61\3\2\2\2,-\7\5\2\2-.\5\n\6\2./\7\4\2\2"+
		"/\61\3\2\2\2\60(\3\2\2\2\60,\3\2\2\2\61\7\3\2\2\2\62\63\7\27\2\2\63\64"+
		"\7\6\2\2\64\65\5\n\6\2\65\66\7\4\2\2\66<\3\2\2\2\678\7\27\2\289\7\6\2"+
		"\29:\7\26\2\2:<\7\4\2\2;\62\3\2\2\2;\67\3\2\2\2<\t\3\2\2\2=D\5\24\13\2"+
		">D\5\26\f\2?D\5\20\t\2@D\5\22\n\2AD\7\27\2\2BD\7\26\2\2C=\3\2\2\2C>\3"+
		"\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EF\7\7\2\2F"+
		"G\7\27\2\2GH\7\b\2\2H\r\3\2\2\2IJ\7\t\2\2JK\7\27\2\2KL\7\b\2\2L\17\3\2"+
		"\2\2MN\5\30\r\2NO\7\n\2\2OP\7\30\2\2Pi\3\2\2\2QR\5\30\r\2RS\7\13\2\2S"+
		"T\7\30\2\2Ti\3\2\2\2UV\5\30\r\2VW\7\f\2\2WX\7\30\2\2Xi\3\2\2\2YZ\5\30"+
		"\r\2Z\\\7\r\2\2[]\t\2\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\30\2\2_"+
		"i\3\2\2\2`a\5\30\r\2ab\7\16\2\2bc\7\30\2\2ci\3\2\2\2de\5\30\r\2ef\7\17"+
		"\2\2fg\7\30\2\2gi\3\2\2\2hM\3\2\2\2hQ\3\2\2\2hU\3\2\2\2hY\3\2\2\2h`\3"+
		"\2\2\2hd\3\2\2\2i\21\3\2\2\2jk\5\30\r\2kl\7\16\2\2lm\7\27\2\2mv\3\2\2"+
		"\2no\5\30\r\2op\7\17\2\2pq\7\27\2\2qv\3\2\2\2rs\5\30\r\2st\7\20\2\2tv"+
		"\3\2\2\2uj\3\2\2\2un\3\2\2\2ur\3\2\2\2v\23\3\2\2\2wx\7\21\2\2xy\7\26\2"+
		"\2y\u0082\7\22\2\2z\177\7\30\2\2{|\7\22\2\2|~\7\30\2\2}{\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082z\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0094\7\b\2\2\u0085\u0086\7\21\2\2\u0086\u0087\7\27\2\2\u0087\u0090\7"+
		"\22\2\2\u0088\u008d\7\30\2\2\u0089\u008a\7\22\2\2\u008a\u008c\7\30\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0088\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\b\2\2\u0093w\3\2\2\2"+
		"\u0093\u0085\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\23\2\2\u0096\u0097"+
		"\7\26\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\26\2\2\u0099\u009a\7\22\2"+
		"\2\u009a\u009b\7\30\2\2\u009b\u009c\7\22\2\2\u009c\u009d\7\30\2\2\u009d"+
		"\u009e\7\22\2\2\u009e\u009f\7\30\2\2\u009f\u00ac\7\b\2\2\u00a0\u00a1\7"+
		"\23\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\7\27\2\2"+
		"\u00a4\u00a5\7\22\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\22\2\2\u00a7"+
		"\u00a8\7\30\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ac"+
		"\7\b\2\2\u00ab\u0095\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\7\27\2\2\u00ae\u00af\7\24\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b6"+
		"\7\25\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b4\7\30\2"+
		"\2\u00b4\u00b6\7\25\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6"+
		"\31\3\2\2\2\21\35&\60;C\\hu\177\u0082\u008d\u0090\u0093\u00ab\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}