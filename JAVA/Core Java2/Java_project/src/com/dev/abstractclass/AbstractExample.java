package com.dev.abstractclass;

public abstract class AbstractExample {

	abstract  void display(); 			//abstract method declaration we cannot declare body in that
	abstract  void print();	
	
	public void show() {
		System.out.println("Concrete method of abstract class");
	}
	public void AbstractExample () {
		System.out.println("constructor of abstract example");
	}
}


