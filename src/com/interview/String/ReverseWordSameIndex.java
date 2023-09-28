package com.interview.String;

public class ReverseWordSameIndex {
		public static void main(String[] args) {
			String word ="hi dear welcome to java";
			String str[]= word.split(" ");
			System.out.println(word);
			for (int i = 0; i < str.length; i++) {
				String ch= str[i];
				StringBuilder sb= new StringBuilder(ch);
				sb.reverse();
				System.out.print(sb+" ");
			}
		}
}
