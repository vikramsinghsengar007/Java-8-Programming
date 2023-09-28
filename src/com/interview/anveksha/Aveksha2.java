package com.interview.anveksha;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Aveksha2 {
public static void main(String[] args) {
	int arr[]=new int[10];
	Scanner sc =new Scanner(System.in);
	System.out.println("which index you want to insert: ");
	try{
	int index=sc.nextInt();
	System.out.println("specify elemt for index ");
	int element=sc.nextInt();
	sc.close();
	for (int i = 0; i < arr.length; i++) {
		
		arr[index-1]=element;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	}catch (InputMismatchException e) {
		System.out.println("please specify int type only  "+e);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("index number should between 1-10  "+e);
	}
}
}
