import java.util.Scanner;
/*
 * Pseudo-code:
 * First: Check the length of String single and String multiple.
 *        If single.length() == 0, or multiple.length() < single.length(), or multiple.length() % single.length() != 0
 *        		That means multiple cannnot be built by single
 *        Create an integer variable named scale, and scale = multiple.length() / single.length()
 *        Use String built-in method repeat(), repeat single for a scale time
 *        Check if the repeated String single equals to the String multiple
 *        Return true if equal, otherwise return false
 */
public class StringMultiples {
	public static boolean checkIfMultipleOf(String single, String multiple) {
		int length1 = single.length();
		int length2 = multiple.length();
		if(length2 < length1 || length1 == 0 || length2 % length1 != 0) // Check for some possible false cases
			return false;
		int scale = length2 / length1;  // Check the scale of the length between "single" and "multiple"
		single = single.repeat(scale);  // Repeat the single string with the "scale time"
		return single.equals(multiple); // Check if the repeated single string equals to the multiple string
	}
	
	// Test client
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String str1;
		System.out.println("Please input the first sentence: ");
		str1 = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		String str2;
		System.out.println("Please input the second sentence: ");
		str2 = sc2.nextLine();
		System.out.println("Can the second sentence be built by the repeat of the first sentence? " + checkIfMultipleOf(str1, str2));
		
		/*
		 * Test Cases:
		 * 1. "cat", "catcatcat". 	Expected return result: true
		 * 2. "cat", "catdatcat". 	Expected return result: false
		 * 3. "cat", "cat". 		Expected return result: true
		 * 4. "cat", "catcatCat". 	Expected return result: false
		 * 5. "cat", "". 			Expected return result: false
		 * 6. "cat", "catcatc". 	Expected return result: false
		 * 7. "dog", "doG".			Expected return result: false
		 * 8. "DoG", "DoGDoGDoGDoG"	Expected return result: true
		 * 9. "a", "aaaaaaaaaaaa"	Expected return result: true
		 * 10. "abc", "abccba"		Expected return result: false
		 */
	}
}
