package com.dev.inheritance;

public class ParentClass {

	public ParentClass() {
		System.out.println("no argumnt");
	}
	public  ParentClass(int a) {
		System.out.println("with int");
	}
	public  static void addition(int a,int b) {
		System.out.println("addition of two int in parentclass=>"+(a+b));
		
	}
	public static void addition(float f,int i) {
		System.out.println("addition of flaot and int=>"+(f+i));
	}
	public static void main(String[] args) {
		
		addition(2,4);
		addition((int) 1.5,6);

	}

}
