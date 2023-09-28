package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;

public class Archey {
	public static void main(String[] args) {
		int[] scores = {100, 90, 90, 80, 75, 60};
		Integer[] alice = {50, 65, 77, 90, 102};
int finl[] =climbingLeaderboard(scores, alice);
		//Position finl[] =climbing(scores, alice);
		for(int i=0; i< finl.length; i++)
		System.out.println(finl[i]);
	}
	
	static int[] climbingLeaderboard(int[] sc, Integer[] alice) {
		Integer scores[] = new Integer[sc.length];
		for(int i=0; i< sc.length; i++)
			scores[i] = sc[i];
		
		Arrays.sort(scores,Collections.reverseOrder());
	       Arrays.sort(alice);

	       System.out.println("Score: "+Arrays.toString(scores));
	       System.out.println("Alice: "+Arrays.toString(alice));
		int positions[] = new int[alice.length];
		int maxLastPosition = 0;
		for(int i=0; i<alice.length; i++) {
			for(int j=scores.length-1; j >=0; j--) {
				if(alice[i] <= scores[j]) {
					maxLastPosition = i;
					positions[i] = j;
					break;
				}
			}
		}
		
		for(int i=maxLastPosition+1; i<alice.length; i++) {
			positions[i] = 1;
		}
		
		return positions;
    }
	
	
	
	private static Position[] climbing(int[] score, int[] alice) {
		Position positions[] = new Position[alice.length];
		int maxLastPosition = 0;
		for(int i=0; i<alice.length; i++) {
			Position p = null;
			for(int j=score.length-1; j >=0; j--) {
				if(alice[i] <= score[j]) {
					maxLastPosition = i;
					p = new Position(alice[i], j);
					positions[i] = p;
					break;
				}
			}
		}
		
		for(int i=maxLastPosition+1; i<alice.length; i++) {
			Position p = new Position(alice[i], 1);
			positions[i] = p;
		}
		
		return positions;
	}
	
	private static class Position{
		int alice;
		int position;
		
		Position(int alice, int position) {
			this.alice = alice;
			this.position= position;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return alice +":"+position;
		}
	}
}
