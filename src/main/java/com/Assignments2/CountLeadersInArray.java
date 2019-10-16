package com.Assignments2;

import java.util.ArrayList;
import java.util.List;

public class CountLeadersInArray {

	public List<Integer> getLeadersCount(Integer[] testArray) {
		List<Integer> resultList = new ArrayList<Integer>();

		for (int i = 0; i < testArray.length; i++) {
			int j;
			for (j = i + 1; j < testArray.length; j++) {
				if (testArray[i] <= testArray[j]) {
					break;
				}
			}
			if (j == testArray.length) { 
				resultList.add(testArray[i]);
			}
		}

		return resultList;
	}

}
