// Generated from Hello.g4 by ANTLR 4.13.0

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	import java.util.HashMap;
	import java.util.Map;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, NUMBER=14, DECIMAL_NUMBER=15, TEXT=16, 
		ATTR=17, SUM=18, SUB=19, MULT=20, DIV=21, OPREL=22, ID=23, VIRG=24, PF=25, 
		AP=26, FP=27, BLANK=28;
	public static final int
		RULE_programa = 0, RULE_decl = 1, RULE_tipo = 2, RULE_lista_var = 3, RULE_cmd = 4, 
		RULE_cmdWhile = 5, RULE_cmdIf = 6, RULE_cmdRead = 7, RULE_cmdWrite = 8, 
		RULE_cmdAttr = 9, RULE_expr = 10, RULE_termo = 11, RULE_exprl = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decl", "tipo", "lista_var", "cmd", "cmdWhile", "cmdIf", 
			"cmdRead", "cmdWrite", "cmdAttr", "expr", "termo", "exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'INTEGER'", "'REAL'", "'enquanto'", 
			"'realize'", "'fimenquanto'", "'se'", "'entao'", "'senao'", "'fimse'", 
			"'leia'", "'escreva'", null, null, null, "':='", "'+'", "'-'", "'*'", 
			"'/'", null, null, "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NUMBER", "DECIMAL_NUMBER", "TEXT", "ATTR", "SUM", "SUB", 
			"MULT", "DIV", "OPREL", "ID", "VIRG", "PF", "AP", "FP", "BLANK"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private SymbolTable symbolTable = new SymbolTable();
		private DataType currentType;
		private AbstractExpression expression;
		private String operator;
		private String unaryOperator;
		private DataType leftDT;
		private DataType rightDT;
		private String   idDeclarado, idAtribuido;
		private boolean isExprParenthesisOpened = false;
		private boolean condicaoEnquanto = false;
		private List<Identifier> declaredIds;
		private String   text;
		private Program  program = new Program();
		private Stack<List<AbstractCommand>> stack = new Stack<List<AbstractCommand>>();
		private Map<String, Boolean> mapaUsoVariaveis = new HashMap<>();
		
		public void init(){
			program.setSymbolTable(symbolTable);
			stack.push(new ArrayList<AbstractCommand>());
		}
			
		public void exibirID(){
			symbolTable.getSymbols().values().stream().forEach((id)->System.out.println(id));
		}
		
		public void generateObjectCode(){
			program.generateTarget();
		}


	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				decl();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				cmd();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8401184L) != 0) );
			setState(37);
			match(T__1);

							for (Map.Entry<String, Boolean> entry : mapaUsoVariaveis.entrySet()) {
								if(entry.getValue() == false){
			    					System.out.println("A variavel: " + entry.getKey() + " não foi utilizada.");
								}
							}
							System.out.println();
							program.setComandos(stack.pop());
						
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
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			tipo();
			setState(41);
			lista_var();
			setState(42);
			match(PF);

				          Declaration _decl = new Declaration(declaredIds);
				          stack.peek().add(_decl);
			            
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__2);
				 currentType = DataType.INTEGER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T__3);
				 currentType = DataType.REAL; 
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
	public static class Lista_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HelloParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HelloParser.ID, i);
		}
		public List<TerminalNode> VIRG() { return getTokens(HelloParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(HelloParser.VIRG, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);

				          declaredIds = new ArrayList<>();
				          idDeclarado = _input.LT(-1).getText();
				          if (symbolTable.get(idDeclarado) != null) {
				          	throw new RuntimeException("Variable " + idDeclarado + " already has been declared");
				          }
				          mapaUsoVariaveis.put(idDeclarado,false);
				          symbolTable.add(idDeclarado, new Identifier(idDeclarado, currentType));
				          declaredIds.add(symbolTable.get(idDeclarado));
			            
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(53);
				match(VIRG);
				setState(54);
				match(ID);

				           	  idDeclarado = _input.LT(-1).getText();
				           	  if (symbolTable.get(idDeclarado) != null) {
					          	throw new RuntimeException("Variable \"" + idDeclarado + "\" already has been declared");
					          }
					          mapaUsoVariaveis.put(idDeclarado,false);
					          symbolTable.add(idDeclarado, new Identifier(idDeclarado, currentType));
					          declaredIds.add(symbolTable.get(idDeclarado));
				           	
				}
				}
				setState(60);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				cmdAttr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				cmdRead();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				cmdWrite();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				cmdIf();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				cmdWhile();
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
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(HelloParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(HelloParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(HelloParser.FP, 0); }
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__4);
			 
							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();
							CmdWhile _cmdWhile = new CmdWhile();
						
			setState(70);
			match(AP);
			setState(71);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(73);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText());
						
			setState(75);
			expr();

							_relExpr.setRightSide(expression);
							_cmdWhile.setExpr(_relExpr);
							// limpando operadores para validacoes de comparacoes futuras
							leftDT = null;
							rightDT =null;
						
			setState(77);
			match(FP);
			setState(78);
			match(T__5);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				cmd();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8401184L) != 0) );

							_cmdWhile.setCommands(stack.pop());
						
			setState(85);
			match(T__6);
			setState(86);
			match(PF);

							stack.peek().add(_cmdWhile);
						
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
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(HelloParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(HelloParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(HelloParser.FP, 0); }
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__7);

							stack.push(new ArrayList<AbstractCommand>());
							BinaryExpression _relExpr = new BinaryExpression();
							CmdIf _cmdIf = new CmdIf();
						
			setState(91);
			match(AP);
			setState(92);
			expr();

							_relExpr.setLeftSide(expression);
						
			setState(94);
			match(OPREL);

							_relExpr.setOperator(_input.LT(-1).getText());
						
			setState(96);
			expr();

							_relExpr.setRightSide(expression);
							_cmdIf.setExpr(_relExpr);
							// limpando operadores para validacoes de comparacoes futuras
							leftDT = null;
							rightDT =null;
						
			setState(98);
			match(FP);
			setState(99);
			match(T__8);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				cmd();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8401184L) != 0) );

							_cmdIf.setListaTrue(stack.pop());
						
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(106);
				match(T__9);

								stack.push(new ArrayList<AbstractCommand>());
							
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					cmd();
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8401184L) != 0) );

								_cmdIf.setListaFalse(stack.pop());
							
				}
			}

			setState(117);
			match(T__10);
			setState(118);
			match(PF);

							stack.peek().add(_cmdIf);
						
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
	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(HelloParser.AP, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode FP() { return getToken(HelloParser.FP, 0); }
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__11);
			setState(122);
			match(AP);
			setState(123);
			match(ID);

							Identifier id = symbolTable.get(_input.LT(-1).getText());
							if (id == null){
								throw new RuntimeException("Undeclared Variable");
							}
							CmdRead _read = new CmdRead(id);
							stack.peek().add(_read);
						 
			setState(125);
			match(FP);
			setState(126);
			match(PF);
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
	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(HelloParser.AP, 0); }
		public TerminalNode FP() { return getToken(HelloParser.FP, 0); }
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(HelloParser.TEXT, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__12);
			setState(129);
			match(AP);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(130);
				match(ID);

					         	Identifier id = symbolTable.get(_input.LT(-1).getText());
					         	if (id == null){
					         		throw new RuntimeException("Undeclared Variable");	         		
					         	}
					         	CmdWrite _write = new CmdWrite(id);
					         	stack.peek().add(_write);
					         
				}
				break;
			case TEXT:
				{
				setState(132);
				match(TEXT);

					         	CmdWrite _write = new CmdWrite(_input.LT(-1).getText());
					         	stack.peek().add(_write);
					         	
					         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			match(FP);
			setState(137);
			match(PF);
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
	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(HelloParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PF() { return getToken(HelloParser.PF, 0); }
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCmdAttr(this);
		}
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);

							idAtribuido = _input.LT(-1).getText();
							if (!symbolTable.exists(_input.LT(-1).getText())){
								throw new RuntimeException("Semantic ERROR - Undeclared Identifier");
							}
							leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
							rightDT = null;
						
			setState(141);
			match(ATTR);
			setState(142);
			expr();
			setState(143);
			match(PF);

								// logica para atribuir o valor da expressao no identificador
								Identifier id = symbolTable.get(idAtribuido);
								symbolTable.add(idAtribuido, id);
								CmdAttrib _attr = new CmdAttrib(id, expression);
								stack.peek().add(_attr);
								expression = null;
								leftDT = null;
								rightDT = null;
							
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
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			termo();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					exprl();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(HelloParser.DECIMAL_NUMBER, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode AP() { return getToken(HelloParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(HelloParser.FP, 0); }
		public TerminalNode SUM() { return getToken(HelloParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(HelloParser.SUB, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(NUMBER);

								expression = new NumberExpression(Integer.parseInt(_input.LT(-1).getText()));

							
				}
				break;
			case DECIMAL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(DECIMAL_NUMBER);

						  	expression = new NumberDecimalExpression(Float.parseFloat(_input.LT(-1).getText()));
						  
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(ID);

							    // checks for existence in symbolTable; throws RuntimeError if not present
								if (!symbolTable.exists(_input.LT(-1).getText())){
									throw new RuntimeException("Semantic ERROR - Undeclared Identifier: "+_input.LT(-1).getText());
								}
								
								// checks for left-hand side and right-hand side type equality; throws if mismatch
								rightDT = symbolTable.get(_input.LT(-1).getText()).getType();
								//como a expressão é reusada, usamos o  if abaixo para atribuicao de tipo do lado esquerdo da expressao. Apos isso ele ira ler o valor do lado direito.
								if(leftDT == null){
									leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
								};
								if (leftDT != rightDT){
									throw new RuntimeException("Semantic ERROR - Type Mismatching "+leftDT+ "-"+rightDT);
								}		
								
								// checks for initialization; if initialized generate new NumberExpression, throws otherwise
								Identifier id = symbolTable.get(_input.LT(-1).getText());
								if (id != null){
									mapaUsoVariaveis.put(id.getText(),true);
									expression = new IDExpression(id);
								}
								else{
									throw new RuntimeException("Semantic ERROR - Unassigned variable");
								}
							
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(AP);
				setState(160);
				expr();
				setState(161);
				match(FP);

						  	  expression = new ParenthesisExpression(expression);
						    
				}
				break;
			case SUM:
			case SUB:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==SUM || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

						  	  unaryOperator = _input.LT(-1).getText();
						    
				setState(166);
				expr();

						  	  expression = new UnaryExpression(unaryOperator, expression);
						    
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
	public static class ExprlContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode SUM() { return getToken(HelloParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(HelloParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(HelloParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 
							operator = _input.LT(-1).getText();
							BinaryExpression _exprADD = new BinaryExpression(operator);
							_exprADD.setLeftSide(expression);
						
			setState(173);
			termo();

							_exprADD.setRightSide(expression);
							expression = _exprADD;
						
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
		"\u0004\u0001\u001c\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000"+
		"#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00022\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u0005Q\b\u0005\u000b\u0005\f\u0005R\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006f\b\u0006\u000b\u0006\f\u0006"+
		"g\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006n\b\u0006"+
		"\u000b\u0006\f\u0006o\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0005\n\u0095\b\n\n\n\f\n\u0098\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00aa\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000\u0012\u0013\u0001\u0000"+
		"\u0012\u0015\u00b5\u0000\u001a\u0001\u0000\u0000\u0000\u0002(\u0001\u0000"+
		"\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\bB\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fY\u0001\u0000"+
		"\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000"+
		"\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000"+
		"\u0000\u0016\u00a9\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0005\u0001\u0000\u0000\u001b\u001d\u0003\u0002\u0001"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0003\b\u0004\u0000! \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005\u0002\u0000\u0000"+
		"&\'\u0006\u0000\uffff\uffff\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0003"+
		"\u0004\u0002\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0019\u0000\u0000"+
		"+,\u0006\u0001\uffff\uffff\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0003\u0000\u0000.2\u0006\u0002\uffff\uffff\u0000/0\u0005\u0004\u0000"+
		"\u000002\u0006\u0002\uffff\uffff\u00001-\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0017\u0000"+
		"\u00004:\u0006\u0003\uffff\uffff\u000056\u0005\u0018\u0000\u000067\u0005"+
		"\u0017\u0000\u000079\u0006\u0003\uffff\uffff\u000085\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=C\u0003\u0012\t\u0000>C\u0003\u000e\u0007\u0000?C\u0003\u0010\b\u0000"+
		"@C\u0003\f\u0006\u0000AC\u0003\n\u0005\u0000B=\u0001\u0000\u0000\u0000"+
		"B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\u0005"+
		"\u0000\u0000EF\u0006\u0005\uffff\uffff\u0000FG\u0005\u001a\u0000\u0000"+
		"GH\u0003\u0014\n\u0000HI\u0006\u0005\uffff\uffff\u0000IJ\u0005\u0016\u0000"+
		"\u0000JK\u0006\u0005\uffff\uffff\u0000KL\u0003\u0014\n\u0000LM\u0006\u0005"+
		"\uffff\uffff\u0000MN\u0005\u001b\u0000\u0000NP\u0005\u0006\u0000\u0000"+
		"OQ\u0003\b\u0004\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0006\u0005\uffff\uffff\u0000UV\u0005\u0007\u0000\u0000VW\u0005"+
		"\u0019\u0000\u0000WX\u0006\u0005\uffff\uffff\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000YZ\u0005\b\u0000\u0000Z[\u0006\u0006\uffff\uffff\u0000[\\"+
		"\u0005\u001a\u0000\u0000\\]\u0003\u0014\n\u0000]^\u0006\u0006\uffff\uffff"+
		"\u0000^_\u0005\u0016\u0000\u0000_`\u0006\u0006\uffff\uffff\u0000`a\u0003"+
		"\u0014\n\u0000ab\u0006\u0006\uffff\uffff\u0000bc\u0005\u001b\u0000\u0000"+
		"ce\u0005\t\u0000\u0000df\u0003\b\u0004\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000is\u0006\u0006\uffff\uffff\u0000jk\u0005"+
		"\n\u0000\u0000km\u0006\u0006\uffff\uffff\u0000ln\u0003\b\u0004\u0000m"+
		"l\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u0006"+
		"\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u000b\u0000"+
		"\u0000vw\u0005\u0019\u0000\u0000wx\u0006\u0006\uffff\uffff\u0000x\r\u0001"+
		"\u0000\u0000\u0000yz\u0005\f\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005"+
		"\u0017\u0000\u0000|}\u0006\u0007\uffff\uffff\u0000}~\u0005\u001b\u0000"+
		"\u0000~\u007f\u0005\u0019\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\r\u0000\u0000\u0081\u0086\u0005\u001a\u0000\u0000\u0082"+
		"\u0083\u0005\u0017\u0000\u0000\u0083\u0087\u0006\b\uffff\uffff\u0000\u0084"+
		"\u0085\u0005\u0010\u0000\u0000\u0085\u0087\u0006\b\uffff\uffff\u0000\u0086"+
		"\u0082\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001b\u0000\u0000\u0089"+
		"\u008a\u0005\u0019\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0017\u0000\u0000\u008c\u008d\u0006\t\uffff\uffff\u0000\u008d"+
		"\u008e\u0005\u0011\u0000\u0000\u008e\u008f\u0003\u0014\n\u0000\u008f\u0090"+
		"\u0005\u0019\u0000\u0000\u0090\u0091\u0006\t\uffff\uffff\u0000\u0091\u0013"+
		"\u0001\u0000\u0000\u0000\u0092\u0096\u0003\u0016\u000b\u0000\u0093\u0095"+
		"\u0003\u0018\f\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u00aa\u0006"+
		"\u000b\uffff\uffff\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c\u00aa"+
		"\u0006\u000b\uffff\uffff\u0000\u009d\u009e\u0005\u0017\u0000\u0000\u009e"+
		"\u00aa\u0006\u000b\uffff\uffff\u0000\u009f\u00a0\u0005\u001a\u0000\u0000"+
		"\u00a0\u00a1\u0003\u0014\n\u0000\u00a1\u00a2\u0005\u001b\u0000\u0000\u00a2"+
		"\u00a3\u0006\u000b\uffff\uffff\u0000\u00a3\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0007\u0000\u0000\u0000\u00a5\u00a6\u0006\u000b\uffff\uffff"+
		"\u0000\u00a6\u00a7\u0003\u0014\n\u0000\u00a7\u00a8\u0006\u000b\uffff\uffff"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u0099\u0001\u0000\u0000"+
		"\u0000\u00a9\u009b\u0001\u0000\u0000\u0000\u00a9\u009d\u0001\u0000\u0000"+
		"\u0000\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000"+
		"\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0007\u0001\u0000"+
		"\u0000\u00ac\u00ad\u0006\f\uffff\uffff\u0000\u00ad\u00ae\u0003\u0016\u000b"+
		"\u0000\u00ae\u00af\u0006\f\uffff\uffff\u0000\u00af\u0019\u0001\u0000\u0000"+
		"\u0000\f\u001e#1:BRgos\u0086\u0096\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}