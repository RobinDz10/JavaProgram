public class Vehicle {
	protected String make;
	protected String color;
	protected int year;
	protected String model;
	
	/* Class "Vehicle" constructor */
	public Vehicle() {}
	
	/* Class "Vehicle" constructor */
	public Vehicle(String vehicleMake, String vehicleColor, int vehicleYear, String vehicleModel) {
		make = vehicleMake;
		color = vehicleColor;
		year = vehicleYear;
		model = vehicleModel;
	}
	
	/* Set the make of the vehicle */
	public void setMake(String vehicleMake) {
		make = vehicleMake;
	}
	
	/* Get the make of the vehicle */
	public String getMake() {
		return make;
	}
	
	/* Set the color of the vehicle */
	public void setColor(String vehicleColor) {
		color = vehicleColor;
	}
	
	/* Get the color of the vehicle */
	public String getColor() {
		return color;
	}
	
	/* Set the year of the vehicle being made */
	public void setYear(int vehicleYear) {
		year = vehicleYear;
	}
	
	/* Get the year of the vehicle being made */
	public int getYear() {
		return year;
	}
	
	/* Set the model of the vehicle */
	public void setModel(String vehicleModel) {
		model = vehicleModel;
	}
	
	/* Get the model of the vehicle */
	public String getModel() {
		return model;
	}
	
	/* Print out the details of the vehicle: make, color, year, model */
	public void printDetails() {
		System.out.println("This car is made by " + make + ", the color is " + color + ", the year is " + year + ", the model is " + model + ".");
	}
	
	/*
	 * Questions:
	 * a. What are the different types of inheritance?
	 * <This answer is referred from: https://www.dotnettricks.com/learn/oops/understanding-inheritance-and-different-types-of-inheritance>
	 * 1. Single inheritance; 2. Multi-level inheritance; 3. Multiple inheritance; 4. Multipath inheritance; 5. Hierarchical Inheritance; 6. Hybrid Inheritance
	 * 
	 * b. What are final and super keyword?
	 * <This answer is referred from: https://www.w3schools.in/java-tutorial/super-final-keywords/>
	 * super is a keyword of Java which refers to the immediate parent of a class and is used inside the subclass method definition for calling a method defined in the superclass.
	 * final is a keyword in Java that is used to restrict the user and can be used in many respects. It can be used with class, method, and variables.
	 * 
	 * c. Multiple inheritance is not supported by Java, explain?
	 * <This answer is referred from: https://www.tutorialspoint.com/Why-multiple-inheritance-is-not-supported-in-Java>
	 * Because multiple inheritance can lead to some problems such as ambiguity.
	 * */
}

class Car extends Vehicle{
	private String bodyStyle;
	private int topSpeed;
	private int currSpeed;
	
	/* Sub-class "Car" constructor */
	public Car(String vehicleMake, String vehicleColor, int vehicleYear, String vehicleModel, String carBodyStyle, int carTopSpeed, int carCurrSpeed) {
		super(vehicleMake, vehicleColor, vehicleYear, vehicleModel);
		bodyStyle = carBodyStyle;
		topSpeed = carTopSpeed;
		currSpeed = carCurrSpeed;
	}
	
	/* Set the body style of the car */
	public void setBodyStyle(String carBodyStyle) {
		bodyStyle = carBodyStyle;
	}
	
	/* Get the body style of the car */
	public String getBodyStyle() {
		return bodyStyle;
	}
	
	/* Set the top speed of the car */
	public void setTopSpeed(int carTopSpeed) {
		topSpeed = carTopSpeed;
	}
	
	/* Get the top speed of the car */
	public int getTopSpeed() {
		return topSpeed;
	}
	
	/* Set the current speed of the car */
	public void setCurrSpeed(int carCurrSpeed) {
		currSpeed = carCurrSpeed;
	}
	
	/* Get the current speed of the car */
	public int getCurrSpeed() {
		return currSpeed;
	}
	
	/* Get the acceleration of the car (currSpeed + topSpeed) */
	public int accelerate() {
		return currSpeed + topSpeed;
	}
	
	/* Print out the details of the car: make, color, year, model, bodystyle, acceleration */
	public void carDetails() {
		super.printDetails();
		System.out.println("The bodystyle of this car is: " + bodyStyle + ", the acceleration is " + this.accelerate());
	}
}