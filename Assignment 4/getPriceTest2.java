import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class getPriceTest2 {

	@Test
	public void test() {
		MovieTicket getPriceTest = new MovieTicket();
		int result = getPriceTest.getPrice(20);
		assertEquals(12, result);
	}

}
