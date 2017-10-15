import java.util.Objects;

public class Discount {
	private long value;

	public Discount(long value) {
		Objects.requireNonNull(value, "Valeur de discount !=  null");
		if (value < 0) {
			throw new IllegalArgumentException();
		}
		this.value = value;

	}

	public long getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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

		Discount other = (Discount) obj;
		if (value != other.value)
			return false;
		return true;
	}
}
