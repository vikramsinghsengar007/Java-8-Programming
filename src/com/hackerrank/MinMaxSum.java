package com.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinMaxSum {
	static int arr[] = {1,2,3,4,5};
	public static void main(String[] args) {
		miniMaxSum(arr);
	}
	static void miniMaxSum(int[] arr) {
		Map<Integer, Integer> map= new HashMap();
		int index = 0, sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			
			map.put(arr[i], sum-arr[i]);
		}
		int max = Collections.max(map.values());
		int min = Collections.min(map.values());
		for (int i = 0; i < arr.length; i++) {
			
		}
		
    }

}
