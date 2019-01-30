package gC_Lab12;

public class Car {

// instance variable declarations	
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;

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

// resuable header
	public static void printHeader() {
		System.out.println("Current Inventory Report:");
		System.out.println("\n");
		System.out.println("=MAKE===========MODEL===========YEAR=============PRICE======");

	}

	@Override
	public String toString() {

		return carMake + carModel + carYear + carPrice;

	}

}
