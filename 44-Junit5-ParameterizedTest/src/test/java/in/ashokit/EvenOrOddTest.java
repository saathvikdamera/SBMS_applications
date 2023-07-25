package in.ashokit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EvenOrOddTest {
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	public void testCheckNumber(String input,String expected) {
		EvenOrOdd e = new EvenOrOdd();
		String actual = e.checkNumber(Integer.parseInt(input));
		assertEquals(expected, actual);
	}

}
