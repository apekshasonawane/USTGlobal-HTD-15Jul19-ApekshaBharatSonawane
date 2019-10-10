package com.dev.inheritance;

public class ParentNew {
	static ParentNew pn=new ParentNew();
	
	public void multiply(int a,int v) {
		System.out.println("Multiplication of  "+a+"   &  "+v+"=>  "+(a*v));
	}
	
	public static void main(String[] args) {
		pn.multiply(11,5);
	}



}
