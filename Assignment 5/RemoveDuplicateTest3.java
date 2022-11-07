import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicateTest3 {

	@Test
	void test() {
		RemoveDuplicates test1 = new RemoveDuplicates();
		int[] arr1 = {0, 0, 0, 1, 1, 3, 3, 3, 4, 5, 5, 6, 6, 6, 8, 9, 10, 10};
		int[] temp = test1.removeDups(arr1);
		int[] arr2 = {0, 1, 3, 4, 5, 6, 8, 9, 10};
		assertArrayEquals(temp, arr2);
	}

}
