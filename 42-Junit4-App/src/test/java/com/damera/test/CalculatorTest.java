package com.damera.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.damera.Calculator;

public class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeClass
	public static void beforeAll() {
		calc = new Calculator();
	}
	
	@AfterClass
	public static void afterAll() {
		calc = null;
	}


	@Test
	public void testAdd() {
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testMultiply() {
		Integer actualResult = calc.multiply(10, 30);
		Integer expectedResult = 300;
		
		assertEquals(expectedResult, actualResult);
	}
	
	
}
