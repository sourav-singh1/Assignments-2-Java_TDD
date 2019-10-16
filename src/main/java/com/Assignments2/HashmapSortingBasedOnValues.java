package com.Assignments2;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class HashmapSortingBasedOnValues {

	public HashMap<String, Integer> sortHashMapBasedOnValues(HashMap<String, Integer> testHashMap) {
		
		 List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(testHashMap.entrySet()); 
	  
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp;
	}

}
