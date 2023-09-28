package com.interview.logic;

import java.util.Scanner;

public class Fibonicci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("square of sum of fibo are:");
		for (int j = 0; j < i; j++) {
			System.out.print(fibo(i)+" ");
		}
	}

	public static int fibo(int i) {
		int prev, next,sum,temp = 0;
		
		prev=next=1;
		temp=
		sum= prev+next;
		prev= next;
		next= sum;
		return temp;
	}
}
