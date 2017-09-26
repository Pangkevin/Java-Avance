
public class Multi implements Expr{

	
	private Expr exp1;
	private Expr exp2;
	
	
	
	
	public Multi(Expr exp1, Expr exp2) {
	
		this.exp1 = exp1;
		this.exp2 = exp2;
	}


	@Override
	public double eval() {
		
		
		
		return this.exp1.eval() * this.exp2.eval();
				
		
	}
	
	@Override
	public String toString() {
		return "("+this.exp1.toString()+")*("+this.exp2.toString()+")";
	}
	
	
}
