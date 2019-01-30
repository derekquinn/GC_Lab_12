package gC_Lab12;

import java.util.ArrayList;

public class UsedCar extends Car {

// constructor experiment to build usedCar object

	public UsedCar(int carYear, String carMake, String carModel, double carPrice, double carMiles) {
		super(carYear, carMake, carModel, carPrice);
		this.carMiles = carMiles;

	}

	@Override
	public String toString() {

		return String.format("%-10s%-10s%-5d%2s%10.2f%10.1f%-12s", carMake, carModel, carYear, "$", carPrice, carMiles,
				" miles (Used)");
	}

}
