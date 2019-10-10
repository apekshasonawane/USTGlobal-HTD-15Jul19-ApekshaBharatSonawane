package com.dev.polymorphism;

public class MethodOverloading {

	
	public void print() {
		System.out.println("print with no argument");
	}
	public void print(int a) {
		System.out.println("print with one integer");
	}
	public void print(int a,String str) {
		System.out.println("print with one integer and String");
	}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.print();
		mo.print(1);
		mo.print(1, "ABC");
	}

}
