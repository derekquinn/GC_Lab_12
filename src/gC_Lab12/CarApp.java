package gC_Lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		int howMany = 0;
		String make;
		String model;
		int year;
		Double price;

		System.out.println("Welcome to CANTON's CLEANEST CARS");
		System.out.println("\n");
		System.out.println("How many cars are you entering?");

		Scanner scnr = new Scanner(System.in);

		howMany = scnr.nextInt();

		scnr.nextLine();

//create an array list to store cars

		ArrayList<Car> carsList = new ArrayList<>();

// prompt user for input and store input in a carList

		for (int i = 0; i < howMany; i++) {

			System.out.println("Make for Car " + (i + 1) + ": ");
			make = scnr.nextLine();

			System.out.println("Model for Car " + (i + 1) + ": ");
			model = scnr.nextLine();

			System.out.println("Year for Car " + (i + 1) + ": ");
			year = scnr.nextInt();

			System.out.println("Price for Car " + (i + 1) + ": ");
			price = scnr.nextDouble();
			scnr.nextLine();

// add the car that user inputted info for to the list

			carsList.add(new Car(year, make, model, price));

		}

		Car.printHeader();

		for (int i = 0; i < carsList.size(); i++) {

			System.out.printf("%-10s \t", carsList.get(i).getMake());
			System.out.printf("%-10s \t", carsList.get(i).getModel());
			System.out.printf("%-10s \t", carsList.get(i).getYear());
			System.out.printf("%-9s", "$" + carsList.get(i).getPrice());
			System.out.println("\n");

		}

	}

}
