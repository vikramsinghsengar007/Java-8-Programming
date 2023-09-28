package com.interview.verifone;

public class SecondMaxArray {
	public static void main(String[] args) {
		int arr[] = {13,2,10,44,9,6,7,11,114};
		int max = 0, secMax = 0;
		for(int i=0;i<arr.length; i++){
			if(arr[i] > max){
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax){
				secMax = arr[i];
			}
		}
		System.out.println(secMax);
	}
}
