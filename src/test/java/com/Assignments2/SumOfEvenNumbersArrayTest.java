package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenNumbersArrayTest {
	
	@Test
	public void shouldReturnSumOfEvenNumberFromArray() {
		Integer[] testArray = new Integer[] {1, 2, 3, 5, 6, 8, 9, 22, 2};
		SumOfEvenNumbersArray sumOfEvenNumbersArray = new SumOfEvenNumbersArray();
		Integer actual = sumOfEvenNumbersArray.getSumOfEvenNumbers(testArray);
		assertEquals(40, actual);
	}

}
