package com.Assignments2;

import java.util.Arrays;

public class SecondHighestNumberInArray {

	public Integer getSecondHighestNumberFromArray(Integer[] testArray) {
		Arrays.sort(testArray);
		return testArray[testArray.length-2];
	}

}
