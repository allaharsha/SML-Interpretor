grammar ProjLang;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

Num :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

Mulop	:	'*'
		|'/'
		|'&';
Relop	:	'<';
Equal	:	'=';
Addop	:	'+'|'-'|'|';


factor returns [Expr value] 	:	 v20 = Num {$value = new IntConst(Integer.parseInt($v20.text));} 
					 |'true' {$value = new BoolConst(Boolean.parseBoolean("true"));} 
					 | 'false' {$value = new BoolConst(Boolean.parseBoolean("false"));}
					 | v21 = ID {$value = new Variable_Expr($v21.text);}
					 | v21 = ID '('v22 = expr {$value = new Fun_Dec($v21.text,$v22.value) ;}')' 
					 | '('v23 = expr {$value = $v23.value;} ')';

relexpr returns [Expr value]	:	 v24 = arithexpr {$value = $v24.value;}(v25 = (Relop|Equal) v26 = arithexpr{
						if($v25.text.equals("=")){
							$value = new Binary_Expr($value,BinOp.EQ,$v26.value);
							}
						else if($v25.text.equals("<")){
							$value = new Binary_Expr($value,BinOp.LT,$v26.value);
							}
						})?;

term returns [Expr value]	:	 v29 = factor {$value = $v29.value;} (v30 = Mulop v31 = factor{
							if($v30.text.equals("*")){
								$value = new Binary_Expr($value,BinOp.TIMES,$v31.value);
								}
							else if($v30.text.equals("/")){
								$value = new Binary_Expr($value,BinOp.DIV,$v31.value);
								}
							else if($v30.text.equals("&")){
								$value = new Binary_Expr($value,BinOp.AND,$v31.value);
								}
							})*;

arithexpr returns [Expr value]  :	 v27 = term {$value = $v27.value;} (v28 = Addop v29 = term{
						if($v28.text.equals("-")){
							$value = new Binary_Expr($value,BinOp.MINUS,$v29.value);
							}
						else if($v28.text.equals("+")){
							$value = new Binary_Expr($value,BinOp.PLUS,$v29.value);
							}
						else if($v28.text.equals("|")){
							$value = new Binary_Expr($value,BinOp.OR,$v29.value);
							}						
						})*;



expr returns [Expr value]	:	 'if' v2 = expr 'then' v3 = expr 'else' v4 = expr {$value = new If_Expr($v2.value,$v3.value,$v4.value);}
		| 'let' 'val' v7 = ID '=' v5 = expr 'in' v6 = expr 'end' {$value = new Let_Val_Expr($v7.text,$v5.value,$v6.value);} 
		| 'let' 'fun' v8 = ID'('v9 = ID')' '=' v10 = expr 'in' v11 = expr 'end' {$value = new Let_Fun_Expr($v8.text,$v9.text,$v10.value,$v11.value);} 
		| 'while' v12 = expr 'do' v13 = expr {$value = new While_Expr($v12.value,$v13.value);} 
		| '{' v14 = expr {$value = $v14.value;}(';' v15 = expr {$value = new Sequence_Expr($value,$v15.value);})* '}' 
		| '!' v16 = expr {$value = new NotExp($v16.value);} 
		| v17 = ID ':=' v18 = expr {$value = new Assignment_Expr($v17.text,$v18.value);}
		| v19 = relexpr {$value = $v19.value;};
		
		
input returns [Expr value] 	:	 v1 = expr {$value = $v1.value;}';';
