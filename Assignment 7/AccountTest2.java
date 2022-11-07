import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest2 {

	@Test
	void test1() {
		Savings savingAccount = new Savings();
		savingAccount.deposit(2000);
		assertEquals(23600, savingAccount.balance);
	}
	
	@Test
	void test2() {
		Savings savingAccount = new Savings();
		savingAccount.withdraw(4000);
		assertEquals(12800, savingAccount.balance);
	}
	
	@Test
	void test3() {
		Savings savingAccount = new Savings();
		assertEquals(20000, savingAccount.balance);
	}
	
	@Test
	void test4() {
		Current currentAccount = new Current();
		assertEquals(20000, currentAccount.balance);
	}
	
	@Test
	void test5() {
		Current currentAccount = new Current();
		currentAccount.deposit(5000);
		assertEquals(25000, currentAccount.balance);
	}
	
	@Test
	void test6() {
		Current currentAccount = new Current();
		currentAccount.withdraw(2500);
		assertEquals(17500, currentAccount.balance);
	}
}
