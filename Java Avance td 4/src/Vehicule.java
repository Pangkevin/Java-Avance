import java.util.Objects;

public abstract class Vehicule {
	private final String brand;
	private final long value;
	private Discount aDiscount;

	// Constructeur
	public Vehicule(String brand, long value) {
		this.brand = Objects.requireNonNull(brand, "brand non null");
		if (value < 0) {
			throw new IllegalArgumentException();
		}
		this.value = value;
	}

	public Vehicule(String brand, long value, Discount d) {

		this(brand, value);

		this.aDiscount = d;

	}

	public long getValue() {
		return this.value;
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	public boolean equals(Vehicule car) {

		if (this.getBrand() == car.getBrand() && this.getValue() == car.getValue()) {
			return true;
		}

		return false;
	}

}
