package com.interview.IOPackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab1333 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(FileInputStream fis=new FileInputStream("D:\\abc.txt");
			BufferedInputStream bis=new BufferedInputStream(fis)){
		while(true){
			int asc=bis.read();
			if(asc==-1)break;
			char ch=(char) asc;
			System.out.println(ch);
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
