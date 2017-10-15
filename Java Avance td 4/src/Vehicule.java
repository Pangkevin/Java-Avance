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

		this(brand, value); // p-e inutile vue que value ne sert à rien, autant
							// faire un constructeur avec uniquement brand

		this.aDiscount = d;

	}

	public long getValue() {
		// Très bizarre, demander des explications
		if (Objects.isNull(aDiscount)) {
			return this.value;
		}
		return this.aDiscount.getValue();
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aDiscount == null) ? 0 : aDiscount.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + (int) (value ^ (value >>> 32));
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
		Vehicule other = (Vehicule) obj;
		if (aDiscount == null) {
			if (other.aDiscount != null)
				return false;
		} else if (!aDiscount.equals(other.aDiscount))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public void setDiscount(Discount discount) {
		// ne pas oublier le require NON NULL
		aDiscount = discount;

	}

}
