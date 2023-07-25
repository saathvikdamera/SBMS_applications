package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeAll
	public static void init() {
		calc = new Calculator();
	}
	
	@AfterAll
	public static void destroy() {
		calc = null;
	}

	@Test
	public void addTest() {
	    calc = new Calculator();
		int actualResult = calc.add(20, 30);
		int expectedResult = 50;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void mulTest() {
		calc = new Calculator();
		int actualResult = calc.mul(2, 3);
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

}