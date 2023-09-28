package com.interview.Singleton;

public class Lam1173 {
	public static void main(String[] args) {

		Singleton s1=Singleton.getS();
		System.out.println(s1);
		System.out.println(Singleton.getS());
		
		//Singleton s2=(Singleton) s1.clone();
	}
	
	
}

class Singleton{
	private static Singleton s=new Singleton();
	/*static{
		s=new Singleton();
	}*/
	private Singleton(){}
	public static Singleton getS() {
		if (s==null) {
			s=new Singleton();
		}
		return s;
	}
	
	
}