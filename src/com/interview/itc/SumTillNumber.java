package com.interview.itc;

public class SumTillNumber {

	public static void main(String[] args) {
		
		int sum = 1;
		for (int i = 1; i < 3; i++) {
			sum += sum * 1; 
		}
		System.out.println(sum);

	}

}
