package gC_Lab12;

public class UsedCar extends Car {

// constructor experiment to build usedCar object

	public UsedCar(int carYear, String carMake, String carModel, double carPrice, double carMiles) {
		super(carYear, carMake, carModel, carPrice);
		this.carMiles = carMiles;

	}

	@Override
	public String toString() {

		return String.format("%-15s %-10s %-10s %-1s %-10s %-10s %-10s ", carMake, carModel, carYear, "$", carPrice, carMiles,
				" miles (Used)");
	}

}
