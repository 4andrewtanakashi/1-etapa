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
		FOLDERPAC=1, LIB=2, DEFCLASS=3, ABS=4, EXT=5, PRI=6, PRO=7, PUB=8, CLA=9, 
		THIS=10, NEW=11, NUL=12, IMP=13, PAC=14, RET=15, SUP=16, IF=17, WHI=18, 
		ELS=19, INS=20, INT=21, CHA=22, VOI=23, BOO=24, STA=25, FAL=26, TRU=27, 
		VET=28, Var=29, NumR=30, Atrib=31, AtrArit=32, OpBool=33, OpUni=34, OpArit=35, 
		VOP=36, VCL=37, KOP=38, KCL=39, AP=40, FP=41, Str=42, EndL=43, PTR=44, 
		COMA=45, NEWLINE=46, WS=47, Comment=48, LOWW=49, UPPW=50, Numl=51, TYPES=52, 
		WORD=53, MODV=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FOLDERPAC", "LIB", "DEFCLASS", "ABS", "EXT", "PRI", "PRO", "PUB", "CLA", 
			"THIS", "NEW", "NUL", "IMP", "PAC", "RET", "SUP", "IF", "WHI", "ELS", 
			"INS", "INT", "CHA", "VOI", "BOO", "STA", "FAL", "TRU", "VET", "Var", 
			"NumR", "Atrib", "AtrArit", "OpBool", "OpUni", "OpArit", "VOP", "VCL", 
			"KOP", "KCL", "AP", "FP", "Str", "EndL", "PTR", "COMA", "NEWLINE", "WS", 
			"Comment", "LOWW", "UPPW", "Numl", "TYPES", "WORD", "MODV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'abstract'", "'extends'", "'private'", "'protected'", 
			"'public'", "'class'", "'this'", "'new'", "'null'", "'import'", "'package'", 
			"'return'", "'super'", "'if'", "'while'", "'else'", "'instanceof'", "'int'", 
			"'char'", "'void'", "'boolean'", "'static'", "'false'", "'true'", null, 
			null, null, "'='", "'+='", null, null, null, "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, "';'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOLDERPAC", "LIB", "DEFCLASS", "ABS", "EXT", "PRI", "PRO", "PUB", 
			"CLA", "THIS", "NEW", "NUL", "IMP", "PAC", "RET", "SUP", "IF", "WHI", 
			"ELS", "INS", "INT", "CHA", "VOI", "BOO", "STA", "FAL", "TRU", "VET", 
			"Var", "NumR", "Atrib", "AtrArit", "OpBool", "OpUni", "OpArit", "VOP", 
			"VCL", "KOP", "KCL", "AP", "FP", "Str", "EndL", "PTR", "COMA", "NEWLINE", 
			"WS", "Comment", "LOWW", "UPPW", "Numl", "TYPES", "WORD", "MODV"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\5\2s\n\2\3\2\6\2v\n\2\r"+
		"\2\16\2w\3\3\3\3\3\3\3\3\3\3\6\3\177\n\3\r\3\16\3\u0080\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0125\n\35\f\35\16\35\u0128\13"+
		"\35\3\35\3\35\3\35\3\35\7\35\u012e\n\35\f\35\16\35\u0131\13\35\3\35\3"+
		"\35\5\35\u0135\n\35\3\36\3\36\3\36\3\36\7\36\u013b\n\36\f\36\16\36\u013e"+
		"\13\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0150\n\"\3#\3#\3#\3#\3#\5#\u0157\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\7+\u0169\n+\f+\16+\u016c\13+\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\5/\u0177\n/\3/\3/\6/\u017b\n/\r/\16/\u017c\3\60\6\60\u0180\n"+
		"\60\r\60\16\60\u0181\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u018a\n\61\f\61"+
		"\16\61\u018d\13\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01a5"+
		"\n\65\3\66\3\66\6\66\u01a9\n\66\r\66\16\66\u01aa\3\67\3\67\3\67\5\67\u01b0"+
		"\n\67\3\u0126\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8\3\2\6\4\2,-//\4\2$$^^\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\3o\3\2\2\2\5y\3\2\2\2\7\u0082\3\2\2\2\t\u0086\3\2\2\2\13\u008f"+
		"\3\2\2\2\r\u0097\3\2\2\2\17\u009f\3\2\2\2\21\u00a9\3\2\2\2\23\u00b0\3"+
		"\2\2\2\25\u00b6\3\2\2\2\27\u00bb\3\2\2\2\31\u00bf\3\2\2\2\33\u00c4\3\2"+
		"\2\2\35\u00cb\3\2\2\2\37\u00d3\3\2\2\2!\u00da\3\2\2\2#\u00e0\3\2\2\2%"+
		"\u00e3\3\2\2\2\'\u00e9\3\2\2\2)\u00ee\3\2\2\2+\u00f9\3\2\2\2-\u00fd\3"+
		"\2\2\2/\u0102\3\2\2\2\61\u0107\3\2\2\2\63\u010f\3\2\2\2\65\u0116\3\2\2"+
		"\2\67\u011c\3\2\2\29\u0121\3\2\2\2;\u0136\3\2\2\2=\u013f\3\2\2\2?\u0143"+
		"\3\2\2\2A\u0145\3\2\2\2C\u014f\3\2\2\2E\u0156\3\2\2\2G\u0158\3\2\2\2I"+
		"\u015a\3\2\2\2K\u015c\3\2\2\2M\u015e\3\2\2\2O\u0160\3\2\2\2Q\u0162\3\2"+
		"\2\2S\u0164\3\2\2\2U\u0166\3\2\2\2W\u016f\3\2\2\2Y\u0171\3\2\2\2[\u0173"+
		"\3\2\2\2]\u017a\3\2\2\2_\u017f\3\2\2\2a\u0185\3\2\2\2c\u0190\3\2\2\2e"+
		"\u0192\3\2\2\2g\u0194\3\2\2\2i\u01a4\3\2\2\2k\u01a8\3\2\2\2m\u01af\3\2"+
		"\2\2ou\5\35\17\2pr\5k\66\2qs\5Y-\2rq\3\2\2\2rs\3\2\2\2sv\3\2\2\2tv\5k"+
		"\66\2up\3\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\4\3\2\2\2y~\5"+
		"\33\16\2z{\5k\66\2{|\5Y-\2|\177\3\2\2\2}\177\5k\66\2~z\3\2\2\2~}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\6\3\2\2"+
		"\2\u0082\u0083\5m\67\2\u0083\u0084\5\23\n\2\u0084\u0085\5;\36\2\u0085"+
		"\b\3\2\2\2\u0086\u0087\7c\2\2\u0087\u0088\7d\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7c\2\2\u008c\u008d\7e\2\2"+
		"\u008d\u008e\7v\2\2\u008e\n\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7z"+
		"\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2\u0094\u0095"+
		"\7f\2\2\u0095\u0096\7u\2\2\u0096\f\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7x\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\16\3\2\2\2\u009f\u00a0\7r\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7e\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7f\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac"+
		"\7d\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\22\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7u\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7u\2\2\u00ba\26\3\2\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7y\2\2\u00be\30\3\2\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\32\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7"+
		"r\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7v\2\2\u00ca\34"+
		"\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7m\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7i\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2\36\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7"+
		"v\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7p\2\2\u00d9 "+
		"\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7r\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7h\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7j\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8&\3\2\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed(\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7u\2"+
		"\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7e\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7h\2\2\u00f8"+
		"*\3\2\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		",\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7c\2\2\u0100"+
		"\u0101\7t\2\2\u0101.\3\2\2\2\u0102\u0103\7x\2\2\u0103\u0104\7q\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7f\2\2\u0106\60\3\2\2\2\u0107\u0108\7d\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010a\7q\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2"+
		"\u010c\u010d\7c\2\2\u010d\u010e\7p\2\2\u010e\62\3\2\2\2\u010f\u0110\7"+
		"u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7e\2\2\u0115\64\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118"+
		"\7c\2\2\u0118\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b"+
		"\66\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7w\2\2\u011f"+
		"\u0120\7g\2\2\u01208\3\2\2\2\u0121\u0134\5;\36\2\u0122\u0126\5I%\2\u0123"+
		"\u0125\5g\64\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\5K&\2\u012a\u0135\3\2\2\2\u012b\u012f\5I%\2\u012c\u012e\5g\64\2"+
		"\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5K&\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0122\3\2\2\2\u0134\u012b\3\2\2\2\u0135:\3\2\2\2"+
		"\u0136\u013c\5k\66\2\u0137\u013b\5g\64\2\u0138\u013b\7a\2\2\u0139\u013b"+
		"\5k\66\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d<\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\5g\64\2\u0140\u0141\7\60\2\2\u0141\u0142"+
		"\5g\64\2\u0142>\3\2\2\2\u0143\u0144\7?\2\2\u0144@\3\2\2\2\u0145\u0146"+
		"\7-\2\2\u0146\u0147\7?\2\2\u0147B\3\2\2\2\u0148\u0149\7?\2\2\u0149\u0150"+
		"\7?\2\2\u014a\u0150\7@\2\2\u014b\u014c\7(\2\2\u014c\u0150\7(\2\2\u014d"+
		"\u014e\7>\2\2\u014e\u0150\7?\2\2\u014f\u0148\3\2\2\2\u014f\u014a\3\2\2"+
		"\2\u014f\u014b\3\2\2\2\u014f\u014d\3\2\2\2\u0150D\3\2\2\2\u0151\u0157"+
		"\7#\2\2\u0152\u0153\7-\2\2\u0153\u0157\7-\2\2\u0154\u0155\7/\2\2\u0155"+
		"\u0157\7/\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157F\3\2\2\2\u0158\u0159\t\2\2\2\u0159H\3\2\2\2\u015a\u015b\7]"+
		"\2\2\u015bJ\3\2\2\2\u015c\u015d\7_\2\2\u015dL\3\2\2\2\u015e\u015f\7}\2"+
		"\2\u015fN\3\2\2\2\u0160\u0161\7\177\2\2\u0161P\3\2\2\2\u0162\u0163\7*"+
		"\2\2\u0163R\3\2\2\2\u0164\u0165\7+\2\2\u0165T\3\2\2\2\u0166\u016a\7$\2"+
		"\2\u0167\u0169\n\3\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\7$\2\2\u016eV\3\2\2\2\u016f\u0170\7=\2\2\u0170X\3\2\2\2\u0171\u0172"+
		"\7\60\2\2\u0172Z\3\2\2\2\u0173\u0174\7.\2\2\u0174\\\3\2\2\2\u0175\u0177"+
		"\7\17\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2"+
		"\u0178\u017b\7\f\2\2\u0179\u017b\7\17\2\2\u017a\u0176\3\2\2\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"^\3\2\2\2\u017e\u0180\t\4\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2"+
		"\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\b\60\2\2\u0184`\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\7\61\2\2\u0187"+
		"\u018b\3\2\2\2\u0188\u018a\n\5\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\b\61\2\2\u018fb\3\2\2\2\u0190\u0191\4c|\2\u0191"+
		"d\3\2\2\2\u0192\u0193\4C\\\2\u0193f\3\2\2\2\u0194\u0195\4\62;\2\u0195"+
		"h\3\2\2\2\u0196\u0197\7k\2\2\u0197\u0198\7p\2\2\u0198\u01a5\7v\2\2\u0199"+
		"\u019a\7e\2\2\u019a\u019b\7j\2\2\u019b\u019c\7c\2\2\u019c\u01a5\7t\2\2"+
		"\u019d\u019e\7d\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1"+
		"\7n\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a5\7p\2\2\u01a4"+
		"\u0196\3\2\2\2\u01a4\u0199\3\2\2\2\u01a4\u019d\3\2\2\2\u01a5j\3\2\2\2"+
		"\u01a6\u01a9\5c\62\2\u01a7\u01a9\5e\63\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"l\3\2\2\2\u01ac\u01b0\5\r\7\2\u01ad\u01b0\5\21\t\2\u01ae\u01b0\5\17\b"+
		"\2\u01af\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0n"+
		"\3\2\2\2\31\2ruw~\u0080\u0126\u012f\u0134\u013a\u013c\u014f\u0156\u016a"+
		"\u0176\u017a\u017c\u0181\u018b\u01a4\u01a8\u01aa\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}