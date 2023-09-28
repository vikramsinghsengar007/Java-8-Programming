package com.interview.demo;

public abstract class ThreadSafe implements Runnable{
	static{
		System.out.println("static ");
	}
		public static void main(String[] args) {
			Thread th=new Thread();
			th.start();
			
					}
}
