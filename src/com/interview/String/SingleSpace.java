package com.interview.String;

import java.util.Scanner;

public class SingleSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=str.replaceAll(" +", " ");
	sc.close();
		System.out.println(s);
	}
}
