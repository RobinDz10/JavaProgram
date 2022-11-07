import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest1 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 3, 4, 5};
		MyArrayList test = new MyArrayList(arr1);
		int[] arr2 = {1, 2, 3, 4, 5, 9};
		test.add(9);
		assertArrayEquals(arr2, test.getMyArrayList());
	}

}
