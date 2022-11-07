import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ageRestrictedTest2 {

	@Test
	public void test() {
		MovieTicket ageRestrictionTest = new MovieTicket();
		boolean result = ageRestrictionTest.ageRestricted(16, "R");
		assertEquals(true, result);
	}

}
