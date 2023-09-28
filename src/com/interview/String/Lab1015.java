package com.interview.String;

public class Lab1015 {
	public static void main(String[] args) {
		String s1="vik";
		System.out.println(s1);
		//s1="singh";
		s1.replace('i', 'v');
		String s4=s1.replaceFirst("k", "umar");
		System.out.println(s4);
		String s2="vir";
		String s3="vik";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		String n=new String("abc");
		 n=new String("def");
		 System.out.println(n);
	}
}
