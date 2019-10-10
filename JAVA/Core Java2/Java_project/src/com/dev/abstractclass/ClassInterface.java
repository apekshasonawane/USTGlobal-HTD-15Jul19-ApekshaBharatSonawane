package com.dev.abstractclass;

public class ClassInterface implements Abstract,Abstract2 {

	public static void main(String[] args) {
		Abstract.print();
		Abstract a=new ClassInterface();
		a.print1();
		
		
		ClassInterface ci=new ClassInterface();
		ci.display();
	}

	@Override
	public void display() {
		System.out.println("Display of classInterface");
	}
}
