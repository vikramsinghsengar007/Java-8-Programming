package com.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DivisibleSumPair {
	public static void main(String[] args) {
		System.out.println(divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2}));
		System.out.println(divisibleSumPairsMap(6, 3, new int[] {1, 3, 2, 6, 1, 2}));
	}
	
	 static int divisibleSumPairs(int n, int k, int[] ar) {
		 int count = 0;
		 for (int i = 0; i < n-1; i++) {
			 for (int j = i+1; j < n; j++) {
				 if((ar[i] + ar[j]) %k ==0) {
					 count ++;
				 }
			}
		}
		 
		 return count;
	    }
	 
	 static int divisibleSumPairsMap(int n, int k, int[] ar) {
		 int count = 0;
		 Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			map.put(ar[i], map.containsKey(ar[i]) ? map.get(ar[i]) + 1 : 1);
		}
		
		 Set<Integer> set = new HashSet<>();
		 for (int i = 0; i < ar.length; i++) {
			 int temp= k-ar[i];
			 if(map.containsKey(temp) && (temp + ar[i])%k == 0) {
				 map.put(temp, map.get(temp)-1);
				 count++;
			 }
			 
		}
		 
		 System.out.println(map);
		 return count;
	 }
}
