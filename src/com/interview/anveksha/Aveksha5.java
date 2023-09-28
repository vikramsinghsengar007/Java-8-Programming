package com.interview.anveksha;

import java.util.Scanner;


public class Aveksha5 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter hour:");
			int hour=sc.nextInt();
			System.out.println("enter min ");
			int min=sc.nextInt();
			if (hour<=11 && min<=59) {
				double hdegree=(hour*30)+(min* 30/60);
				double mdegree=min*6;
				double angle=hdegree- mdegree;
				System.out.println("angle is "+ angle);
				System.out.println("angl: "+Math.abs(angle));
				
			} else {
					System.out.println("incorrect");
			}
			sc.close();
		}
}
