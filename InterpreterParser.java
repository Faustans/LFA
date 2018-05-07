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
		RULE_selectC = 9, RULE_unite = 10, RULE_access = 11, RULE_table = 12;
	public static final String[] ruleNames = {
		"program", "stat", "print", "assign", "expr", "load", "save", "arithmetic", 
		"textExpr", "selectC", "unite", "access", "table"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				stat();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				assign();
				}
				break;
			case T__0:
			case T__2:
				_localctx = new StatExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				print();
				}
				break;
			case T__4:
				_localctx = new StatLoadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				load();
				}
				break;
			case T__6:
				_localctx = new StatSaveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
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
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintConsoleContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintConsoleContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterPrintConsole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitPrintConsole(this);
		}
	}
	public static class PrintFileContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintFileContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterPrintFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitPrintFile(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new PrintConsoleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(41);
				expr();
				setState(42);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new PrintFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__2);
				setState(45);
				expr();
				setState(46);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__3);
				setState(52);
				expr();
				setState(53);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new AssignCSVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(ID);
				setState(56);
				match(T__3);
				setState(57);
				match(CSV);
				setState(58);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprTableContext extends ExprContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ExprTableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExprTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExprTable(this);
		}
	}
	public static class ExprSelectContext extends ExprContext {
		public SelectCContext selectC() {
			return getRuleContext(SelectCContext.class,0);
		}
		public ExprSelectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExprSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExprSelect(this);
		}
	}
	public static class ExprUniteContext extends ExprContext {
		public UniteContext unite() {
			return getRuleContext(UniteContext.class,0);
		}
		public ExprUniteContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExprUnite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExprUnite(this);
		}
	}
	public static class ExprTextContext extends ExprContext {
		public TextExprContext textExpr() {
			return getRuleContext(TextExprContext.class,0);
		}
		public ExprTextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExprText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExprText(this);
		}
	}
	public static class ExprArithContext extends ExprContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ExprArithContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExprArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExprArith(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExprSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				selectC();
				}
				break;
			case 2:
				_localctx = new ExprUniteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				unite();
				}
				break;
			case 3:
				_localctx = new ExprArithContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				arithmetic();
				}
				break;
			case 4:
				_localctx = new ExprTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				textExpr();
				}
				break;
			case 5:
				_localctx = new ExprTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				table();
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
			setState(68);
			match(T__4);
			setState(69);
			match(ID);
			setState(70);
			match(T__5);
			setState(71);
			match(T__1);
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
			setState(73);
			match(T__6);
			setState(74);
			match(ID);
			setState(75);
			match(T__5);
			setState(76);
			match(T__1);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MultArContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				access();
				setState(79);
				match(T__7);
				setState(80);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DivArContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				access();
				setState(83);
				match(T__8);
				setState(84);
				match(INT);
				}
				break;
			case 3:
				_localctx = new RemArContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				access();
				setState(87);
				match(T__9);
				setState(88);
				match(INT);
				}
				break;
			case 4:
				_localctx = new PowerArContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				access();
				setState(91);
				match(T__10);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__12) {
					{
					setState(92);
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

				setState(95);
				match(INT);
				}
				break;
			case 5:
				_localctx = new PlusArContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				access();
				setState(98);
				match(T__11);
				setState(99);
				match(INT);
				}
				break;
			case 6:
				_localctx = new MinusArContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				access();
				setState(102);
				match(T__12);
				setState(103);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ConcatExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				access();
				setState(108);
				match(T__11);
				setState(109);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeleteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				access();
				setState(112);
				match(T__12);
				setState(113);
				match(ID);
				}
				break;
			case 3:
				_localctx = new InvertExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				access();
				setState(116);
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
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(InterpreterParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterpreterParser.INT, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__14);
			setState(121);
			table();
			setState(122);
			match(T__15);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(123);
				match(INT);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(124);
					match(T__15);
					setState(125);
					match(INT);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
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

	public static class UniteContext extends ParserRuleContext {
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(InterpreterParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(InterpreterParser.INT, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__16);
			setState(136);
			table();
			setState(137);
			match(T__15);
			setState(138);
			table();
			setState(139);
			match(T__15);
			setState(140);
			match(INT);
			setState(141);
			match(T__15);
			setState(142);
			match(INT);
			setState(143);
			match(T__15);
			setState(144);
			match(INT);
			setState(145);
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

	public static class AccessContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode INT() { return getToken(InterpreterParser.INT, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			table();
			setState(148);
			match(T__17);
			setState(149);
			match(INT);
			setState(150);
			match(T__18);
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

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
	 
		public TableContext() { }
		public void copyFrom(TableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableCSVContext extends TableContext {
		public TerminalNode CSV() { return getToken(InterpreterParser.CSV, 0); }
		public TableCSVContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterTableCSV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitTableCSV(this);
		}
	}
	public static class TableIDContext extends TableContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TableIDContext(TableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterTableID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitTableID(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TableIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ID);
				}
				break;
			case CSV:
				_localctx = new TableCSVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(CSV);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\5\6E\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"y\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16\13\u0084\13"+
		"\13\5\13\u0086\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u009d\n\16\3\16\2\2\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\16\17\2\u00a6\2\37\3\2\2\2\4(\3"+
		"\2\2\2\6\62\3\2\2\2\b=\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16K\3\2\2\2\20k\3"+
		"\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u0089\3\2\2\2\30\u0095\3\2\2\2\32\u009c"+
		"\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$)\5\b\5\2%)\5\6\4\2"+
		"&)\5\f\7\2\')\5\16\b\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2"+
		"\2\2*+\7\3\2\2+,\5\n\6\2,-\7\4\2\2-\63\3\2\2\2./\7\5\2\2/\60\5\n\6\2\60"+
		"\61\7\4\2\2\61\63\3\2\2\2\62*\3\2\2\2\62.\3\2\2\2\63\7\3\2\2\2\64\65\7"+
		"\27\2\2\65\66\7\6\2\2\66\67\5\n\6\2\678\7\4\2\28>\3\2\2\29:\7\27\2\2:"+
		";\7\6\2\2;<\7\26\2\2<>\7\4\2\2=\64\3\2\2\2=9\3\2\2\2>\t\3\2\2\2?E\5\24"+
		"\13\2@E\5\26\f\2AE\5\20\t\2BE\5\22\n\2CE\5\32\16\2D?\3\2\2\2D@\3\2\2\2"+
		"DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\7\2\2GH\7\27\2\2HI\7\b"+
		"\2\2IJ\7\4\2\2J\r\3\2\2\2KL\7\t\2\2LM\7\27\2\2MN\7\b\2\2NO\7\4\2\2O\17"+
		"\3\2\2\2PQ\5\30\r\2QR\7\n\2\2RS\7\30\2\2Sl\3\2\2\2TU\5\30\r\2UV\7\13\2"+
		"\2VW\7\30\2\2Wl\3\2\2\2XY\5\30\r\2YZ\7\f\2\2Z[\7\30\2\2[l\3\2\2\2\\]\5"+
		"\30\r\2]_\7\r\2\2^`\t\2\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\30\2\2b"+
		"l\3\2\2\2cd\5\30\r\2de\7\16\2\2ef\7\30\2\2fl\3\2\2\2gh\5\30\r\2hi\7\17"+
		"\2\2ij\7\30\2\2jl\3\2\2\2kP\3\2\2\2kT\3\2\2\2kX\3\2\2\2k\\\3\2\2\2kc\3"+
		"\2\2\2kg\3\2\2\2l\21\3\2\2\2mn\5\30\r\2no\7\16\2\2op\7\27\2\2py\3\2\2"+
		"\2qr\5\30\r\2rs\7\17\2\2st\7\27\2\2ty\3\2\2\2uv\5\30\r\2vw\7\20\2\2wy"+
		"\3\2\2\2xm\3\2\2\2xq\3\2\2\2xu\3\2\2\2y\23\3\2\2\2z{\7\21\2\2{|\5\32\16"+
		"\2|\u0085\7\22\2\2}\u0082\7\30\2\2~\177\7\22\2\2\177\u0081\7\30\2\2\u0080"+
		"~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085}\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\b\2\2\u0088\25\3\2\2\2\u0089"+
		"\u008a\7\23\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7\22\2\2\u008c\u008d"+
		"\5\32\16\2\u008d\u008e\7\22\2\2\u008e\u008f\7\30\2\2\u008f\u0090\7\22"+
		"\2\2\u0090\u0091\7\30\2\2\u0091\u0092\7\22\2\2\u0092\u0093\7\30\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\27\3\2\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\24"+
		"\2\2\u0097\u0098\7\30\2\2\u0098\u0099\7\25\2\2\u0099\31\3\2\2\2\u009a"+
		"\u009d\7\27\2\2\u009b\u009d\7\26\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\33\3\2\2\2\r\37(\62=D_kx\u0082\u0085\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}