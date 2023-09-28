package com.interview.demo;

public abstract class Immutable {
		public static void main(String[] args) {
		 String s1="hi";
			String s2="jlc";
			String s3="hijlc";
			String s4= s1+s2;
			String s5="vik"; String s6="ram";
			String s7="vikram";
			System.out.println(s1);System.out.println(s2);System.out.println(s3.hashCode());
			System.out.println(s4.hashCode());
			System.out.println(s3==s4);
			System.out.println(s3.equals(s4));
			System.out.println((s5+s6).hashCode());
			System.out.println(s7.hashCode());
			
		}
}
