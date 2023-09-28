package com.interview.logic;

public class CommonChar {
	public static void main(String[] args) {
		String s1="bangalore", s2= "angel";
		String commonChar="",unCommon="";
		char ch1[]= s1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			ch1[i]=s1.charAt(i);
		}
		char ch2[]= s2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if(ch1[i] == ch2[j]){
					commonChar +=ch1[i];
				}
			} 
		
		}
		System.out.println(commonChar);
		System.out.println(unCommon);
	}
}
