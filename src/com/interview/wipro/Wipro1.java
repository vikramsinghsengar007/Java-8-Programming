package com.interview.wipro;

import java.util.Arrays;

public class Wipro1 {
	public static void main(String[] args) {
		String str="hellloooramafghsks";
		char ch[]=str.toCharArray();
	
		for (int i = 1; i < ch.length-1; i++) {
			Arrays.sort(ch);
			if (ch[i]==ch[i-1]) {
				
				System.out.println(ch[i]);
			}else{
				continue;
			}
		}
		
	}
}
