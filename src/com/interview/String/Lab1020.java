package com.interview.String;

public class Lab1020 {
		public static void main(String[] args) {
			String st1="jlc";
			String st2="india";
			
			System.out.println("---------------------------");
			String st8=st1.concat(st2);
			System.out.println(st8);
			System.out.println("abc".compareTo("abc"));
			System.out.println("abc".compareTo("abd"));
			System.out.println("abcdef".compareTo("abc"));
			String s1=st1.substring(0, 1).toUpperCase()+st1.substring(1);
			System.out.println(s1);
		}
}
