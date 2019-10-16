package com.Assignments2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TwoToneClassTest {

	@Test
	public void shouldNotCreateThirdObectsOfAClass() {

		TwoToneClass twoToneClassObj1 = TwoToneClass.getInstance();
		TwoToneClass twoToneClassObj2 = TwoToneClass.getInstance();
		TwoToneClass twoToneClassObj3 = TwoToneClass.getInstance();
		System.out.println(twoToneClassObj1.hashCode());
		System.out.println(twoToneClassObj2.hashCode());
		System.out.println(twoToneClassObj3.hashCode());
		assertEquals(false, twoToneClassObj1.hashCode() == twoToneClassObj2.hashCode());
		assertEquals(true, twoToneClassObj2.hashCode() == twoToneClassObj3.hashCode());
	}

}
