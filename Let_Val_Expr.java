public class Let_Val_Expr extends Expr{
	String Var;
	Expr EXPRESSION1;
	Expr EXPRESSION2;
	public Let_Val_Expr(String Var, Expr EXPRESSION1, Expr EXPRESSION2){
		this.Var = Var;
		this.EXPRESSION1 = EXPRESSION1;
		this.EXPRESSION2 = EXPRESSION2;
		}
	public Value eval(Env env) throws EvalError{
			Env env1=env.addBinding(Var, EXPRESSION1.eval(env));
			return EXPRESSION2.eval(env1);
			
		
		}
	public String toString(){
		return "Let "+"val "+Var+" = "+EXPRESSION1.toString()+" in "+EXPRESSION2.toString()+"end";
		}
	}

