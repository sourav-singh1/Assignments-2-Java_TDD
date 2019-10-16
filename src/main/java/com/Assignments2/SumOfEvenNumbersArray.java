package com.Assignments2;

import java.util.Arrays;

public class SumOfEvenNumbersArray {

	public Integer getSumOfEvenNumbers(Integer[] testArray) {
		Integer sum = Arrays.asList(testArray).stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
		return sum;
	}

}
