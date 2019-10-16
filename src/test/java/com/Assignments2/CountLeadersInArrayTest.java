package com.Assignments2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CountLeadersInArrayTest {
	
	@Test
	public void shouldReturnCountOfLeadersFormArray() {
		Integer[] testArray = new Integer[] {2, 5, 13, 6, 7, 5, 2};
		Integer[] expectedArray = new Integer[] {13, 7, 5, 2};
		List<Integer> expectedList = Arrays.asList(expectedArray);
		CountLeadersInArray countLeadersInArray = new CountLeadersInArray();
		 List<Integer> actual = countLeadersInArray.getLeadersCount(testArray);
		assertEquals(expectedList, actual);
	}

}
