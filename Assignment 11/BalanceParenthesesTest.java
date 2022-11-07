import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalanceParenthesesTest {

	/* First test for .balanceParenthesesRecursive() method */
	@Test
	void test1() {
		assertEquals(true, BalanceParentheses.balanceParenthesesRecursive("((()))", 0, 0));
	}

	
	/* Second test for .balanceParenthesesRecursive() method */
	@Test
	void test2() {
		assertEquals(false, BalanceParentheses.balanceParenthesesRecursive("( Hello (Hi) world", 0, 0));
	}
	
	
	/* Third test for .balanceParenthesesRecursive() method */
	@Test
	void test3() {
		assertEquals(true, BalanceParentheses.balanceParenthesesRecursive("(I (like to (code) in Java))", 0, 0));
	}
	
	
	/* First test for .balanceParenthesesIterative() method */
	@Test
	void test4() {
		assertEquals(true, BalanceParentheses.balanceParenthesesIterative("((()))"));
	}
	
	
	/* Second test for .balanceParenthesesIterative() method */
	@Test
	void test5() {
		assertEquals(false, BalanceParentheses.balanceParenthesesIterative("( Hello (Hi) world"));
	}
	
	
	/* Third test for .balanceParenthesesIterative() method */
	@Test
	void test6() {
		assertEquals(true, BalanceParentheses.balanceParenthesesIterative("(I (like to (code) in Java))"));
	}
}
