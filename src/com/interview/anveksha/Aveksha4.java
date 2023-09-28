package com.interview.anveksha;

public class Aveksha4 {
	public static void main(String[] args) {
		int chk;
		for (int i = 0; i < 100; i++) {
			chk=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0)
					chk=1;
			}

			if (chk==0) {
				System.out.print(i+" ");
			}
		}
	}
}
