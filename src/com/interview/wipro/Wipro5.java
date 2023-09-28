package com.interview.wipro;

import java.util.Arrays;
import java.util.Scanner;


public class Wipro5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for (int i = 1; i < ch.length; i++) {
			Arrays.sort(ch);
			if (ch[i]==ch[i-1]) {
				System.out.println(ch[i]+" "+count);
			}
		}
		
	}
}
