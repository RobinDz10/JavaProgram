import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentDirectoryTest3 {

	@Test
	void test() {
		StudentDirectory test1 = new StudentDirectory();
		int[][] students = {{1, 18, 12, 90}, {2, 16, 10, 75}, {3, 15, 9, 85}};
		int[] result1 = test1.filterStudents(students, 20, -1, 80);
		int[] res = {};
		assertArrayEquals(result1, res);
	}

}
