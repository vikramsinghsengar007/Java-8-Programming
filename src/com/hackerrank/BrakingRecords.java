package com.hackerrank;

public class BrakingRecords {
	public static void main(String[] args) {
		int scores[]= {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		int scores1[] = {10, 5, 20,20, 4, 5, 2, 25, 1};
		int sc[]= breakingRecords(scores);
		
	}
	
	static int[] breakingRecords(int[] scores) {
		int max = scores[0];
		int min = scores[0];
		int maxcount = 0;
		int mincount = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				maxcount = maxcount + 1;
			}
			if (scores[i] < min) {
				min = scores[i];
				mincount = mincount + 1;
			}
		}
		int res[] = { maxcount, mincount };
		return res;
	}}