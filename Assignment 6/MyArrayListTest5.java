import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest5 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 3, 4, 5, 9};
		MyArrayList test = new MyArrayList(arr1);
		assertEquals("1 2 3 4 5 9 ", test.toString());
		int[] arr2 = {1, 9, 2, 8, 3, 7};
		test = new MyArrayList(arr2);
		assertEquals("1 9 2 8 3 7 ", test.toString());
	}

}
