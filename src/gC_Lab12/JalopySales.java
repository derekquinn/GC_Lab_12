package gC_Lab12;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class JalopySales {

	public static void main(String[] args) {
		System.out.println("Welcome to Canton USED Cars.");
		System.out.println("Owned by the SON of Canton's Cleanest Cars.");
		System.out.println("\n");

// display a list of 6 cars (3 new and 3 used)

		// Cars.printLargeHeader();

		ArrayList<Car> jalopyList = new ArrayList<>();

	
		jalopyList.add(new UsedCar(2003, "Mercedes", "C500", 9313.33, 4343.35));
		jalopyList.add(new UsedCar(2009, "BMW", "M3", 6313.33, 5543.35));
		jalopyList.add(new UsedCar(2010, "BMW", "M5", 7313.33, 166343.35));

	
		jalopyList.add(new Car(2019, "Ford", "Taurus", 3333.33));
		jalopyList.add(new Car(2019, "Lincoln", "Navigator", 4444.33));
		jalopyList.add(new Car(2019, "Mercedes", "C300", 3939.04));

		System.out.println("\n");

		//for (int i = 0; i < jalopyList.size(); i++) {
		for (Car car : jalopyList) {
//			System.out.printf("%-10s \t", jalopyList.get(i).getMake());
//			System.out.printf("%-10s \t", jalopyList.get(i).getModel());
//			System.out.printf("%-10s \t", jalopyList.get(i).getYear());
//			System.out.printf("%-10s \t", jalopyList.get(i).getPrice());
//			System.out.printf("%-9s", "$" + jalopyList.get(i).getMiles());
//			System.out.println("\n");
			System.out.println(car);

		}
// let the user select 1 car

		System.out.println("Choose a car to begin the purcahse experience of a lifetime.");
// display selected car info

// ask user if buy car

// if do, remove car from list

// display list

	}

}
