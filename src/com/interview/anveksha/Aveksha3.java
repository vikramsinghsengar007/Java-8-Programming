package com.interview.anveksha;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Aveksha3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pathname: ");
		String pathname=sc.nextLine();
		File file=new File(pathname);
		File files[]=file.listFiles(new ExtFilter(".pdf"));
		String dir[]=file.list();
		if(dir==null){
			System.out.println("no dir");
		}else
		if (files!=null) {
			for (File f : files) {
				System.out.println(f);
			}
		}else{
			System.out.println("no file found: ");
		}
		
}
}

class ExtFilter implements FileFilter{

	 String ext;
	public ExtFilter(String ext) {
		this.ext=ext;
	}
	@Override
	public boolean accept(File f) {
		
		return f.getName().endsWith(ext);
	}
	
}