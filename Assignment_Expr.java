public class Assignment_Expr extends Expr{
	Expr EXPRESSION;
	String ID;
	public Assignment_Expr(String ID, Expr EXPRESSION){
		this.EXPRESSION = EXPRESSION;
		this.ID = ID;
		}
	public Value eval(Env env) throws EvalError{
			//checks for type of both env.lookup(ID) and EXPRESSION.eval(env) to be same
			boolean b=env.lookup(ID) instanceof BoolVal && EXPRESSION.eval(env) instanceof BoolVal;	
			boolean i=env.lookup(ID) instanceof IntVal && EXPRESSION.eval(env) instanceof IntVal;
			if(b)
				env.updateBinding(ID,(BoolVal)EXPRESSION.eval(env));
			else if(i)
				env.updateBinding(ID,(IntVal) EXPRESSION.eval(env));
			else
				throw new EvalError("Error: Could not assign to a different type");
			return EXPRESSION.eval(env);	
			}
	public String toString(){
		return ID+":="+EXPRESSION.toString();
		}
	}
