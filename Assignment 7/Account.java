/* Base class: Account */
public class Account {
	protected double balance;
	
	/* Class "Account" constructor */
	public Account(double amount) {
		balance = amount;
	}
	
	/* Withdraw money from the account */
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	/* Deposit money to the account */
	public void deposit(double amount) {
		balance += amount;
	}
	
	/* Print the balance of the account */
	public void printBalance() {
		System.out.println("The balance of this account is: " + balance);
	}
	
	/* Question:
	 * 
	 * Can we override the final method, True or false? and briefly explain the reason?
	 * False, we cannot override the final method, because final means the method has been completely made and wish no changes, 
	 * 		thus if we try to override the final method, we will get an error from the compiler.
	 * 
	 * */
}

class Savings extends Account{
	private double interestRate = 0.8;
	
	/* Sub-class "Savings" constructor */
	public Savings() {
		super(20000);
	}
	
	/* Withdraw money from the savings account */
	public void withdraw(double amount) {
		this.balance -= (amount + amount * interestRate);
	}
	
	/* Deposit money to the savings account */
	public void deposit(double amount) {
		this.balance += (amount + amount * interestRate);
	}
	
	/* Print out the balance of the savings account */
	public void printBalance() {
		System.out.println("Balance in your saving account: " + this.balance);
	}
}

class Current extends Account{
	/* Sub-class "Current" constructor */
	public Current() {
		super(20000);
	}
	
	/* Withdraw money from the current account */
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	/* Deposit money to the current account */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/* Print out the balance of the current account */
	public void printBalance() {
		System.out.println("Balance in your current account: " + this.balance);
	}
}


/*
 * Questions:
 * 
 * 1. What are abstract classes?
 * Abstract classes are super classes which are used for describing general objects. They cannot be instantiated.
 * 
 * 
 * 2. An abstract class cannot be instantiated, so it cannot have a constructor - True or false? Briefly explain why?
 * False, abstract classes cannot be instantiated does not mean they cannot have constructor. In abstract classes, we still have to initialize 
 * 		some properties like instance variable and non-abstract methods, therefore abstract classes still have constructors.
 * 
 * 
 * 3. Can abstract class have methods other than abstract methods - True or false?
 * False, like question 2, besides abstract methods, abstract classes can contain other properties like non-abstract methods.
 * */
 