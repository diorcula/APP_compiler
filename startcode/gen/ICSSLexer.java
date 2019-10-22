// Generated from C:/Users/soffe/Desktop/APP_BEROEPSPRODUCT/icss/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, BOX_BRACKET_OPEN=2, BOX_BRACKET_CLOSE=3, TRUE=4, FALSE=5, PIXELSIZE=6, 
		PERCENTAGE=7, SCALAR=8, COLOR=9, ID_IDENT=10, CLASS_IDENT=11, LOWER_IDENT=12, 
		CAPITAL_IDENT=13, WS=14, OPEN_BRACE=15, CLOSE_BRACE=16, SEMICOLON=17, 
		COLON=18, PLUS=19, MIN=20, MUL=21, ASSIGNMENT_OPERATOR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", "FALSE", "PIXELSIZE", 
			"PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", "LOWER_IDENT", 
			"CAPITAL_IDENT", "WS", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", "COLON", 
			"PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'['", "']'", "'TRUE'", "'FALSE'", null, null, null, null, 
			null, null, null, null, null, "'{'", "'}'", "';'", "':'", "'+'", "'-'", 
			"'*'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "BOX_BRACKET_OPEN", "BOX_BRACKET_CLOSE", "TRUE", "FALSE", 
			"PIXELSIZE", "PERCENTAGE", "SCALAR", "COLOR", "ID_IDENT", "CLASS_IDENT", 
			"LOWER_IDENT", "CAPITAL_IDENT", "WS", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
			"COLON", "PLUS", "MIN", "MUL", "ASSIGNMENT_OPERATOR"
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7C\n"+
		"\7\r\7\16\7D\3\7\3\7\3\7\3\b\6\bK\n\b\r\b\16\bL\3\b\3\b\3\t\6\tR\n\t\r"+
		"\t\16\tS\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13`\n\13\r\13\16"+
		"\13a\3\f\3\f\6\ff\n\f\r\f\16\fg\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\3\16\3"+
		"\16\7\16s\n\16\f\16\16\16v\13\16\3\17\6\17y\n\17\r\17\16\17z\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\t\3\2\62;"+
		"\4\2\62;ch\5\2//\62;c|\3\2c|\3\2C\\\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13;\3\2\2\2\rB\3\2"+
		"\2\2\17J\3\2\2\2\21Q\3\2\2\2\23U\3\2\2\2\25]\3\2\2\2\27c\3\2\2\2\31i\3"+
		"\2\2\2\33p\3\2\2\2\35x\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2"+
		"\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c"+
		"\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\4\3\2\2\2\62\63\7]\2\2\63\6\3\2\2"+
		"\2\64\65\7_\2\2\65\b\3\2\2\2\66\67\7V\2\2\678\7T\2\289\7W\2\29:\7G\2\2"+
		":\n\3\2\2\2;<\7H\2\2<=\7C\2\2=>\7N\2\2>?\7U\2\2?@\7G\2\2@\f\3\2\2\2AC"+
		"\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7r\2\2GH"+
		"\7z\2\2H\16\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"MN\3\2\2\2NO\7\'\2\2O\20\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2T\22\3\2\2\2UV\7%\2\2VW\t\3\2\2WX\t\3\2\2XY\t\3\2\2YZ\t\3"+
		"\2\2Z[\t\3\2\2[\\\t\3\2\2\\\24\3\2\2\2]_\7%\2\2^`\t\4\2\2_^\3\2\2\2`a"+
		"\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\26\3\2\2\2ce\7\60\2\2df\t\4\2\2ed\3\2\2"+
		"\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\30\3\2\2\2im\t\5\2\2jl\t\4\2\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\32\3\2\2\2om\3\2\2\2pt\t\6\2\2qs\t"+
		"\7\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\34\3\2\2\2vt\3\2\2\2w"+
		"y\t\b\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\17\2\2"+
		"}\36\3\2\2\2~\177\7}\2\2\177 \3\2\2\2\u0080\u0081\7\177\2\2\u0081\"\3"+
		"\2\2\2\u0082\u0083\7=\2\2\u0083$\3\2\2\2\u0084\u0085\7<\2\2\u0085&\3\2"+
		"\2\2\u0086\u0087\7-\2\2\u0087(\3\2\2\2\u0088\u0089\7/\2\2\u0089*\3\2\2"+
		"\2\u008a\u008b\7,\2\2\u008b,\3\2\2\2\u008c\u008d\7<\2\2\u008d\u008e\7"+
		"?\2\2\u008e.\3\2\2\2\13\2DLSagmtz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}