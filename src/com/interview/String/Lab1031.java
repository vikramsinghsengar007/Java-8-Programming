package com.interview.String;

public class Lab1031 {
	public static void main(String[] args) {
		String s1="welcome ti jlc, java training center, no 1 in java training and placement";
		
		int len=s1.length();
		char chr[]=new char[len];
		System.out.println("_______________________________________________________");
		s1.getChars(3, 44, chr, 4);
		System.out.println("_______________________________________________________");
		
		for (int i = 0; i < len; i++) {
			chr[i]=s1.charAt(i);
			System.out.println(chr[i]);
		}
		System.out.println("\n ----- char array-------");
		for (int i = 0; i < chr.length; i++) {
			char ch=chr[i];
			System.out.println(i+"\t"+ch);
		}
}}
