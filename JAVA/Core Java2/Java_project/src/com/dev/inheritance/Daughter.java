package com.dev.inheritance;

public class Daughter extends Father{   		//we cannot extend two classes at the same time

	static GrandFather d= new Daughter();		
	static GrandFather d1=new Daughter();
	static  Daughter d2=(Daughter) d1;
	@Override
	public void printName() {
		String name="Apeksha";
		System.out.println(name +" "+super.name+"  "+d.lastname );
		super.printName();
	}
	public static void main(String[] args) {
	d2.printName();

	}

}
