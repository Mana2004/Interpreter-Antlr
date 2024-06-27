// Generated from D:/meow/programm/Interpreter/src/GrammarNSC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarNSCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		Identifier=32, Number=33, StringLiteral=34, WS=35;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_binop = 3, 
		RULE_expr = 4, RULE_term = 5, RULE_factor = 6, RULE_result = 7, RULE_identifier = 8, 
		RULE_number = 9, RULE_sl = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "binop", "expr", "term", "factor", 
			"result", "identifier", "number", "sl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'begin'", "'end'", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'of'", "'to'", "'loop'", "':'", "'print'", "','", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'('", "')'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Identifier", "Number", 
			"StringLiteral", "WS"
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
	public String getGrammarFileName() { return "GrammarNSC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarNSCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			statements(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class States_stateContext extends StatementsContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public States_stateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitStates_state(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends StatementsContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StateContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(25);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new States_stateContext(new StatementsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(27);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(28);
					statement();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public EqualContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Print_literalContext extends StatementContext {
		public SlContext sl() {
			return getRuleContext(SlContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Print_literalContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitPrint_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_thenContext extends StatementContext {
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_thenContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Begin_endContext extends StatementContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Begin_endContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitBegin_end(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_then_elseContext extends StatementContext {
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_then_elseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitIf_then_else(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_doContext extends StatementContext {
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_doContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitWhile_do(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Loop_doContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_doContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitLoop_do(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_doContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_doContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitFor_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				identifier();
				setState(35);
				match(T__0);
				setState(36);
				binop(0);
				setState(37);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new Begin_endContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__2);
				setState(40);
				statements(0);
				setState(41);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new If_thenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__4);
				setState(44);
				binop(0);
				setState(45);
				match(T__5);
				setState(46);
				statement();
				}
				break;
			case 4:
				_localctx = new If_then_elseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(T__4);
				setState(49);
				binop(0);
				setState(50);
				match(T__5);
				setState(51);
				statement();
				setState(52);
				match(T__6);
				setState(53);
				statement();
				}
				break;
			case 5:
				_localctx = new While_doContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(T__7);
				setState(56);
				binop(0);
				setState(57);
				match(T__8);
				setState(58);
				statement();
				}
				break;
			case 6:
				_localctx = new For_doContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(T__9);
				setState(61);
				identifier();
				setState(62);
				match(T__10);
				setState(63);
				number();
				setState(64);
				match(T__11);
				setState(65);
				number();
				setState(66);
				match(T__8);
				setState(67);
				statement();
				}
				break;
			case 7:
				_localctx = new Loop_doContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				match(T__12);
				setState(70);
				identifier();
				setState(71);
				match(T__13);
				setState(72);
				number();
				setState(73);
				match(T__8);
				setState(74);
				statement();
				}
				break;
			case 8:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				match(T__14);
				setState(77);
				identifier();
				setState(78);
				match(T__1);
				}
				break;
			case 9:
				_localctx = new Print_literalContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				match(T__14);
				setState(81);
				sl();
				setState(82);
				match(T__15);
				setState(83);
				identifier();
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinopContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		return binop(0);
	}

	private BinopContext binop(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinopContext _localctx = new BinopContext(_ctx, _parentState);
		BinopContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_binop, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						match(T__16);
						setState(93);
						expr(0);
						}
						break;
					case 2:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						match(T__17);
						setState(96);
						expr(0);
						}
						break;
					case 3:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(T__18);
						setState(99);
						expr(0);
						}
						break;
					case 4:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(T__19);
						setState(102);
						expr(0);
						}
						break;
					case 5:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(104);
						match(T__20);
						setState(105);
						expr(0);
						}
						break;
					case 6:
						{
						_localctx = new BinopContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binop);
						setState(106);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(107);
						match(T__21);
						setState(108);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						match(T__22);
						setState(119);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(121);
						match(T__23);
						setState(122);
						term(0);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						match(T__24);
						setState(133);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						match(T__25);
						setState(136);
						factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(138);
						match(T__26);
						setState(139);
						factor();
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				result();
				setState(147);
				match(T__27);
				setState(148);
				factor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_result);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				number();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				identifier();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(T__28);
				setState(155);
				expr(0);
				setState(156);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(T__30);
				setState(159);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GrammarNSCParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(GrammarNSCParser.Number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Number);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SlContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GrammarNSCParser.StringLiteral, 0); }
		public SlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarNSCVisitor ) return ((GrammarNSCVisitor<? extends T>)visitor).visitSl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlContext sl() throws RecognitionException {
		SlContext _localctx = new SlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(StringLiteral);
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
		case 1:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 3:
			return binop_sempred((BinopContext)_localctx, predIndex);
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean binop_sempred(BinopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001e"+
		"\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002W\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003n\b\u0003\n\u0003\f\u0003q\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004|\b\u0004\n\u0004\f\u0004\u007f\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u008d\b\u0005\n\u0005\f\u0005\u0090\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0097\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0000\u0004\u0002\u0006\b\n\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00b5\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004V\u0001"+
		"\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\br\u0001\u0000\u0000"+
		"\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000\u0000\u0000"+
		"\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000"+
		"\u0012\u00a4\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0001\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019\u001a\u0003\u0004\u0002"+
		"\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u001c\n\u0001\u0000\u0000"+
		"\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0003\u0010\b\u0000#$\u0005\u0001\u0000\u0000$%"+
		"\u0003\u0006\u0003\u0000%&\u0005\u0002\u0000\u0000&W\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0003\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0004"+
		"\u0000\u0000*W\u0001\u0000\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0003"+
		"\u0006\u0003\u0000-.\u0005\u0006\u0000\u0000./\u0003\u0004\u0002\u0000"+
		"/W\u0001\u0000\u0000\u000001\u0005\u0005\u0000\u000012\u0003\u0006\u0003"+
		"\u000023\u0005\u0006\u0000\u000034\u0003\u0004\u0002\u000045\u0005\u0007"+
		"\u0000\u000056\u0003\u0004\u0002\u00006W\u0001\u0000\u0000\u000078\u0005"+
		"\b\u0000\u000089\u0003\u0006\u0003\u00009:\u0005\t\u0000\u0000:;\u0003"+
		"\u0004\u0002\u0000;W\u0001\u0000\u0000\u0000<=\u0005\n\u0000\u0000=>\u0003"+
		"\u0010\b\u0000>?\u0005\u000b\u0000\u0000?@\u0003\u0012\t\u0000@A\u0005"+
		"\f\u0000\u0000AB\u0003\u0012\t\u0000BC\u0005\t\u0000\u0000CD\u0003\u0004"+
		"\u0002\u0000DW\u0001\u0000\u0000\u0000EF\u0005\r\u0000\u0000FG\u0003\u0010"+
		"\b\u0000GH\u0005\u000e\u0000\u0000HI\u0003\u0012\t\u0000IJ\u0005\t\u0000"+
		"\u0000JK\u0003\u0004\u0002\u0000KW\u0001\u0000\u0000\u0000LM\u0005\u000f"+
		"\u0000\u0000MN\u0003\u0010\b\u0000NO\u0005\u0002\u0000\u0000OW\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u000f\u0000\u0000QR\u0003\u0014\n\u0000RS\u0005\u0010"+
		"\u0000\u0000ST\u0003\u0010\b\u0000TU\u0005\u0002\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000V\"\u0001\u0000\u0000\u0000V\'\u0001\u0000\u0000\u0000V+\u0001"+
		"\u0000\u0000\u0000V0\u0001\u0000\u0000\u0000V7\u0001\u0000\u0000\u0000"+
		"V<\u0001\u0000\u0000\u0000VE\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000"+
		"\u0000VP\u0001\u0000\u0000\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0006"+
		"\u0003\uffff\uffff\u0000YZ\u0003\b\u0004\u0000Zo\u0001\u0000\u0000\u0000"+
		"[\\\n\u0006\u0000\u0000\\]\u0005\u0011\u0000\u0000]n\u0003\b\u0004\u0000"+
		"^_\n\u0005\u0000\u0000_`\u0005\u0012\u0000\u0000`n\u0003\b\u0004\u0000"+
		"ab\n\u0004\u0000\u0000bc\u0005\u0013\u0000\u0000cn\u0003\b\u0004\u0000"+
		"de\n\u0003\u0000\u0000ef\u0005\u0014\u0000\u0000fn\u0003\b\u0004\u0000"+
		"gh\n\u0002\u0000\u0000hi\u0005\u0015\u0000\u0000in\u0003\b\u0004\u0000"+
		"jk\n\u0001\u0000\u0000kl\u0005\u0016\u0000\u0000ln\u0003\b\u0004\u0000"+
		"m[\u0001\u0000\u0000\u0000m^\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000"+
		"\u0000md\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mj\u0001\u0000"+
		"\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0006\u0004\uffff\uffff\u0000st\u0003\n\u0005\u0000t}\u0001\u0000"+
		"\u0000\u0000uv\n\u0002\u0000\u0000vw\u0005\u0017\u0000\u0000w|\u0003\n"+
		"\u0005\u0000xy\n\u0001\u0000\u0000yz\u0005\u0018\u0000\u0000z|\u0003\n"+
		"\u0005\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\t\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\u0005\uffff\uffff\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082"+
		"\u008e\u0001\u0000\u0000\u0000\u0083\u0084\n\u0003\u0000\u0000\u0084\u0085"+
		"\u0005\u0019\u0000\u0000\u0085\u008d\u0003\f\u0006\u0000\u0086\u0087\n"+
		"\u0002\u0000\u0000\u0087\u0088\u0005\u001a\u0000\u0000\u0088\u008d\u0003"+
		"\f\u0006\u0000\u0089\u008a\n\u0001\u0000\u0000\u008a\u008b\u0005\u001b"+
		"\u0000\u0000\u008b\u008d\u0003\f\u0006\u0000\u008c\u0083\u0001\u0000\u0000"+
		"\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u000b\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0097\u0003\u000e\u0007"+
		"\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093\u0094\u0005\u001c\u0000"+
		"\u0000\u0094\u0095\u0003\f\u0006\u0000\u0095\u0097\u0001\u0000\u0000\u0000"+
		"\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0097\r\u0001\u0000\u0000\u0000\u0098\u00a1\u0003\u0012\t\u0000\u0099"+
		"\u00a1\u0003\u0010\b\u0000\u009a\u009b\u0005\u001d\u0000\u0000\u009b\u009c"+
		"\u0003\b\u0004\u0000\u009c\u009d\u0005\u001e\u0000\u0000\u009d\u00a1\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a1\u0003"+
		"\b\u0004\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005 \u0000"+
		"\u0000\u00a3\u0011\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005!\u0000\u0000"+
		"\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\"\u0000\u0000\u00a7"+
		"\u0015\u0001\u0000\u0000\u0000\n\u001fVmo{}\u008c\u008e\u0096\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}