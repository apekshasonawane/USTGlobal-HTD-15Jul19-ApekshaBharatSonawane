package com.dev.objectmethods;

public class ObjectMethod {

	public static void main(String[] args) {
		Cat c1=new Cat();
		Cat c2=new Cat();
		
		System.out.println(c1.getClass());   //gives fully qualified name of class  i.e class com.dev.objectmethods.Cat
		System.out.println(c2.getClass());
		
		//clone=>we can create clone of object but we have to use Clonable interface
		//equals=>gives boolean output(compares two objects) before using this we have to override hashCode method
		//equals referes the memory address
		//hashcode=>return type is int
//		finalize=>it is invoked when excution ends
		
	}

}
