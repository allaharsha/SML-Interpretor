public class Fun_Dec extends Expr{
	Expr EXPRESSION;
	String ID;
	public Fun_Dec(String ID, Expr EXPRESSION){
		this.EXPRESSION=EXPRESSION;
		this.ID=ID;
		}
	public Value eval(Env e) throws EvalError{
			Value v=e.lookup(ID);
			if(v instanceof FunVal){			
				FunVal fun=(FunVal)v;
				Env env1=fun.env;
				return fun.arg.eval(env1.addBinding(fun.v,EXPRESSION.eval(e)));
				}
			else
				throw new EvalError("Error: Not a function");
		}
	public String toString(){
		return ID+"("+EXPRESSION.toString()+")";
		}
	}

