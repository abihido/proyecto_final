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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, CHAR=62, REAL=63, INT=64, BOOL=65, COT=66, IF=67, 
		ELSE=68, WHile=69, FOR=70, Do=71, LeftShift=72, RightShift=73, ID=74, 
		BIBLIOTECA=75, WORD=76, Whitespace=77, Newline=78, BlockComment=79, LineComment=80, 
		RightShiftAssign=81, LeftShiftAssign=82;
	public static final int
		RULE_begin = 0, RULE_imports = 1, RULE_statement = 2, RULE_fun_statement = 3, 
		RULE_globalThings = 4, RULE_localThings = 5, RULE_main = 6, RULE_declaracion = 7, 
		RULE_void_declaration = 8, RULE_function_declaration = 9, RULE_declaracion_asignacion = 10, 
		RULE_simpleDeclaration = 11, RULE_expresion = 12, RULE_ciclo = 13, RULE_desicion = 14, 
		RULE_wHILe = 15, RULE_do_while = 16, RULE_fOR = 17, RULE_expresion_decimal = 18, 
		RULE_expresion_entera = 19, RULE_expresion_palabra = 20, RULE_assignmentexpression = 21, 
		RULE_expresion_logica = 22, RULE_conditionalexpression = 23, RULE_expresion_mat = 24, 
		RULE_logicalandexpression = 25, RULE_logicalorexpression = 26, RULE_equalityexpression = 27, 
		RULE_andexpression = 28, RULE_exclusiveorexpression = 29, RULE_inclusiveorexpression = 30, 
		RULE_relationalexpression = 31, RULE_shiftoperator = 32, RULE_mulriplicacion = 33, 
		RULE_adicion = 34, RULE_post_operators = 35, RULE_pre_operators = 36, 
		RULE_tipos = 37, RULE_tipos_sin_pre = 38, RULE_tipos_con_pre = 39, RULE_variables = 40, 
		RULE_pretipo = 41, RULE_assignmentoperator = 42, RULE_numero = 43, RULE_index = 44, 
		RULE_arguments = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "imports", "statement", "fun_statement", "globalThings", "localThings", 
			"main", "declaracion", "void_declaration", "function_declaration", "declaracion_asignacion", 
			"simpleDeclaration", "expresion", "ciclo", "desicion", "wHILe", "do_while", 
			"fOR", "expresion_decimal", "expresion_entera", "expresion_palabra", 
			"assignmentexpression", "expresion_logica", "conditionalexpression", 
			"expresion_mat", "logicalandexpression", "logicalorexpression", "equalityexpression", 
			"andexpression", "exclusiveorexpression", "inclusiveorexpression", "relationalexpression", 
			"shiftoperator", "mulriplicacion", "adicion", "post_operators", "pre_operators", 
			"tipos", "tipos_sin_pre", "tipos_con_pre", "variables", "pretipo", "assignmentoperator", 
			"numero", "index", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'using'", "'namespace'", "'std'", "'{'", "'}'", "'return'", 
			"'int main'", "'('", "')'", "'0'", "'void'", "'?'", "':'", "'&&'", "'and'", 
			"'||'", "'or'", "'!'", "'=='", "'!='", "'&'", "'^'", "'|'", "'<'", "'>'", 
			"'<='", "'>='", "'*'", "'/'", "'%'", "'+'", "'-'", "'++'", "'--'", "'char'", 
			"'char16'", "'char32'", "'wchar'", "'bool'", "'auto'", "'string'", "'int'", 
			"'float'", "'double'", "','", "'short'", "'long'", "'signed'", "'unsigned'", 
			"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'&='", "'^='", "'|='", 
			"'['", "']'", null, null, null, null, "';'", "'if'", "'else'", "'while'", 
			"'for'", "'do'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CHAR", "REAL", "INT", "BOOL", "COT", "IF", "ELSE", "WHile", 
			"FOR", "Do", "LeftShift", "RightShift", "ID", "BIBLIOTECA", "WORD", "Whitespace", 
			"Newline", "BlockComment", "LineComment", "RightShiftAssign", "LeftShiftAssign"
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
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(lengBasicParser.EOF, 0); }
		public List<GlobalThingsContext> globalThings() {
			return getRuleContexts(GlobalThingsContext.class);
		}
		public GlobalThingsContext globalThings(int i) {
			return getRuleContext(GlobalThingsContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			setState(92);
			imports();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__33 - 12)) | (1L << (T__34 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__37 - 12)) | (1L << (T__38 - 12)) | (1L << (T__39 - 12)) | (1L << (T__40 - 12)) | (1L << (T__41 - 12)) | (1L << (T__42 - 12)) | (1L << (T__43 - 12)) | (1L << (T__44 - 12)) | (1L << (T__46 - 12)) | (1L << (T__47 - 12)) | (1L << (T__48 - 12)) | (1L << (T__49 - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				{
				setState(93);
				globalThings();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(99);
				main();
				}
			}

			setState(102);
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public List<TerminalNode> BIBLIOTECA() { return getTokens(lengBasicParser.BIBLIOTECA); }
		public TerminalNode BIBLIOTECA(int i) {
			return getToken(lengBasicParser.BIBLIOTECA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(104);
				match(T__0);
				setState(105);
				match(BIBLIOTECA);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(111);
				match(T__1);
				setState(112);
				match(T__2);
				setState(113);
				match(T__3);
				setState(114);
				match(COT);
				}
				break;
			case EOF:
			case T__7:
			case T__11:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case ID:
				{
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
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__4);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__33 - 34)) | (1L << (T__34 - 34)) | (1L << (T__35 - 34)) | (1L << (T__36 - 34)) | (1L << (T__37 - 34)) | (1L << (T__38 - 34)) | (1L << (T__39 - 34)) | (1L << (T__40 - 34)) | (1L << (T__41 - 34)) | (1L << (T__42 - 34)) | (1L << (T__43 - 34)) | (1L << (T__44 - 34)) | (1L << (T__46 - 34)) | (1L << (T__47 - 34)) | (1L << (T__48 - 34)) | (1L << (T__49 - 34)) | (1L << (IF - 34)) | (1L << (WHile - 34)) | (1L << (FOR - 34)) | (1L << (Do - 34)) | (1L << (ID - 34)))) != 0)) {
				{
				{
				setState(119);
				localThings();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public static class Fun_statementContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COT() { return getToken(lengBasicParser.COT, 0); }
		public List<LocalThingsContext> localThings() {
			return getRuleContexts(LocalThingsContext.class);
		}
		public LocalThingsContext localThings(int i) {
			return getRuleContext(LocalThingsContext.class,i);
		}
		public Fun_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterFun_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitFun_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitFun_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_statementContext fun_statement() throws RecognitionException {
		Fun_statementContext _localctx = new Fun_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__4);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (T__33 - 34)) | (1L << (T__34 - 34)) | (1L << (T__35 - 34)) | (1L << (T__36 - 34)) | (1L << (T__37 - 34)) | (1L << (T__38 - 34)) | (1L << (T__39 - 34)) | (1L << (T__40 - 34)) | (1L << (T__41 - 34)) | (1L << (T__42 - 34)) | (1L << (T__43 - 34)) | (1L << (T__44 - 34)) | (1L << (T__46 - 34)) | (1L << (T__47 - 34)) | (1L << (T__48 - 34)) | (1L << (T__49 - 34)) | (1L << (IF - 34)) | (1L << (WHile - 34)) | (1L << (FOR - 34)) | (1L << (Do - 34)) | (1L << (ID - 34)))) != 0)) {
				{
				{
				setState(128);
				localThings();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__6);
			setState(135);
			expresion();
			setState(136);
			match(COT);
			setState(137);
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
		public Void_declarationContext void_declaration() {
			return getRuleContext(Void_declarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_globalThings);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				assignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				void_declaration();
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
		enterRule(_localctx, 10, RULE_localThings);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				declaracion();
				}
				break;
			case WHile:
			case FOR:
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				ciclo();
				}
				break;
			case T__33:
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				assignmentexpression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
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
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__7);
			setState(152);
			match(T__8);
			setState(153);
			match(T__9);
			setState(154);
			statement();
			setState(155);
			match(T__6);
			setState(156);
			match(T__10);
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
		enterRule(_localctx, 14, RULE_declaracion);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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

	public static class Void_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Void_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterVoid_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitVoid_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitVoid_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_declarationContext void_declaration() throws RecognitionException {
		Void_declarationContext _localctx = new Void_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_void_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__11);
			setState(163);
			match(ID);
			setState(164);
			match(T__8);
			setState(165);
			arguments();
			setState(166);
			match(T__9);
			setState(167);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public TerminalNode ID() { return getToken(lengBasicParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Fun_statementContext fun_statement() {
			return getRuleContext(Fun_statementContext.class,0);
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
		enterRule(_localctx, 18, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			tipos();
			setState(170);
			match(ID);
			setState(171);
			match(T__8);
			setState(172);
			arguments();
			setState(173);
			match(T__9);
			setState(174);
			fun_statement();
			setState(175);
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
		enterRule(_localctx, 20, RULE_declaracion_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			tipos();
			setState(178);
			match(ID);
			setState(179);
			assignmentoperator();
			setState(180);
			expresion();
			setState(181);
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
		enterRule(_localctx, 22, RULE_simpleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			tipos();
			setState(184);
			variables();
			setState(185);
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
		public Expresion_palabraContext expresion_palabra() {
			return getRuleContext(Expresion_palabraContext.class,0);
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
		enterRule(_localctx, 24, RULE_expresion);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				expresion_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				expresion_decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				expresion_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				expresion_mat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				expresion_palabra();
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
		enterRule(_localctx, 26, RULE_ciclo);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				fOR();
				}
				break;
			case WHile:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				wHILe();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
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
		enterRule(_localctx, 28, RULE_desicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IF);
			setState(200);
			match(T__8);
			setState(201);
			expresion_logica();
			setState(202);
			match(T__9);
			setState(203);
			statement();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(204);
				match(ELSE);
				setState(205);
				statement();
				}
				break;
			case 2:
				{
				setState(206);
				match(ELSE);
				setState(207);
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
		enterRule(_localctx, 30, RULE_wHILe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHile);
			setState(212);
			match(T__8);
			setState(213);
			expresion_logica();
			setState(214);
			match(T__9);
			setState(215);
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
		enterRule(_localctx, 32, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(Do);
			setState(218);
			statement();
			setState(219);
			match(WHile);
			setState(220);
			match(T__8);
			setState(221);
			expresion_logica();
			setState(222);
			match(T__9);
			setState(223);
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
		enterRule(_localctx, 34, RULE_fOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			setState(226);
			match(T__8);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(227);
				simpleDeclaration();
				}
				break;
			case 2:
				{
				setState(228);
				declaracion_asignacion();
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__18) | (1L << REAL))) != 0) || _la==INT || _la==ID) {
				{
				setState(231);
				expresion_logica();
				}
			}

			setState(234);
			match(COT);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__33) | (1L << T__34) | (1L << REAL))) != 0) || _la==INT || _la==ID) {
				{
				setState(235);
				expresion_mat();
				}
			}

			setState(238);
			match(T__9);
			setState(239);
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
		enterRule(_localctx, 36, RULE_expresion_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 38, RULE_expresion_entera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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

	public static class Expresion_palabraContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(lengBasicParser.WORD, 0); }
		public Expresion_palabraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_palabra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterExpresion_palabra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitExpresion_palabra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitExpresion_palabra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_palabraContext expresion_palabra() throws RecognitionException {
		Expresion_palabraContext _localctx = new Expresion_palabraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_palabra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(WORD);
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
		enterRule(_localctx, 42, RULE_assignmentexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(247);
				match(ID);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(248);
					index();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				assignmentoperator();
				setState(255);
				expresion();
				}
				break;
			case 2:
				{
				setState(257);
				post_operators();
				}
				break;
			case 3:
				{
				setState(258);
				pre_operators();
				}
				break;
			}
			setState(261);
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
		enterRule(_localctx, 44, RULE_expresion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 46, RULE_conditionalexpression);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				logicalorexpression(0);
				setState(267);
				match(T__12);
				setState(268);
				assignmentexpression();
				setState(269);
				match(T__13);
				setState(270);
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
		enterRule(_localctx, 48, RULE_expresion_mat);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				adicion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				post_operators();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						match(T__14);
						setState(284);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(285);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(286);
						match(T__15);
						setState(287);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(292);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(296);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(297);
						match(T__16);
						setState(298);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(299);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(300);
						match(T__17);
						setState(301);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(306);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case REAL:
			case INT:
			case ID:
				{
				setState(308);
				relationalexpression(0);
				}
				break;
			case T__18:
				{
				setState(309);
				match(T__18);
				setState(310);
				expresion_logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(T__19);
						setState(315);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(316);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(317);
						match(T__20);
						setState(318);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(323);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(327);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(328);
					match(T__21);
					setState(329);
					equalityexpression(0);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(339);
					match(T__22);
					setState(340);
					andexpression(0);
					}
					} 
				}
				setState(345);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(347);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(349);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(350);
					match(T__23);
					setState(351);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(358);
			adicion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(360);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(361);
						match(T__24);
						setState(362);
						adicion(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(363);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(364);
						match(T__25);
						setState(365);
						adicion(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(366);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(367);
						match(T__26);
						setState(368);
						adicion(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(369);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(370);
						match(T__27);
						setState(371);
						adicion(0);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 64, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_mulriplicacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(380);
			numero();
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(382);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(383);
						match(T__28);
						setState(384);
						numero();
						}
						break;
					case 2:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(385);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(386);
						match(T__29);
						setState(387);
						numero();
						}
						break;
					case 3:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(388);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(389);
						match(T__30);
						setState(390);
						numero();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_adicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			mulriplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						match(T__31);
						setState(401);
						mulriplicacion(0);
						}
						break;
					case 2:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(402);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(403);
						match(T__32);
						setState(404);
						mulriplicacion(0);
						}
						break;
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 70, RULE_post_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(ID);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(411);
				index();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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
		enterRule(_localctx, 72, RULE_pre_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(420);
			match(ID);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(421);
				index();
				}
				}
				setState(426);
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
		enterRule(_localctx, 74, RULE_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				{
				setState(427);
				pretipo();
				setState(428);
				tipos_con_pre();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				{
				setState(430);
				tipos_sin_pre();
				}
				break;
			case T__42:
			case T__43:
			case T__44:
				{
				setState(431);
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
		enterRule(_localctx, 76, RULE_tipos_sin_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_tipos_con_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			match(ID);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45) {
				{
				{
				setState(439);
				match(T__45);
				setState(440);
				match(ID);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__59) {
				{
				{
				setState(446);
				index();
				}
				}
				setState(451);
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
		enterRule(_localctx, 82, RULE_pretipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (T__50 - 51)) | (1L << (T__51 - 51)) | (1L << (T__52 - 51)) | (1L << (T__53 - 51)) | (1L << (T__54 - 51)) | (1L << (T__55 - 51)) | (1L << (T__56 - 51)) | (1L << (T__57 - 51)) | (1L << (T__58 - 51)) | (1L << (RightShiftAssign - 51)) | (1L << (LeftShiftAssign - 51)))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_numero);
		try {
			int _alt;
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(ID);
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						index();
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				expresion_entera();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				expresion_decimal();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(T__8);
				setState(466);
				expresion();
				setState(467);
				match(T__9);
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
		enterRule(_localctx, 88, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__59);
			setState(472);
			expresion_mat();
			setState(473);
			match(T__60);
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
		enterRule(_localctx, 90, RULE_arguments);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				tipos();
				setState(476);
				match(ID);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45) {
					{
					{
					setState(477);
					match(T__45);
					setState(478);
					tipos();
					setState(479);
					match(ID);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
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
		case 25:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 26:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 27:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 28:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 29:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 30:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 31:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 33:
			return mulriplicacion_sempred((MulriplicacionContext)_localctx, predIndex);
		case 34:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u01ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\5\2g\n\2\3"+
		"\2\3\2\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\3\3\3\3\5\3w\n\3\3"+
		"\4\3\4\7\4{\n\4\f\4\16\4~\13\4\3\4\3\4\3\5\3\5\7\5\u0084\n\5\f\5\16\5"+
		"\u0087\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\7\3\7"+
		"\3\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00a3\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00c3\n\16\3\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00d4\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00e8"+
		"\n\23\3\23\5\23\u00eb\n\23\3\23\3\23\5\23\u00ef\n\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00fc\n\27\f\27\16\27\u00ff"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\5\27\u0106\n\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0113\n\31\3\32\3\32\3\32\5\32"+
		"\u0118\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0123\n"+
		"\33\f\33\16\33\u0126\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u0131\n\34\f\34\16\34\u0134\13\34\3\35\3\35\3\35\3\35\5\35\u013a"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0142\n\35\f\35\16\35\u0145\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u014d\n\36\f\36\16\36\u0150\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0158\n\37\f\37\16\37\u015b\13"+
		"\37\3 \3 \3 \3 \3 \3 \7 \u0163\n \f \16 \u0166\13 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0177\n!\f!\16!\u017a\13!\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u018a\n#\f#\16#\u018d\13#\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\7$\u0198\n$\f$\16$\u019b\13$\3%\3%\7%\u019f\n%\f%\16%"+
		"\u01a2\13%\3%\3%\3&\3&\3&\7&\u01a9\n&\f&\16&\u01ac\13&\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01b3\n\'\3(\3(\3)\3)\3*\3*\3*\7*\u01bc\n*\f*\16*\u01bf\13*\3"+
		"*\7*\u01c2\n*\f*\16*\u01c5\13*\3+\3+\3,\3,\3-\3-\7-\u01cd\n-\f-\16-\u01d0"+
		"\13-\3-\3-\3-\3-\3-\3-\5-\u01d8\n-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\7/\u01e4"+
		"\n/\f/\16/\u01e7\13/\3/\5/\u01ea\n/\3/\2\13\64\668:<>@DF\60\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"\2\b\3\2JK\3\2$%\3\2&,\3\2-/\3\2\61\64\4\2\65=ST\2\u01fa\2^\3\2\2\2\4"+
		"n\3\2\2\2\6x\3\2\2\2\b\u0081\3\2\2\2\n\u0091\3\2\2\2\f\u0097\3\2\2\2\16"+
		"\u0099\3\2\2\2\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00ab\3\2\2\2\26\u00b3"+
		"\3\2\2\2\30\u00b9\3\2\2\2\32\u00c2\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3"+
		"\2\2\2 \u00d5\3\2\2\2\"\u00db\3\2\2\2$\u00e3\3\2\2\2&\u00f3\3\2\2\2(\u00f5"+
		"\3\2\2\2*\u00f7\3\2\2\2,\u0105\3\2\2\2.\u0109\3\2\2\2\60\u0112\3\2\2\2"+
		"\62\u0117\3\2\2\2\64\u0119\3\2\2\2\66\u0127\3\2\2\28\u0139\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0151\3\2\2\2>\u015c\3\2\2\2@\u0167\3\2\2\2B\u017b\3\2\2\2D"+
		"\u017d\3\2\2\2F\u018e\3\2\2\2H\u019c\3\2\2\2J\u01a5\3\2\2\2L\u01b2\3\2"+
		"\2\2N\u01b4\3\2\2\2P\u01b6\3\2\2\2R\u01b8\3\2\2\2T\u01c6\3\2\2\2V\u01c8"+
		"\3\2\2\2X\u01d7\3\2\2\2Z\u01d9\3\2\2\2\\\u01e9\3\2\2\2^b\5\4\3\2_a\5\n"+
		"\6\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\5\16"+
		"\b\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\2\2\3i\3\3\2\2\2jk\7\3\2\2km\7"+
		"M\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2qr\7"+
		"\4\2\2rs\7\5\2\2st\7\6\2\2tw\7D\2\2uw\3\2\2\2vq\3\2\2\2vu\3\2\2\2w\5\3"+
		"\2\2\2x|\7\7\2\2y{\5\f\7\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\7\b\2\2\u0080\7\3\2\2\2\u0081\u0085\7\7\2"+
		"\2\u0082\u0084\5\f\7\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\5\32\16\2\u008a\u008b\7D\2\2\u008b\u008c\7"+
		"\b\2\2\u008c\t\3\2\2\2\u008d\u0092\5\20\t\2\u008e\u0092\5,\27\2\u008f"+
		"\u0092\5\24\13\2\u0090\u0092\5\22\n\2\u0091\u008d\3\2\2\2\u0091\u008e"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\13\3\2\2\2\u0093"+
		"\u0098\5\20\t\2\u0094\u0098\5\34\17\2\u0095\u0098\5,\27\2\u0096\u0098"+
		"\5\36\20\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\r\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u009b\7"+
		"\13\2\2\u009b\u009c\7\f\2\2\u009c\u009d\5\6\4\2\u009d\u009e\7\t\2\2\u009e"+
		"\u009f\7\r\2\2\u009f\17\3\2\2\2\u00a0\u00a3\5\30\r\2\u00a1\u00a3\5\26"+
		"\f\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5"+
		"\7\16\2\2\u00a5\u00a6\7L\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\5\\/\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\5\6\4\2\u00aa\23\3\2\2\2\u00ab\u00ac\5L\'\2"+
		"\u00ac\u00ad\7L\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\5\\/\2\u00af\u00b0"+
		"\7\f\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7D\2\2\u00b2\25\3\2\2\2\u00b3"+
		"\u00b4\5L\'\2\u00b4\u00b5\7L\2\2\u00b5\u00b6\5V,\2\u00b6\u00b7\5\32\16"+
		"\2\u00b7\u00b8\7D\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\5L\'\2\u00ba\u00bb"+
		"\5R*\2\u00bb\u00bc\7D\2\2\u00bc\31\3\2\2\2\u00bd\u00c3\5(\25\2\u00be\u00c3"+
		"\5&\24\2\u00bf\u00c3\5.\30\2\u00c0\u00c3\5\62\32\2\u00c1\u00c3\5*\26\2"+
		"\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c8\5$\23\2\u00c5"+
		"\u00c8\5 \21\2\u00c6\u00c8\5\"\22\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cb"+
		"\7\13\2\2\u00cb\u00cc\5.\30\2\u00cc\u00cd\7\f\2\2\u00cd\u00d3\5\6\4\2"+
		"\u00ce\u00cf\7F\2\2\u00cf\u00d4\5\6\4\2\u00d0\u00d1\7F\2\2\u00d1\u00d4"+
		"\5\36\20\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7"+
		"\13\2\2\u00d7\u00d8\5.\30\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\5\6\4\2\u00da"+
		"!\3\2\2\2\u00db\u00dc\7I\2\2\u00dc\u00dd\5\6\4\2\u00dd\u00de\7G\2\2\u00de"+
		"\u00df\7\13\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\7"+
		"D\2\2\u00e2#\3\2\2\2\u00e3\u00e4\7H\2\2\u00e4\u00e7\7\13\2\2\u00e5\u00e8"+
		"\5\30\r\2\u00e6\u00e8\5\26\f\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5.\30\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\7D\2\2\u00ed\u00ef\5\62\32\2"+
		"\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\7\f\2\2\u00f1\u00f2\5\6\4\2\u00f2%\3\2\2\2\u00f3\u00f4\7A\2\2\u00f4\'"+
		"\3\2\2\2\u00f5\u00f6\7B\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7N\2\2\u00f8+\3"+
		"\2\2\2\u00f9\u00fd\7L\2\2\u00fa\u00fc\5Z.\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5V,\2\u0101\u0102\5\32\16\2\u0102"+
		"\u0106\3\2\2\2\u0103\u0106\5H%\2\u0104\u0106\5J&\2\u0105\u00f9\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\7D\2\2\u0108-\3\2\2\2\u0109\u010a\5\66\34\2\u010a/\3\2\2\2\u010b\u0113"+
		"\5\66\34\2\u010c\u010d\5\66\34\2\u010d\u010e\7\17\2\2\u010e\u010f\5,\27"+
		"\2\u010f\u0110\7\20\2\2\u0110\u0111\5,\27\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0112\u010c\3\2\2\2\u0113\61\3\2\2\2\u0114\u0118\5F$\2"+
		"\u0115\u0118\5H%\2\u0116\u0118\5J&\2\u0117\u0114\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0116\3\2\2\2\u0118\63\3\2\2\2\u0119\u011a\b\33\1\2\u011a"+
		"\u011b\5> \2\u011b\u0124\3\2\2\2\u011c\u011d\f\4\2\2\u011d\u011e\7\21"+
		"\2\2\u011e\u0123\5> \2\u011f\u0120\f\3\2\2\u0120\u0121\7\22\2\2\u0121"+
		"\u0123\5> \2\u0122\u011c\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0126\3\2\2"+
		"\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\65\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\b\34\1\2\u0128\u0129\5\64\33\2\u0129\u0132\3\2\2"+
		"\2\u012a\u012b\f\4\2\2\u012b\u012c\7\23\2\2\u012c\u0131\5\64\33\2\u012d"+
		"\u012e\f\3\2\2\u012e\u012f\7\24\2\2\u012f\u0131\5\64\33\2\u0130\u012a"+
		"\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\67\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\35\1"+
		"\2\u0136\u013a\5@!\2\u0137\u0138\7\25\2\2\u0138\u013a\5.\30\2\u0139\u0135"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0143\3\2\2\2\u013b\u013c\f\4\2\2\u013c"+
		"\u013d\7\26\2\2\u013d\u0142\5@!\2\u013e\u013f\f\3\2\2\u013f\u0140\7\27"+
		"\2\2\u0140\u0142\5@!\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u01449\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\b\36\1\2\u0147\u0148\58\35\2\u0148\u014e\3"+
		"\2\2\2\u0149\u014a\f\3\2\2\u014a\u014b\7\30\2\2\u014b\u014d\58\35\2\u014c"+
		"\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f;\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\b\37\1\2\u0152\u0153"+
		"\5:\36\2\u0153\u0159\3\2\2\2\u0154\u0155\f\3\2\2\u0155\u0156\7\31\2\2"+
		"\u0156\u0158\5:\36\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a=\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\b \1\2\u015d\u015e\5<\37\2\u015e\u0164\3\2\2\2\u015f\u0160\f\3"+
		"\2\2\u0160\u0161\7\32\2\2\u0161\u0163\5<\37\2\u0162\u015f\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165?\3\2\2\2"+
		"\u0166\u0164\3\2\2\2\u0167\u0168\b!\1\2\u0168\u0169\5F$\2\u0169\u0178"+
		"\3\2\2\2\u016a\u016b\f\6\2\2\u016b\u016c\7\33\2\2\u016c\u0177\5F$\2\u016d"+
		"\u016e\f\5\2\2\u016e\u016f\7\34\2\2\u016f\u0177\5F$\2\u0170\u0171\f\4"+
		"\2\2\u0171\u0172\7\35\2\2\u0172\u0177\5F$\2\u0173\u0174\f\3\2\2\u0174"+
		"\u0175\7\36\2\2\u0175\u0177\5F$\2\u0176\u016a\3\2\2\2\u0176\u016d\3\2"+
		"\2\2\u0176\u0170\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179A\3\2\2\2\u017a\u0178\3\2\2\2"+
		"\u017b\u017c\t\2\2\2\u017cC\3\2\2\2\u017d\u017e\b#\1\2\u017e\u017f\5X"+
		"-\2\u017f\u018b\3\2\2\2\u0180\u0181\f\5\2\2\u0181\u0182\7\37\2\2\u0182"+
		"\u018a\5X-\2\u0183\u0184\f\4\2\2\u0184\u0185\7 \2\2\u0185\u018a\5X-\2"+
		"\u0186\u0187\f\3\2\2\u0187\u0188\7!\2\2\u0188\u018a\5X-\2\u0189\u0180"+
		"\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0186\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cE\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u018f\b$\1\2\u018f\u0190\5D#\2\u0190\u0199\3\2\2\2\u0191\u0192"+
		"\f\4\2\2\u0192\u0193\7\"\2\2\u0193\u0198\5D#\2\u0194\u0195\f\3\2\2\u0195"+
		"\u0196\7#\2\2\u0196\u0198\5D#\2\u0197\u0191\3\2\2\2\u0197\u0194\3\2\2"+
		"\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aG"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0\7L\2\2\u019d\u019f\5Z.\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\t\3\2\2\u01a4"+
		"I\3\2\2\2\u01a5\u01a6\t\3\2\2\u01a6\u01aa\7L\2\2\u01a7\u01a9\5Z.\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abK\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5T+\2\u01ae\u01af"+
		"\5P)\2\u01af\u01b3\3\2\2\2\u01b0\u01b3\5N(\2\u01b1\u01b3\5P)\2\u01b2\u01ad"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3M\3\2\2\2\u01b4"+
		"\u01b5\t\4\2\2\u01b5O\3\2\2\2\u01b6\u01b7\t\5\2\2\u01b7Q\3\2\2\2\u01b8"+
		"\u01bd\7L\2\2\u01b9\u01ba\7\60\2\2\u01ba\u01bc\7L\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c3\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\5Z.\2\u01c1\u01c0\3\2\2"+
		"\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4S"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\t\6\2\2\u01c7U\3\2\2\2\u01c8"+
		"\u01c9\t\7\2\2\u01c9W\3\2\2\2\u01ca\u01ce\7L\2\2\u01cb\u01cd\5Z.\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d8\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d8\5(\25\2\u01d2"+
		"\u01d8\5&\24\2\u01d3\u01d4\7\13\2\2\u01d4\u01d5\5\32\16\2\u01d5\u01d6"+
		"\7\f\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01ca\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d8Y\3\2\2\2\u01d9\u01da\7>\2\2\u01da"+
		"\u01db\5\62\32\2\u01db\u01dc\7?\2\2\u01dc[\3\2\2\2\u01dd\u01de\5L\'\2"+
		"\u01de\u01e5\7L\2\2\u01df\u01e0\7\60\2\2\u01e0\u01e1\5L\'\2\u01e1\u01e2"+
		"\7L\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ea\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01dd\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"]\3\2\2\2.bfnv|\u0085\u0091\u0097\u00a2\u00c2\u00c7\u00d3\u00e7\u00ea"+
		"\u00ee\u00fd\u0105\u0112\u0117\u0122\u0124\u0130\u0132\u0139\u0141\u0143"+
		"\u014e\u0159\u0164\u0176\u0178\u0189\u018b\u0197\u0199\u01a0\u01aa\u01b2"+
		"\u01bd\u01c3\u01ce\u01d7\u01e5\u01e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}