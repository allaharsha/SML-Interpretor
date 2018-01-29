public class Sequence_Expr extends Expr{
	Expr EXPRESSION1;
	Expr EXPRESSION2;
	public Sequence_Expr(Expr EXPRESSION1, Expr EXPRESSION2){
		this.EXPRESSION1 = EXPRESSION1;
		this.EXPRESSION2 = EXPRESSION2;
		}
	public Value eval(Env env) throws EvalError{
			EXPRESSION1.eval(env);
			return EXPRESSION2.eval(env);
			
		}
	public String toString(){
		String exp1=EXPRESSION1.toString();
		String exp2=EXPRESSION2.toString();
		return exp1+";"+exp2;
		}
	}

