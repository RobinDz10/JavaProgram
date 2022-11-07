import java.util.Scanner;
import java.util.ArrayList;

public class ThemeParkMain {
	public static void main(String[] args) {
		ThemePark myThemePark = new ThemePark();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your theme park!");
		while(true) {
			System.out.println("Please enter the number of your option (1 ~ 5): ");
			System.out.println("1. Employees option (Hire/Fire).");
			System.out.println("2. Customer option (Add/Remove/Ride/Purchase).");
			System.out.println("3. Add rides in your park.");
			System.out.println("4. Add facility in your park.");
			System.out.println("5. Display the statistics of the theme park.");
			System.out.println("6. End program.");
			String num1 = sc.nextLine();
			if(!(num1.equals("1") || num1.equals("2") || num1.equals("3") || num1.equals("4") || num1.equals("5") || num1.equals("6"))) {
				System.out.println("Invalid option. Please re-enter your option.");
				continue;
			}
			else {
				if(num1.equals("1")) {
					System.out.println("Please choose: (input 1)->Hire employee, (other inputs)->Fire employee.");
					String num2 = sc.nextLine();
					if(num2.equals("1")) {
						Scanner sc2 = new Scanner(System.in);
						System.out.println("Please enter the name of person you want to hire: ");
						String employeeName = sc2.nextLine();
						System.out.println("You have successfully hired " + myThemePark.hireEmployee(employeeName) + " in your park.");
						System.out.println("Now your employees list is: " + myThemePark.displayAllEmployees());
					}
					else {
						Scanner sc2 = new Scanner(System.in);
						System.out.println("Please enter the name of employee you want to fire: ");
						String employeeName = sc2.nextLine();
						String result = myThemePark.fireEmployee(employeeName);
						if(result.equals("No such employee in this park.")) {
							System.out.println("Fire failed. No such employee in this park.");
						}
						else {
							System.out.println("You have successfully fired " + employeeName + " from your park.");
							System.out.println("Now your employees list is: " + myThemePark.displayAllEmployees());
						}
					}
				}
				else if(num1.equals("2")) {
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Please choose: (input 1)->Add customer, (input 2)->Customer ride, (input 3)->Customer purchase, (other input)->Remove customer.");
					String num2 = sc2.nextLine();
					if(num2.equals("1")) {
						System.out.println("Please enter customer's name:");
						Scanner sc3 = new Scanner(System.in);
						String customerName = sc3.nextLine();
						System.out.println("Costumer " + myThemePark.addCustomer(customerName) + " entered the theme park.");
						System.out.println("Now the list of customers in the theme park is: " + myThemePark.displayAllCustomers());
					}
					else if(num2.equals("2")) {
						Scanner sc3 = new Scanner(System.in);
						System.out.println("All the customers in the theme park now are: " + myThemePark.displayAllCustomers());
						System.out.println("Which customer do you choose?");
						String customerName = sc3.nextLine();
						boolean flag1 = false;
						ArrayList<String> allCustomersInThePark = myThemePark.getAllCustomers();
						for(int i = 0; i < allCustomersInThePark.size(); i++) {
							if(allCustomersInThePark.get(i).equals(customerName))
								flag1 = true;
						}
						if(flag1 == false) {
							System.out.println("The customer " + customerName + " is not in the theme park.");
						}
						else {
							Scanner sc4 = new Scanner(System.in);
							System.out.println("Which ride does the customer want to play?");
							String rideName = sc4.nextLine();
							boolean flag2 = false;
							ArrayList<String> allRidesInThePark = myThemePark.getRidesNames();
							for(int i = 0; i < allRidesInThePark.size(); i++) {
								if(allRidesInThePark.get(i).equals(rideName))
									flag2 = true;
							}
							if(flag2 == false) {
								System.out.println("The ride " + rideName + " is not in the theme park.");
							}
							else {
								System.out.println("Customer " + customerName + " is now riding " + rideName);
								ArrayList<String> rideStatistics = myThemePark.rideRides(customerName, rideName);
								String str2 = "";
								for(int i = 1; i < rideStatistics.size(); i++) {
									str2 += rideStatistics.get(i);
									str2 += "   ";
								}
								System.out.println("The list of customer who has ride " + rideName + " are: " + str2);
							}
						}
					}
					else if(num2.equals("3")) {
						Scanner sc3 = new Scanner(System.in);
						System.out.println("All the customers in the theme park now are: " + myThemePark.displayAllCustomers());
						System.out.println("Which customer do you choose?");
						String customerName = sc3.nextLine();
						boolean flag1 = false;
						ArrayList<String> allCustomersInThePark = myThemePark.getAllCustomers();
						for(int i = 0; i < allCustomersInThePark.size(); i++) {
							if(allCustomersInThePark.get(i).equals(customerName))
								flag1 = true;
						}
						if(flag1 == false) {
							System.out.println("The customer " + customerName + " is not in the theme park.");
						}
						else {
							Scanner sc4 = new Scanner(System.in);
							System.out.println("Which facility does the customer want to purchase from?");
							String facilityName = sc4.nextLine();
							boolean flag2 = false;
							ArrayList<String> allFacilitiesInThePark = myThemePark.getFacilitiesNames();
							for(int i = 0; i < allFacilitiesInThePark.size(); i++) {
								if(allFacilitiesInThePark.get(i).equals(facilityName))
									flag2 = true;
							}
							if(flag2 == false) {
								System.out.println("The facility " + facilityName + " is not in the theme park.");
							}
							else {
								System.out.println("Customer " + customerName + " is now purchasing item from " + facilityName);
								ArrayList<String> facilityStatistics = myThemePark.purchaseItems(customerName, facilityName);
								String str2 = "";
								for(int i = 1; i < facilityStatistics.size(); i++) {
									str2 += facilityStatistics.get(i);
									str2 += "   ";
								}
								System.out.println("The list of customer who has purchased items from " + facilityName + " are: " + str2);
							}
						}
					}
					else {
						Scanner sc3 = new Scanner(System.in);
						System.out.println("Please enter customer's name:");
						String customerName = sc3.nextLine();
						String result = myThemePark.removeCustomer(customerName);
						if(result.equals("No such customer in this park.")) {
							System.out.println("Customer " + customerName + " is not in the theme park.");
						}
						else {
							System.out.println("Customer " + customerName + " left the theme park.");
							System.out.println("Now the list of customers in the theme park is: " + myThemePark.displayAllCustomers());
						}
					}
				}
				else if(num1.equals("3")) {
					System.out.println("Please add a ride in the theme park:");
					Scanner sc2 = new Scanner(System.in);
					String rideName = sc2.nextLine();
					ArrayList<String> ridesNames = myThemePark.getRidesNames();
					boolean flag = true;
					for(int i = 0; i < ridesNames.size(); i++) {
						if(ridesNames.get(i).equals(rideName)) {
							flag = false;
						}
					}
					if(flag == true) {
						System.out.println("Ride " + rideName + " has been successfully added into the theme park.");
						myThemePark.addRides(rideName);
						System.out.println("Now the rides in the theme park are: " + myThemePark.displayAllRides());
					}
					else {
						System.out.println("Ride " + rideName + " has already existed in the theme park.");
						System.out.println("Now the rides in the theme park are: " + myThemePark.displayAllRides());
					}
				}
				else if(num1.equals("4")) {
					System.out.println("Please add a facility in the theme park:");
					Scanner sc2 = new Scanner(System.in);
					String facilityName = sc2.nextLine();
					ArrayList<String> facilitiesNames = myThemePark.getFacilitiesNames();
					boolean flag = true;
					for(int i = 0; i < facilitiesNames.size(); i++) {
						if(facilitiesNames.get(i).equals(facilityName))
							flag = false;
					}
					if(flag == true) {
						System.out.println("Facility " + facilityName + " has been successfully added into the theme park.");
						myThemePark.addFacilities(facilityName);
						System.out.println("Now the facilities in the theme park are: " + myThemePark.displayAllFacilities());
					}
					else {
						System.out.println("Facility " + facilityName + " has already existed in the theme park.");
						System.out.println("Now the facilities in the theme park are: " + myThemePark.displayAllFacilities());
					}
				}
				else if(num1.equals("5")) {
					myThemePark.parkStatistics();
				}
				else break;
			}
			System.out.println();
		}
		sc.close();
	}
}