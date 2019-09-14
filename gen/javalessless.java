// Generated from /home/shi/Documents/compiladores/trabalho_pratico/1-tp/src/main/java/javalessless.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javalessless extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABS=1, EXT=2, PRI=3, PRO=4, PUB=5, CLA=6, THIS=7, NEW=8, NUL=9, IMP=10, 
		PAC=11, RET=12, SUP=13, IF=14, WHI=15, ELS=16, INS=17, INT=18, CHA=19, 
		VOI=20, BOO=21, STA=22, FAL=23, TRU=24, Var=25, NumR=26, Atrib=27, AtrArit=28, 
		OpBool=29, OpUni=30, OpArit=31, VOP=32, VCL=33, KOP=34, KCL=35, AP=36, 
		FP=37, Str=38, EndL=39, PTR=40, COMA=41, NEWLINE=42, WS=43, Comment=44, 
		LOWW=45, UPPW=46, Numl=47, NNuml=48, TYPES=49, WORD=50, MODV=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", "IMP", 
			"PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", "VOI", 
			"BOO", "STA", "FAL", "TRU", "Var", "NumR", "Atrib", "AtrArit", "OpBool", 
			"OpUni", "OpArit", "VOP", "VCL", "KOP", "KCL", "AP", "FP", "Str", "EndL", 
			"PTR", "COMA", "NEWLINE", "WS", "Comment", "LOWW", "UPPW", "Numl", "NNuml", 
			"TYPES", "WORD", "MODV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'extends'", "'private'", "'protected'", "'public'", 
			"'class'", "'this'", "'new'", "'null'", "'import'", "'package'", "'return'", 
			"'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", "'char'", 
			"'void'", "'boolean'", "'static'", "'false'", "'true'", null, null, "'='", 
			"'+='", null, null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", null, 
			"';'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABS", "EXT", "PRI", "PRO", "PUB", "CLA", "THIS", "NEW", "NUL", 
			"IMP", "PAC", "RET", "SUP", "IF", "WHI", "ELS", "INS", "INT", "CHA", 
			"VOI", "BOO", "STA", "FAL", "TRU", "Var", "NumR", "Atrib", "AtrArit", 
			"OpBool", "OpUni", "OpArit", "VOP", "VCL", "KOP", "KCL", "AP", "FP", 
			"Str", "EndL", "PTR", "COMA", "NEWLINE", "WS", "Comment", "LOWW", "UPPW", 
			"Numl", "NNuml", "TYPES", "WORD", "MODV"
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


	public javalessless(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "javalessless.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0188\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u0109\n\32\f\32\16\32\u010c\13\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0124\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u012b\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\7\'\u013d\n\'\f\'\16\'\u0140\13\'\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\5+\u014b\n+\3+\3+\6+\u014f\n+\r+\16+\u0150\3,\6,\u0154\n,\r,\16,\u0155"+
		"\3,\3,\3-\3-\3-\3-\7-\u015e\n-\f-\16-\u0161\13-\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u017c\n\62\3\63\3\63\6\63\u0180\n\63\r\63\16"+
		"\63\u0181\3\64\3\64\3\64\5\64\u0187\n\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\6\4\2,-//\4\2$$^^\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\2\u019c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3"+
		"i\3\2\2\2\5r\3\2\2\2\7z\3\2\2\2\t\u0082\3\2\2\2\13\u008c\3\2\2\2\r\u0093"+
		"\3\2\2\2\17\u0099\3\2\2\2\21\u009e\3\2\2\2\23\u00a2\3\2\2\2\25\u00a7\3"+
		"\2\2\2\27\u00ae\3\2\2\2\31\u00b6\3\2\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00c6\3\2\2\2!\u00cc\3\2\2\2#\u00d1\3\2\2\2%\u00dc\3\2\2\2\'\u00e0"+
		"\3\2\2\2)\u00e5\3\2\2\2+\u00ea\3\2\2\2-\u00f2\3\2\2\2/\u00f9\3\2\2\2\61"+
		"\u00ff\3\2\2\2\63\u0104\3\2\2\2\65\u0115\3\2\2\2\67\u0117\3\2\2\29\u0119"+
		"\3\2\2\2;\u0123\3\2\2\2=\u012a\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C"+
		"\u0130\3\2\2\2E\u0132\3\2\2\2G\u0134\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2"+
		"\2\2M\u013a\3\2\2\2O\u0143\3\2\2\2Q\u0145\3\2\2\2S\u0147\3\2\2\2U\u014e"+
		"\3\2\2\2W\u0153\3\2\2\2Y\u0159\3\2\2\2[\u0164\3\2\2\2]\u0166\3\2\2\2_"+
		"\u0168\3\2\2\2a\u016a\3\2\2\2c\u017b\3\2\2\2e\u017f\3\2\2\2g\u0186\3\2"+
		"\2\2ij\7c\2\2jk\7d\2\2kl\7u\2\2lm\7v\2\2mn\7t\2\2no\7c\2\2op\7e\2\2pq"+
		"\7v\2\2q\4\3\2\2\2rs\7g\2\2st\7z\2\2tu\7v\2\2uv\7g\2\2vw\7p\2\2wx\7f\2"+
		"\2xy\7u\2\2y\6\3\2\2\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7x\2\2~\177\7c\2\2"+
		"\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081\b\3\2\2\2\u0082\u0083\7r\2"+
		"\2\u0083\u0084\7t\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7e\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7f\2\2\u008b\n\3\2\2\2\u008c\u008d\7r\2\2\u008d\u008e\7w\2\2\u008e"+
		"\u008f\7d\2\2\u008f\u0090\7n\2\2\u0090\u0091\7k\2\2\u0091\u0092\7e\2\2"+
		"\u0092\f\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c"+
		"\2\2\u0096\u0097\7u\2\2\u0097\u0098\7u\2\2\u0098\16\3\2\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7u\2\2\u009d"+
		"\20\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7y\2\2\u00a1"+
		"\22\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\26\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7"+
		"e\2\2\u00b1\u00b2\7m\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\32\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7r\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7t\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7y\2\2\u00c7\u00c8\7j\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb \3\2\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\"\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7u"+
		"\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7e\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7h\2\2\u00db"+
		"$\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df"+
		"&\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7k\2\2\u00e8\u00e9\7f\2\2\u00e9*\3\2\2\2\u00ea\u00eb\7d\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7u\2"+
		"\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\7k\2\2\u00f7\u00f8\7e\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb"+
		"\7c\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\60\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101\u0102\7w\2\2\u0102"+
		"\u0103\7g\2\2\u0103\62\3\2\2\2\u0104\u010a\5e\63\2\u0105\u0109\5_\60\2"+
		"\u0106\u0109\7a\2\2\u0107\u0109\5e\63\2\u0108\u0105\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\64\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5_\60"+
		"\2\u010e\u010f\7\60\2\2\u010f\u0110\5_\60\2\u0110\u0116\3\2\2\2\u0111"+
		"\u0112\5a\61\2\u0112\u0113\7\60\2\2\u0113\u0114\5_\60\2\u0114\u0116\3"+
		"\2\2\2\u0115\u010d\3\2\2\2\u0115\u0111\3\2\2\2\u0116\66\3\2\2\2\u0117"+
		"\u0118\7?\2\2\u01188\3\2\2\2\u0119\u011a\7-\2\2\u011a\u011b\7?\2\2\u011b"+
		":\3\2\2\2\u011c\u011d\7?\2\2\u011d\u0124\7?\2\2\u011e\u0124\7@\2\2\u011f"+
		"\u0120\7(\2\2\u0120\u0124\7(\2\2\u0121\u0122\7>\2\2\u0122\u0124\7?\2\2"+
		"\u0123\u011c\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124<\3\2\2\2\u0125\u012b\7#\2\2\u0126\u0127\7-\2\2\u0127\u012b"+
		"\7-\2\2\u0128\u0129\7/\2\2\u0129\u012b\7/\2\2\u012a\u0125\3\2\2\2\u012a"+
		"\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b>\3\2\2\2\u012c\u012d\t\2\2\2"+
		"\u012d@\3\2\2\2\u012e\u012f\7]\2\2\u012fB\3\2\2\2\u0130\u0131\7_\2\2\u0131"+
		"D\3\2\2\2\u0132\u0133\7}\2\2\u0133F\3\2\2\2\u0134\u0135\7\177\2\2\u0135"+
		"H\3\2\2\2\u0136\u0137\7*\2\2\u0137J\3\2\2\2\u0138\u0139\7+\2\2\u0139L"+
		"\3\2\2\2\u013a\u013e\7$\2\2\u013b\u013d\n\3\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7$\2\2\u0142N\3\2\2\2\u0143\u0144"+
		"\7=\2\2\u0144P\3\2\2\2\u0145\u0146\7\60\2\2\u0146R\3\2\2\2\u0147\u0148"+
		"\7.\2\2\u0148T\3\2\2\2\u0149\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\7\f\2\2\u014d\u014f\7\17"+
		"\2\2\u014e\u014a\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151V\3\2\2\2\u0152\u0154\t\4\2\2"+
		"\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b,\2\2\u0158X\3\2\2\2\u0159\u015a"+
		"\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c\u015e\n\5\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b-\2\2\u0163"+
		"Z\3\2\2\2\u0164\u0165\4c|\2\u0165\\\3\2\2\2\u0166\u0167\4C\\\2\u0167^"+
		"\3\2\2\2\u0168\u0169\4\62;\2\u0169`\3\2\2\2\u016a\u016b\7/\2\2\u016b\u016c"+
		"\5_\60\2\u016cb\3\2\2\2\u016d\u016e\7k\2\2\u016e\u016f\7p\2\2\u016f\u017c"+
		"\7v\2\2\u0170\u0171\7e\2\2\u0171\u0172\7j\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u017c\7t\2\2\u0174\u0175\7d\2\2\u0175\u0176\7q\2\2\u0176\u0177\7q\2\2"+
		"\u0177\u0178\7n\2\2\u0178\u0179\7g\2\2\u0179\u017a\7c\2\2\u017a\u017c"+
		"\7p\2\2\u017b\u016d\3\2\2\2\u017b\u0170\3\2\2\2\u017b\u0174\3\2\2\2\u017c"+
		"d\3\2\2\2\u017d\u0180\5[.\2\u017e\u0180\5]/\2\u017f\u017d\3\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182f\3\2\2\2\u0183\u0187\5\7\4\2\u0184\u0187\5\13\6\2\u0185\u0187"+
		"\5\t\5\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"h\3\2\2\2\22\2\u0108\u010a\u0115\u0123\u012a\u013e\u014a\u014e\u0150\u0155"+
		"\u015f\u017b\u017f\u0181\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}