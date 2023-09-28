package com.interview.techMahindra;

public class AbstractConcept {
	
	
	
	public static void main(String[] args) {
		Animal animal = new Dog(true, false);
		System.out.println(animal.say());
	}
}

abstract class Animal {
	
	public Animal(boolean abc, boolean xyz) {
	}
	
	public abstract String say();
	
	public void animal() {
		System.out.println("Yes");
	}
}

class Dog extends Animal {

	public Dog() {
		super(true, true);
	}
	public Dog(boolean abc, boolean xyz) {
		super(abc, xyz);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String say() {
		return "Dog";
	}
	
}