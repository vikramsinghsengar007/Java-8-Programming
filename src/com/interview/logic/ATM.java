package com.interview.logic;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		System.out.println("enter amount less than 1000");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int totalAmount = 1000, count = 1;
		int balance = 0;
		balance = totalAmount - amount;
		System.out.println("balance is: " + balance);
		while (balance != 0 && amount == totalAmount) {
			System.out.println("1000: " + count);
			count = 1;
		}
		while (balance != 0 && balance < totalAmount && balance - 500 >= 1) {
			System.out.println("500: " + count);
			balance = balance - 500;
			count = 1;
		}
		while (balance != 0 && balance / 100 >= 1) {
			int i = count++;
			System.out.println("100: " + i++);
			balance = balance - 100;
		}

		while (balance != 0 && balance / 50 >= 0.5) {
			count = 1;
			System.out.println("50: " + count);
			balance = balance - 50;
		}
		while (balance != 0 && balance / 20 >= 0.2) {
			int i = count++;
			System.out.println("20: " + i++);
			balance = balance - 20;

		}
		while (balance != 0 && balance / 10 >= 0.1) {
			count = 1;
			System.out.println("10: " + count);
			balance = balance - 10;
		}
		while (balance != 0 && balance / 5 >= 0.05) {
			count = 1;
			System.out.println("5: " + count);
			balance = balance - 5;
		}
		while (balance != 0 && balance / 2 >= 0.02) {
			int i = count++;
			System.out.println("2: " + i++);
			balance = balance - 2;
		}
		while (balance != 0 && balance / 1 >= 0.01) {
			count = 1;
			System.out.println("1: " + count);
			balance = balance - 1;
		}
		sc.close();
	}
}
