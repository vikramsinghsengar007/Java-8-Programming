package com.interview.logic;

public class MagicSquare {
	public static void main(String[] args) {
		String str="abcde";
		/*char ch[] = str.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			System.out.print(ch[i]+"");
		}*/
		
		/*char rev[]= new char[str.length()];
		for (int i = rev.length-1; i>=0; i--) {
			rev[i]= str.charAt(i);
			System.out.print(rev[i]+"");
		}*/
		
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String input) {
		
		if(input.length() == 1) {
			return input;
		}
		
		String inpt = reverseString(input.substring(1)) + input.charAt(0);
		
		return inpt;
	}
}
