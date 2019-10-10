package com.dev.inheritance;

public class GrandFather {
    static GrandFather gf=new GrandFather();
	static String lastname="Sonawane";
	String name="bb";
	
	public static void main(String[] args) {
		gf.printName();
	}
	public void printName() {
		
		System.out.println(name +" "+lastname);
		
	}
}
