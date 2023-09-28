package com.interview.anveksha;

import java.util.Scanner;

public class Aveksha {
	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("specify elements: ");
		System.out.println("Please enter value less than or equal to : "+arr.length);
		String userInput[] = sc.nextLine().split(" ");
		int userInputCpy[] = new int[userInput.length];
		boolean invalidInput = false;
		
		for (int i = 0; i < userInput.length; i++) {
			userInputCpy[i] = Integer.parseInt(userInput[i]);
			
				try{
					if(arr.length < userInputCpy[i]){
						throw new ArrayIndexOutOfBoundsException("Invalid input field");
					}
				}catch(IndexOutOfBoundsException exception){
					System.out.println(exception.getMessage()+" enter under 10 only ");
					invalidInput = true;
				}
			}
		for (int i = 1; i <=arr.length && !invalidInput; i++) {
				if(!checkWithExisting(userInputCpy, i)){
					System.out.println("Missing element: "+i);
			}
		}
		sc.close();
	}
	
	public static boolean checkWithExisting(int[] existingArr, int element){
		
		boolean isExisting = false;
		
		for (int i = 0; i < existingArr.length; i++) {
			if(element == existingArr[i]){
				isExisting = true;
				break;
			}
		}
		return isExisting;
	}
}


