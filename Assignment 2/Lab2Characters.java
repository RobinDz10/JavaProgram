import java.util.Scanner;

public class Lab2Characters {
	
	// This method is to calculate the integer value of a single character
	public static int getIntVal(char ch) {
		return (int)ch;	// Return the character's corresponding integer value
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string:");
		String str = sc.nextLine(); // Create a string which was input by the user
		int length = str.length();
		System.out.println("The int value of each character in the original string is:");
		for(int i = 0; i < length; ++i) {
			char ch = str.charAt(i); // Store each character and then calculate the corresponding integer value
			System.out.print(getIntVal(ch) + "\t"); // print out the corresponding integer value of each character in the original string
		}
	}
}
