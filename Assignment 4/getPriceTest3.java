import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class getPriceTest3 {

	@Test
	public void test() {
		MovieTicket getPriceTest = new MovieTicket();
		int result = getPriceTest.getPrice(15);
		assertEquals(9, result);
	}

}
