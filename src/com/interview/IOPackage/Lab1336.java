package com.interview.IOPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab1336 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(FileInputStream fis=new FileInputStream("D:\\abc.txt");
		FileOutputStream fos=new FileOutputStream("D:\\xyz.txt");){
		while(true){
			int asc=fis.read();
			if (asc==-1) {
				break;
			}
			fos.write(asc);
		}
		System.out.println("writing completed");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
