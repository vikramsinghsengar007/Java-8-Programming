package com.hackerrank;

import java.util.*;
import java.util.Map.Entry;

public class MigratyBird {
	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		System.out.println(migratoryBirds(arr));
	}
	
	static int migratoryBirds(List<Integer> arr) {
		int maxFreq = 1;
		Map<Integer, Integer> freqMap = new HashMap<>(); 
		for (Integer integer : arr) {
			if(!freqMap.isEmpty() && freqMap.keySet().contains(integer))
				freqMap.put(integer, freqMap.get(integer)+1);
			else {
				freqMap.put(integer, maxFreq);
		}}
		
		return Collections.max(freqMap.entrySet(), new Comparator<Entry<Integer, Integer>>() {
	        public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
	            return e1.getValue()
	                .compareTo(e2.getValue());
	        }}
	    ).getKey();
	}
}
