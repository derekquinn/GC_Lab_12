package gC_Lab12;

public class Car {

// instance variable declarations	
	protected String carMake;
	protected String carModel;
	protected int carYear;
	protected double carPrice;
	protected double carMiles;

// no arguments constructors for all 4 data sets
	public Car() {
		super();
	}

// constructor with four arguments matching order above 
	public Car(int carYear, String carMake, String carModel, double carPrice) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}

// getter for car make
	public String getMake() {
		return carMake;

	}

// getter for car model 
	public String getModel() {
		return carModel;
	}

// getter for car year 
	public Integer getYear() {
		return carYear;
	}

// getter for car price
	public double getPrice() {
		return carPrice;

	}

// getter for mileage 
	public double getMiles() {
		return carMiles;
	}

// setter for car make
	public void setMake(String carMake) {
		this.carMake = carMake;

	}

// setter for car model (with param for user input)
	public void setModel(String carModel) {
		this.carModel = carModel;

	}

// setter for car year (with param for user input)
	public void setYear(int carYear) {
		this.carYear = carYear;
	}

// setter for car price (with param for user input)
	public void setPrice(double carPrice) {
		this.carPrice = carPrice;
	}

// setter for mileage for used cars without user input

	public void setMiles(double carMiles) {
		this.carMiles = carMiles;
	}

// resuable header
	public static void printHeader() {

		System.out.println("\n");
		System.out.println("=MAKE===========MODEL===========YEAR=============PRICE======");

	}

	public static void printLargeHeader() {

	
		System.out.println("=MAKE===========MODEL======YEAR=======PRICE========MILEAGE=================");

	}

	@Override
	public String toString() {

		return String.format("%-15s %-10s %-10s %-1s %-10s %-10s", carMake, carModel, carYear, "$", carPrice,
				"------------------ (NEW)");
	}

}
