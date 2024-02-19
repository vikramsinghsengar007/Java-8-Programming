package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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
	List<Integer> scores = new ArrayList<>();

	// intialize both alice's & bob's score to 0
	int aliceScore = 0;
	int bobScore = 0;

	// iterate both the lists a, b
	// can take any of the sizes as compare condition since both sizes are 3
	for (int i=0; i<a.size(); i++){
		if(a.get(i) > b.get(i)){
			aliceScore += 1;
		}
		else if(b.get(i) > a.get(i)) {
			bobScore += 1;
		}
	}

	long counta = a.stream().map(i -> b.stream().filter(j -> i > j).count()).count();
	long countb = b.stream().map(i -> a.stream().filter(j -> i > j).count()).count();
	// first we will add alice's score to scores list
	scores.add(aliceScore);

	// now add bob's score to scores list
	scores.add(bobScore);

	// scores = [alicesScore, bobScore]
	return scores;


}
}
