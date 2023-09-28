package com.interview.hp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadXml {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("‪E:\\VIkram2.2.rtf");
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		while(true){
			int asc=bufferedInputStream.read();
			if(asc== -1) break;
			char ch= (char) asc;
			System.out.println(ch);
		}
	}
}
