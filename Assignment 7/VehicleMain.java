import java.util.Scanner;

public class VehicleMain {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter the make of the car:");
		String str1 = sc1.nextLine();
		System.out.println("Please enter the color of the car:");
		String str2 = sc1.nextLine();
		System.out.println("Please enter the year of the car:");
		int num1 = sc2.nextInt();
		System.out.println("Please enter the model of the car:");
		String str3 = sc1.nextLine();
		System.out.println("Please enter the bodystyle of the car:");
		String str4 = sc1.nextLine();
		System.out.println("Please enter the current speed of the car:");
		int num2 = sc2.nextInt();
		System.out.println("Please enter the top speed of the car:");
		int num3 = sc2.nextInt();

		Car myCar = new Car(str1, str2, num1, str3, str4, num2, num3);
		myCar.carDetails();
	}
}
