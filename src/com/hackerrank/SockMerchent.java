package com.hackerrank;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SockMerchent {
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(sockMerchant(9, arr));
		System.out.println(sockMerchant(9, collect));
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

	static int sockMerchant(int n, List<Integer> ar){
		int sum = ar.stream().distinct().mapToInt(number -> {
			int frequency = Collections.frequency(ar, number);
			return frequency % 2 == 0 ? frequency : frequency - 1;
		}).sum();
		return sum/2;
	}

}
