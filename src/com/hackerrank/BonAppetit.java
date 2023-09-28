package com.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BonAppetit {
		public static void main(String[] args) {
		List<Integer> bill = new ArrayList<>();
		bill.add(72);          
		bill.add(53);
		bill.add(60);
		bill.add(66);
		bill.add(90);
		bill.add(62);
		bill.add(12);
		bill.add(31);
		bill.add(36);
		bill.add(94);
		bonAppetit(bill, 6, 288);
		}
		
		static void bonAppetit(List<Integer> bill, int k, int b) {
	        int refund = 0;
	        
	        Integer arr[] = new Integer[bill.size()];
			  arr =  bill.toArray(arr);
			  int totalSum =0, annaSum=0;
			  for (int i = 0; i < arr.length; i++) {
				totalSum += arr[i];
				if(i != k) {
					annaSum += arr[i];
				}
			}
			  totalSum = totalSum/2;
			  annaSum = annaSum/2;
			  refund = b - annaSum;
			  
			  if(annaSum == b) System.out.println("Bon Appetit");
			  else
				  System.out.println(refund);
	    }
}
