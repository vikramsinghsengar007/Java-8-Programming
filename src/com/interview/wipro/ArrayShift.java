package com.interview.wipro;

public class ArrayShift {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2};
		System.out.println(shiftArr(2, arr));
	}
	
	private static int[] shiftArr(int num, int[] arr){
		int finalarr[]= new int[arr.length];
		for (int i = 0; i < arr.length-1; i++) {
			 if(arr[i] == num){
				 arr[i] = arr[i++];
				 arr[i++] = arr[i];
				 finalarr[i]= arr[i];
			 }
		}
		return finalarr;
	}
}
