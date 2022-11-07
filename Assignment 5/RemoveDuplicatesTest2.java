import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest2 {

	@Test
	void test() {
		RemoveDuplicates test1 = new RemoveDuplicates();
		int[] arr1 = {10, 20, 20, 30, 30, 40, 50, 50};
		int[] temp = test1.removeDups(arr1);
		int[] arr2 = {10, 20, 30, 40, 50};
		assertArrayEquals(temp, arr2);
	}

}
