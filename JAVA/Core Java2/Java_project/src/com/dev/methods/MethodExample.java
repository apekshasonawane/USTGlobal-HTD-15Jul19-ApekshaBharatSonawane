package com.dev.methods;

public class MethodExample {

	public static int a1 = 0; // static variable creation should be in class we cannot create it in method

	static MethodExample me = new MethodExample(); // object creation of class i.e global creation

	public static void main(String[] args) {

		// MethodExample me=new MethodExample(); //object creation of class locally

		int area = areaOfSquare(8);
		System.out.println("Area of square=>" + area);
		int area1 = me.areaOfRectangle(7, 8);
		System.out.println("Area of recangle=>" + area1);

	}

	public static int areaOfSquare(int side) {
		a1 = side * side;
		int a2 = me.areaOfRectangle(8, 9);
		System.out.println(a2);
		return a1; // using static variable of class
	}

	protected int areaOfRectangle(int len, int width) { // non-static method
		int area1 = len * width;
		return area1;
	}

}
