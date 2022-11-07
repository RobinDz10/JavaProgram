import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest4 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 0, 3, 4, 9};
		MyArrayList test = new MyArrayList(arr1);
		int[] arr2 = {1, 2, 0, 4, 9};
		test.remove(3);
		assertArrayEquals(arr2, test.getMyArrayList());
		int[] arr3 = {2, 0, 4, 9};
		test.remove(1);
		assertArrayEquals(arr3, test.getMyArrayList());
	}

}
