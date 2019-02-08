package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Checkout;

public class DartsTest {
	@Test
	public void test() {

		assertEquals("D20", Checkout.checkoutCalculator(40));
		assertEquals("1, D19", Checkout.checkoutCalculator(39));
		assertEquals("Bull", Checkout.checkoutCalculator(50));
		assertEquals("No outshot", Checkout.checkoutCalculator(1760));
		for (int i = 170; i > 0; i--) {
			System.out.println(i +": "+Checkout.checkoutCalculator(i));

		}
	}

}
