package com.interview.anveksha;

import java.util.Scanner;


public class Aveksha6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter value: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		 
		 System.out.println("index for update: ");
		 int index=sc.nextInt();
		 System.out.println("element ");
		 int element=sc.nextInt();
		 for (int i = 0; i < arr.length; i++) {
			if (i==index) {
				arr[i-1]=element;
					for (int j = 0; j < arr.length; j++) {
						System.out.print(arr[j]+" ");
					}
			}
		}
		 System.out.println("remove: ");
		 int remove=sc.nextInt();
		 
			for (int i = remove-1; i < arr.length-1; i++) {
				arr[i]=arr[i+1];
			}	
			for (int i = 0; i < arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}
	}
}
