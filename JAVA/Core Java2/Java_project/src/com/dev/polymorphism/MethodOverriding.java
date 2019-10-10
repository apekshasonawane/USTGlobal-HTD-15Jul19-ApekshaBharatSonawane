package com.dev.polymorphism;

public class MethodOverriding extends MethodOverloading{

	@Override
	public void print()
	{
		System.out.println("print in Overriding");
		super.print(1);
		print(1,"A");
	}
	public void print(int a) {
		System.out.println("method overriding with int");
	}
	public static void main(String[] args) {
		MethodOverriding mr=new MethodOverriding();
		mr.print();
		mr.print(1);
		
		
	}

}
