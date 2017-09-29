
public class Bike extends Vehicule {
	public final static long PRICE = 100;

	public Bike(String brand) {
		super(brand, PRICE);
	}

	public Bike(String brand, Discount d) {
		super(brand, PRICE, d);
	}

}
