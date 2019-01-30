package gC_Lab12;

import java.util.ArrayList;

public class UsedCar extends Car {

	public static void main(String[] Args) {

// display a list of 6 cars (3 new and 3 used)

		ArrayList<Car> carsList = new ArrayList<>();

		carsList.add(new UsedCar());
		carsList.add(new UsedCar());
		carsList.add(new UsedCar());
		carsList.add(new UsedCar());
		carsList.add(new UsedCar());

		carsList.add(new Car());
		carsList.add(new Car());
		carsList.add(new Car());
		carsList.add(new Car());
		carsList.add(new Car());

	}

}
