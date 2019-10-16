package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SecondHighestNumberInArrayTest {
	
	@Test
	public void shouldReturnSecondHighestNumberFromArray() {
		Integer[] testArray = new Integer[] {12, 3, 43, 42, 2, 2};
		SecondHighestNumberInArray secondHighestNumberInArray = new SecondHighestNumberInArray();
		Integer actual = secondHighestNumberInArray.getSecondHighestNumberFromArray(testArray);
		assertEquals(42, actual);
	}

}
