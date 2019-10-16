package com.Assignments2;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Test;

public class HashmapSortingBasedOnValuesTest {
	
	@Test
	public void shouldSortHashMapOnTheBasisOfObjectsValues() {
		HashMap<String, Integer> testHashMap = new HashMap<String, Integer>();
		testHashMap.put("Ram", 43);
		testHashMap.put("Shyam", 123);
		testHashMap.put("Mohan", 861);
		testHashMap.put("Raghav", 12);
		testHashMap.put("Laxman", 2);
		testHashMap.put("Sudhir", 76);
		
		LinkedHashMap<String, Integer> expectedHashMap = new LinkedHashMap<String, Integer>();
		expectedHashMap.put("Laxman", 2);
		expectedHashMap.put("Raghav", 12);
		expectedHashMap.put("Ram", 43);
		expectedHashMap.put("Sudhir", 76);
		expectedHashMap.put("Shyam", 123);
		expectedHashMap.put("Mohan", 861);
		
		
		HashmapSortingBasedOnValues hashmapSortingBasedOnValues = new HashmapSortingBasedOnValues();
		HashMap<String, Integer> actual = hashmapSortingBasedOnValues.sortHashMapBasedOnValues(testHashMap);
		assertEquals(expectedHashMap.toString(), actual.toString());
	}

}
