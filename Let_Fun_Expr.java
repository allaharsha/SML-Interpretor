public class Let_Fun_Expr extends Expr{
	String Var1;
	String Var2;
	Expr EXPRESSION1;
	Expr EXPRESSION2;
	public Let_Fun_Expr(String Var1, String Var2, Expr EXPRESSION1, Expr EXPRESSION2){
		this.Var1 = Var1;
		this.Var2 = Var2;
		this.EXPRESSION1 = EXPRESSION1;
		this.EXPRESSION2 = EXPRESSION2;
		}
	public Value eval(Env env) throws EvalError{		
			Env env1=env.addBinding(Var1, new IntVal(0));
			FunVal funval = new FunVal(Var2,EXPRESSION1,env1);	
			env1.updateBinding(Var1, funval);
			return EXPRESSION2.eval(env1); 
			
		}
	public String toString() {
		return "Let "+"fun "+Var1+"("+Var2+") ="+EXPRESSION1.toString()+" in "+EXPRESSION2.toString();
		}
	}


