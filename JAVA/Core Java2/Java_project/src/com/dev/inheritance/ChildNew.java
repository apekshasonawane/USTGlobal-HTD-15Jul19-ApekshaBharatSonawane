package com.dev.inheritance;

public class ChildNew extends ParentNew{

	static ChildNew cn=new ChildNew();
	@Override
	public  void multiply (int a,int b) {		//static method cannot be overriden
	super.multiply(12, 13);
	super.multiply(11, 9);
		
	}
	public static void main(String[] args) {
		cn.multiply(10,4);
	}

}
