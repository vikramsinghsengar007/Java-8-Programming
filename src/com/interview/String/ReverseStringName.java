package com.interview.String;

import java.util.Scanner;

public class ReverseStringName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// String str[]=original.split(" ");
		/*String[] s1="my name is Sartaj".split(" ");
		for (int i = s1.length-1; i >= 0; i--) {
			System.out.print(s1[i]+" ");
		}*/
		String str=sc.nextLine();
			String str1=""; 
			int count =0; 
			String[] reverse = new String[10]; 

			for(int i=0;i<str.length();i++){ 
			if(str.charAt(i)==' ') 
			count++; 
			} 
			int c = count; 
			for(int i=0;i<str.length();i++){ 
			if(str.charAt(i)!=' '){ 
			str1 = str1+str.charAt(i); 
			} 
			if(str.charAt(i)==' '){ 
			reverse[--count] = str1; 
			str1=""; 
			} 
			} 
			for(int i=0;i<c;i++) 
			str1 = str1.concat(" "+reverse[i]); 

			System.out.println(str1); 
			}
	}
