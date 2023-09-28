package com.interview.String;


public class EQTEST {
public static void main(String[] args) {
	String a="abc";
	String b=a+"def";
	String c="abcdef";
	System.out.println("a: "+a.hashCode());
	System.out.println("b: "+b.hashCode());
	System.out.println("c: "+c.hashCode());
	System.out.println(b==c);
	System.out.println(b.equals(c));
}	
}
