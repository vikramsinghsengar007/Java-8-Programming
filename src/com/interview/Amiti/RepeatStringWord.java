package com.interview.Amiti;


public class RepeatStringWord {
public static void main(String[] args) {
	String s="jlc";
	char ch[]=s.toCharArray();
	StringBuilder sb=new StringBuilder();
	for (int i = 0; i < ch.length; i++) {
		sb.append(ch[i]).append(ch[i]);
	}
		System.out.println(sb);
	
}
}
