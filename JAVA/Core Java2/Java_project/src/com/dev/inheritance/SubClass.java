package com.dev.inheritance;

public class SubClass extends SuperClass{

	public SubClass() {
//		super();
		super(2,"A");
	}
	
	public void add()
	{
//		sc.super();
		super.add();
		
	}
	
		public static void main(String[] args) {
		
			 SubClass sc=new SubClass();
			add(12,10);
			
	}


}
