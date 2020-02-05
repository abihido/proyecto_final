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
		T__59=60, T__60=61, T__61=62, CHAR=63, REAL=64, INT=65, BOOL=66, COT=67, 
		IF=68, ELSE=69, WHile=70, FOR=71, Do=72, LeftShift=73, RightShift=74, 
		ID=75, BIBLIOTECA=76, WORD=77, Whitespace=78, Newline=79, BlockComment=80, 
		LineComment=81, RightShiftAssign=82, LeftShiftAssign=83;
	public static final int
		RULE_begin = 0, RULE_imports = 1, RULE_statement = 2, RULE_fun_statement = 3, 
		RULE_globalThings = 4, RULE_localThings = 5, RULE_main = 6, RULE_declaracion = 7, 
		RULE_void_declaration = 8, RULE_function_declaration = 9, RULE_declaracion_asignacion = 10, 
		RULE_simpleDeclaration = 11, RULE_expresion = 12, RULE_salida = 13, RULE_ciclo = 14, 
		RULE_desicion = 15, RULE_wHILe = 16, RULE_do_while = 17, RULE_fOR = 18, 
		RULE_function = 19, RULE_expresion_decimal = 20, RULE_expresion_entera = 21, 
		RULE_expresion_palabra = 22, RULE_assignmentexpression = 23, RULE_expresion_logica = 24, 
		RULE_conditionalexpression = 25, RULE_expresion_mat = 26, RULE_logicalandexpression = 27, 
		RULE_logicalorexpression = 28, RULE_equalityexpression = 29, RULE_andexpression = 30, 
		RULE_exclusiveorexpression = 31, RULE_inclusiveorexpression = 32, RULE_relationalexpression = 33, 
		RULE_shiftoperator = 34, RULE_mulriplicacion = 35, RULE_adicion = 36, 
		RULE_post_operators = 37, RULE_pre_operators = 38, RULE_tipos = 39, RULE_tipos_sin_pre = 40, 
		RULE_tipos_con_pre = 41, RULE_variables = 42, RULE_pretipo = 43, RULE_assignmentoperator = 44, 
		RULE_numero = 45, RULE_index = 46, RULE_arguments = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "imports", "statement", "fun_statement", "globalThings", "localThings", 
			"main", "declaracion", "void_declaration", "function_declaration", "declaracion_asignacion", 
			"simpleDeclaration", "expresion", "salida", "ciclo", "desicion", "wHILe", 
			"do_while", "fOR", "function", "expresion_decimal", "expresion_entera", 
			"expresion_palabra", "assignmentexpression", "expresion_logica", "conditionalexpression", 
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
			null, "'#'", "'import'", "'using'", "'namespace'", "'std'", "'{'", "'}'", 
			"'return'", "'int main'", "'('", "')'", "'void'", "'cout'", "','", "'?'", 
			"':'", "'&&'", "'and'", "'||'", "'or'", "'!'", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'++'", "'--'", "'char'", "'char16'", "'char32'", "'wchar'", "'bool'", 
			"'auto'", "'string'", "'int'", "'float'", "'double'", "'short'", "'long'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CHAR", "REAL", "INT", "BOOL", "COT", "IF", "ELSE", 
			"WHile", "FOR", "Do", "LeftShift", "RightShift", "ID", "BIBLIOTECA", 
			"WORD", "Whitespace", "Newline", "BlockComment", "LineComment", "RightShiftAssign", 
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
			setState(96);
			imports();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__37 - 12)) | (1L << (T__38 - 12)) | (1L << (T__39 - 12)) | (1L << (T__40 - 12)) | (1L << (T__41 - 12)) | (1L << (T__42 - 12)) | (1L << (T__43 - 12)) | (1L << (T__44 - 12)) | (1L << (T__45 - 12)) | (1L << (T__46 - 12)) | (1L << (T__47 - 12)) | (1L << (T__48 - 12)) | (1L << (T__49 - 12)) | (1L << (T__50 - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				{
				setState(97);
				globalThings();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(103);
				main();
				}
			}

			setState(106);
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(108);
				match(T__0);
				setState(109);
				match(T__1);
				setState(110);
				match(BIBLIOTECA);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(116);
				match(T__2);
				setState(117);
				match(T__3);
				setState(118);
				match(T__4);
				setState(119);
				match(COT);
				}
				break;
			case EOF:
			case T__8:
			case T__11:
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
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
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
			setState(123);
			match(T__5);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__35 - 13)) | (1L << (T__36 - 13)) | (1L << (T__37 - 13)) | (1L << (T__38 - 13)) | (1L << (T__39 - 13)) | (1L << (T__40 - 13)) | (1L << (T__41 - 13)) | (1L << (T__42 - 13)) | (1L << (T__43 - 13)) | (1L << (T__44 - 13)) | (1L << (T__45 - 13)) | (1L << (T__46 - 13)) | (1L << (T__47 - 13)) | (1L << (T__48 - 13)) | (1L << (T__49 - 13)) | (1L << (T__50 - 13)) | (1L << (IF - 13)) | (1L << (WHile - 13)) | (1L << (FOR - 13)) | (1L << (Do - 13)) | (1L << (ID - 13)))) != 0)) {
				{
				{
				setState(124);
				localThings();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(T__6);
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
			setState(132);
			match(T__5);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__35 - 13)) | (1L << (T__36 - 13)) | (1L << (T__37 - 13)) | (1L << (T__38 - 13)) | (1L << (T__39 - 13)) | (1L << (T__40 - 13)) | (1L << (T__41 - 13)) | (1L << (T__42 - 13)) | (1L << (T__43 - 13)) | (1L << (T__44 - 13)) | (1L << (T__45 - 13)) | (1L << (T__46 - 13)) | (1L << (T__47 - 13)) | (1L << (T__48 - 13)) | (1L << (T__49 - 13)) | (1L << (T__50 - 13)) | (1L << (IF - 13)) | (1L << (WHile - 13)) | (1L << (FOR - 13)) | (1L << (Do - 13)) | (1L << (ID - 13)))) != 0)) {
				{
				{
				setState(133);
				localThings();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__7);
			setState(140);
			expresion();
			setState(141);
			match(COT);
			setState(142);
			match(T__6);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				assignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
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
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				declaracion();
				}
				break;
			case WHile:
			case FOR:
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				ciclo();
				}
				break;
			case T__35:
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				assignmentexpression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				desicion();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				salida();
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
		public Fun_statementContext fun_statement() {
			return getRuleContext(Fun_statementContext.class,0);
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
			setState(157);
			match(T__8);
			setState(158);
			match(T__9);
			setState(159);
			match(T__10);
			setState(160);
			fun_statement();
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
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
			setState(166);
			match(T__11);
			setState(167);
			match(ID);
			setState(168);
			match(T__9);
			setState(169);
			arguments();
			setState(170);
			match(T__10);
			setState(171);
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
			setState(173);
			tipos();
			setState(174);
			match(ID);
			setState(175);
			match(T__9);
			setState(176);
			arguments();
			setState(177);
			match(T__10);
			setState(178);
			fun_statement();
			setState(179);
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
			setState(181);
			tipos();
			setState(182);
			match(ID);
			setState(183);
			assignmentoperator();
			setState(184);
			expresion();
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
			setState(187);
			tipos();
			setState(188);
			variables();
			setState(189);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				expresion_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				expresion_decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				expresion_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				expresion_mat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				expresion_palabra();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				function();
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

	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode LeftShift() { return getToken(lengBasicParser.LeftShift, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitSalida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitSalida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__12);
			setState(200);
			match(LeftShift);
			setState(201);
			expresion();
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
		enterRule(_localctx, 28, RULE_ciclo);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				fOR();
				}
				break;
			case WHile:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				wHILe();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
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
		enterRule(_localctx, 30, RULE_desicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IF);
			setState(209);
			match(T__9);
			setState(210);
			expresion_logica();
			setState(211);
			match(T__10);
			setState(212);
			statement();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(213);
				match(ELSE);
				setState(214);
				statement();
				}
				break;
			case 2:
				{
				setState(215);
				match(ELSE);
				setState(216);
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
		enterRule(_localctx, 32, RULE_wHILe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(WHile);
			setState(221);
			match(T__9);
			setState(222);
			expresion_logica();
			setState(223);
			match(T__10);
			setState(224);
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
		enterRule(_localctx, 34, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Do);
			setState(227);
			statement();
			setState(228);
			match(WHile);
			setState(229);
			match(T__9);
			setState(230);
			expresion_logica();
			setState(231);
			match(T__10);
			setState(232);
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
		enterRule(_localctx, 36, RULE_fOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FOR);
			setState(235);
			match(T__9);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(236);
				simpleDeclaration();
				}
				break;
			case 2:
				{
				setState(237);
				declaracion_asignacion();
				}
				break;
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__20 || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(240);
				expresion_logica();
				}
			}

			setState(243);
			match(COT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__35) | (1L << T__36))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(244);
				expresion_mat();
				}
			}

			setState(247);
			match(T__10);
			setState(248);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(lengBasicParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(lengBasicParser.ID, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ID);
			setState(251);
			match(T__9);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(252);
				match(ID);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(253);
					match(T__13);
					setState(254);
					match(ID);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
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
		enterRule(_localctx, 40, RULE_expresion_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 42, RULE_expresion_entera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 44, RULE_expresion_palabra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 46, RULE_assignmentexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(271);
				match(ID);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__60) {
					{
					{
					setState(272);
					index();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				assignmentoperator();
				setState(279);
				expresion();
				}
				break;
			case 2:
				{
				setState(281);
				post_operators();
				}
				break;
			case 3:
				{
				setState(282);
				pre_operators();
				}
				break;
			}
			setState(285);
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
		enterRule(_localctx, 48, RULE_expresion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 50, RULE_conditionalexpression);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				logicalorexpression(0);
				setState(291);
				match(T__14);
				setState(292);
				assignmentexpression();
				setState(293);
				match(T__15);
				setState(294);
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
		enterRule(_localctx, 52, RULE_expresion_mat);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				adicion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				post_operators();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(T__16);
						setState(308);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(309);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(310);
						match(T__17);
						setState(311);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(316);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(318);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						match(T__18);
						setState(322);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(323);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(324);
						match(T__19);
						setState(325);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(330);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case REAL:
			case INT:
			case ID:
				{
				setState(332);
				relationalexpression(0);
				}
				break;
			case T__20:
				{
				setState(333);
				match(T__20);
				setState(334);
				expresion_logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(337);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(338);
						match(T__21);
						setState(339);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(340);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(341);
						match(T__22);
						setState(342);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(347);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(T__23);
					setState(353);
					equalityexpression(0);
					}
					} 
				}
				setState(358);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(360);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					match(T__24);
					setState(364);
					andexpression(0);
					}
					} 
				}
				setState(369);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					match(T__25);
					setState(375);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(380);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			adicion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(384);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(385);
						match(T__26);
						setState(386);
						adicion(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(387);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(388);
						match(T__27);
						setState(389);
						adicion(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(390);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(391);
						match(T__28);
						setState(392);
						adicion(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(393);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(394);
						match(T__29);
						setState(395);
						adicion(0);
						}
						break;
					}
					} 
				}
				setState(400);
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
		enterRule(_localctx, 68, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_mulriplicacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			numero();
			}
			_ctx.stop = _input.LT(-1);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(406);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(407);
						match(T__30);
						setState(408);
						numero();
						}
						break;
					case 2:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(409);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(410);
						match(T__31);
						setState(411);
						numero();
						}
						break;
					case 3:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(412);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(413);
						match(T__32);
						setState(414);
						numero();
						}
						break;
					}
					} 
				}
				setState(419);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_adicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(421);
			mulriplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(423);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(424);
						match(T__33);
						setState(425);
						mulriplicacion(0);
						}
						break;
					case 2:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(426);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(427);
						match(T__34);
						setState(428);
						mulriplicacion(0);
						}
						break;
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 74, RULE_post_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(ID);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(435);
				index();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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
		enterRule(_localctx, 76, RULE_pre_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(444);
			match(ID);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(445);
				index();
				}
				}
				setState(450);
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
		enterRule(_localctx, 78, RULE_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(451);
				pretipo();
				setState(452);
				tipos_con_pre();
				}
				break;
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
				{
				setState(454);
				tipos_sin_pre();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
				{
				setState(455);
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
		enterRule(_localctx, 80, RULE_tipos_sin_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_tipos_con_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462);
			match(ID);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(463);
				match(T__13);
				setState(464);
				match(ID);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(470);
				index();
				}
				}
				setState(475);
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
		enterRule(_localctx, 86, RULE_pretipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (T__51 - 52)) | (1L << (T__52 - 52)) | (1L << (T__53 - 52)) | (1L << (T__54 - 52)) | (1L << (T__55 - 52)) | (1L << (T__56 - 52)) | (1L << (T__57 - 52)) | (1L << (T__58 - 52)) | (1L << (T__59 - 52)) | (1L << (RightShiftAssign - 52)) | (1L << (LeftShiftAssign - 52)))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_numero);
		try {
			int _alt;
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(ID);
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(481);
						index();
						}
						} 
					}
					setState(486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				expresion_entera();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				expresion_decimal();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(T__9);
				setState(490);
				expresion();
				setState(491);
				match(T__10);
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
		enterRule(_localctx, 92, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__60);
			setState(496);
			expresion_mat();
			setState(497);
			match(T__61);
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
		enterRule(_localctx, 94, RULE_arguments);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				tipos();
				setState(500);
				match(ID);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(501);
					match(T__13);
					setState(502);
					tipos();
					setState(503);
					match(ID);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
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
		case 27:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 28:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 29:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 30:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 31:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 32:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 33:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 35:
			return mulriplicacion_sempred((MulriplicacionContext)_localctx, predIndex);
		case 36:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0204\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\7\2e\n\2\f\2\16\2h"+
		"\13\2\3\2\5\2k\n\2\3\2\3\2\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3|\n\3\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3"+
		"\4\3\5\3\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00dd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00f1\n\24\3\24\5\24\u00f4"+
		"\n\24\3\24\3\24\5\24\u00f8\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0102\n\25\f\25\16\25\u0105\13\25\3\25\5\25\u0108\n\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u0114\n\31\f\31\16\31\u0117"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\5\31\u011e\n\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u012b\n\33\3\34\3\34\3\34\5\34"+
		"\u0130\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u013b\n"+
		"\35\f\35\16\35\u013e\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0149\n\36\f\36\16\36\u014c\13\36\3\37\3\37\3\37\3\37\5\37\u0152"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u015a\n\37\f\37\16\37\u015d\13"+
		"\37\3 \3 \3 \3 \3 \3 \7 \u0165\n \f \16 \u0168\13 \3!\3!\3!\3!\3!\3!\7"+
		"!\u0170\n!\f!\16!\u0173\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u017b\n\"\f\""+
		"\16\"\u017e\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u018f"+
		"\n#\f#\16#\u0192\13#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u01a2"+
		"\n%\f%\16%\u01a5\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01b0\n&\f&\16&\u01b3"+
		"\13&\3\'\3\'\7\'\u01b7\n\'\f\'\16\'\u01ba\13\'\3\'\3\'\3(\3(\3(\7(\u01c1"+
		"\n(\f(\16(\u01c4\13(\3)\3)\3)\3)\3)\5)\u01cb\n)\3*\3*\3+\3+\3,\3,\3,\7"+
		",\u01d4\n,\f,\16,\u01d7\13,\3,\7,\u01da\n,\f,\16,\u01dd\13,\3-\3-\3.\3"+
		".\3/\3/\7/\u01e5\n/\f/\16/\u01e8\13/\3/\3/\3/\3/\3/\3/\5/\u01f0\n/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u01fc\n\61\f\61\16"+
		"\61\u01ff\13\61\3\61\5\61\u0202\n\61\3\61\2\138:<>@BDHJ\62\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`\2\b\3\2KL\3\2&\'\3\2(.\3\2/\61\3\2\62\65\4\2\66>TU\2\u0214\2b\3\2\2"+
		"\2\4s\3\2\2\2\6}\3\2\2\2\b\u0086\3\2\2\2\n\u0096\3\2\2\2\f\u009d\3\2\2"+
		"\2\16\u009f\3\2\2\2\20\u00a6\3\2\2\2\22\u00a8\3\2\2\2\24\u00af\3\2\2\2"+
		"\26\u00b7\3\2\2\2\30\u00bd\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36"+
		"\u00d0\3\2\2\2 \u00d2\3\2\2\2\"\u00de\3\2\2\2$\u00e4\3\2\2\2&\u00ec\3"+
		"\2\2\2(\u00fc\3\2\2\2*\u010b\3\2\2\2,\u010d\3\2\2\2.\u010f\3\2\2\2\60"+
		"\u011d\3\2\2\2\62\u0121\3\2\2\2\64\u012a\3\2\2\2\66\u012f\3\2\2\28\u0131"+
		"\3\2\2\2:\u013f\3\2\2\2<\u0151\3\2\2\2>\u015e\3\2\2\2@\u0169\3\2\2\2B"+
		"\u0174\3\2\2\2D\u017f\3\2\2\2F\u0193\3\2\2\2H\u0195\3\2\2\2J\u01a6\3\2"+
		"\2\2L\u01b4\3\2\2\2N\u01bd\3\2\2\2P\u01ca\3\2\2\2R\u01cc\3\2\2\2T\u01ce"+
		"\3\2\2\2V\u01d0\3\2\2\2X\u01de\3\2\2\2Z\u01e0\3\2\2\2\\\u01ef\3\2\2\2"+
		"^\u01f1\3\2\2\2`\u0201\3\2\2\2bf\5\4\3\2ce\5\n\6\2dc\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\5\16\b\2ji\3\2\2\2jk\3\2\2"+
		"\2kl\3\2\2\2lm\7\2\2\3m\3\3\2\2\2no\7\3\2\2op\7\4\2\2pr\7N\2\2qn\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t{\3\2\2\2us\3\2\2\2vw\7\5\2\2wx\7\6\2"+
		"\2xy\7\7\2\2y|\7E\2\2z|\3\2\2\2{v\3\2\2\2{z\3\2\2\2|\5\3\2\2\2}\u0081"+
		"\7\b\2\2~\u0080\5\f\7\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7\t\2\2\u0085\7\3\2\2\2\u0086\u008a\7\b\2\2\u0087\u0089\5\f\7\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\n\2\2\u008e"+
		"\u008f\5\32\16\2\u008f\u0090\7E\2\2\u0090\u0091\7\t\2\2\u0091\t\3\2\2"+
		"\2\u0092\u0097\5\20\t\2\u0093\u0097\5\60\31\2\u0094\u0097\5\24\13\2\u0095"+
		"\u0097\5\22\n\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\13\3\2\2\2\u0098\u009e\5\20\t\2\u0099"+
		"\u009e\5\36\20\2\u009a\u009e\5\60\31\2\u009b\u009e\5 \21\2\u009c\u009e"+
		"\5\34\17\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\7"+
		"\13\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\5\b\5\2\u00a3"+
		"\17\3\2\2\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\21\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa"+
		"\7M\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\5`\61\2\u00ac\u00ad\7\r\2\2\u00ad"+
		"\u00ae\5\6\4\2\u00ae\23\3\2\2\2\u00af\u00b0\5P)\2\u00b0\u00b1\7M\2\2\u00b1"+
		"\u00b2\7\f\2\2\u00b2\u00b3\5`\61\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\5\b"+
		"\5\2\u00b5\u00b6\7E\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\5P)\2\u00b8\u00b9"+
		"\7M\2\2\u00b9\u00ba\5Z.\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7E\2\2\u00bc"+
		"\27\3\2\2\2\u00bd\u00be\5P)\2\u00be\u00bf\5V,\2\u00bf\u00c0\7E\2\2\u00c0"+
		"\31\3\2\2\2\u00c1\u00c8\5,\27\2\u00c2\u00c8\5*\26\2\u00c3\u00c8\5\62\32"+
		"\2\u00c4\u00c8\5\66\34\2\u00c5\u00c8\5.\30\2\u00c6\u00c8\5(\25\2\u00c7"+
		"\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00ca"+
		"\7\17\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\5\32\16\2\u00cc\35\3\2\2\2\u00cd"+
		"\u00d1\5&\24\2\u00ce\u00d1\5\"\22\2\u00cf\u00d1\5$\23\2\u00d0\u00cd\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\37\3\2\2\2\u00d2"+
		"\u00d3\7F\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5\62\32\2\u00d5\u00d6\7"+
		"\r\2\2\u00d6\u00dc\5\6\4\2\u00d7\u00d8\7G\2\2\u00d8\u00dd\5\6\4\2\u00d9"+
		"\u00da\7G\2\2\u00da\u00dd\5 \21\2\u00db\u00dd\3\2\2\2\u00dc\u00d7\3\2"+
		"\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df"+
		"\7H\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\5\62\32\2\u00e1\u00e2\7\r\2\2"+
		"\u00e2\u00e3\5\6\4\2\u00e3#\3\2\2\2\u00e4\u00e5\7J\2\2\u00e5\u00e6\5\6"+
		"\4\2\u00e6\u00e7\7H\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\5\62\32\2\u00e9"+
		"\u00ea\7\r\2\2\u00ea\u00eb\7E\2\2\u00eb%\3\2\2\2\u00ec\u00ed\7I\2\2\u00ed"+
		"\u00f0\7\f\2\2\u00ee\u00f1\5\30\r\2\u00ef\u00f1\5\26\f\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5\62\32\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7E"+
		"\2\2\u00f6\u00f8\5\66\34\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\7\r\2\2\u00fa\u00fb\5\6\4\2\u00fb\'\3\2\2\2"+
		"\u00fc\u00fd\7M\2\2\u00fd\u0107\7\f\2\2\u00fe\u0103\7M\2\2\u00ff\u0100"+
		"\7\20\2\2\u0100\u0102\7M\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\r\2\2\u010a)\3\2\2\2\u010b\u010c\7B\2\2\u010c"+
		"+\3\2\2\2\u010d\u010e\7C\2\2\u010e-\3\2\2\2\u010f\u0110\7O\2\2\u0110/"+
		"\3\2\2\2\u0111\u0115\7M\2\2\u0112\u0114\5^\60\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5Z.\2\u0119\u011a\5\32\16\2\u011a"+
		"\u011e\3\2\2\2\u011b\u011e\5L\'\2\u011c\u011e\5N(\2\u011d\u0111\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"+
		"\7E\2\2\u0120\61\3\2\2\2\u0121\u0122\5:\36\2\u0122\63\3\2\2\2\u0123\u012b"+
		"\5:\36\2\u0124\u0125\5:\36\2\u0125\u0126\7\21\2\2\u0126\u0127\5\60\31"+
		"\2\u0127\u0128\7\22\2\2\u0128\u0129\5\60\31\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012b\65\3\2\2\2\u012c\u0130\5J&\2"+
		"\u012d\u0130\5L\'\2\u012e\u0130\5N(\2\u012f\u012c\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130\67\3\2\2\2\u0131\u0132\b\35\1\2\u0132"+
		"\u0133\5B\"\2\u0133\u013c\3\2\2\2\u0134\u0135\f\4\2\2\u0135\u0136\7\23"+
		"\2\2\u0136\u013b\5B\"\2\u0137\u0138\f\3\2\2\u0138\u0139\7\24\2\2\u0139"+
		"\u013b\5B\"\2\u013a\u0134\3\2\2\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d9\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0140\b\36\1\2\u0140\u0141\58\35\2\u0141\u014a\3\2\2\2"+
		"\u0142\u0143\f\4\2\2\u0143\u0144\7\25\2\2\u0144\u0149\58\35\2\u0145\u0146"+
		"\f\3\2\2\u0146\u0147\7\26\2\2\u0147\u0149\58\35\2\u0148\u0142\3\2\2\2"+
		"\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b;\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\37\1\2\u014e"+
		"\u0152\5D#\2\u014f\u0150\7\27\2\2\u0150\u0152\5\62\32\2\u0151\u014d\3"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0152\u015b\3\2\2\2\u0153\u0154\f\4\2\2\u0154"+
		"\u0155\7\30\2\2\u0155\u015a\5D#\2\u0156\u0157\f\3\2\2\u0157\u0158\7\31"+
		"\2\2\u0158\u015a\5D#\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c=\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\b \1\2\u015f\u0160\5<\37\2\u0160\u0166\3\2"+
		"\2\2\u0161\u0162\f\3\2\2\u0162\u0163\7\32\2\2\u0163\u0165\5<\37\2\u0164"+
		"\u0161\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167?\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\b!\1\2\u016a\u016b"+
		"\5> \2\u016b\u0171\3\2\2\2\u016c\u016d\f\3\2\2\u016d\u016e\7\33\2\2\u016e"+
		"\u0170\5> \2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2"+
		"\2\u0171\u0172\3\2\2\2\u0172A\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175"+
		"\b\"\1\2\u0175\u0176\5@!\2\u0176\u017c\3\2\2\2\u0177\u0178\f\3\2\2\u0178"+
		"\u0179\7\34\2\2\u0179\u017b\5@!\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dC\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0180\b#\1\2\u0180\u0181\5J&\2\u0181\u0190\3\2\2\2\u0182"+
		"\u0183\f\6\2\2\u0183\u0184\7\35\2\2\u0184\u018f\5J&\2\u0185\u0186\f\5"+
		"\2\2\u0186\u0187\7\36\2\2\u0187\u018f\5J&\2\u0188\u0189\f\4\2\2\u0189"+
		"\u018a\7\37\2\2\u018a\u018f\5J&\2\u018b\u018c\f\3\2\2\u018c\u018d\7 \2"+
		"\2\u018d\u018f\5J&\2\u018e\u0182\3\2\2\2\u018e\u0185\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018b\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191E\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\t\2\2\2"+
		"\u0194G\3\2\2\2\u0195\u0196\b%\1\2\u0196\u0197\5\\/\2\u0197\u01a3\3\2"+
		"\2\2\u0198\u0199\f\5\2\2\u0199\u019a\7!\2\2\u019a\u01a2\5\\/\2\u019b\u019c"+
		"\f\4\2\2\u019c\u019d\7\"\2\2\u019d\u01a2\5\\/\2\u019e\u019f\f\3\2\2\u019f"+
		"\u01a0\7#\2\2\u01a0\u01a2\5\\/\2\u01a1\u0198\3\2\2\2\u01a1\u019b\3\2\2"+
		"\2\u01a1\u019e\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4I\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\b&\1\2\u01a7\u01a8"+
		"\5H%\2\u01a8\u01b1\3\2\2\2\u01a9\u01aa\f\4\2\2\u01aa\u01ab\7$\2\2\u01ab"+
		"\u01b0\5H%\2\u01ac\u01ad\f\3\2\2\u01ad\u01ae\7%\2\2\u01ae\u01b0\5H%\2"+
		"\u01af\u01a9\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2K\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b8\7M\2\2\u01b5\u01b7\5^\60\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\t\3\2\2\u01bcM\3\2\2\2\u01bd\u01be\t\3\2\2"+
		"\u01be\u01c2\7M\2\2\u01bf\u01c1\5^\60\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3O\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c6\5X-\2\u01c6\u01c7\5T+\2\u01c7\u01cb\3\2\2\2"+
		"\u01c8\u01cb\5R*\2\u01c9\u01cb\5T+\2\u01ca\u01c5\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01ca\u01c9\3\2\2\2\u01cbQ\3\2\2\2\u01cc\u01cd\t\4\2\2\u01cdS\3"+
		"\2\2\2\u01ce\u01cf\t\5\2\2\u01cfU\3\2\2\2\u01d0\u01d5\7M\2\2\u01d1\u01d2"+
		"\7\20\2\2\u01d2\u01d4\7M\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01db\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01da\5^\60\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcW\3\2\2\2\u01dd\u01db\3\2\2\2"+
		"\u01de\u01df\t\6\2\2\u01dfY\3\2\2\2\u01e0\u01e1\t\7\2\2\u01e1[\3\2\2\2"+
		"\u01e2\u01e6\7M\2\2\u01e3\u01e5\5^\60\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f0\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01f0\5,\27\2\u01ea\u01f0\5*\26\2\u01eb\u01ec\7\f"+
		"\2\2\u01ec\u01ed\5\32\16\2\u01ed\u01ee\7\r\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01e2\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01eb\3\2"+
		"\2\2\u01f0]\3\2\2\2\u01f1\u01f2\7?\2\2\u01f2\u01f3\5\66\34\2\u01f3\u01f4"+
		"\7@\2\2\u01f4_\3\2\2\2\u01f5\u01f6\5P)\2\u01f6\u01fd\7M\2\2\u01f7\u01f8"+
		"\7\20\2\2\u01f8\u01f9\5P)\2\u01f9\u01fa\7M\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f7\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0202\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01f5\3\2\2\2\u0201\u0200\3\2\2\2\u0202a\3\2\2\2\60fjs{\u0081\u008a\u0096"+
		"\u009d\u00a6\u00c7\u00d0\u00dc\u00f0\u00f3\u00f7\u0103\u0107\u0115\u011d"+
		"\u012a\u012f\u013a\u013c\u0148\u014a\u0151\u0159\u015b\u0166\u0171\u017c"+
		"\u018e\u0190\u01a1\u01a3\u01af\u01b1\u01b8\u01c2\u01ca\u01d5\u01db\u01e6"+
		"\u01ef\u01fd\u0201";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}