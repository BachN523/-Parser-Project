// Generated from D:/System/Pi Cloud/Documents/CodeMan/parser/parser/src/main/antlr/Python.g4 by ANTLR 4.13.2
package main.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFIER=16, 
		NUMBER=17, STRING=18, COMMENT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "IDENTIFIER", "NUMBER", 
			"STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'-='", "'*='", "'/='", "'('", "')'", "'['", "']'", 
			"','", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "NUMBER", "STRING", "COMMENT", 
			"WS"
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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

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
		"\u0004\u0000\u0014\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000fN\b\u000f\n\u000f\f\u000fQ\t\u000f\u0001\u0010\u0004"+
		"\u0010T\b\u0010\u000b\u0010\f\u0010U\u0001\u0010\u0001\u0010\u0004\u0010"+
		"Z\b\u0010\u000b\u0010\f\u0010[\u0003\u0010^\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011b\b\u0011\n\u0011\f\u0011e\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011j\b\u0011\n\u0011\f\u0011m\t\u0011\u0001"+
		"\u0011\u0003\u0011p\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012t\b\u0012"+
		"\n\u0012\f\u0012w\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013"+
		"|\b\u0013\u000b\u0013\f\u0013}\u0001\u0013\u0001\u0013\u0002ck\u0000\u0014"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0005"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\n\n\r"+
		"\r\u0003\u0000\t\n\r\r  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005."+
		"\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t4\u0001\u0000"+
		"\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?"+
		"\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017C\u0001\u0000"+
		"\u0000\u0000\u0019E\u0001\u0000\u0000\u0000\u001bG\u0001\u0000\u0000\u0000"+
		"\u001dI\u0001\u0000\u0000\u0000\u001fK\u0001\u0000\u0000\u0000!S\u0001"+
		"\u0000\u0000\u0000#o\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000\u0000"+
		"\'{\u0001\u0000\u0000\u0000)*\u0005=\u0000\u0000*\u0002\u0001\u0000\u0000"+
		"\u0000+,\u0005+\u0000\u0000,-\u0005=\u0000\u0000-\u0004\u0001\u0000\u0000"+
		"\u0000./\u0005-\u0000\u0000/0\u0005=\u0000\u00000\u0006\u0001\u0000\u0000"+
		"\u000012\u0005*\u0000\u000023\u0005=\u0000\u00003\b\u0001\u0000\u0000"+
		"\u000045\u0005/\u0000\u000056\u0005=\u0000\u00006\n\u0001\u0000\u0000"+
		"\u000078\u0005(\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005)\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005[\u0000\u0000<\u0010\u0001"+
		"\u0000\u0000\u0000=>\u0005]\u0000\u0000>\u0012\u0001\u0000\u0000\u0000"+
		"?@\u0005,\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005+\u0000\u0000"+
		"B\u0016\u0001\u0000\u0000\u0000CD\u0005-\u0000\u0000D\u0018\u0001\u0000"+
		"\u0000\u0000EF\u0005*\u0000\u0000F\u001a\u0001\u0000\u0000\u0000GH\u0005"+
		"/\u0000\u0000H\u001c\u0001\u0000\u0000\u0000IJ\u0005%\u0000\u0000J\u001e"+
		"\u0001\u0000\u0000\u0000KO\u0007\u0000\u0000\u0000LN\u0007\u0001\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P \u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V]\u0001\u0000\u0000\u0000WY\u0005.\u0000\u0000XZ\u0007\u0002\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]W\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\"\u0001\u0000\u0000\u0000"+
		"_c\u0005\"\u0000\u0000`b\t\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fp\u0005\"\u0000"+
		"\u0000gk\u0005\'\u0000\u0000hj\t\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005"+
		"\'\u0000\u0000o_\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000p$\u0001"+
		"\u0000\u0000\u0000qu\u0005#\u0000\u0000rt\b\u0003\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000xy\u0006\u0012\u0000\u0000y&\u0001\u0000\u0000\u0000z|\u0007\u0004"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\u0013\u0000\u0000\u0080(\u0001\u0000\u0000\u0000"+
		"\n\u0000OU[]ckou}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}