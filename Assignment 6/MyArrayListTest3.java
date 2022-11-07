import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest3 {

	@Test
	void test() {
		int[] arr1 = {1, 2, 3, 4, 5, 9};
		MyArrayList test = new MyArrayList(arr1);
		int[] arr2 = {1, 2, 3, 5, 9};
		test.remove(4);
		assertArrayEquals(arr2, test.getMyArrayList());
	}

}
