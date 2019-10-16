package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AngramStringTest {
	
	@Test
	public void shouldReturnTrueIfTwoStringsAreAnagramTest1() {
		String str1 = "keep";
		String str2 = "Peek";
		AngramString angramString = new AngramString();
		boolean actual = angramString.isAnagram(str1, str2);
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldReturnTrueIfTwoStringsAreAnagramTest2() {
		String str1 = "Mother In Law"; 
		String str2 = "Hitler Woman";
		AngramString angramString = new AngramString();
		boolean actual = angramString.isAnagram(str1, str2);
		assertEquals(true, actual);
	}
	
	@Test
	public void shouldReturnFalseIfTwoStringsAreNotAnagram() {
		String str1 = "Mother In Law"; 
		String str2 = "Hitler Womans";
		AngramString angramString = new AngramString();
		boolean actual = angramString.isAnagram(str1, str2);
		assertEquals(false, actual);
	}
}
