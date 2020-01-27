// Generated from C:/Users/juanda/IdeaProjects/proyecto final/grammar\lengBasic.g4 by ANTLR 4.7.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lengBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, CHAR=55, REAL=56, INT=57, BOOL=58, COT=59, IF=60, 
		ELSE=61, WHile=62, FOR=63, Do=64, LeftShift=65, RightShift=66, ID=67, 
		Whitespace=68, Newline=69, BlockComment=70, LineComment=71, RightShiftAssign=72, 
		LeftShiftAssign=73;
	public static final int
		RULE_begin = 0, RULE_statement = 1, RULE_globalThings = 2, RULE_localThings = 3, 
		RULE_main = 4, RULE_declaracion = 5, RULE_function_declaration = 6, RULE_declaracion_asignacion = 7, 
		RULE_simpleDeclaration = 8, RULE_expresion = 9, RULE_ciclo = 10, RULE_desicion = 11, 
		RULE_wHILe = 12, RULE_do_while = 13, RULE_fOR = 14, RULE_expresion_decimal = 15, 
		RULE_expresion_entera = 16, RULE_assignmentexpression = 17, RULE_expresion_logica = 18, 
		RULE_conditionalexpression = 19, RULE_expresion_mat = 20, RULE_logicalandexpression = 21, 
		RULE_logicalorexpression = 22, RULE_equalityexpression = 23, RULE_andexpression = 24, 
		RULE_exclusiveorexpression = 25, RULE_inclusiveorexpression = 26, RULE_relationalexpression = 27, 
		RULE_shiftoperator = 28, RULE_mulriplicacion = 29, RULE_adicion = 30, 
		RULE_post_operators = 31, RULE_pre_operators = 32, RULE_tipos = 33, RULE_tipos_sin_pre = 34, 
		RULE_tipos_con_pre = 35, RULE_tipos_fun = 36, RULE_tipos_sin_pre_fun = 37, 
		RULE_tipos_con_pre_fun = 38, RULE_variables = 39, RULE_pretipo = 40, RULE_assignmentoperator = 41, 
		RULE_numero = 42, RULE_index = 43, RULE_arguments = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "statement", "globalThings", "localThings", "main", "declaracion", 
			"function_declaration", "declaracion_asignacion", "simpleDeclaration", 
			"expresion", "ciclo", "desicion", "wHILe", "do_while", "fOR", "expresion_decimal", 
			"expresion_entera", "assignmentexpression", "expresion_logica", "conditionalexpression", 
			"expresion_mat", "logicalandexpression", "logicalorexpression", "equalityexpression", 
			"andexpression", "exclusiveorexpression", "inclusiveorexpression", "relationalexpression", 
			"shiftoperator", "mulriplicacion", "adicion", "post_operators", "pre_operators", 
			"tipos", "tipos_sin_pre", "tipos_con_pre", "tipos_fun", "tipos_sin_pre_fun", 
			"tipos_con_pre_fun", "variables", "pretipo", "assignmentoperator", "numero", 
			"index", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'int main'", "'('", "')'", "'?'", "':'", "'&&'", 
			"'and'", "'||'", "'or'", "'!'", "'=='", "'!='", "'&'", "'^'", "'|'", 
			"'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'+'", "'-'", "'++'", 
			"'--'", "'char'", "'char16'", "'char32'", "'wchar'", "'bool'", "'auto'", 
			"'int'", "'float'", "'double'", "'void'", "','", "'short'", "'long'", 
			"'signed'", "'unsigned'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'&='", "'^='", "'|='", "'['", "']'", null, null, null, null, "';'", 
			"'if'", "'else'", "'while'", "'for'", "'do'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CHAR", "REAL", "INT", "BOOL", 
			"COT", "IF", "ELSE", "WHile", "FOR", "Do", "LeftShift", "RightShift", 
			"ID", "Whitespace", "Newline", "BlockComment", "LineComment", "RightShiftAssign", 
			"LeftShiftAssign"
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
	public String getGrammarFileName() { return "lengBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lengBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(lengBasicParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<GlobalThingsContext> globalThings() {
			return getRuleContexts(GlobalThingsContext.class);
		}
		public GlobalThingsContext globalThings(int i) {
			return getRuleContext(GlobalThingsContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__28 - 27)) | (1L << (T__29 - 27)) | (1L << (T__30 - 27)) | (1L << (T__31 - 27)) | (1L << (T__32 - 27)) | (1L << (T__33 - 27)) | (1L << (T__34 - 27)) | (1L << (T__35 - 27)) | (1L << (T__36 - 27)) | (1L << (T__37 - 27)) | (1L << (T__39 - 27)) | (1L << (T__40 - 27)) | (1L << (T__41 - 27)) | (1L << (T__42 - 27)) | (1L << (ID - 27)))) != 0)) {
				{
				{
				setState(90);
				globalThings();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(96);
				main();
				}
				break;
			case EOF:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
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

	public static class StatementContext extends ParserRuleContext {
		public List<LocalThingsContext> localThings() {
			return getRuleContexts(LocalThingsContext.class);
		}
		public LocalThingsContext localThings(int i) {
			return getRuleContext(LocalThingsContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__27 - 27)) | (1L << (T__28 - 27)) | (1L << (T__29 - 27)) | (1L << (T__30 - 27)) | (1L << (T__31 - 27)) | (1L << (T__32 - 27)) | (1L << (T__33 - 27)) | (1L << (T__34 - 27)) | (1L << (T__35 - 27)) | (1L << (T__36 - 27)) | (1L << (T__39 - 27)) | (1L << (T__40 - 27)) | (1L << (T__41 - 27)) | (1L << (T__42 - 27)) | (1L << (IF - 27)) | (1L << (WHile - 27)) | (1L << (FOR - 27)) | (1L << (Do - 27)) | (1L << (ID - 27)))) != 0)) {
				{
				{
				setState(103);
				localThings();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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

	public static class GlobalThingsContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public GlobalThingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalThings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterGlobalThings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitGlobalThings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitGlobalThings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalThingsContext globalThings() throws RecognitionException {
		GlobalThingsContext _localctx = new GlobalThingsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalThings);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				assignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				function_declaration();
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

	public static class LocalThingsContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public DesicionContext desicion() {
			return getRuleContext(DesicionContext.class,0);
		}
		public LocalThingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localThings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterLocalThings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitLocalThings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitLocalThings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalThingsContext localThings() throws RecognitionException {
		LocalThingsContext _localctx = new LocalThingsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_localThings);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				declaracion();
				}
				break;
			case WHile:
			case FOR:
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				ciclo();
				}
				break;
			case T__26:
			case T__27:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				assignmentexpression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				desicion();
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

	public static class MainContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__2);
			setState(123);
			match(T__3);
			setState(124);
			match(T__4);
			setState(125);
			statement();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public Declaracion_asignacionContext declaracion_asignacion() {
			return getRuleContext(Declaracion_asignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				declaracion_asignacion();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Tipos_funContext tipos_fun() {
			return getRuleContext(Tipos_funContext.class,0);
		}
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			tipos_fun();
			setState(132);
			match(ID);
			setState(133);
			match(T__3);
			setState(134);
			arguments();
			setState(135);
			match(T__4);
			setState(136);
			statement();
			setState(137);
			match(COT);
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

	public static class Declaracion_asignacionContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public Declaracion_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterDeclaracion_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitDeclaracion_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitDeclaracion_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_asignacionContext declaracion_asignacion() throws RecognitionException {
		Declaracion_asignacionContext _localctx = new Declaracion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			tipos();
			setState(140);
			match(ID);
			setState(141);
			assignmentoperator();
			setState(142);
			expresion();
			setState(143);
			match(COT);
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

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			tipos();
			setState(146);
			variables();
			setState(147);
			match(COT);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_decimalContext expresion_decimal() {
			return getRuleContext(Expresion_decimalContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_matContext expresion_mat() {
			return getRuleContext(Expresion_matContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expresion_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				expresion_decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				expresion_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				expresion_mat();
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

	public static class CicloContext extends ParserRuleContext {
		public FORContext fOR() {
			return getRuleContext(FORContext.class,0);
		}
		public WHILeContext wHILe() {
			return getRuleContext(WHILeContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ciclo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				fOR();
				}
				break;
			case WHile:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				wHILe();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				do_while();
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

	public static class DesicionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lengBasicParser.IF, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(lengBasicParser.ELSE, 0); }
		public DesicionContext desicion() {
			return getRuleContext(DesicionContext.class,0);
		}
		public DesicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterDesicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitDesicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitDesicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesicionContext desicion() throws RecognitionException {
		DesicionContext _localctx = new DesicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_desicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			match(T__3);
			setState(162);
			expresion_logica();
			setState(163);
			match(T__4);
			setState(164);
			statement();
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(165);
				match(ELSE);
				setState(166);
				statement();
				}
				break;
			case 2:
				{
				setState(167);
				match(ELSE);
				setState(168);
				desicion();
				}
				break;
			case 3:
				{
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

	public static class WHILeContext extends ParserRuleContext {
		public TerminalNode WHile() { return getToken(lengBasicParser.WHile, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WHILeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wHILe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterWHILe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitWHILe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitWHILe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WHILeContext wHILe() throws RecognitionException {
		WHILeContext _localctx = new WHILeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wHILe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHile);
			setState(173);
			match(T__3);
			setState(174);
			expresion_logica();
			setState(175);
			match(T__4);
			setState(176);
			statement();
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(lengBasicParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHile() { return getToken(lengBasicParser.WHile, 0); }
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Do);
			setState(179);
			statement();
			setState(180);
			match(WHile);
			setState(181);
			match(T__3);
			setState(182);
			expresion_logica();
			setState(183);
			match(T__4);
			setState(184);
			match(COT);
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

	public static class FORContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(lengBasicParser.FOR, 0); }
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public Declaracion_asignacionContext declaracion_asignacion() {
			return getRuleContext(Declaracion_asignacionContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Expresion_matContext expresion_mat() {
			return getRuleContext(Expresion_matContext.class,0);
		}
		public FORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fOR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterFOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitFOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitFOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FORContext fOR() throws RecognitionException {
		FORContext _localctx = new FORContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FOR);
			setState(187);
			match(T__3);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(188);
				simpleDeclaration();
				}
				break;
			case 2:
				{
				setState(189);
				declaracion_asignacion();
				}
				break;
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__11 - 4)) | (1L << (REAL - 4)) | (1L << (INT - 4)) | (1L << (ID - 4)))) != 0)) {
				{
				setState(192);
				expresion_logica();
				}
			}

			setState(195);
			match(COT);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__26 - 4)) | (1L << (T__27 - 4)) | (1L << (REAL - 4)) | (1L << (INT - 4)) | (1L << (ID - 4)))) != 0)) {
				{
				setState(196);
				expresion_mat();
				}
			}

			setState(199);
			match(T__4);
			setState(200);
			statement();
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

	public static class Expresion_decimalContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(lengBasicParser.REAL, 0); }
		public Expresion_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion_decimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion_decimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_decimalContext expresion_decimal() throws RecognitionException {
		Expresion_decimalContext _localctx = new Expresion_decimalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(REAL);
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

	public static class Expresion_enteraContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lengBasicParser.INT, 0); }
		public Expresion_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_enteraContext expresion_entera() throws RecognitionException {
		Expresion_enteraContext _localctx = new Expresion_enteraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion_entera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(INT);
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Post_operatorsContext post_operators() {
			return getRuleContext(Post_operatorsContext.class,0);
		}
		public Pre_operatorsContext pre_operators() {
			return getRuleContext(Pre_operatorsContext.class,0);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitAssignmentexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitAssignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(206);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(207);
					index();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				assignmentoperator();
				setState(214);
				expresion();
				}
				break;
			case 2:
				{
				setState(216);
				post_operators();
				}
				break;
			case 3:
				{
				setState(217);
				pre_operators();
				}
				break;
			}
			setState(220);
			match(COT);
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

	public static class Expresion_logicaContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			logicalorexpression(0);
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

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public List<AssignmentexpressionContext> assignmentexpression() {
			return getRuleContexts(AssignmentexpressionContext.class);
		}
		public AssignmentexpressionContext assignmentexpression(int i) {
			return getRuleContext(AssignmentexpressionContext.class,i);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitConditionalexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitConditionalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalexpression);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				logicalorexpression(0);
				setState(226);
				match(T__5);
				setState(227);
				assignmentexpression();
				setState(228);
				match(T__6);
				setState(229);
				assignmentexpression();
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

	public static class Expresion_matContext extends ParserRuleContext {
		public AdicionContext adicion() {
			return getRuleContext(AdicionContext.class,0);
		}
		public Post_operatorsContext post_operators() {
			return getRuleContext(Post_operatorsContext.class,0);
		}
		public Pre_operatorsContext pre_operators() {
			return getRuleContext(Pre_operatorsContext.class,0);
		}
		public Expresion_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_matContext expresion_mat() throws RecognitionException {
		Expresion_matContext _localctx = new Expresion_matContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_mat);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				adicion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				post_operators();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				pre_operators();
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

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitLogicalandexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitLogicalandexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(241);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(242);
						match(T__7);
						setState(243);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(244);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(245);
						match(T__8);
						setState(246);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitLogicalorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitLogicalorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						match(T__9);
						setState(257);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(258);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(259);
						match(T__10);
						setState(260);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitEqualityexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitEqualityexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case REAL:
			case INT:
			case ID:
				{
				setState(267);
				relationalexpression(0);
				}
				break;
			case T__11:
				{
				setState(268);
				match(T__11);
				setState(269);
				expresion_logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(273);
						match(T__12);
						setState(274);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(276);
						match(T__13);
						setState(277);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitAndexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitAndexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(287);
					match(T__14);
					setState(288);
					equalityexpression(0);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExclusiveorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					match(T__15);
					setState(299);
					andexpression(0);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitInclusiveorexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitInclusiveorexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(306);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(308);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(309);
					match(T__16);
					setState(310);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public AdicionContext adicion() {
			return getRuleContext(AdicionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitRelationalexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitRelationalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			adicion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(320);
						match(T__17);
						setState(321);
						adicion(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(323);
						match(T__18);
						setState(324);
						adicion(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(T__19);
						setState(327);
						adicion(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(329);
						match(T__20);
						setState(330);
						adicion(0);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ShiftoperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(lengBasicParser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(lengBasicParser.LeftShift, 0); }
		public ShiftoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterShiftoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitShiftoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitShiftoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
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

	public static class MulriplicacionContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public MulriplicacionContext mulriplicacion() {
			return getRuleContext(MulriplicacionContext.class,0);
		}
		public MulriplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulriplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterMulriplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitMulriplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitMulriplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulriplicacionContext mulriplicacion() throws RecognitionException {
		return mulriplicacion(0);
	}

	private MulriplicacionContext mulriplicacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulriplicacionContext _localctx = new MulriplicacionContext(_ctx, _parentState);
		MulriplicacionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_mulriplicacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(339);
			numero();
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(341);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(342);
						match(T__21);
						setState(343);
						numero();
						}
						break;
					case 2:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(344);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(345);
						match(T__22);
						setState(346);
						numero();
						}
						break;
					case 3:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(347);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(348);
						match(T__23);
						setState(349);
						numero();
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class AdicionContext extends ParserRuleContext {
		public MulriplicacionContext mulriplicacion() {
			return getRuleContext(MulriplicacionContext.class,0);
		}
		public AdicionContext adicion() {
			return getRuleContext(AdicionContext.class,0);
		}
		public AdicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitAdicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdicionContext adicion() throws RecognitionException {
		return adicion(0);
	}

	private AdicionContext adicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdicionContext _localctx = new AdicionContext(_ctx, _parentState);
		AdicionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_adicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			mulriplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(358);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(359);
						match(T__24);
						setState(360);
						mulriplicacion(0);
						}
						break;
					case 2:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(361);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(362);
						match(T__25);
						setState(363);
						mulriplicacion(0);
						}
						break;
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Post_operatorsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public Post_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterPost_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitPost_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitPost_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_operatorsContext post_operators() throws RecognitionException {
		Post_operatorsContext _localctx = new Post_operatorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_post_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ID);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(370);
				index();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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

	public static class Pre_operatorsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public Pre_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterPre_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitPre_operators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitPre_operators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_operatorsContext pre_operators() throws RecognitionException {
		Pre_operatorsContext _localctx = new Pre_operatorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pre_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(379);
			match(ID);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(380);
				index();
				}
				}
				setState(385);
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

	public static class TiposContext extends ParserRuleContext {
		public PretipoContext pretipo() {
			return getRuleContext(PretipoContext.class,0);
		}
		public Tipos_con_preContext tipos_con_pre() {
			return getRuleContext(Tipos_con_preContext.class,0);
		}
		public Tipos_sin_preContext tipos_sin_pre() {
			return getRuleContext(Tipos_sin_preContext.class,0);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				{
				setState(386);
				pretipo();
				setState(387);
				tipos_con_pre();
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				{
				setState(389);
				tipos_sin_pre();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
				{
				setState(390);
				tipos_con_pre();
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

	public static class Tipos_sin_preContext extends ParserRuleContext {
		public Tipos_sin_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_sin_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos_sin_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos_sin_pre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos_sin_pre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_sin_preContext tipos_sin_pre() throws RecognitionException {
		Tipos_sin_preContext _localctx = new Tipos_sin_preContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tipos_sin_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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

	public static class Tipos_con_preContext extends ParserRuleContext {
		public Tipos_con_preContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_con_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos_con_pre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos_con_pre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos_con_pre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_con_preContext tipos_con_pre() throws RecognitionException {
		Tipos_con_preContext _localctx = new Tipos_con_preContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tipos_con_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class Tipos_funContext extends ParserRuleContext {
		public PretipoContext pretipo() {
			return getRuleContext(PretipoContext.class,0);
		}
		public Tipos_con_pre_funContext tipos_con_pre_fun() {
			return getRuleContext(Tipos_con_pre_funContext.class,0);
		}
		public Tipos_sin_pre_funContext tipos_sin_pre_fun() {
			return getRuleContext(Tipos_sin_pre_funContext.class,0);
		}
		public Tipos_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_funContext tipos_fun() throws RecognitionException {
		Tipos_funContext _localctx = new Tipos_funContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tipos_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				{
				setState(397);
				pretipo();
				setState(398);
				tipos_con_pre_fun();
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
				{
				setState(400);
				tipos_sin_pre_fun();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
				{
				setState(401);
				tipos_con_pre_fun();
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

	public static class Tipos_sin_pre_funContext extends ParserRuleContext {
		public Tipos_sin_pre_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_sin_pre_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos_sin_pre_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos_sin_pre_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos_sin_pre_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_sin_pre_funContext tipos_sin_pre_fun() throws RecognitionException {
		Tipos_sin_pre_funContext _localctx = new Tipos_sin_pre_funContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipos_sin_pre_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__37))) != 0)) ) {
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

	public static class Tipos_con_pre_funContext extends ParserRuleContext {
		public Tipos_con_pre_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_con_pre_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterTipos_con_pre_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitTipos_con_pre_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitTipos_con_pre_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_con_pre_funContext tipos_con_pre_fun() throws RecognitionException {
		Tipos_con_pre_funContext _localctx = new Tipos_con_pre_funContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tipos_con_pre_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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

	public static class VariablesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lengBasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lengBasicParser.ID, i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			match(ID);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(409);
				match(T__38);
				setState(410);
				match(ID);
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(416);
				index();
				}
				}
				setState(421);
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

	public static class PretipoContext extends ParserRuleContext {
		public PretipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pretipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterPretipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitPretipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitPretipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PretipoContext pretipo() throws RecognitionException {
		PretipoContext _localctx = new PretipoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pretipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode RightShiftAssign() { return getToken(lengBasicParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(lengBasicParser.LeftShiftAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitAssignmentoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitAssignmentoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (T__43 - 44)) | (1L << (T__44 - 44)) | (1L << (T__45 - 44)) | (1L << (T__46 - 44)) | (1L << (T__47 - 44)) | (1L << (T__48 - 44)) | (1L << (T__49 - 44)) | (1L << (T__50 - 44)) | (1L << (T__51 - 44)) | (1L << (RightShiftAssign - 44)) | (1L << (LeftShiftAssign - 44)))) != 0)) ) {
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public Expresion_enteraContext expresion_entera() {
			return getRuleContext(Expresion_enteraContext.class,0);
		}
		public Expresion_decimalContext expresion_decimal() {
			return getRuleContext(Expresion_decimalContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_numero);
		try {
			int _alt;
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(ID);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						index();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				expresion_entera();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				expresion_decimal();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(T__3);
				setState(436);
				expresion();
				setState(437);
				match(T__4);
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

	public static class IndexContext extends ParserRuleContext {
		public Expresion_matContext expresion_mat() {
			return getRuleContext(Expresion_matContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__52);
			setState(442);
			expresion_mat();
			setState(443);
			match(T__53);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TiposContext> tipos() {
			return getRuleContexts(TiposContext.class);
		}
		public TiposContext tipos(int i) {
			return getRuleContext(TiposContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(lengBasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lengBasicParser.ID, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arguments);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				tipos();
				setState(446);
				match(ID);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(447);
					match(T__38);
					setState(448);
					tipos();
					setState(449);
					match(ID);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 22:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 23:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 24:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 25:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 26:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 27:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 29:
			return mulriplicacion_sempred((MulriplicacionContext)_localctx, predIndex);
		case 30:
			return adicion_sempred((AdicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulriplicacion_sempred(MulriplicacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean adicion_sempred(AdicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u01ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\5\2e\n\2\3\2\3\2"+
		"\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\3\3\3\4\3\4\3\4\5\4u\n\4\3\5\3\5"+
		"\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00c1"+
		"\n\20\3\20\5\20\u00c4\n\20\3\20\3\20\5\20\u00c8\n\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6\13\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\3\26\3\26\3\26\5\26\u00ef\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00fa\n\27\f\27"+
		"\16\27\u00fd\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0108"+
		"\n\30\f\30\16\30\u010b\13\30\3\31\3\31\3\31\3\31\5\31\u0111\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0119\n\31\f\31\16\31\u011c\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0124\n\32\f\32\16\32\u0127\13\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u012f\n\33\f\33\16\33\u0132\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u013a\n\34\f\34\16\34\u013d\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u014e\n\35\f\35\16\35\u0151\13\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0161\n\37\f\37\16\37\u0164"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u016f\n \f \16 \u0172\13 \3!\3!\7"+
		"!\u0176\n!\f!\16!\u0179\13!\3!\3!\3\"\3\"\3\"\7\"\u0180\n\"\f\"\16\"\u0183"+
		"\13\"\3#\3#\3#\3#\3#\5#\u018a\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\5&\u0195\n"+
		"&\3\'\3\'\3(\3(\3)\3)\3)\7)\u019e\n)\f)\16)\u01a1\13)\3)\7)\u01a4\n)\f"+
		")\16)\u01a7\13)\3*\3*\3+\3+\3,\3,\7,\u01af\n,\f,\16,\u01b2\13,\3,\3,\3"+
		",\3,\3,\3,\5,\u01ba\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u01c6\n.\f.\16"+
		".\u01c9\13.\3.\5.\u01cc\n.\3.\2\13,.\60\62\64\668<>/\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\t\3\2C"+
		"D\3\2\35\36\3\2\37$\3\2%\'\4\2\37$((\3\2*-\4\2.\66JK\2\u01da\2_\3\2\2"+
		"\2\4h\3\2\2\2\6t\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f\u0083\3\2\2\2\16\u0085"+
		"\3\2\2\2\20\u008d\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2\26\u00a0\3"+
		"\2\2\2\30\u00a2\3\2\2\2\32\u00ae\3\2\2\2\34\u00b4\3\2\2\2\36\u00bc\3\2"+
		"\2\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2$\u00dc\3\2\2\2&\u00e0\3\2\2\2(\u00e9"+
		"\3\2\2\2*\u00ee\3\2\2\2,\u00f0\3\2\2\2.\u00fe\3\2\2\2\60\u0110\3\2\2\2"+
		"\62\u011d\3\2\2\2\64\u0128\3\2\2\2\66\u0133\3\2\2\28\u013e\3\2\2\2:\u0152"+
		"\3\2\2\2<\u0154\3\2\2\2>\u0165\3\2\2\2@\u0173\3\2\2\2B\u017c\3\2\2\2D"+
		"\u0189\3\2\2\2F\u018b\3\2\2\2H\u018d\3\2\2\2J\u0194\3\2\2\2L\u0196\3\2"+
		"\2\2N\u0198\3\2\2\2P\u019a\3\2\2\2R\u01a8\3\2\2\2T\u01aa\3\2\2\2V\u01b9"+
		"\3\2\2\2X\u01bb\3\2\2\2Z\u01cb\3\2\2\2\\^\5\6\4\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2a_\3\2\2\2be\5\n\6\2ce\3\2\2\2db\3\2\2\2"+
		"dc\3\2\2\2ef\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hl\7\3\2\2ik\5\b\5\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\4\2\2p\5\3\2"+
		"\2\2qu\5\f\7\2ru\5$\23\2su\5\16\b\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\7\3"+
		"\2\2\2v{\5\f\7\2w{\5\26\f\2x{\5$\23\2y{\5\30\r\2zv\3\2\2\2zw\3\2\2\2z"+
		"x\3\2\2\2zy\3\2\2\2{\t\3\2\2\2|}\7\5\2\2}~\7\6\2\2~\177\7\7\2\2\177\u0080"+
		"\5\4\3\2\u0080\13\3\2\2\2\u0081\u0084\5\22\n\2\u0082\u0084\5\20\t\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086\5J&\2\u0086"+
		"\u0087\7E\2\2\u0087\u0088\7\6\2\2\u0088\u0089\5Z.\2\u0089\u008a\7\7\2"+
		"\2\u008a\u008b\5\4\3\2\u008b\u008c\7=\2\2\u008c\17\3\2\2\2\u008d\u008e"+
		"\5D#\2\u008e\u008f\7E\2\2\u008f\u0090\5T+\2\u0090\u0091\5\24\13\2\u0091"+
		"\u0092\7=\2\2\u0092\21\3\2\2\2\u0093\u0094\5D#\2\u0094\u0095\5P)\2\u0095"+
		"\u0096\7=\2\2\u0096\23\3\2\2\2\u0097\u009c\5\"\22\2\u0098\u009c\5 \21"+
		"\2\u0099\u009c\5&\24\2\u009a\u009c\5*\26\2\u009b\u0097\3\2\2\2\u009b\u0098"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\25\3\2\2\2\u009d"+
		"\u00a1\5\36\20\2\u009e\u00a1\5\32\16\2\u009f\u00a1\5\34\17\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2"+
		"\u00a3\7>\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5&\24\2\u00a5\u00a6\7\7"+
		"\2\2\u00a6\u00ac\5\4\3\2\u00a7\u00a8\7?\2\2\u00a8\u00ad\5\4\3\2\u00a9"+
		"\u00aa\7?\2\2\u00aa\u00ad\5\30\r\2\u00ab\u00ad\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af"+
		"\7@\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7\7\2\2\u00b2"+
		"\u00b3\5\4\3\2\u00b3\33\3\2\2\2\u00b4\u00b5\7B\2\2\u00b5\u00b6\5\4\3\2"+
		"\u00b6\u00b7\7@\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba"+
		"\7\7\2\2\u00ba\u00bb\7=\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7A\2\2\u00bd"+
		"\u00c0\7\6\2\2\u00be\u00c1\5\22\n\2\u00bf\u00c1\5\20\t\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\5&\24\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7="+
		"\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\5\4\3\2\u00cb\37\3\2\2"+
		"\2\u00cc\u00cd\7:\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7;\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00d4\7E\2\2\u00d1\u00d3\5X-\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\5T+\2\u00d8\u00d9\5\24\13\2\u00d9\u00dd\3\2"+
		"\2\2\u00da\u00dd\5@!\2\u00db\u00dd\5B\"\2\u00dc\u00d0\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7=\2\2\u00df"+
		"%\3\2\2\2\u00e0\u00e1\5.\30\2\u00e1\'\3\2\2\2\u00e2\u00ea\5.\30\2\u00e3"+
		"\u00e4\5.\30\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5$\23\2\u00e6\u00e7\7\t"+
		"\2\2\u00e7\u00e8\5$\23\2\u00e8\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9"+
		"\u00e3\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00ef\5> \2\u00ec\u00ef\5@!\2\u00ed"+
		"\u00ef\5B\"\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef+\3\2\2\2\u00f0\u00f1\b\27\1\2\u00f1\u00f2\5\66\34\2\u00f2\u00fb"+
		"\3\2\2\2\u00f3\u00f4\f\4\2\2\u00f4\u00f5\7\n\2\2\u00f5\u00fa\5\66\34\2"+
		"\u00f6\u00f7\f\3\2\2\u00f7\u00f8\7\13\2\2\u00f8\u00fa\5\66\34\2\u00f9"+
		"\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc-\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\b\30\1\2\u00ff\u0100\5,\27\2\u0100\u0109\3\2\2\2\u0101\u0102\f\4\2\2"+
		"\u0102\u0103\7\f\2\2\u0103\u0108\5,\27\2\u0104\u0105\f\3\2\2\u0105\u0106"+
		"\7\r\2\2\u0106\u0108\5,\27\2\u0107\u0101\3\2\2\2\u0107\u0104\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a/\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u010d\b\31\1\2\u010d\u0111\58\35\2\u010e\u010f"+
		"\7\16\2\2\u010f\u0111\5&\24\2\u0110\u010c\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u011a\3\2\2\2\u0112\u0113\f\4\2\2\u0113\u0114\7\17\2\2\u0114\u0119"+
		"\58\35\2\u0115\u0116\f\3\2\2\u0116\u0117\7\20\2\2\u0117\u0119\58\35\2"+
		"\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\61\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\b\32\1\2\u011e\u011f\5\60\31\2\u011f\u0125\3\2\2\2\u0120\u0121"+
		"\f\3\2\2\u0121\u0122\7\21\2\2\u0122\u0124\5\60\31\2\u0123\u0120\3\2\2"+
		"\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\63"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\b\33\1\2\u0129\u012a\5\62\32"+
		"\2\u012a\u0130\3\2\2\2\u012b\u012c\f\3\2\2\u012c\u012d\7\22\2\2\u012d"+
		"\u012f\5\62\32\2\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\65\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\b\34\1\2\u0134\u0135\5\64\33\2\u0135\u013b\3\2\2\2\u0136\u0137"+
		"\f\3\2\2\u0137\u0138\7\23\2\2\u0138\u013a\5\64\33\2\u0139\u0136\3\2\2"+
		"\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\67"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\35\1\2\u013f\u0140\5> \2\u0140"+
		"\u014f\3\2\2\2\u0141\u0142\f\6\2\2\u0142\u0143\7\24\2\2\u0143\u014e\5"+
		"> \2\u0144\u0145\f\5\2\2\u0145\u0146\7\25\2\2\u0146\u014e\5> \2\u0147"+
		"\u0148\f\4\2\2\u0148\u0149\7\26\2\2\u0149\u014e\5> \2\u014a\u014b\f\3"+
		"\2\2\u014b\u014c\7\27\2\2\u014c\u014e\5> \2\u014d\u0141\3\2\2\2\u014d"+
		"\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u01509\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\t\2\2\2\u0153;\3\2\2\2\u0154\u0155\b\37\1\2\u0155"+
		"\u0156\5V,\2\u0156\u0162\3\2\2\2\u0157\u0158\f\5\2\2\u0158\u0159\7\30"+
		"\2\2\u0159\u0161\5V,\2\u015a\u015b\f\4\2\2\u015b\u015c\7\31\2\2\u015c"+
		"\u0161\5V,\2\u015d\u015e\f\3\2\2\u015e\u015f\7\32\2\2\u015f\u0161\5V,"+
		"\2\u0160\u0157\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015d\3\2\2\2\u0161\u0164"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163=\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\b \1\2\u0166\u0167\5<\37\2\u0167\u0170\3\2"+
		"\2\2\u0168\u0169\f\4\2\2\u0169\u016a\7\33\2\2\u016a\u016f\5<\37\2\u016b"+
		"\u016c\f\3\2\2\u016c\u016d\7\34\2\2\u016d\u016f\5<\37\2\u016e\u0168\3"+
		"\2\2\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171?\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7E\2\2\u0174"+
		"\u0176\5X-\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b"+
		"\t\3\2\2\u017bA\3\2\2\2\u017c\u017d\t\3\2\2\u017d\u0181\7E\2\2\u017e\u0180"+
		"\5X-\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182C\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5R*\2\u0185"+
		"\u0186\5H%\2\u0186\u018a\3\2\2\2\u0187\u018a\5F$\2\u0188\u018a\5H%\2\u0189"+
		"\u0184\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aE\3\2\2\2"+
		"\u018b\u018c\t\4\2\2\u018cG\3\2\2\2\u018d\u018e\t\5\2\2\u018eI\3\2\2\2"+
		"\u018f\u0190\5R*\2\u0190\u0191\5N(\2\u0191\u0195\3\2\2\2\u0192\u0195\5"+
		"L\'\2\u0193\u0195\5N(\2\u0194\u018f\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195K\3\2\2\2\u0196\u0197\t\6\2\2\u0197M\3\2\2\2\u0198"+
		"\u0199\t\5\2\2\u0199O\3\2\2\2\u019a\u019f\7E\2\2\u019b\u019c\7)\2\2\u019c"+
		"\u019e\7E\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a5\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\5X-\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6Q\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9"+
		"\t\7\2\2\u01a9S\3\2\2\2\u01aa\u01ab\t\b\2\2\u01abU\3\2\2\2\u01ac\u01b0"+
		"\7E\2\2\u01ad\u01af\5X-\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01ba\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01ba\5\"\22\2\u01b4\u01ba\5 \21\2\u01b5\u01b6\7\6\2\2\u01b6"+
		"\u01b7\5\24\13\2\u01b7\u01b8\7\7\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01ac\3"+
		"\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01ba"+
		"W\3\2\2\2\u01bb\u01bc\7\67\2\2\u01bc\u01bd\5*\26\2\u01bd\u01be\78\2\2"+
		"\u01beY\3\2\2\2\u01bf\u01c0\5D#\2\u01c0\u01c7\7E\2\2\u01c1\u01c2\7)\2"+
		"\2\u01c2\u01c3\5D#\2\u01c3\u01c4\7E\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c1"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cc\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01bf\3\2"+
		"\2\2\u01cb\u01ca\3\2\2\2\u01cc[\3\2\2\2,_dltz\u0083\u009b\u00a0\u00ac"+
		"\u00c0\u00c3\u00c7\u00d4\u00dc\u00e9\u00ee\u00f9\u00fb\u0107\u0109\u0110"+
		"\u0118\u011a\u0125\u0130\u013b\u014d\u014f\u0160\u0162\u016e\u0170\u0177"+
		"\u0181\u0189\u0194\u019f\u01a5\u01b0\u01b9\u01c7\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}