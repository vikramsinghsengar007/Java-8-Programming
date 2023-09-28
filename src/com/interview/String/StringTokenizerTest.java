package com.interview.String;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String s1="hi welcome to java";
		StringTokenizer st=new StringTokenizer(s1);
		System.out.println("count: "+st.countTokens());
		
		while(st.hasMoreTokens()){
			String data=st.nextToken();
			System.out.println(data);
		}
	}
}
