public class If_Expr extends Expr{
	Expr EXPRESSION1;
	Expr EXPRESSION2;
	Expr EXPRESSION3;
	public If_Expr(Expr EXPRESSION1, Expr EXPRESSION2, Expr EXPRESSION3){
		this.EXPRESSION1 = EXPRESSION1;
		this.EXPRESSION2 = EXPRESSION2;
		this.EXPRESSION3 = EXPRESSION3;
		}
	public Value eval(Env env) throws EvalError{
			if(EXPRESSION1.eval(env) instanceof BoolVal){
			//checks that the condition returns boolean value
				BoolVal bool=(BoolVal)EXPRESSION1.eval(env);
				if(bool.value){
					return EXPRESSION2.eval(env);
					}
				else
					return EXPRESSION3.eval(env);
				}
			else
				throw new EvalError("Error: Improper condition");
			
		}
	public String toString(){
		return "If "+ EXPRESSION1.toString()+" then "+ EXPRESSION2.toString() +" else "+EXPRESSION3.toString();
		}
	}
