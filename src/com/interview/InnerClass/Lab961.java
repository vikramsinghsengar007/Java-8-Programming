package com.interview.InnerClass;



public class Lab961 {
	public static void main(String[] args) {
		//Person p=new Person()
		new Person(){
			public void reading(){
				System.out.println("stud-reading()");
			}
			@Override
			public void sleeping() {
				System.out.println("stud-sleeping()");
				
			}
		}.reading();
		
	}
}

abstract class Person{
	public abstract void sleeping();
}