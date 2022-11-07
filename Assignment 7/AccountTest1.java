import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest1 {

	@Test
	void test1() {
		Savings savingAccount = new Savings();
		savingAccount.deposit(1000);
		assertEquals(21800, savingAccount.balance);
	}
	
	@Test
	void test2() {
		Savings savingAccount = new Savings();
		savingAccount.withdraw(2000);
		assertEquals(16400, savingAccount.balance);
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
		currentAccount.deposit(1000);
		assertEquals(21000, currentAccount.balance);
	}
	
	@Test
	void test6() {
		Current currentAccount = new Current();
		currentAccount.withdraw(1000);
		assertEquals(19000, currentAccount.balance);
	}
}
