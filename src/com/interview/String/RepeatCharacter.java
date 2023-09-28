package com.interview.String;

public class RepeatCharacter {
	public static void main(String[] args) {
		String str="jaaa";
		int count=0;
		int length=str.length();
		char ch[]=str.toCharArray();
		for (int i = 0; i < length; ++i) {
			count=0;
			for (int j = 0; j < length; ++j) {
				if (j<i && ch[i]==ch[j]) {
					break;
				}
				if (ch[j]==ch[i]) {
					count++;
				}
				
				if (j==length-1) {
					System.out.println("char is "+ch[i]+" count "+count);
				}
			}
		}
	}
}
