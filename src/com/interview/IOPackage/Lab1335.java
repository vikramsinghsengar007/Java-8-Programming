package com.interview.IOPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1335 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(FileInputStream fis=new FileInputStream("D://abc.txt");
		InputStreamReader isr=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(isr);){
		while(true){
			String id=br.readLine();
			if (id==null)break;		
		System.out.println(id);	
		}
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
