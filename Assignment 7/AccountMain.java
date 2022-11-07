import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Savings savingAccount = new Savings();
		Current currentAccount = new Current();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the bank!");
		while(true) {
			System.out.println("Please select the number of your account: 1. Saving account; 2. Current account; 3. Quit program");
			int num1 = sc.nextInt();
			if(num1 == 1) {
				System.out.println("Please select your option: 1. Deposit; 2. Withdraw");
				int num2 = sc.nextInt();
				Scanner sc1 = new Scanner(System.in);
				if(num2 == 1) {
					System.out.println("How much money do you want to deposit?");
					double num3 = sc1.nextDouble();
					savingAccount.deposit(num3);
					savingAccount.printBalance();
				}
				else if(num2 == 2) {
					System.out.println("How much money do you want to withdraw?");
					double num3 = sc1.nextDouble();
					savingAccount.withdraw(num3);
					savingAccount.printBalance();
				}
				else {
					System.out.println("Invalid option!");
					continue;
				}
			}
			else if(num1 == 2) {
				System.out.println("Please select your option: 1. Deposit; 2. Withdraw");
				int num2 = sc.nextInt();
				Scanner sc1 = new Scanner(System.in);
				if(num2 == 1) {
					System.out.println("How much money do you want to deposit?");
					double num3 = sc1.nextDouble();
					currentAccount.deposit(num3);
					currentAccount.printBalance();
				}
				else if(num2 == 2) {
					System.out.println("How much money do you want to deposit?");
					double num3 = sc1.nextDouble();
					currentAccount.withdraw(num3);
					currentAccount.printBalance();
				}
				else {
					System.out.println("Invalid option!");
					continue;
				}
			}
			else if(num1 == 3) {
				System.out.println("Goodbye!");
				break;
			}
			else {
				System.out.println("Invalid option");
			}
		}
	}
}
