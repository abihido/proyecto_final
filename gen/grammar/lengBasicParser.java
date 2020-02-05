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
		RULE_desicion = 15, RULE_elso = 16, RULE_wHILe = 17, RULE_do_while = 18, 
		RULE_fOR = 19, RULE_function = 20, RULE_expresion_decimal = 21, RULE_expresion_entera = 22, 
		RULE_expresion_palabra = 23, RULE_assignmentexpression = 24, RULE_expresion_logica = 25, 
		RULE_conditionalexpression = 26, RULE_expresion_mat = 27, RULE_logicalandexpression = 28, 
		RULE_logicalorexpression = 29, RULE_equalityexpression = 30, RULE_andexpression = 31, 
		RULE_exclusiveorexpression = 32, RULE_inclusiveorexpression = 33, RULE_relationalexpression = 34, 
		RULE_shiftoperator = 35, RULE_mulriplicacion = 36, RULE_adicion = 37, 
		RULE_post_operators = 38, RULE_pre_operators = 39, RULE_tipos = 40, RULE_tipos_sin_pre = 41, 
		RULE_tipos_con_pre = 42, RULE_variables = 43, RULE_pretipo = 44, RULE_assignmentoperator = 45, 
		RULE_numero = 46, RULE_index = 47, RULE_arguments = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "imports", "statement", "fun_statement", "globalThings", "localThings", 
			"main", "declaracion", "void_declaration", "function_declaration", "declaracion_asignacion", 
			"simpleDeclaration", "expresion", "salida", "ciclo", "desicion", "elso", 
			"wHILe", "do_while", "fOR", "function", "expresion_decimal", "expresion_entera", 
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
			null, "'#'", "'include'", "'using'", "'namespace'", "'std'", "'{'", "'}'", 
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
			setState(98);
			imports();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__37 - 12)) | (1L << (T__38 - 12)) | (1L << (T__39 - 12)) | (1L << (T__40 - 12)) | (1L << (T__41 - 12)) | (1L << (T__42 - 12)) | (1L << (T__43 - 12)) | (1L << (T__44 - 12)) | (1L << (T__45 - 12)) | (1L << (T__46 - 12)) | (1L << (T__47 - 12)) | (1L << (T__48 - 12)) | (1L << (T__49 - 12)) | (1L << (T__50 - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				{
				setState(99);
				globalThings();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(105);
				main();
				}
			}

			setState(108);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				match(T__0);
				setState(111);
				match(T__1);
				setState(112);
				match(BIBLIOTECA);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(118);
				match(T__2);
				setState(119);
				match(T__3);
				setState(120);
				match(T__4);
				setState(121);
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
			setState(125);
			match(T__5);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__35 - 13)) | (1L << (T__36 - 13)) | (1L << (T__37 - 13)) | (1L << (T__38 - 13)) | (1L << (T__39 - 13)) | (1L << (T__40 - 13)) | (1L << (T__41 - 13)) | (1L << (T__42 - 13)) | (1L << (T__43 - 13)) | (1L << (T__44 - 13)) | (1L << (T__45 - 13)) | (1L << (T__46 - 13)) | (1L << (T__47 - 13)) | (1L << (T__48 - 13)) | (1L << (T__49 - 13)) | (1L << (T__50 - 13)) | (1L << (IF - 13)) | (1L << (WHile - 13)) | (1L << (FOR - 13)) | (1L << (Do - 13)) | (1L << (ID - 13)))) != 0)) {
				{
				{
				setState(126);
				localThings();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
			setState(134);
			match(T__5);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__35 - 13)) | (1L << (T__36 - 13)) | (1L << (T__37 - 13)) | (1L << (T__38 - 13)) | (1L << (T__39 - 13)) | (1L << (T__40 - 13)) | (1L << (T__41 - 13)) | (1L << (T__42 - 13)) | (1L << (T__43 - 13)) | (1L << (T__44 - 13)) | (1L << (T__45 - 13)) | (1L << (T__46 - 13)) | (1L << (T__47 - 13)) | (1L << (T__48 - 13)) | (1L << (T__49 - 13)) | (1L << (T__50 - 13)) | (1L << (IF - 13)) | (1L << (WHile - 13)) | (1L << (FOR - 13)) | (1L << (Do - 13)) | (1L << (ID - 13)))) != 0)) {
				{
				{
				setState(135);
				localThings();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__7);
			setState(142);
			expresion();
			setState(143);
			match(COT);
			setState(144);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				assignmentexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
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
			setState(157);
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
				setState(152);
				declaracion();
				}
				break;
			case WHile:
			case FOR:
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				ciclo();
				}
				break;
			case T__35:
			case T__36:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				assignmentexpression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				desicion();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
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
			setState(159);
			match(T__8);
			setState(160);
			match(T__9);
			setState(161);
			match(T__10);
			setState(162);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
			setState(168);
			match(T__11);
			setState(169);
			match(ID);
			setState(170);
			match(T__9);
			setState(171);
			arguments();
			setState(172);
			match(T__10);
			setState(173);
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
			setState(175);
			tipos();
			setState(176);
			match(ID);
			setState(177);
			match(T__9);
			setState(178);
			arguments();
			setState(179);
			match(T__10);
			setState(180);
			fun_statement();
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
			setState(183);
			tipos();
			setState(184);
			match(ID);
			setState(185);
			assignmentoperator();
			setState(186);
			expresion();
			setState(187);
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
			setState(189);
			tipos();
			setState(190);
			variables();
			setState(191);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				expresion_entera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				expresion_decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				expresion_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				expresion_mat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				expresion_palabra();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
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
			setState(201);
			match(T__12);
			setState(202);
			match(LeftShift);
			setState(203);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				fOR();
				}
				break;
			case WHile:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				wHILe();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElsoContext elso() {
			return getRuleContext(ElsoContext.class,0);
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
			setState(210);
			match(IF);
			setState(211);
			match(T__9);
			setState(212);
			expresion_logica();
			setState(213);
			match(T__10);
			setState(214);
			statement();
			setState(215);
			elso();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(lengBasicParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DesicionContext desicion() {
			return getRuleContext(DesicionContext.class,0);
		}
		public ElsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).enterElso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lengBasicListener ) ((lengBasicListener)listener).exitElso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lengBasicVisitor ) return ((lengBasicVisitor<? extends T>)visitor).visitElso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsoContext elso() throws RecognitionException {
		ElsoContext _localctx = new ElsoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(217);
				match(ELSE);
				setState(218);
				statement();
				}
				break;
			case 2:
				{
				setState(219);
				match(ELSE);
				setState(220);
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
		enterRule(_localctx, 34, RULE_wHILe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WHile);
			setState(225);
			match(T__9);
			setState(226);
			expresion_logica();
			setState(227);
			match(T__10);
			setState(228);
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
		enterRule(_localctx, 36, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(Do);
			setState(231);
			statement();
			setState(232);
			match(WHile);
			setState(233);
			match(T__9);
			setState(234);
			expresion_logica();
			setState(235);
			match(T__10);
			setState(236);
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
		enterRule(_localctx, 38, RULE_fOR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FOR);
			setState(239);
			match(T__9);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(240);
				simpleDeclaration();
				}
				break;
			case 2:
				{
				setState(241);
				declaracion_asignacion();
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__20 || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(244);
				expresion_logica();
				}
			}

			setState(247);
			match(COT);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__35) | (1L << T__36))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (REAL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				setState(248);
				expresion_mat();
				}
			}

			setState(251);
			match(T__10);
			setState(252);
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
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(T__9);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(256);
				match(ID);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(257);
					match(T__13);
					setState(258);
					match(ID);
					}
					}
					setState(263);
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
			setState(267);
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
		enterRule(_localctx, 42, RULE_expresion_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 44, RULE_expresion_entera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 46, RULE_expresion_palabra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 48, RULE_assignmentexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(275);
				match(ID);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__60) {
					{
					{
					setState(276);
					index();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				assignmentoperator();
				setState(283);
				expresion();
				}
				break;
			case 2:
				{
				setState(285);
				post_operators();
				}
				break;
			case 3:
				{
				setState(286);
				pre_operators();
				}
				break;
			}
			setState(289);
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
		enterRule(_localctx, 50, RULE_expresion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 52, RULE_conditionalexpression);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				logicalorexpression(0);
				setState(295);
				match(T__14);
				setState(296);
				assignmentexpression();
				setState(297);
				match(T__15);
				setState(298);
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
		enterRule(_localctx, 54, RULE_expresion_mat);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				adicion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				post_operators();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						match(T__16);
						setState(312);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(313);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(314);
						match(T__17);
						setState(315);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(320);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(322);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(T__18);
						setState(326);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(327);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(328);
						match(T__19);
						setState(329);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(334);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case REAL:
			case INT:
			case ID:
				{
				setState(336);
				relationalexpression(0);
				}
				break;
			case T__20:
				{
				setState(337);
				match(T__20);
				setState(338);
				expresion_logica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(341);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(342);
						match(T__21);
						setState(343);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(344);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(345);
						match(T__22);
						setState(346);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(351);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(353);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(360);
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
					setState(355);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(356);
					match(T__23);
					setState(357);
					equalityexpression(0);
					}
					} 
				}
				setState(362);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(364);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
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
					setState(366);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(367);
					match(T__24);
					setState(368);
					andexpression(0);
					}
					} 
				}
				setState(373);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(375);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
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
					setState(377);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(378);
					match(T__25);
					setState(379);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(384);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			adicion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(388);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(389);
						match(T__26);
						setState(390);
						adicion(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(391);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(392);
						match(T__27);
						setState(393);
						adicion(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(394);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(395);
						match(T__28);
						setState(396);
						adicion(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(397);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(398);
						match(T__29);
						setState(399);
						adicion(0);
						}
						break;
					}
					} 
				}
				setState(404);
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
		enterRule(_localctx, 70, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_mulriplicacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			numero();
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(410);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(411);
						match(T__30);
						setState(412);
						numero();
						}
						break;
					case 2:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(413);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(414);
						match(T__31);
						setState(415);
						numero();
						}
						break;
					case 3:
						{
						_localctx = new MulriplicacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulriplicacion);
						setState(416);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(417);
						match(T__32);
						setState(418);
						numero();
						}
						break;
					}
					} 
				}
				setState(423);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_adicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			mulriplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(427);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(428);
						match(T__33);
						setState(429);
						mulriplicacion(0);
						}
						break;
					case 2:
						{
						_localctx = new AdicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_adicion);
						setState(430);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(431);
						match(T__34);
						setState(432);
						mulriplicacion(0);
						}
						break;
					}
					} 
				}
				setState(437);
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
		enterRule(_localctx, 76, RULE_post_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ID);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(439);
				index();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
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
		enterRule(_localctx, 78, RULE_pre_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(448);
			match(ID);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(449);
				index();
				}
				}
				setState(454);
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
		enterRule(_localctx, 80, RULE_tipos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
			case T__49:
			case T__50:
				{
				setState(455);
				pretipo();
				setState(456);
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
				setState(458);
				tipos_sin_pre();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
				{
				setState(459);
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
		enterRule(_localctx, 82, RULE_tipos_sin_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		enterRule(_localctx, 84, RULE_tipos_con_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		enterRule(_localctx, 86, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			match(ID);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(467);
				match(T__13);
				setState(468);
				match(ID);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__60) {
				{
				{
				setState(474);
				index();
				}
				}
				setState(479);
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
		enterRule(_localctx, 88, RULE_pretipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 90, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 92, RULE_numero);
		try {
			int _alt;
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(ID);
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						index();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				expresion_entera();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				expresion_decimal();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(T__9);
				setState(494);
				expresion();
				setState(495);
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
		enterRule(_localctx, 94, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__60);
			setState(500);
			expresion_mat();
			setState(501);
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
		enterRule(_localctx, 96, RULE_arguments);
		int _la;
		try {
			setState(515);
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
				setState(503);
				tipos();
				setState(504);
				match(ID);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(505);
					match(T__13);
					setState(506);
					tipos();
					setState(507);
					match(ID);
					}
					}
					setState(513);
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
		case 28:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 29:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 30:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 31:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 32:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 33:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 34:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 36:
			return mulriplicacion_sempred((MulriplicacionContext)_localctx, predIndex);
		case 37:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0208\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\5\2m\n\2\3\2\3\2\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13"+
		"\4\3\4\3\4\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00e1\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00f5"+
		"\n\25\3\25\5\25\u00f8\n\25\3\25\3\25\5\25\u00fc\n\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0106\n\26\f\26\16\26\u0109\13\26\3\26\5"+
		"\26\u010c\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32"+
		"\u0118\n\32\f\32\16\32\u011b\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u0122"+
		"\n\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012f"+
		"\n\34\3\35\3\35\3\35\5\35\u0134\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u013f\n\36\f\36\16\36\u0142\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\7\37\u014d\n\37\f\37\16\37\u0150\13\37\3 \3"+
		" \3 \3 \5 \u0156\n \3 \3 \3 \3 \3 \3 \7 \u015e\n \f \16 \u0161\13 \3!"+
		"\3!\3!\3!\3!\3!\7!\u0169\n!\f!\16!\u016c\13!\3\"\3\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0174\n\"\f\"\16\"\u0177\13\"\3#\3#\3#\3#\3#\3#\7#\u017f\n#\f#\16#"+
		"\u0182\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0193\n$\f"+
		"$\16$\u0196\13$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01a6\n&"+
		"\f&\16&\u01a9\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01b4\n\'\f"+
		"\'\16\'\u01b7\13\'\3(\3(\7(\u01bb\n(\f(\16(\u01be\13(\3(\3(\3)\3)\3)\7"+
		")\u01c5\n)\f)\16)\u01c8\13)\3*\3*\3*\3*\3*\5*\u01cf\n*\3+\3+\3,\3,\3-"+
		"\3-\3-\7-\u01d8\n-\f-\16-\u01db\13-\3-\7-\u01de\n-\f-\16-\u01e1\13-\3"+
		".\3.\3/\3/\3\60\3\60\7\60\u01e9\n\60\f\60\16\60\u01ec\13\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u01f4\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\7\62\u0200\n\62\f\62\16\62\u0203\13\62\3\62\5\62\u0206"+
		"\n\62\3\62\2\13:<>@BDFJL\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\b\3\2KL\3\2&\'\3\2(.\3\2/"+
		"\61\3\2\62\65\4\2\66>TU\2\u0217\2d\3\2\2\2\4u\3\2\2\2\6\177\3\2\2\2\b"+
		"\u0088\3\2\2\2\n\u0098\3\2\2\2\f\u009f\3\2\2\2\16\u00a1\3\2\2\2\20\u00a8"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00b1\3\2\2\2\26\u00b9\3\2\2\2\30\u00bf\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00cb\3\2\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2"+
		"\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00e8\3\2\2\2(\u00f0\3\2\2\2*\u0100"+
		"\3\2\2\2,\u010f\3\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u0121\3\2\2"+
		"\2\64\u0125\3\2\2\2\66\u012e\3\2\2\28\u0133\3\2\2\2:\u0135\3\2\2\2<\u0143"+
		"\3\2\2\2>\u0155\3\2\2\2@\u0162\3\2\2\2B\u016d\3\2\2\2D\u0178\3\2\2\2F"+
		"\u0183\3\2\2\2H\u0197\3\2\2\2J\u0199\3\2\2\2L\u01aa\3\2\2\2N\u01b8\3\2"+
		"\2\2P\u01c1\3\2\2\2R\u01ce\3\2\2\2T\u01d0\3\2\2\2V\u01d2\3\2\2\2X\u01d4"+
		"\3\2\2\2Z\u01e2\3\2\2\2\\\u01e4\3\2\2\2^\u01f3\3\2\2\2`\u01f5\3\2\2\2"+
		"b\u0205\3\2\2\2dh\5\4\3\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2km\5\16\b\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no"+
		"\7\2\2\3o\3\3\2\2\2pq\7\3\2\2qr\7\4\2\2rt\7N\2\2sp\3\2\2\2tw\3\2\2\2u"+
		"s\3\2\2\2uv\3\2\2\2v}\3\2\2\2wu\3\2\2\2xy\7\5\2\2yz\7\6\2\2z{\7\7\2\2"+
		"{~\7E\2\2|~\3\2\2\2}x\3\2\2\2}|\3\2\2\2~\5\3\2\2\2\177\u0083\7\b\2\2\u0080"+
		"\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\7\t\2\2\u0087\7\3\2\2\2\u0088\u008c\7\b\2\2\u0089\u008b\5\f\7\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\n\2\2\u0090"+
		"\u0091\5\32\16\2\u0091\u0092\7E\2\2\u0092\u0093\7\t\2\2\u0093\t\3\2\2"+
		"\2\u0094\u0099\5\20\t\2\u0095\u0099\5\62\32\2\u0096\u0099\5\24\13\2\u0097"+
		"\u0099\5\22\n\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u00a0\5\20\t\2\u009b"+
		"\u00a0\5\36\20\2\u009c\u00a0\5\62\32\2\u009d\u00a0\5 \21\2\u009e\u00a0"+
		"\5\34\17\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\7"+
		"\13\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\5\b\5\2\u00a5"+
		"\17\3\2\2\2\u00a6\u00a9\5\30\r\2\u00a7\u00a9\5\26\f\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac"+
		"\7M\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5b\62\2\u00ae\u00af\7\r\2\2\u00af"+
		"\u00b0\5\6\4\2\u00b0\23\3\2\2\2\u00b1\u00b2\5R*\2\u00b2\u00b3\7M\2\2\u00b3"+
		"\u00b4\7\f\2\2\u00b4\u00b5\5b\62\2\u00b5\u00b6\7\r\2\2\u00b6\u00b7\5\b"+
		"\5\2\u00b7\u00b8\7E\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\5R*\2\u00ba\u00bb"+
		"\7M\2\2\u00bb\u00bc\5\\/\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7E\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c0\5R*\2\u00c0\u00c1\5X-\2\u00c1\u00c2\7E\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00ca\5.\30\2\u00c4\u00ca\5,\27\2\u00c5\u00ca\5\64\33"+
		"\2\u00c6\u00ca\58\35\2\u00c7\u00ca\5\60\31\2\u00c8\u00ca\5*\26\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc"+
		"\7\17\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\5\32\16\2\u00ce\35\3\2\2\2\u00cf"+
		"\u00d3\5(\25\2\u00d0\u00d3\5$\23\2\u00d1\u00d3\5&\24\2\u00d2\u00cf\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7F\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00d8\7\r\2\2"+
		"\u00d8\u00d9\5\6\4\2\u00d9\u00da\5\"\22\2\u00da!\3\2\2\2\u00db\u00dc\7"+
		"G\2\2\u00dc\u00e1\5\6\4\2\u00dd\u00de\7G\2\2\u00de\u00e1\5 \21\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7H\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5"+
		"\5\64\33\2\u00e5\u00e6\7\r\2\2\u00e6\u00e7\5\6\4\2\u00e7%\3\2\2\2\u00e8"+
		"\u00e9\7J\2\2\u00e9\u00ea\5\6\4\2\u00ea\u00eb\7H\2\2\u00eb\u00ec\7\f\2"+
		"\2\u00ec\u00ed\5\64\33\2\u00ed\u00ee\7\r\2\2\u00ee\u00ef\7E\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f1\7I\2\2\u00f1\u00f4\7\f\2\2\u00f2\u00f5\5\30\r\2"+
		"\u00f3\u00f5\5\26\f\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f8\5\64\33\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7E\2\2\u00fa\u00fc\58\35\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\r\2\2\u00fe"+
		"\u00ff\5\6\4\2\u00ff)\3\2\2\2\u0100\u0101\7M\2\2\u0101\u010b\7\f\2\2\u0102"+
		"\u0107\7M\2\2\u0103\u0104\7\20\2\2\u0104\u0106\7M\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010c\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0102\3\2"+
		"\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\r\2\2\u010e"+
		"+\3\2\2\2\u010f\u0110\7B\2\2\u0110-\3\2\2\2\u0111\u0112\7C\2\2\u0112/"+
		"\3\2\2\2\u0113\u0114\7O\2\2\u0114\61\3\2\2\2\u0115\u0119\7M\2\2\u0116"+
		"\u0118\5`\61\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\5\\/\2\u011d\u011e\5\32\16\2\u011e\u0122\3\2\2\2\u011f\u0122\5"+
		"N(\2\u0120\u0122\5P)\2\u0121\u0115\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7E\2\2\u0124\63\3\2\2\2\u0125"+
		"\u0126\5<\37\2\u0126\65\3\2\2\2\u0127\u012f\5<\37\2\u0128\u0129\5<\37"+
		"\2\u0129\u012a\7\21\2\2\u012a\u012b\5\62\32\2\u012b\u012c\7\22\2\2\u012c"+
		"\u012d\5\62\32\2\u012d\u012f\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3"+
		"\2\2\2\u012f\67\3\2\2\2\u0130\u0134\5L\'\2\u0131\u0134\5N(\2\u0132\u0134"+
		"\5P)\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"9\3\2\2\2\u0135\u0136\b\36\1\2\u0136\u0137\5D#\2\u0137\u0140\3\2\2\2\u0138"+
		"\u0139\f\4\2\2\u0139\u013a\7\23\2\2\u013a\u013f\5D#\2\u013b\u013c\f\3"+
		"\2\2\u013c\u013d\7\24\2\2\u013d\u013f\5D#\2\u013e\u0138\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141;\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\b\37\1\2\u0144\u0145"+
		"\5:\36\2\u0145\u014e\3\2\2\2\u0146\u0147\f\4\2\2\u0147\u0148\7\25\2\2"+
		"\u0148\u014d\5:\36\2\u0149\u014a\f\3\2\2\u014a\u014b\7\26\2\2\u014b\u014d"+
		"\5:\36\2\u014c\u0146\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f=\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0152\b \1\2\u0152\u0156\5F$\2\u0153\u0154\7\27\2\2\u0154\u0156"+
		"\5\64\33\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015f\3\2\2\2"+
		"\u0157\u0158\f\4\2\2\u0158\u0159\7\30\2\2\u0159\u015e\5F$\2\u015a\u015b"+
		"\f\3\2\2\u015b\u015c\7\31\2\2\u015c\u015e\5F$\2\u015d\u0157\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160?\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b!\1\2\u0163\u0164"+
		"\5> \2\u0164\u016a\3\2\2\2\u0165\u0166\f\3\2\2\u0166\u0167\7\32\2\2\u0167"+
		"\u0169\5> \2\u0168\u0165\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016bA\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e"+
		"\b\"\1\2\u016e\u016f\5@!\2\u016f\u0175\3\2\2\2\u0170\u0171\f\3\2\2\u0171"+
		"\u0172\7\33\2\2\u0172\u0174\5@!\2\u0173\u0170\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176C\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\b#\1\2\u0179\u017a\5B\"\2\u017a\u0180\3\2\2\2\u017b"+
		"\u017c\f\3\2\2\u017c\u017d\7\34\2\2\u017d\u017f\5B\"\2\u017e\u017b\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"E\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b$\1\2\u0184\u0185\5L\'\2\u0185"+
		"\u0194\3\2\2\2\u0186\u0187\f\6\2\2\u0187\u0188\7\35\2\2\u0188\u0193\5"+
		"L\'\2\u0189\u018a\f\5\2\2\u018a\u018b\7\36\2\2\u018b\u0193\5L\'\2\u018c"+
		"\u018d\f\4\2\2\u018d\u018e\7\37\2\2\u018e\u0193\5L\'\2\u018f\u0190\f\3"+
		"\2\2\u0190\u0191\7 \2\2\u0191\u0193\5L\'\2\u0192\u0186\3\2\2\2\u0192\u0189"+
		"\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195G\3\2\2\2\u0196\u0194\3\2\2\2"+
		"\u0197\u0198\t\2\2\2\u0198I\3\2\2\2\u0199\u019a\b&\1\2\u019a\u019b\5^"+
		"\60\2\u019b\u01a7\3\2\2\2\u019c\u019d\f\5\2\2\u019d\u019e\7!\2\2\u019e"+
		"\u01a6\5^\60\2\u019f\u01a0\f\4\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a6\5^"+
		"\60\2\u01a2\u01a3\f\3\2\2\u01a3\u01a4\7#\2\2\u01a4\u01a6\5^\60\2\u01a5"+
		"\u019c\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8K\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ab\b\'\1\2\u01ab\u01ac\5J&\2\u01ac\u01b5\3\2\2\2\u01ad"+
		"\u01ae\f\4\2\2\u01ae\u01af\7$\2\2\u01af\u01b4\5J&\2\u01b0\u01b1\f\3\2"+
		"\2\u01b1\u01b2\7%\2\2\u01b2\u01b4\5J&\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"M\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bc\7M\2\2\u01b9\u01bb\5`\61\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\t\3\2\2\u01c0"+
		"O\3\2\2\2\u01c1\u01c2\t\3\2\2\u01c2\u01c6\7M\2\2\u01c3\u01c5\5`\61\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7Q\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\5Z.\2\u01ca\u01cb"+
		"\5V,\2\u01cb\u01cf\3\2\2\2\u01cc\u01cf\5T+\2\u01cd\u01cf\5V,\2\u01ce\u01c9"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfS\3\2\2\2\u01d0"+
		"\u01d1\t\4\2\2\u01d1U\3\2\2\2\u01d2\u01d3\t\5\2\2\u01d3W\3\2\2\2\u01d4"+
		"\u01d9\7M\2\2\u01d5\u01d6\7\20\2\2\u01d6\u01d8\7M\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01df\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\5`\61\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"Y\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\t\6\2\2\u01e3[\3\2\2\2\u01e4"+
		"\u01e5\t\7\2\2\u01e5]\3\2\2\2\u01e6\u01ea\7M\2\2\u01e7\u01e9\5`\61\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01f4\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f4\5.\30\2\u01ee"+
		"\u01f4\5,\27\2\u01ef\u01f0\7\f\2\2\u01f0\u01f1\5\32\16\2\u01f1\u01f2\7"+
		"\r\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01e6\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3"+
		"\u01ee\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f4_\3\2\2\2\u01f5\u01f6\7?\2\2\u01f6"+
		"\u01f7\58\35\2\u01f7\u01f8\7@\2\2\u01f8a\3\2\2\2\u01f9\u01fa\5R*\2\u01fa"+
		"\u0201\7M\2\2\u01fb\u01fc\7\20\2\2\u01fc\u01fd\5R*\2\u01fd\u01fe\7M\2"+
		"\2\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u01f9\3\2\2\2\u0205\u0204\3\2\2\2\u0206c\3\2\2\2"+
		"\60hlu}\u0083\u008c\u0098\u009f\u00a8\u00c9\u00d2\u00e0\u00f4\u00f7\u00fb"+
		"\u0107\u010b\u0119\u0121\u012e\u0133\u013e\u0140\u014c\u014e\u0155\u015d"+
		"\u015f\u016a\u0175\u0180\u0192\u0194\u01a5\u01a7\u01b3\u01b5\u01bc\u01c6"+
		"\u01ce\u01d9\u01df\u01ea\u01f3\u0201\u0205";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}