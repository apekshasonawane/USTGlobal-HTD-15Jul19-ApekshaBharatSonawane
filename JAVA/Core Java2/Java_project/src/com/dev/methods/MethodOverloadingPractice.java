package com.dev.methods;

import java.util.Scanner;

public class MethodOverloadingPractice {
	static MethodOverloadingPractice mop=new MethodOverloadingPractice();
	public void addition(int a,int b) {
		System.out.println("Addition of two numbers=>"+(a+b));

	}
	public void addition(int a,int b,int c) {
		System.out.println("Addition of three no.s=>"+(a+b+c));

	}
	public void addition(int a,int b,int c,int d) {
		System.out.println("Addition of 4 no.s=>"+(a+b+c+d));

	}
	public void subtraction(int a,int b) {
		System.out.println("subtraction of two numbers=>"+(a-b));

	}
	public void subtraction(int a,int b,int c) {
		System.out.println("subtraction of three no.s=>"+(a-b-c));

	}
	public void subtraction(int a,int b,int c,int d) {
		System.out.println("subtraction of four no.s=>"+(a-b-c-d));

	}
	public void multiplication(int a,int b) {
		System.out.println("Multiplication of two no.s=>"+(a*b));
	}
	public void multiplication(int a,int b,int c) {
		System.out.println("multiplication od 3 numbers =>"+(a*b*c));

	}
	public void multiplication(int a,int b,int c,int d) {
		System.out.println("multiplication od 4 numbers =>"+(a*b*c*d));

	}


	public void division(int a,int b) {
		System.out.println("Division of two no.s=>"+(a/b));
	}
	public void division(int a,int b,int c) {
		System.out.println("Division of two no.s=>"+((a/b)/c));
	}
	public void division(int a,int b,int c,int d) {
		System.out.println("Division of two no.s=>"+(((a/b)/c)/d));
	}

	public static void main(String[] args) {
		int ch=0,n,a,b,c,d;
		Scanner sc=new Scanner(System.in);
		//		System.out.println("How many numbers you want to give=>");
		//		n=sc.nextInt();
		//		System.out.println("Enter  "+n+"  numbers=>");
		//		a=sc.nextInt();
		//		b=sc.nextInt();
		//		c=sc.nextInt();
		//		d=sc.nextInt();

		System.out.println("1.operations of  2 numbers");
		System.out.println("2.operations of  3 numbers");
		System.out.println("1.operations of  4 numbers");

		System.out.println("Enter your choice=>");
		ch=sc.nextInt();
		switch(ch) {
		case 1:	System.out.println("Enter  2 numbers=>");
		a=sc.nextInt();
		b=sc.nextInt();
		mop.addition(a,b);
		mop.subtraction(a,b);
		mop.multiplication(a,b);
		mop.division(a,b);
		break;
		case 2:System.out.println("Enter  3 numbers=>");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		mop.addition(a,b,c);
		mop.subtraction(a,b,c);
	
		mop.multiplication(a,b,c);
		mop.division(a,b,c);
		break;

		case 4:System.out.println("Enter  4 numbers=>");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		mop.addition(a,b,c,d);
		mop.subtraction(a,b,c,d);
		mop.multiplication(a,b,c,d);
		mop.division(a,b,c,d);
		break;
		default:
			System.out.println("invalid choice");
		}

	}

}
