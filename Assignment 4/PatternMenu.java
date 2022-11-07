import java.util.Scanner;
import java.util.Random;

public class PatternMenu {
	
	// Design the output of pattern 1 based on random pattern size of [3, 10]
	public static void pattern1(int num) {
		for(int i = num; i > 0; i--) {
			String str = "";
			if(i == num) {
				for(int j = 0; j < i; j++)
					str += "*";
			}
			else {
				for(int j = 0; j < num - i; j++)
					str += " ";
				for(int j = 0; j < i; j++)
					str += "*";
			}
			System.out.println(str);
		}
	}
	
	// Design the output of pattern 2 based on random pattern size of [3, 10]
	public static void pattern2(int num) {
		for(int i = 0; i < num; i++) {
			String str = "";
			if(i == 0) {
				str += String.valueOf(num);
				for(int j = i + 1; j < num; j++)
					str += " ";
			}
			else if(i == num - 1) {
				for(int j = 0; j < num - 1; j++)
					str += " ";
				str += String.valueOf(num);
			}
			else {
				for(int j = 0; j < i; j++)
					str += " ";
				str += String.valueOf(num);
				for(int j = i + 1; j < num; j++)
					str += " ";
			}
			System.out.println(str);
		}
		for(int i = num - 2; i >= 0; i--) {
			String str = "";
			if(i == 0) {
				str += String.valueOf(num);
				for(int j = i + 1; j < num; j++)
					str += " ";
			}
			else {
				for(int j = 0; j < i; j++)
					str += " ";
				str += String.valueOf(num);
				for(int j = i + 1; j < num; j++)
					str += " ";
			}
			System.out.println(str);
		}
	}
	
	// Design the output of pattern 3 based on random pattern size of [3, 10]
	public static void pattern3(int num) {
		for(int i = 1; i <= num; i++) {
			String str = "";
			String temp = String.valueOf(i);
			for(int j = 0; j < i; j++) {
				str += temp;
			}
			System.out.println(str);
		}
	}
	
	// Design the output of pattern 4 based on random pattern size of [3, 10]
	public static void pattern4(int num) {
		for(int i = 1; i <= num; i++) {
			String str = "";
			for(int j = 0; j < i; j++)
				str += "*";
			System.out.println(str);
		}
		for(int i = num - 1; i > 0; i--) {
			String str = "";
			for(int j = 0; j < i; j++)
				str += "*";
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			// Pattern Menu Initialization
			System.out.println("Valid pattern menu options: A, B, C, D, E");
			System.out.println("Example Menu:");
			System.out.println("A. Pattern 1");
			System.out.println("B. Pattern 2");
			System.out.println("C. Pattern 3");
			System.out.println("D. Pattern 4");
			System.out.println("E. Exit");
			System.out.println("Please enter your option: ");
			String str = sc.nextLine();		// Get option from user input
			int num = rand.nextInt(8);		// Get the pattern size randomly from [0, 7]
			num += 3;		// Change the random pattern size to [3, 10]
			// Output the pattern based on the user input
			if(str.equals("A"))
				pattern1(num);
			else if(str.equals("B")) 
				pattern2(num);
			else if(str.equals("C"))
				pattern3(num);
			else if(str.equals("D")) 
				pattern4(num);
			else if(str.equals("E")){
				System.out.println("Program End!");
				break;
			}
			else System.out.println("Invalid option!");
		}
	}
}
