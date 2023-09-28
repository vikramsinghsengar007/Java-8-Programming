package com.interview.verifone;

public class SumArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(findSum(arr, 77));
	}
	private static boolean findSum(int[] arr, int num){
		boolean flag = false;
		
		for(int i =0; i< arr.length-1; i++){
			int max= arr[i];
			for (int j = 1; j < arr.length; j++) {
				max = max + arr[j];
				if(max == num) return true;
			}
		}
		
		return flag;
	}
}
