import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Garage {

	private List<Vehicule> listCar = new ArrayList<Vehicule>();
	private int id;
	private static int countCar;

	public Garage() {
		countCar++;
		this.id = countCar;

	}

	public int getId() {
		return id;
	}

	public List<Vehicule> getListCar() {
		return listCar;
	}

	public void setListCar(List<Vehicule> listCar) {
		this.listCar = listCar;
	}

	public void add(Vehicule car) {

		Objects.requireNonNull(car, " Must be not null");

		this.listCar.add(car);

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (Vehicule car : listCar) {

			sb.append(car.toString());

		}

		return sb.toString();
	}

	/**
	 * Exercice 9
	 * 
	 * @return
	 */
	public long getValue() {

		long sumCars = 0;

		for (Vehicule car : listCar) {

			sumCars = sumCars + car.getValue();

		}

		return sumCars;

	}

	/**
	 * Exercice 10
	 * 
	 * @param brand
	 * @return
	 * @throws IllegalArgumentException
	 */
	public Vehicule firstCarByBrand(String brand) {

		Objects.requireNonNull(brand);

		for (Vehicule car : listCar) {

			if (brand.equals(car.getBrand())) {

				return car;
			}
		}
		return null;

	}

	public void remove(Vehicule car) {

		// On doit utiliser un itérator pcq on peut pas avec un for each faire
		// un remove d'un objet d'une liste

		Iterator<Vehicule> iteListeCar = listCar.iterator();
		while (iteListeCar.hasNext()) {
			Vehicule c = iteListeCar.next();

			if (c.equals(car)) {
				iteListeCar.remove();
				return; // permet de sortir de la fonction
			}
		}
		throw new IllegalStateException();

	}

}
