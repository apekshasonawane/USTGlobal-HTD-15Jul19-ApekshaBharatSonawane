package com.dev.abstractclass;

public  class ConcreteChild extends AbstractParent {
	static ConcreteChild cc=new ConcreteChild();
	public static void main(String[] args) {
	
		cc.display();
		cc.print();

	}

	@Override
	void print() {
		System.out.println("print method of concrete child");
	
	}
	@Override
	void display() {
		System.out.println("display method of concrete child");
		
	}



}
