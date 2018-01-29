public class Variable_Expr extends Expr {
	String var;
    public Variable_Expr(String s){
    	var=s;
		}
	public Value eval(Env env) throws EvalError{
			return env.lookup(var);
        }
	public String toString(){
		return var;
		}
	}
