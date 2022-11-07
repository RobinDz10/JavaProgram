import java.util.Scanner;
import java.util.Arrays;

public class StudentDirectory {
	// This method is to filter students given by the filter of "Minimum Age" (num1), "Minimum Year" (num2), and "Minimum Grade" (num3)
	public static int[] filterStudents(int[][] students, int num1, int num2, int num3) {
		// Create an array of boolean values, each of them represents if the corresponding student can pass the filter or not
		boolean[] s = {true, true, true};
		// Check each student if they pass the filter
		for(int i = 0; i < students.length; i++) {
			if((num1 > students[i][1] && num1 > 0) || (num2 > students[i][2] && num2 > 0) || (num3 > students[i][3] && num3 > 0))
					s[i] = false;
		}
		int count = 0;	// Check how many students pass the filter
		for(int i = 0; i < s.length; i++)
			if(s[i] == true)
				count++;
		int[] res = new int[count];
		int pos = 0;
		// If one student pass all three filters, put the student ID into the return array
		for(int i = 0; i < s.length; i++) {
			if(s[i] == true)
				res[pos++] = students[i][0];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[][] students = {{1, 18, 12, 90}, {2, 16, 10, 75}, {3, 15, 9, 85}};	// Initialize Students Directory
		Scanner sc = new Scanner(System.in);
		System.out.println("User provides the following filter parameters via Scanner input:");
		System.out.print("Minimum Age: ");		// Get the filter of "Minimum Age" from user input
		int num1 = sc.nextInt();
		System.out.print("Minimum Year: ");		// Get the filter of "Minimum Year" from user input
		int num2 = sc.nextInt();
		System.out.print("Minimum Grade: ");	// Get the filter of "Minimum Grade" from user input
		int num3 = sc.nextInt();
		int[] res = filterStudents(students, num1, num2, num3);
		System.out.print("Output: ");
		// Output the input array after filtering
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}
}
