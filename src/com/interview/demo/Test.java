package com.interview.demo;


public class Test {
	public static void main(String[] args) {
		String str="jlc";
		char ch=str.charAt(0);
		char ch1=str.charAt(1);
		char ch2=str.charAt(2);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch+" "+ch1+" "+ch2);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
