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
public class Python extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IDENTIFIER=2, NUMBER=3, STRING=4, COMMENT=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IDENTIFIER", "NUMBER", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IDENTIFIER", "NUMBER", "STRING", "COMMENT", "WS"
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


	public Python(CharStream input) {
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
		"\u0004\u0000\u0006:\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001"+
		"\u0002\u0004\u0002\u0018\b\u0002\u000b\u0002\f\u0002\u0019\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u001e\b\u0002\u000b\u0002\f\u0002\u001f\u0003"+
		"\u0002\"\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003&\b\u0003\n\u0003"+
		"\f\u0003)\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004/\b\u0004\n\u0004\f\u00042\t\u0004\u0001\u0005\u0004\u00055\b\u0005"+
		"\u000b\u0005\f\u00056\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000"+
		"\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0001\u0000"+
		"\"\"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  @\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0001\r\u0001\u0000\u0000\u0000"+
		"\u0003\u000f\u0001\u0000\u0000\u0000\u0005\u0017\u0001\u0000\u0000\u0000"+
		"\u0007#\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b4\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0005=\u0000\u0000\u000e\u0002\u0001\u0000"+
		"\u0000\u0000\u000f\u0013\u0007\u0000\u0000\u0000\u0010\u0012\u0007\u0001"+
		"\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000"+
		"\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\u0007\u0002\u0000\u0000\u0017\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a!\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0005.\u0000\u0000\u001c\u001e\u0007\u0002\u0000\u0000"+
		"\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \""+
		"\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#\'\u0005\"\u0000\u0000$&"+
		"\b\u0003\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\"\u0000\u0000+\b\u0001\u0000"+
		"\u0000\u0000,0\u0005#\u0000\u0000-/\b\u0004\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001\n\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"35\u0007\u0005\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0006\u0005\u0000\u00009\f\u0001\u0000\u0000\u0000\b\u0000"+
		"\u0013\u0019\u001f!\'06\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}