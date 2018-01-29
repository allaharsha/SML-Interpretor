// $ANTLR null C:\\Users\\harsha\\Desktop\\ProjLang.g 2017-12-04 23:35:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "Equal", "ID", "Mulop", 
		"Num", "Relop", "WS", "'!'", "'('", "')'", "':='", "';'", "'do'", "'else'", 
		"'end'", "'false'", "'fun'", "'if'", "'in'", "'let'", "'then'", "'true'", 
		"'val'", "'while'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\harsha\\Desktop\\ProjLang.g"; }



	// $ANTLR start "factor"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:24:1: factor returns [Expr value] : (v20= Num | 'true' | 'false' |v21= ID |v21= ID '(' v22= expr ')' | '(' v23= expr ')' );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token v20=null;
		Token v21=null;
		Expr v22 =null;
		Expr v23 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:24:30: (v20= Num | 'true' | 'false' |v21= ID |v21= ID '(' v22= expr ')' | '(' v23= expr ')' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case Num:
				{
				alt1=1;
				}
				break;
			case 25:
				{
				alt1=2;
				}
				break;
			case 19:
				{
				alt1=3;
				}
				break;
			case ID:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==12) ) {
					alt1=5;
				}
				else if ( ((LA1_4 >= Addop && LA1_4 <= Equal)||LA1_4==Mulop||LA1_4==Relop||LA1_4==13||(LA1_4 >= 15 && LA1_4 <= 18)||LA1_4==22||LA1_4==24||LA1_4==29) ) {
					alt1=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 12:
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:24:33: v20= Num
					{
					v20=(Token)match(input,Num,FOLLOW_Num_in_factor187); 
					value = new IntConst(Integer.parseInt((v20!=null?v20.getText():null)));
					}
					break;
				case 2 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:25:8: 'true'
					{
					match(input,25,FOLLOW_25_in_factor199); 
					value = new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:26:9: 'false'
					{
					match(input,19,FOLLOW_19_in_factor212); 
					value = new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:27:9: v21= ID
					{
					v21=(Token)match(input,ID,FOLLOW_ID_in_factor228); 
					value = new Variable_Expr((v21!=null?v21.getText():null));
					}
					break;
				case 5 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:28:9: v21= ID '(' v22= expr ')'
					{
					v21=(Token)match(input,ID,FOLLOW_ID_in_factor244); 
					match(input,12,FOLLOW_12_in_factor246); 
					pushFollow(FOLLOW_expr_in_factor251);
					v22=expr();
					state._fsp--;

					value = new Fun_Dec((v21!=null?v21.getText():null),v22) ;
					match(input,13,FOLLOW_13_in_factor254); 
					}
					break;
				case 6 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:29:9: '(' v23= expr ')'
					{
					match(input,12,FOLLOW_12_in_factor265); 
					pushFollow(FOLLOW_expr_in_factor270);
					v23=expr();
					state._fsp--;

					value = v23;
					match(input,13,FOLLOW_13_in_factor274); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "factor"



	// $ANTLR start "relexpr"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:31:1: relexpr returns [Expr value] : v24= arithexpr (v25= ( Relop | Equal ) v26= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Token v25=null;
		Expr v24 =null;
		Expr v26 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:31:30: (v24= arithexpr (v25= ( Relop | Equal ) v26= arithexpr )? )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:31:33: v24= arithexpr (v25= ( Relop | Equal ) v26= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr291);
			v24=arithexpr();
			state._fsp--;

			value = v24;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:31:71: (v25= ( Relop | Equal ) v26= arithexpr )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Equal||LA2_0==Relop) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:31:72: v25= ( Relop | Equal ) v26= arithexpr
					{
					v25=input.LT(1);
					if ( input.LA(1)==Equal||input.LA(1)==Relop ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithexpr_in_relexpr309);
					v26=arithexpr();
					state._fsp--;


											if((v25!=null?v25.getText():null).equals("=")){
												value = new Binary_Expr(value,BinOp.EQ,v26);
												}
											else if((v25!=null?v25.getText():null).equals("<")){
												value = new Binary_Expr(value,BinOp.LT,v26);
												}
											
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "term"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:40:1: term returns [Expr value] : v29= factor (v30= Mulop v31= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Token v30=null;
		Expr v29 =null;
		Expr v31 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:40:27: (v29= factor (v30= Mulop v31= factor )* )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:40:30: v29= factor (v30= Mulop v31= factor )*
			{
			pushFollow(FOLLOW_factor_in_term329);
			v29=factor();
			state._fsp--;

			value = v29;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:40:66: (v30= Mulop v31= factor )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==Mulop) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:40:67: v30= Mulop v31= factor
					{
					v30=(Token)match(input,Mulop,FOLLOW_Mulop_in_term338); 
					pushFollow(FOLLOW_factor_in_term344);
					v31=factor();
					state._fsp--;


												if((v30!=null?v30.getText():null).equals("*")){
													value = new Binary_Expr(value,BinOp.TIMES,v31);
													}
												else if((v30!=null?v30.getText():null).equals("/")){
													value = new Binary_Expr(value,BinOp.DIV,v31);
													}
												else if((v30!=null?v30.getText():null).equals("&")){
													value = new Binary_Expr(value,BinOp.AND,v31);
													}
												
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "arithexpr"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:52:1: arithexpr returns [Expr value] : v27= term (v28= Addop v29= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Token v28=null;
		Expr v27 =null;
		Expr v29 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:52:33: (v27= term (v28= Addop v29= term )* )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:52:36: v27= term (v28= Addop v29= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr365);
			v27=term();
			state._fsp--;

			value = v27;
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:52:70: (v28= Addop v29= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Addop) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:52:71: v28= Addop v29= term
					{
					v28=(Token)match(input,Addop,FOLLOW_Addop_in_arithexpr374); 
					pushFollow(FOLLOW_term_in_arithexpr380);
					v29=term();
					state._fsp--;


											if((v28!=null?v28.getText():null).equals("-")){
												value = new Binary_Expr(value,BinOp.MINUS,v29);
												}
											else if((v28!=null?v28.getText():null).equals("+")){
												value = new Binary_Expr(value,BinOp.PLUS,v29);
												}
											else if((v28!=null?v28.getText():null).equals("|")){
												value = new Binary_Expr(value,BinOp.OR,v29);
												}						
											
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "expr"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:66:1: expr returns [Expr value] : ( 'if' v2= expr 'then' v3= expr 'else' v4= expr | 'let' 'val' v7= ID '=' v5= expr 'in' v6= expr 'end' | 'let' 'fun' v8= ID '(' v9= ID ')' '=' v10= expr 'in' v11= expr 'end' | 'while' v12= expr 'do' v13= expr | '{' v14= expr ( ';' v15= expr )* '}' | '!' v16= expr |v17= ID ':=' v18= expr |v19= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr value = null;


		Token v7=null;
		Token v8=null;
		Token v9=null;
		Token v17=null;
		Expr v2 =null;
		Expr v3 =null;
		Expr v4 =null;
		Expr v5 =null;
		Expr v6 =null;
		Expr v10 =null;
		Expr v11 =null;
		Expr v12 =null;
		Expr v13 =null;
		Expr v14 =null;
		Expr v15 =null;
		Expr v16 =null;
		Expr v18 =null;
		Expr v19 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:66:27: ( 'if' v2= expr 'then' v3= expr 'else' v4= expr | 'let' 'val' v7= ID '=' v5= expr 'in' v6= expr 'end' | 'let' 'fun' v8= ID '(' v9= ID ')' '=' v10= expr 'in' v11= expr 'end' | 'while' v12= expr 'do' v13= expr | '{' v14= expr ( ';' v15= expr )* '}' | '!' v16= expr |v17= ID ':=' v18= expr |v19= relexpr )
			int alt6=8;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt6=1;
				}
				break;
			case 23:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==26) ) {
					alt6=2;
				}
				else if ( (LA6_2==20) ) {
					alt6=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 27:
				{
				alt6=4;
				}
				break;
			case 28:
				{
				alt6=5;
				}
				break;
			case 11:
				{
				alt6=6;
				}
				break;
			case ID:
				{
				int LA6_6 = input.LA(2);
				if ( (LA6_6==14) ) {
					alt6=7;
				}
				else if ( ((LA6_6 >= Addop && LA6_6 <= Equal)||LA6_6==Mulop||LA6_6==Relop||(LA6_6 >= 12 && LA6_6 <= 13)||(LA6_6 >= 15 && LA6_6 <= 18)||LA6_6==22||LA6_6==24||LA6_6==29) ) {
					alt6=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Num:
			case 12:
			case 19:
			case 25:
				{
				alt6=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:66:30: 'if' v2= expr 'then' v3= expr 'else' v4= expr
					{
					match(input,21,FOLLOW_21_in_expr398); 
					pushFollow(FOLLOW_expr_in_expr404);
					v2=expr();
					state._fsp--;

					match(input,24,FOLLOW_24_in_expr406); 
					pushFollow(FOLLOW_expr_in_expr412);
					v3=expr();
					state._fsp--;

					match(input,17,FOLLOW_17_in_expr414); 
					pushFollow(FOLLOW_expr_in_expr420);
					v4=expr();
					state._fsp--;

					value = new If_Expr(v2,v3,v4);
					}
					break;
				case 2 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:67:5: 'let' 'val' v7= ID '=' v5= expr 'in' v6= expr 'end'
					{
					match(input,23,FOLLOW_23_in_expr428); 
					match(input,26,FOLLOW_26_in_expr430); 
					v7=(Token)match(input,ID,FOLLOW_ID_in_expr436); 
					match(input,Equal,FOLLOW_Equal_in_expr438); 
					pushFollow(FOLLOW_expr_in_expr444);
					v5=expr();
					state._fsp--;

					match(input,22,FOLLOW_22_in_expr446); 
					pushFollow(FOLLOW_expr_in_expr452);
					v6=expr();
					state._fsp--;

					match(input,18,FOLLOW_18_in_expr454); 
					value = new Let_Val_Expr((v7!=null?v7.getText():null),v5,v6);
					}
					break;
				case 3 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:68:5: 'let' 'fun' v8= ID '(' v9= ID ')' '=' v10= expr 'in' v11= expr 'end'
					{
					match(input,23,FOLLOW_23_in_expr463); 
					match(input,20,FOLLOW_20_in_expr465); 
					v8=(Token)match(input,ID,FOLLOW_ID_in_expr471); 
					match(input,12,FOLLOW_12_in_expr472); 
					v9=(Token)match(input,ID,FOLLOW_ID_in_expr477); 
					match(input,13,FOLLOW_13_in_expr478); 
					match(input,Equal,FOLLOW_Equal_in_expr480); 
					pushFollow(FOLLOW_expr_in_expr486);
					v10=expr();
					state._fsp--;

					match(input,22,FOLLOW_22_in_expr488); 
					pushFollow(FOLLOW_expr_in_expr494);
					v11=expr();
					state._fsp--;

					match(input,18,FOLLOW_18_in_expr496); 
					value = new Let_Fun_Expr((v8!=null?v8.getText():null),(v9!=null?v9.getText():null),v10,v11);
					}
					break;
				case 4 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:69:5: 'while' v12= expr 'do' v13= expr
					{
					match(input,27,FOLLOW_27_in_expr505); 
					pushFollow(FOLLOW_expr_in_expr511);
					v12=expr();
					state._fsp--;

					match(input,16,FOLLOW_16_in_expr513); 
					pushFollow(FOLLOW_expr_in_expr519);
					v13=expr();
					state._fsp--;

					value = new While_Expr(v12,v13);
					}
					break;
				case 5 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:70:5: '{' v14= expr ( ';' v15= expr )* '}'
					{
					match(input,28,FOLLOW_28_in_expr528); 
					pushFollow(FOLLOW_expr_in_expr534);
					v14=expr();
					state._fsp--;

					value = v14;
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:70:42: ( ';' v15= expr )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==15) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\harsha\\Desktop\\ProjLang.g:70:43: ';' v15= expr
							{
							match(input,15,FOLLOW_15_in_expr538); 
							pushFollow(FOLLOW_expr_in_expr544);
							v15=expr();
							state._fsp--;

							value = new Sequence_Expr(value,v15);
							}
							break;

						default :
							break loop5;
						}
					}

					match(input,29,FOLLOW_29_in_expr550); 
					}
					break;
				case 6 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:71:5: '!' v16= expr
					{
					match(input,11,FOLLOW_11_in_expr557); 
					pushFollow(FOLLOW_expr_in_expr563);
					v16=expr();
					state._fsp--;

					value = new NotExp(v16);
					}
					break;
				case 7 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:72:5: v17= ID ':=' v18= expr
					{
					v17=(Token)match(input,ID,FOLLOW_ID_in_expr576); 
					match(input,14,FOLLOW_14_in_expr578); 
					pushFollow(FOLLOW_expr_in_expr584);
					v18=expr();
					state._fsp--;

					value = new Assignment_Expr((v17!=null?v17.getText():null),v18);
					}
					break;
				case 8 :
					// C:\\Users\\harsha\\Desktop\\ProjLang.g:73:5: v19= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr596);
					v19=relexpr();
					state._fsp--;

					value = v19;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "input"
	// C:\\Users\\harsha\\Desktop\\ProjLang.g:76:1: input returns [Expr value] : v1= expr ';' ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr v1 =null;

		try {
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:76:29: (v1= expr ';' )
			// C:\\Users\\harsha\\Desktop\\ProjLang.g:76:32: v1= expr ';'
			{
			pushFollow(FOLLOW_expr_in_input621);
			v1=expr();
			state._fsp--;

			value = v1;
			match(input,15,FOLLOW_15_in_input624); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "input"

	// Delegated rules



	public static final BitSet FOLLOW_Num_in_factor187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_factor199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_factor212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor244 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_factor246 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_factor251 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_factor254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_factor265 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_factor270 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_factor274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr291 = new BitSet(new long[]{0x0000000000000222L});
	public static final BitSet FOLLOW_set_in_relexpr299 = new BitSet(new long[]{0x0000000002081140L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term329 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_Mulop_in_term338 = new BitSet(new long[]{0x0000000002081140L});
	public static final BitSet FOLLOW_factor_in_term344 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_term_in_arithexpr365 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_Addop_in_arithexpr374 = new BitSet(new long[]{0x0000000002081140L});
	public static final BitSet FOLLOW_term_in_arithexpr380 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_21_in_expr398 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_expr406 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr412 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_expr414 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr428 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_expr430 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_expr436 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Equal_in_expr438 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr444 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_expr446 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr452 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_expr454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr463 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_expr465 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_expr471 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_expr472 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_expr477 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_expr478 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_Equal_in_expr480 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr486 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_expr488 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr494 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_expr496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_expr505 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_expr513 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_expr528 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr534 = new BitSet(new long[]{0x0000000020008000L});
	public static final BitSet FOLLOW_15_in_expr538 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr544 = new BitSet(new long[]{0x0000000020008000L});
	public static final BitSet FOLLOW_29_in_expr550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_expr557 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr576 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_expr578 = new BitSet(new long[]{0x000000001AA81940L});
	public static final BitSet FOLLOW_expr_in_expr584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_input621 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_input624 = new BitSet(new long[]{0x0000000000000002L});
}
