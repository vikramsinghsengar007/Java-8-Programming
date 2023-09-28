package com.interview.String;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("A");
		StringBuilder s2=new StringBuilder("A");
		System.out.println(s1.equals(s2));
		String st1=s1.toString();
		String st2=s2.toString();
		System.out.println(st1.equals(st2));
	}
	
	
}
