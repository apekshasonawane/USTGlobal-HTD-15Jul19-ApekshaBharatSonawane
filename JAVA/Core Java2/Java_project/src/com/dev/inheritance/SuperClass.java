package com.dev.inheritance;

public class SuperClass  extends SuperMostClass{


	public  SuperClass() {
		System.out.println("Constructor with no-argument");
	}
	public  SuperClass(int a) {
		System.out.println("Constructor with int");
	}
	
	public  SuperClass(String str) {
		System.out.println("Constructor with string");
	}
	
	public  SuperClass(String str,int a) {
		System.out.println("Constructor with string and int");
	}
	
	public  SuperClass(int a, String str) {
		System.out.println("Constructor with int and string");
	}
	public void add() {
	
		super.add(1,4);
	
	}
	
	public static void main(String[] args) {
		
		add(20,10);
		
	}

}
