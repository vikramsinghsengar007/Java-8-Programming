package com.interview.IOPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab1337 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	try(FileReader fis=new FileReader("D:\\abc.txt");
		BufferedReader br=new BufferedReader(fis);	
		FileWriter fos=new FileWriter("D:\\xyz.txt");
		BufferedWriter bw=new BufferedWriter(fos);	){
		while(true){
			String asc=br.readLine();
			if (asc==null) {
				break;
			}
			fos.write(asc);
			bw.newLine();
		}
		bw.close();
		System.out.println("writing completed");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
