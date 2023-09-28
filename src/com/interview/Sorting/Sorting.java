package com.interview.Sorting;

import java.util.Scanner;

class Sorting {
	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the no. of elements");

		int n = br.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++)
			arr[i] = br.nextInt();
		
		countSwaps(arr);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		br.close();
		System.out.println("\nsorted array");
		System.out.println("\n");
		for (int i = 0; i < n; i++)

			System.out.print(arr[i]+"  ");
		
		

	}
	
	  static void countSwaps(int[] a) {
	        int count=0;
	        for(int i = 1; i<a.length ; i++){
	            if(a[i-1] > a[i]){
	               int temp = a[i];
	                a[i] = a[i-1];
	                a[i] = temp;
	                count += 1;
	            }
	        }
	        System.out.println("Array is sorted in "+ count +" swaps.");
	        System.out.println("First Element: "+a[0]);
	        System.out.println("Last Element: "+a[a.length-1]);

	    }
}