import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest7 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 3, 4, 5};
		MyArrayList test = new MyArrayList(arr1);
		assertEquals(2, test.indexOf(3));
		assertEquals(4, test.indexOf(5));
		assertEquals(-1, test.indexOf(10));
		assertEquals(-1, test.indexOf(0));
	}
	
	@Test
	void test2() {
		int[] arr1 = {1, 2, 3, 4, 5};
		MyArrayList test = new MyArrayList(arr1);
		assertEquals(2, test.indexOf(3));
		assertEquals(4, test.indexOf(5));
		assertEquals(-1, test.indexOf(10));
		assertEquals(-1, test.indexOf(0));
	}
}
