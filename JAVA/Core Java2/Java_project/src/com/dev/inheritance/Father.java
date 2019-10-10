package com.dev.inheritance;

public class Father extends GrandFather{
	
	static Father f=new Father();
	String name="Bharat";
		@Override
		public void printName() {
			System.out.println(" "+name +super.name+ " "+super.lastname);		//super is used to access methods n variables of parents
			super.printName();
		}
	public static void main(String[] args) {
		f.printName();
	}

}
