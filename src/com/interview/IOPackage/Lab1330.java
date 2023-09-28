package com.interview.IOPackage;


public class Lab1330 {
public static void main(String[] args) throws Exception {
	System.out.println("enter data ");
	int count=0;
	while(true){
	int asc=System.in.read();
	System.out.println(++count+"\t"+asc+"\t"+(char)asc);
	if(asc=='*')break;
	}
	System.out.println("\n after loop");
	while(true){
	int asc1=System.in.read();
	System.out.println(asc1+"\t"+(char)asc1);
	if(asc1==10)break;
}
}
}
