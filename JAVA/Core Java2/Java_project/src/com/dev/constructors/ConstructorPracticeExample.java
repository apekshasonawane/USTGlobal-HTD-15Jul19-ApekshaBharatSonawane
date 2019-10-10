package com.dev.constructors;

public class ConstructorPracticeExample {
	public ConstructorPracticeExample() {
		this(2,"A");			//constructor call using this()
		System.out.println("No argument constructor");
	}
	public ConstructorPracticeExample(int f) {
		System.out.println("Parameterised constructor");
		
	}
	public ConstructorPracticeExample(int i,String p) {
		System.out.println("one int and one string constructor");
	}
	public ConstructorPracticeExample(String p,int i) {
		System.out.println("one one string and int constructor");
	}

	public static void main(String[] args) {
		ConstructorPracticeExample cpe1=new ConstructorPracticeExample();		//no argument constructor
		System.out.println(cpe1);				//physical address with package name
		ConstructorPracticeExample cpe2=new ConstructorPracticeExample(2);		//Parameterised constructor
		System.out.println(cpe2);
//		ConstructorPracticeExample cpe3=new ConstructorPracticeExample("v",13);	//constructor  overloading
//		System.out.println(cpe3);
		ConstructorPracticeExample cpe4=new ConstructorPracticeExample(1,"w");	//constructor overloading
		System.out.println(cpe4);
	}
}
