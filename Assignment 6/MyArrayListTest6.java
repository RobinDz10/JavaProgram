import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest6 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 3, 4, 5, 9};
		MyArrayList test = new MyArrayList(arr1);
		assertEquals(6, test.getSize());
		assertEquals(false, test.isEmpty());
		int[] arr2 = {0, 1, 9};
		test = new MyArrayList(arr2);
		assertEquals(3, test.getSize());
		assertEquals(false, test.isEmpty());
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		test = new MyArrayList(arr3);
		assertEquals(9, test.getSize());
		assertEquals(false, test.isEmpty());
		int[] arr4 = {};
		test = new MyArrayList(arr4);
		assertEquals(0, test.getSize());
		assertEquals(true, test.isEmpty());
	}

}
