package com.hackerrank;

public class CountApplesAndOranges {
	public static void main(String[] args) {
		int apple[] = {2,3,-4};
		int orange[]= {3,-2,-4};
		countApplesAndOranges(7, 10, 4, 12, apple, orange);
	}
	
	
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		 
		 int aCount=0;
		 for (int i = 0; i < apples.length; i++) {
			apples[i] += a;
			if(apples[i] >= s && apples[i] <= t) aCount++;
		}

		 int oCount = 0;
		 for (int i = 0; i < oranges.length; i++) {
			 oranges[i] += b;
			if(oranges[i] >= s && oranges[i] <= t) oCount++;
		}
		 
		 System.out.println(aCount);
		 System.out.println(oCount);
	    }
}
