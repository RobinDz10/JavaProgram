import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ComputerScientistsTest {

	/* Test for getName() and setName() */
	@Test
	void test1() {
		ComputerScientists person1 = new ComputerScientists();
		person1.setName("leo");
		assertEquals("leo", person1.getName());
	}
	
	@Test
	void test2() {
		ComputerScientists person2 = new ComputerScientists();
		person2.setName("josh");
		assertEquals("josh", person2.getName());
	}
	
	/* Test for getArea() and setArea() */
	@Test
	void test3() {
		ComputerScientists person3 = new ComputerScientists();
		person3.setArea("Spring");
		person3.setArea("Summer");;
		person3.setArea("Autumn");
		person3.setArea("Winter");
		String[] result = {"Spring", "Summer", "Autumn", "Winter"};
		String[] person3Areas = new String[4];
		for(int i = 0; i < person3.getArea().size(); i++) {
			person3Areas[i] = person3.getArea().get(i);
		}
		assertArrayEquals(result, person3Areas);
	}
	
	@Test
	void test4() {
		ComputerScientists person4 = new ComputerScientists();
		person4.setArea("Europe");
		person4.setArea("America");;
		person4.setArea("Asia");
		person4.setArea("Africa");
		person4.setArea("Antarctica");
		String[] result = {"Europe", "America", "Asia", "Africa", "Antarctica"};
		String[] person4Areas = new String[5];
		for(int i = 0; i < person4.getArea().size(); i++) {
			person4Areas[i] = person4.getArea().get(i);
		}
		assertArrayEquals(result, person4Areas);
	}
	
	/* Test for getContribution() and setContribution()*/
	@Test
	void test5() {
		ComputerScientists person5 = new ComputerScientists();
		person5.setContribution("hello");
		String result = "hello";
		assertEquals(result, person5.getContribution());
	}
	
	@Test
	void test6() {
		ComputerScientists person6 = new ComputerScientists();
		person6.setContribution("This is java course");
		String result = "This is java course";
		assertEquals(result, person6.getContribution());
	}
}
