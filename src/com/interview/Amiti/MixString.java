package com.interview.Amiti;

public class MixString {
	public static void main(String[] args) {
		String s1="hai";
		String s2="XXXX";
		/*StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			sb.append(s1.charAt(i));
			if (s1.length()>i) {
				sb.append(s2.charAt(i));
			}
		}
		String result=sb.toString();
		System.out.println(result);*/
		
		char ch1[]= s1.toCharArray();
		char ch2[]= s2.toCharArray();
		String mix = "";
		for (int i = 0; i < ch1.length; i++) {
				mix= mix+String.valueOf(ch1[i]);
				mix= mix+String.valueOf(ch2[1]);
			
		}
		System.out.println(mix);
	}
}
