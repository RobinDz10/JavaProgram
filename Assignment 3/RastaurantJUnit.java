public class RastaurantJUnit {
	public static void main(String[] args) {
		Rastaurant r1 = new Rastaurant();	// Create a Rastaurant object named r1
		r1.setBalance(1000); 				// Set initial balance of r1 to 1000
		System.out.println("The initial balance of rastaurant r1 is: " + r1.getBalance());						// Print out the balance of r1
		r1.itemPurchase(50);				// r1 purchase an item, which worth 50. Calculate the balance after the purchase
		System.out.println("After the first purchase, the balance of rastaurant r1 is: " + r1.getBalance());	// Print out the balance of r1
		r1.itemSell(15);					// r1 sell an item, which worth 15. Calculate the balance after the sell
		System.out.println("After the first sell, the balance of rastaurant r1 is: " + r1.getBalance());		// Print out the balance of r1
		r1.itemPurchase(150);				// r1 purchase an item, which worth 150. Calculate the balance after the purchase
		System.out.println("After the second purchase, the balance of rastaurant r1 is: " + r1.getBalance());	// Print out the balance of r1
		r1.itemSell(220);					// r1 sell an item, which worth 15. Calculate the balance after the sell
		System.out.println("After the second sell, the balance of rastaurant r1 is: " + r1.getBalance());		// Print out the balance of r1
		System.out.println("Now the balance of rastaurant r1 is: " + r1.getBalance());							// Print out the balance of r1
		
		System.out.println("====================================================================");
		
		Rastaurant r2 = new Rastaurant();	// Create a Rastaurant object named r2
		r2.setBalance(500);					// Set initial balance of r2 to 500
		System.out.println("The initial balance of rastaurant r2 is: " + r2.getBalance());						// Print out the balance of r2
		r2.itemPurchase(150);				// r2 purchase an item, which worth 150. Calculate the balance after the purchase
		System.out.println("After the first purchase, the balance of rastaurant r2 is: " + r2.getBalance());	// Print out the balance of r2
		r2.itemSell(20);					// r2 sell an item, which worth 20. Calculate the balance after the sell
		System.out.println("After the first sell, the balance of rastaurant r2 is: " + r2.getBalance());		// Print out the balance of r2
		r2.itemPurchase(100);				// r2 purchase an item, which worth 100. Calculate the balance after the purchase
		System.out.println("After the second purchase, the balance of rastaurant r2 is: " + r2.getBalance());	// Print out the balance of r2
		r2.itemSell(200);					// r2 sell an item, which worth 200. Calculate the balance after the sell
		System.out.println("After the second sell, the balance of rastaurant r2 is: " + r2.getBalance());		// Print out the balance of r2
		System.out.println("Now the balance of rastaurant r2 is: " + r2.getBalance());							// Print out the balance of r2
		
		System.out.println("====================================================================");
		
		Rastaurant r3 = new Rastaurant();	// Create a Rastaurant object named r2
		r3.setBalance(567);					// Set initial balance of r3 to 567
		System.out.println("The initial balance of rastaurant r3 is: " + r3.getBalance());						// Print out the balance of r3
		r3.itemPurchase(123);				// r3 purchase an item, which worth 123. Calculate the balance after the purchase
		System.out.println("After the first purchase, the balance of rastaurant r3 is: " + r3.getBalance());	// Print out the balance of r3
		r3.itemSell(321);					// r3 sell an item, which worth 321. Calculate the balance after the sell
		System.out.println("After the first sell, the balance of rastaurant r3 is: " + r3.getBalance());		// Print out the balance of r3
		r3.itemPurchase(234);				// r3 purchase an item, which worth 234. Calculate the balance after the purchase
		System.out.println("After the second purchase, the balance of rastaurant r3 is: " + r3.getBalance());	// Print out the balance of r3
		r3.itemSell(432);					// r3 sell an item, which worth 432. Calculate the balance after the sell
		System.out.println("After the second sell, the balance of rastaurant r3 is: " + r3.getBalance());		// Print out the balance of r3
		System.out.println("Now the balance of rastaurant r3 is: " + r3.getBalance());							// Print out the balance of r3
	
	}
}
