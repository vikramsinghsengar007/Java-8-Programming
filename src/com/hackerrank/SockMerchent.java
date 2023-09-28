package com.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SockMerchent {
	public static void main(String[] args) {
		System.out.println(sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
	}
	
	
	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (countMap.containsKey(ar[i])) {
				countMap.put(ar[i], countMap.get(ar[i]) + 1);
			} else {
				countMap.put(ar[i], 1);
			}
		}
		for (Iterator<Entry<Integer, Integer>> iterator = countMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, Integer> type = iterator.next();
			Integer key = type.getKey();
			int temp = 0;
			if (countMap.get(key) >= 2) {
				temp = countMap.get(key) / 2;
				pairs = pairs + temp;
			}
		}

		return pairs;
	}
}
