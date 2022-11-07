import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ageRestrictedTest3 {

	@Test
	public void test() {
		MovieTicket ageRestrictionTest = new MovieTicket();
		boolean result = ageRestrictionTest.ageRestricted(25, "R");
		assertEquals(false, result);
	}

}
