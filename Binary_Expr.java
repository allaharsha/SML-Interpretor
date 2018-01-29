public class Binary_Expr extends Expr{
	BinOp OPERATOR;
	Expr OPERAND1;
	Expr OPERAND2;
	public Binary_Expr(Expr OPERAND1,BinOp OPERATOR,Expr OPERAND2){
		super();
		this.OPERATOR = OPERATOR;
		this.OPERAND1 = OPERAND1;
		this.OPERAND2 = OPERAND2;
		}
	public Value eval(Env env) throws EvalError{
			switch(OPERATOR){
				case TIMES:if(OPERAND1.eval(env) instanceof IntVal && OPERAND2.eval(env) instanceof IntVal){
						   int op1=((IntVal)OPERAND1.eval(env)).value;
						   int op2=((IntVal)OPERAND2.eval(env)).value;
						   return new IntVal(op1*op2);
						}
					   else
						throw new EvalError("Error: Operands are not compatible");

				case PLUS: if(OPERAND1.eval(env) instanceof IntVal && OPERAND2.eval(env) instanceof IntVal){
						   int op1=((IntVal)OPERAND1.eval(env)).value;
						   int op2=((IntVal)OPERAND2.eval(env)).value;
						   return new IntVal(op1+op2);
						   }
					   else
						throw new EvalError("Error: Operands are not compatible");
				case DIV:if(OPERAND1.eval(env) instanceof IntVal && OPERAND2.eval(env) instanceof IntVal){
						int op2=((IntVal)OPERAND2.eval(env)).value;
						if(op2!=0){
							int op1=((IntVal)OPERAND1.eval(env)).value;
							return new IntVal(op1/op2);
							}
						else
							throw new EvalError("Error: Division by Zero is not allowed");}
					   else
						throw new EvalError("Error: Operands are not compatible");
				case MINUS: if(OPERAND1.eval(env) instanceof IntVal && OPERAND2.eval(env) instanceof IntVal){
						    int op1=((IntVal)OPERAND1.eval(env)).value;
						    int op2=((IntVal)OPERAND2.eval(env)).value;
						    return new IntVal(op1-op2);}
				case OR:if(OPERAND1.eval(env) instanceof BoolVal & OPERAND2.eval(env) instanceof BoolVal){
					boolean o1=((BoolVal)OPERAND1.eval(env)).value;
					if(o1)
						return new BoolVal(true);
					else
						return new BoolVal(((BoolVal)OPERAND2.eval(env)).value);
					}
					   else
						throw new EvalError("Error: Operands are not compatible");
				case AND:if(OPERAND1.eval(env) instanceof BoolVal & OPERAND2.eval(env) instanceof BoolVal){
					if(((BoolVal)OPERAND1.eval(env)).value)
						return new BoolVal(((BoolVal)OPERAND2.eval(env)).value);
					else 
						return new BoolVal(false);}
					   else
						throw new EvalError("Error: Operands are not compatible");
				case LT:if(OPERAND1.eval(env) instanceof IntVal & OPERAND2.eval(env) instanceof IntVal)
					return new BoolVal(((IntVal)OPERAND1.eval(env)).value<((IntVal)OPERAND2.eval(env)).value);
					   else
						throw new EvalError("Error: Operands are not compatible");
				case EQ:
					if(OPERAND1.eval(env) instanceof IntVal & OPERAND2.eval(env) instanceof IntVal)
						return new BoolVal(((IntVal)OPERAND1.eval(env)).value==((IntVal)OPERAND2.eval(env)).value);
					else if(OPERAND1.eval(env) instanceof BoolVal & OPERAND2.eval(env) instanceof BoolVal)
						return new BoolVal(((BoolVal)OPERAND1.eval(env)).value==((BoolVal)OPERAND2.eval(env)).value);				
				default:
					throw new EvalError("Error: Operands are not compatible");
				}	
			}
	public String toString(){	
			String op=OPERATOR.toString();
			if(op=="TIMES") return OPERAND1.toString() + op + OPERAND2.toString();
			else if(op=="PLUS") return OPERAND1.toString() + op + OPERAND2.toString();
			else if(op=="DIV") return OPERAND1.toString() +op + OPERAND2.toString();
			else if(op=="MINUS") return OPERAND1.toString() + op + OPERAND2.toString();
			else if(op=="OR") return OPERAND1.toString() + op + OPERAND2.toString();
			else if(op=="AND") return OPERAND1.toString() + op + OPERAND2.toString();
			else if(op=="LT") return OPERAND1.toString() + op + OPERAND2.toString();			
			else if(op=="EQ") return OPERAND1.toString() + op + OPERAND2.toString();			
			else return "Not a valid operation";			
			}
	}
