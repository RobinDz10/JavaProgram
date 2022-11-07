public class Rastaurant {
	private int balance;	// Private variable of Rastaurant
	
	// Initialize the balance of the rastaurant
	public Rastaurant() {
		balance = 0;
	}
	
	// Assign a new value to the balance of the rastaurant
	public void setBalance(int amount) {
		balance = amount;
	}
	
	// Calculate the balance of the rastaurant after purchasing an item
	public void itemPurchase(int deductBalance) {
		balance -= deductBalance;
	}
	
	// Calculate the balance of the rastaurant after selling an item
	public void itemSell(int addBalance) {
		balance += addBalance;
	}
	
	// Get the balance of the rastaurant
	public int getBalance() {
		return balance;
	}
}
