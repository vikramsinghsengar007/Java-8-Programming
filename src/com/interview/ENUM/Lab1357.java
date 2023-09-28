package com.interview.ENUM;

public class Lab1357 {
		public static void main(String[] args) {
			Direction d1=null;
			d1=new Direction("east", 0);
			//d1=Direction.EAST;
			System.out.println(d1);
			System.out.println(Direction.NORTH);
			System.out.println(Direction.SOUTH);
			System.out.println(Direction.WEST);
		}
}

class Direction{
	public static Direction EAST=new Direction("east",0);
	public static Direction NORTH=new Direction("north",90);
	public static Direction WEST=new Direction("west",180);
	public static Direction SOUTH=new Direction("south",270);
	static{
		System.out.println("static for direction");
	}
	private String name;
	private int angle;
	public Direction(String name, int angle) {
		this.name = name;
		this.angle = angle;
		System.out.println("constructor");
	}
	public int getAngle() {
		return angle;
	}
	public String toString() {
		return name+"\t"+angle;
	}
}