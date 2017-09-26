
public class Car {

	private final String brand ;
	private final String licencePlate ;
	private final long value;
	
	/**
	 * 
	 * @param brand
	 * @param licencePlate
	 * @param value Non négative
	 */
	public Car(String brand, String licencePlate, long value) {
		this.brand = brand;
		this.licencePlate = licencePlate;
		
		if (this.value<0){
			throw new IllegalArgumentException();
		}
		this.value = value;
	}
	
	public String getBrand() {
		return brand;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public long getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", licencePlate=" + licencePlate + ", value=" + value + "]";
	}
	
	
	
	
	
}