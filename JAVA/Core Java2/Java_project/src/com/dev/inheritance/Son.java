package com.dev.inheritance;

public class Son extends Father{
	static Son s =new Son();
		
	public static void main(String[] args) {
	
		s.printName();
		
	}
	
	@Override
	public void printName() {
		String name="John";

		System.out.println(name +" "+s.name+" "+s.lastname);
	}
}
