public class FunVal extends Value{
	String v;
	Expr arg;
	Env env;
	public FunVal(String v, Expr args, Env env) {
		this.v = v;
		this.arg = args;
		this.env = env;
		}
	public String toString() {
		return v;
		}
	}




