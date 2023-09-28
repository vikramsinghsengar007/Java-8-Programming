package com.interview.String;

public class CompareString implements Comparable{
	String word[]= {"b","a","gffd","ad","sds","asad","fdft","trhdfv"};
	public static void main(String[] args) {
		CompareString cs=new CompareString();
		System.out.println(cs.word);
	}

	@Override
	public int compareTo(Object o) {
		for (int i = 0; i < word.length; i++) {
			for (int j = 1; j < word.length -1; j++) {
				
			if(word[i].equals(word[j])){
				return 0;
				
			}else if(word[i].compareTo(word[j]) > 1){
				return 1;
			}else
				return -1;
		}
		}
		return 0;
	}
}
