package com.interview.Singleton;

public class Lab1073 {
	public static void main(String[] args) {
		System.out.println(Hellobe.getHellobe());
		Hellobe h1=Hellobe.getHellobe();
		System.out.println("Hellobe h1  "+h1.hashCode());
		//Hellobe h2=(Hellobe)h1.clone();//we cant do here
		Hellobe h3=Hellobe.getHellobe();
		System.out.println("Hellobe h3  "+h3.hashCode());
	}
}

class Hellobe{
	private static Hellobe variable=new Hellobe();
	private Hellobe(){}
	public static Hellobe getHellobe(){
		return variable;
	}
}