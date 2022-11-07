import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest2 {

	@Test
	void test() {
		int[] arr1 = {1, 9, 2, 8, 3, 7};
		MyArrayList test = new MyArrayList(arr1);
		int[] arr2 = {1, 9, 2, 8, 3, 7, 5};
		test.add(5);
		assertArrayEquals(arr2, test.getMyArrayList());
	}

}
