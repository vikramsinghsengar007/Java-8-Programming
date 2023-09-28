package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTriplets {
public static void main(String[] args) {
	List<Integer> a= new ArrayList<>();
	a.add(5);
	a.add(7);
	a.add(7);
	List<Integer> b= new ArrayList<>();
	b.add(3);
	b.add(6);
	b.add(10);
	System.out.println(compareTriplets(a, b));
}

static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	List<Integer> compare = new ArrayList<>();
	int al=0,bo=0;
	for (int i = 0; i < a.size(); i++) {
		if(a.get(i) != b.get(i)) {
			int temp = a.get(i) > b.get(i) ? al++ : bo++;
			
		}
	}
	compare.add(al);
	compare.add(bo);
			
	
	return compare;


}
}
