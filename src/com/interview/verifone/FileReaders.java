package com.interview.verifone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaders {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("‪F:\\ab.txt");
		System.out.println(file.canRead()+ "" +file.isFile());
		Scanner sc = new Scanner(file);
		 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
		
		
	}
}
