
public class Value implements Expr{
	
	private double val;
	
	

	public Value(double d) {
		super();
		this.val = d;
	}



	@Override
	public double eval() {
		
		return val;
	}



	@Override
	public String toString() {
		return String.valueOf(this.val);
	}
	
	
	
	

}
