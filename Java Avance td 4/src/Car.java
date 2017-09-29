import java.util.Objects;

public class Car extends Vehicule {

	private final String licencePlate;
	private int vetuste; // un niveau de vetuste = 1000

	/**
	 * 
	 * @param brand
	 * @param licencePlate
	 * @param value
	 *            Non négative
	 */
	public Car(String brand, String licencePlate, long value) {
		super(brand, value);
		this.licencePlate = Objects.requireNonNull(licencePlate, "licencePlate non null");

	}

	public Car(String brand, String licencePlate, long value, int vetuste) {
		this(brand, licencePlate, value);

		if (value - vetuste * 1000 < 0) {
			throw new IllegalArgumentException();
		}
		this.vetuste = Objects.requireNonNull(vetuste, "vetuste non null");

	}

	public String getBrand() {
		return super.getBrand();
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public long getValue() {
		return super.getValue() - vetuste * 1000;
	}

	@Override
	public String toString() {
		return "Car [brand=" + super.getBrand() + ", licencePlate=" + licencePlate + ", value=" + super.getValue()
				+ "]";
	}

	public boolean equals(Car car) {

		if (this.getBrand() == car.getBrand() && this.getValue() == car.getValue()
				&& this.getLicencePlate() == car.getLicencePlate()) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((super.getBrand() == null) ? 0 : super.getBrand().hashCode());
		result = prime * result + ((licencePlate == null) ? 0 : licencePlate.hashCode());
		result = prime * result + (int) (super.getValue() ^ (super.getValue() >>> 32));
		result = prime * result + vetuste;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (super.getBrand() == null) {
			if (super.getBrand() != null)
				return false;
		} else if (!super.getBrand().equals(super.getBrand()))
			return false;
		if (licencePlate == null) {
			if (other.licencePlate != null)
				return false;
		} else if (!licencePlate.equals(other.licencePlate))
			return false;
		if (super.getValue() != super.getValue())
			return false;
		if (vetuste != other.vetuste)
			return false;
		return true;
	}

}
