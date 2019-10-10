package com.dev.constructors;

public class ConstructorsExample {
//	public ConstructorsExample() {		//default constructor
//		
//	}
	
	public   ConstructorsExample() {		//no-argument constructor
		System.out.println("This is no argument constructor");
	
		
	}
	private ConstructorsExample(int i) {				//parameterized constructor
		System.out.println("thi contructor with int argument");
	}
	
	public ConstructorsExample(String s) {
		System.out.println("This is String constructor");
	}
	
	public 	ConstructorsExample (String s,int i) {
		System.out.println("This is string and int constructor");
	}
	public 	ConstructorsExample (int i,String s) {		//order of passing parameters is different so it is costructor overloading
		System.out.println("This is int and string  constructor");
	}
	public static void main(String[] args) {
		ConstructorsExample ce=new ConstructorsExample();
		ConstructorsExample ce1=new ConstructorsExample(1);
		ConstructorsExample ce2=new ConstructorsExample("aps");
		ConstructorsExample ce3=new ConstructorsExample("abc",12);
		ConstructorsExample ce4=new ConstructorsExample(12,"abc");
		
	
	}
}
