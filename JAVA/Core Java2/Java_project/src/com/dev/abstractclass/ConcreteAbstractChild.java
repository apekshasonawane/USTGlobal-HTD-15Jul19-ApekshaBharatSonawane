package com.dev.abstractclass;

public class ConcreteAbstractChild extends AbstractChild{
static ConcreteAbstractChild cac=new ConcreteAbstractChild();
	
	public static void main(String[] args) {
	
		cac.display();
		cac.print();
	}

	
	@Override
	void print() {
		System.out.println("print of  ConcreteAbstractChild");
		
		
	}

	

}
