package com.interview.Sorting;

import java.util.Scanner;

public class ArraySorting {
	
public static void main(String[] args) { 
	/*	int arr[] = { 5, 1, 7, 3, 9,2,4 }; 
		for (int i = 1; i < arr.length; i++) { 
		if (arr[i] < arr[i - 1]) { 
		arr[i] = arr[i] + arr[i - 1]; 
		arr[i - 1] = arr[i] - arr[i - 1]; 
		arr[i] = arr[i] - arr[i - 1]; 
		i = 0; 
		} 
		} 
		System.out.print("Sorted Array : "); 
		for (int i = 0; i < arr.length; i++) { 
		System.out.print(arr[i] + " "); 
		} 	*/
	
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("specify array ");
	
	for (int i = 0; i < arr.length; i++) {
		int element=sc.nextInt();
		arr[i]=element;
	}
		for (int j = 1; j <arr.length; j++) {
			
			if (arr[j]< arr[j-1]) {
				arr[j]=arr[j]+arr[j-1];
				arr[j-1]=arr[j]-arr[j-1];
				arr[j]=arr[j]-arr[j-1];
				j=0;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	
	
		} 
		}
