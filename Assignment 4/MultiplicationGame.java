import java.util.Random;
import java.util.Scanner;

public class MultiplicationGame {
	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(12);	// Generate the first integer, the range is: [0, 12)
		int num2 = rand.nextInt(12);	// Generate the second integer, the range is: [0, 12)
		num1 += 1;		// Now the range of first integer is: [1, 13), which is [1, 12]
		num2 += 1;		// Now the range of second integer is: [1, 13), which is [1, 12]
		int count = 0;		// Set a counter to count the guessing times
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please guess an integer:");
			int num = sc.nextInt();		// User input: guessing number
			count++;		// Update the guessing time
			// If guessing is right, output the guessing time, otherwise keep guessing
			if(num == num1 * num2) {
				System.out.println("Your guessing is right! Your total number of guessing is: " + count);
				break;
			}		
			else
				System.out.println("Your guessing is wrong. Please try it again.");
		}
	}
}

