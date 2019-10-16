package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableClassTest {

	@Test
	public void shouldNotChangeImmutableObject() {

		ImmutableClass immutableObj = ImmutableClass.createNewInstance(1, "Sourav");
		ImmutableClass expectedImmutableObj = ImmutableClass.createNewInstance(1, "Sourav");
		tryModification(immutableObj.getImmutableField1(), immutableObj.getImmutableField2());
		assertEquals(true, expectedImmutableObj.toString().equals(immutableObj.toString()));
	}

	private static void tryModification(Integer immutableField1, String immutableField2) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
	}
}
