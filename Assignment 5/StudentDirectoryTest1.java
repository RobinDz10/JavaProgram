import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentDirectoryTest1 {

	@Test
	void test() {
		StudentDirectory test1 = new StudentDirectory();
		int[][] students = {{1, 18, 12, 90}, {2, 16, 10, 75}, {3, 15, 9, 85}};
		int[] result1 = test1.filterStudents(students, -1, -1, 80);
		int[] res = {1, 3};
		assertArrayEquals(result1, res);
	}

}
