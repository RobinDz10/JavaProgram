import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class getPriceTest1 {

	@Test
	public void test() {
		MovieTicket getPriceTest = new MovieTicket();
		int result = getPriceTest.getPrice(10);
		assertEquals(5, result);
	}

}
