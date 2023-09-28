package com.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Birthday {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(birthday(s, 3, 2));
	}
	
	  static int birthday(List<Integer> s, int d, int m) {
		  int piece=0;
		  Integer arr[] = new Integer[s.size()];
		  arr =  s.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			int temp =m-1, cou =0, j = i;
			while(temp >=0 && j < arr.length) { 
			cou += arr[j];
				temp--;
				j++;
			
			}
			if(cou == d)
			piece++;
		}

		  return piece;
	    }
}
