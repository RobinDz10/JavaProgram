import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ageRestrictedTest1 {

	@Test
	public void test() {
		MovieTicket ageRestrictionTest = new MovieTicket();
		boolean result = ageRestrictionTest.ageRestricted(5, "PG13");
		assertEquals(true, result);
	}

}
