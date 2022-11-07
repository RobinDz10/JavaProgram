import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest1 {

	@Test
	void test() {
		RemoveDuplicates test1 = new RemoveDuplicates();
		int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int[] temp = test1.removeDups(arr1);
		int[] arr2 = {0, 1, 2, 3, 4};
		assertArrayEquals(temp, arr2);
	}

}
