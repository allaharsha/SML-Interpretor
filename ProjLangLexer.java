// $ANTLR null C:\\Users\\harsha\\Desktop\\ProjLang.g 2017-12-04 23:35:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int Addop=4;
	public static final int Equal=5;
	public static final int ID=6;
	public static final int Mulop=7;
	public static final int Num=8;
	public static final int Relop=9;
	public static final int WS=10;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\harsha\\Desktop\\ProjLang.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:2:7: ( '!' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:2:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:3:7: ( '(' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:4:7: ( ')' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:5:7: ( ':=' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:5:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:6:7: ( ';' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:6:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:7:7: ( 'do' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:7:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:8:7: ( 'else' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:8:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:9:7: ( 'end' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:9:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:10:7: ( 'false' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:10:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:11:7: ( 'fun' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:11:9: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:12:7: ( 'if' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:12:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:13:7: ( 'in' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:13:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:14:7: ( 'let' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:14:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:15:7: ( 'then' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:15:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:16:7: ( 'true' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:16:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:17:7: ( 'val' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:17:9: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:18:7: ( 'while' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:18:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:19:7: ( '{' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:19:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:20:7: ( '}' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:20:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:3:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:3:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:3:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "Num"
	public final void mNum() throws RecognitionException {
		try {
			int _type = Num;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:6:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:6:7: ( '0' .. '9' )+
			{
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:6:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Num"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:9:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:9:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "Mulop"
	public final void mMulop() throws RecognitionException {
		try {
			int _type = Mulop;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:16:7: ( '*' | '/' | '&' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Mulop"

	// $ANTLR start "Relop"
	public final void mRelop() throws RecognitionException {
		try {
			int _type = Relop;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:19:7: ( '<' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Relop"

	// $ANTLR start "Equal"
	public final void mEqual() throws RecognitionException {
		try {
			int _type = Equal;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:20:7: ( '=' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:20:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equal"

	// $ANTLR start "Addop"
	public final void mAddop() throws RecognitionException {
		try {
			int _type = Addop;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:21:7: ( '+' | '-' | '|' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Addop"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | ID | Num | WS | Mulop | Relop | Equal | Addop )
		int alt3=26;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:76: T__22
				{
				mT__22(); 

				}
				break;
			case 13 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:82: T__23
				{
				mT__23(); 

				}
				break;
			case 14 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:88: T__24
				{
				mT__24(); 

				}
				break;
			case 15 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:94: T__25
				{
				mT__25(); 

				}
				break;
			case 16 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:100: T__26
				{
				mT__26(); 

				}
				break;
			case 17 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:106: T__27
				{
				mT__27(); 

				}
				break;
			case 18 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:112: T__28
				{
				mT__28(); 

				}
				break;
			case 19 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:118: T__29
				{
				mT__29(); 

				}
				break;
			case 20 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:124: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:127: Num
				{
				mNum(); 

				}
				break;
			case 22 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:131: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:134: Mulop
				{
				mMulop(); 

				}
				break;
			case 24 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:140: Relop
				{
				mRelop(); 

				}
				break;
			case 25 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:146: Equal
				{
				mEqual(); 

				}
				break;
			case 26 :
				// C:\\Users\\harsha\\Desktop\\ProjLang.g:1:152: Addop
				{
				mAddop(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\6\uffff\10\20\11\uffff\1\43\4\20\1\50\1\51\5\20\1\uffff\1\20\1\60\1\20"+
		"\1\62\2\uffff\1\63\2\20\1\66\1\20\1\70\1\uffff\1\20\2\uffff\1\72\1\73"+
		"\1\uffff\1\20\1\uffff\1\75\2\uffff\1\76\2\uffff";
	static final String DFA3_eofS =
		"\77\uffff";
	static final String DFA3_minS =
		"\1\11\5\uffff\1\157\1\154\1\141\1\146\1\145\1\150\1\141\1\150\11\uffff"+
		"\1\60\1\163\1\144\1\154\1\156\2\60\1\164\1\145\1\165\1\154\1\151\1\uffff"+
		"\1\145\1\60\1\163\1\60\2\uffff\1\60\1\156\1\145\1\60\1\154\1\60\1\uffff"+
		"\1\145\2\uffff\2\60\1\uffff\1\145\1\uffff\1\60\2\uffff\1\60\2\uffff";
	static final String DFA3_maxS =
		"\1\175\5\uffff\1\157\1\156\1\165\1\156\1\145\1\162\1\141\1\150\11\uffff"+
		"\1\172\1\163\1\144\1\154\1\156\2\172\1\164\1\145\1\165\1\154\1\151\1\uffff"+
		"\1\145\1\172\1\163\1\172\2\uffff\1\172\1\156\1\145\1\172\1\154\1\172\1"+
		"\uffff\1\145\2\uffff\2\172\1\uffff\1\145\1\uffff\1\172\2\uffff\1\172\2"+
		"\uffff";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\10\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1"+
		"\30\1\31\1\32\14\uffff\1\6\4\uffff\1\13\1\14\6\uffff\1\10\1\uffff\1\12"+
		"\1\15\2\uffff\1\20\1\uffff\1\7\1\uffff\1\16\1\17\1\uffff\1\11\1\21";
	static final String DFA3_specialS =
		"\77\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\1\1\4\uffff\1\23\1\uffff\1\2\1\3\1\23"+
			"\1\26\1\uffff\1\26\1\uffff\1\23\12\21\1\4\1\5\1\24\1\25\3\uffff\32\20"+
			"\4\uffff\1\20\1\uffff\3\20\1\6\1\7\1\10\2\20\1\11\2\20\1\12\7\20\1\13"+
			"\1\20\1\14\1\15\3\20\1\16\1\26\1\17",
			"",
			"",
			"",
			"",
			"",
			"\1\27",
			"\1\30\1\uffff\1\31",
			"\1\32\23\uffff\1\33",
			"\1\34\7\uffff\1\35",
			"\1\36",
			"\1\37\11\uffff\1\40",
			"\1\41",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"\1\57",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\1\61",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"",
			"",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\1\64",
			"\1\65",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\1\67",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"",
			"\1\71",
			"",
			"",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"",
			"\1\74",
			"",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"",
			"",
			"\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | ID | Num | WS | Mulop | Relop | Equal | Addop );";
		}
	}

}
