package com.interview.ENUM;

public class Lab1359 {
		public static void main(String[] args) {
		Direction1 d1=null;
		//d1=new Direction1(0);
		d1=Direction1.EAST;
		System.out.println(d1);
		System.out.println(Direction1.NORTH);
		System.out.println(Direction1.WEST);
		System.out.println(Direction1.SOUTH);
		}
}

enum Direction1{
	EAST,NORTH,SOUTH,WEST;
	private Direction1() {System.out.println("Dir1 def constr");}
	static{
		System.out.println("static block in direction class");
	}
}