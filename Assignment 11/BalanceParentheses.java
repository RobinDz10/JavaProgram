import java.util.Scanner;

public class BalanceParentheses {
	
	/* Check the parentheses is balanced in the input string recursively */
	public static boolean balanceParenthesesRecursive(String input, int index, int count) {
		if(index == input.length())
			return count == 0;
		if(input.charAt(index) == '(')
			count++;
		if(input.charAt(index) == ')')
			count--;
		if(count < 0)
			return false;
		return balanceParenthesesRecursive(input, index + 1, count);
	}
	
	/* Check the parentheses is balanced in the input string iteratively */
	public static boolean balanceParenthesesIterative(String input) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(')
				count++;
			if(input.charAt(i) == ')')
				count--;
			if(count < 0)
				return false;
		}
		return count == 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Please input a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Is parentheses balance in the string? " + balanceParenthesesRecursive(str, 0, 0));
		System.out.println("Is parentheses balance in the string? " + balanceParenthesesIterative(str));
		sc.close();
	}
}
