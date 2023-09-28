package com.hackerrank;

import java.util.HashSet;

public class Pairs {

	public static void main(String[] args) {
		System.out.println(pairs(2, new int[] {1,5,3,4,2}));
	}
	
	
	 static int pairs(int k, int[] arr) {
		 
		 HashSet<Integer> map = new HashSet<>();
		    for(int i=0; i<arr.length; i++){
		        map.add(arr[i]);
		    }
		    int pairCount = 0;
		    for(int i=0; i<arr.length; i++){
		        if(map.contains(arr[i]-k)){
		            pairCount++;
		        }
		    }
		    return pairCount;
	 }
}
