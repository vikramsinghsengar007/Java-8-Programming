package com.interview.mscript;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonArray {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCaseNo = sc.nextInt();
	int num =  sc.nextInt(); 
	System.out.println(swap(num));	
	}
	private static int swap(int num){
		int finalNum = num;
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(num % 10);
		    num /= 10;
		} while  (num > 0);
		
		
		return finalNum;
	}
}
