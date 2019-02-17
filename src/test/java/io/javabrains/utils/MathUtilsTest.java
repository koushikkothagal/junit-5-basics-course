package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private MathUtils mathUtils;
	
	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, 
				"Add method should return the sum of two numbers");
	}
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
}