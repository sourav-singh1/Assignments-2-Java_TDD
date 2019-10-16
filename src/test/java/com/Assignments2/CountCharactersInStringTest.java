package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountCharactersInStringTest {
	
	@Test
	public void shouldReturnNumbersOfOccurancaeOfCharactersInString() {
		String testString = "iamyashemployee";
		CountCharactersInString countCharactersInString = new CountCharactersInString();
		String actual = countCharactersInString.getCharactersCount(testString);
		assertEquals(true, "ia2m2y2she3plo".equals(actual));
	}
}
