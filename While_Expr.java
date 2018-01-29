public class While_Expr extends Expr{
	Expr EXPRESSION1;
	Expr EXPRESSION2;
	public While_Expr(Expr EXPRESSION1, Expr EXPRESSION2){
		this.EXPRESSION1 = EXPRESSION1;
		this.EXPRESSION2 = EXPRESSION2;
		}
	public Value eval(Env env) throws EvalError{
			if( EXPRESSION1.eval(env) instanceof BoolVal){
			while(((BoolVal)(EXPRESSION1.eval(env))).value)
				EXPRESSION2.eval(env);
			return new BoolVal(false);
			}
			else
				throw new EvalError("Error: Condition has to boolean type");
			
		}
	public String toString(){
		return "while "+EXPRESSION1.toString()+" do "+EXPRESSION2.toString();
		}
	}
