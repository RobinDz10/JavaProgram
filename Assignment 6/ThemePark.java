import java.util.ArrayList;

public class ThemePark {
	private ArrayList<String> employees;
	private ArrayList<String> customers;
	private ArrayList<String> rides;
	private ArrayList<String> facilities;
	private ArrayList<ArrayList<String>> customerWhoRideRides;
	private ArrayList<ArrayList<String>> customerWhoPurchaseItems;
	
	/* ThemePark constructor */
	public ThemePark() {
		employees = new ArrayList<String>();
		customers = new ArrayList<String>();
		rides = new ArrayList<String>();
		facilities = new ArrayList<String>();
		customerWhoRideRides = new ArrayList<ArrayList<String>>();
		customerWhoPurchaseItems = new ArrayList<ArrayList<String>>();
	}
	
	/* Hire an employee in the theme park */
	public String hireEmployee(String person) {
		employees.add(person);
		return person;
	}
	
	/* Fire an employee from the theme park */
	public String fireEmployee(String person) {
		int index = -1;
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).equals(person)) {
				index = i;
				employees.remove(i);
			}
		}
		if(index == -1) {
			return "No such employee in this park.";
		}
		return person;
	}
	
	/* Display all the names of the employees in the theme park */
	public String displayAllEmployees() {
		String str = "";
		if(employees.size() <= 0) return str;
		else if(employees.size() == 1) {
			str += employees.get(0);
		}
		else {
			for(int i = 0; i < employees.size() - 1; i++) {
				str += employees.get(i);
				str += ", ";
			}
			str += employees.get(employees.size() - 1);
		}
		return str;
	}
	
	/* Add a customer in the theme park */
	public String addCustomer(String person) {
		customers.add(person);
		return person;
	}
	
	/* Remove a customer from the theme park */
	public String removeCustomer(String person) {
		int index = -1;
		for(int i = 0; i < customers.size(); i++) {
			if(customers.get(i).equals(person)) {
				index = i;
				customers.remove(i);
			}
		}
		if(index == -1) return "No such customer in this park.";
		return person;
	}
	
	/* Get the list of all customers in the theme park */
	public ArrayList<String> getAllCustomers(){
		return customers;
	}
	
	/* Display all the names of the customers in the theme park */
	public String displayAllCustomers() {
		String str = "";
		if(customers.size() <= 0) return str;
		else if(customers.size() == 1) {
			str += customers.get(0);
		}
		else {
			for(int i = 0 ;i < customers.size() - 1; i++) {
				str += customers.get(i);
				str += ", ";
			}
			str += customers.get(customers.size() - 1);
		}
		return str;
	}
	
	/* Add a ride into the theme park */
	public void addRides(String ride) {
		rides.add(ride);
		customerWhoRideRides.add(new ArrayList<String>());
		int numberOfRides = customerWhoRideRides.size();
		customerWhoRideRides.get(numberOfRides - 1).add(ride);
	}
	
	/* Get the list of all the rides in the theme park */
	public ArrayList<String> getRidesNames(){
		return rides;
	}
	
	/* Display all the names of the rides in the theme park */
	public String displayAllRides() {
		String str = "";
		if(rides.size() <= 0) return str;
		else if(rides.size() == 1) {
			str += rides.get(0);
		}
		else {
			for(int i = 0; i < rides.size() - 1; i++) {
				str += rides.get(i);
				str += ", ";
			}
			str += rides.get(rides.size() - 1);
		}
		return str;
	}
	
	/* Add a facilities into the theme park */
	public void addFacilities(String facility) {
		facilities.add(facility);
		customerWhoPurchaseItems.add(new ArrayList<String>());
		int numberOfFacilities = customerWhoPurchaseItems.size();
		customerWhoPurchaseItems.get(numberOfFacilities - 1).add(facility);
	}
	
	/* Get the list of all the facilities in the theme park */
	public ArrayList<String> getFacilitiesNames(){
		return facilities;
	}
	
	/* Display all the names of the facilities in the theme park */
	public String displayAllFacilities() {
		String str = "";
		if(facilities.size() <= 0) return str;
		else if(facilities.size() == 1) {
			str += facilities.get(0);
		}
		else {
			for(int i = 0; i < facilities.size() - 1; i++) {
				str += facilities.get(i);
				str += ", ";
			}
			str += facilities.get(facilities.size() - 1);
		}
		return str;
	}
	
	/* Get the list of person who has ride a particular ride */
	public ArrayList<String> rideRides(String person, String ride) {
		int index = -1;
		for(int i = 0; i < customerWhoRideRides.size(); i++) {
			if(customerWhoRideRides.get(i).get(0).equals(ride)) {
				index = i;
				customerWhoRideRides.get(i).add(person);
			}
		}
		String temp = "This ride does not exist in the theme park.";
		ArrayList<String> tempArrayList = new ArrayList<String>();
		tempArrayList.add(temp);
		if(index == -1) return tempArrayList;
		return customerWhoRideRides.get(index);
	}
	
	/* Get the list of person who has purchased an item from a particular facility */
	public ArrayList<String> purchaseItems(String person, String facility){
		int index = -1;
		for(int i = 0; i < customerWhoPurchaseItems.size(); i++) {
			if(customerWhoPurchaseItems.get(i).get(0).equals(facility)) {
				index = i;
				customerWhoPurchaseItems.get(i).add(person);
			}
		}
		String temp = "This facility does not exist in the theme park.";
		ArrayList<String> tempArrayList = new ArrayList<String>();
		tempArrayList.add(temp);
		if(index == -1) return tempArrayList;
		return customerWhoPurchaseItems.get(index);
	}
	
	/* Display the statistics of the theme park */
	public void parkStatistics() {
		System.out.println("The theme park now has " + rides.size() + " rides.");
		System.out.println("The theme park now has " + facilities.size() + " facilities.");
		System.out.println("The theme park now has " + (rides.size() + facilities.size()) + " buildings in total.");
		System.out.println("The theme park now has " + employees.size() + " employees in total. The list of the employees is: " + this.displayAllEmployees());
		System.out.println("The theme park now has " + customers.size() + " customers in total. The list of the customer is: " + this.displayAllCustomers());
	}
}