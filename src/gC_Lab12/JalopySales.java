package gC_Lab12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JalopySales extends Car {

	public static void main(String[] args) {

		System.out.println("Welcome to Canton USED Cars.");
		System.out.println("Take a look at our current inventory while you are here.");

// display a list of 6 cars (3 new and 3 used)

		ArrayList<Car> jalopyList = new ArrayList<>();

		jalopyList.add(new Car(2019, "Ford", "Taurus", 3333.33));
		jalopyList.add(new Car(2019, "Lincoln", "Navigator", 4444.33));
		jalopyList.add(new Car(2019, "Aston Martin", "C300", 3939.04));
		jalopyList.add(new Car(2020, "Renault", "Breadtruck", 93939.04));

		jalopyList.add(new UsedCar(2003, "Mercedes", "C500", 9313.33, 4343.35));
		jalopyList.add(new UsedCar(2009, "Renault", "M3", 6313.33, 5543.35));
		jalopyList.add(new UsedCar(2010, "BMW", "M5", 7313.33, 166343.35));

		printLargeHeader();
		for (Car f : jalopyList) {

			System.out.println(f);
			
		}
	}
}

//		printLargeHeader();
//	
//		System.out.println("test regular for loop");
//
//		for (int i = 0; i < jalopyList.size(); i++) {
//			System.out.println((jalopyList.get(i)));
//		}



// let the user select 1 car
//		System.out.println("\n");
//		System.out.println("Choose a car to begin the purchase experience of a lifetime.");
//		System.out.println("[TYPE CAR MODEL TO SELECT A CAR]");
//		Scanner scnr = new Scanner(System.in);
//		carSelection = scnr.nextLine();
//
//		for (Car u : jalopyList) {
//			if (carSelection.equalsIgnoreCase(carSelection)) {
//				printLargeHeader();
//				System.out.println(u);
//			}

// display selected car info

// ask user if buy car

// if do, remove car from list

// display list
