package com.Assignments2;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharactersInString {

	public String getCharactersCount(String testString) {
		
		Integer charCount = 0;
		LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();

		char[] strArray = testString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCount++;
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
			
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())  {
			if(entry.getValue()>1)
				sb.append(entry.getKey()+""+entry.getValue());
			else
				sb.append(entry.getKey());
		
    }		return sb.toString();

	}

}
