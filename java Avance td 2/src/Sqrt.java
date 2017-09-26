import java.math.*;

public class Sqrt implements Expr {

	private Expr exp1;
	
	
	
	
	public Sqrt(Expr exp1) {
	
		this.exp1 = exp1;
	}


	@Override
	public double eval() {
		
	
		return Math.sqrt(this.exp1.eval());
				
		
	}
	
	@Override
	public String toString() {
		return "sqrt("+this.exp1.eval()+")";
	}
	

}
