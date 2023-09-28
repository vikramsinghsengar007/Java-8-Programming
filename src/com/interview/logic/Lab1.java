package com.interview.logic;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		System.out.println("enter time without string: \n");
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		System.out.println(formatTime(time));
		sc.close();
	}

	public static int formatTime(String time) {
		int check = 0;
		int lastindex1 = time.toLowerCase().lastIndexOf("pm");
		int lastindex2 = time.toLowerCase().lastIndexOf("am");
		Integer min = 0, hour = 0;
		String shour = time.substring(0, 2);
		hour = Integer.parseInt(shour);

		String smin = time.substring(3, 5);
		min = Integer.parseInt(smin);

		if (min <= 59 && hour <= 12 && lastindex1 >= 0 || lastindex2 >= 0) {
			check = 1;
			return check;
		} else {
			check = 0;
			return check;
		}
	}
}
