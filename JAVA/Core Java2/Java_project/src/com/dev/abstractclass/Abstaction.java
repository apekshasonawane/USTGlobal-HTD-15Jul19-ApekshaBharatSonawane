package com.dev.abstractclass;

public class Abstaction extends AbstractExample {

	// AbstractExample ae=new AbstractExample(); //we cannot create object of
	// abstract class
	public static void main(String[] args) {
		Abstaction a = new Abstaction();
		a.display();
		a.show();
	}

	public Abstaction() {
		System.out.println("constructor of abstract class");
	}

	public void print() {

	}

	@Override
	void display() {
		System.out.println("This is implemented abstract method ");
	}

}
