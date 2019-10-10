package com.dev.exceptions;

public class ExceptionExample {

	public static void main(String[] args) throws NegativeArraySizeException {
		// double d=10.3948;
		// double d1=0.0;
		// System.out.println("Result : "+d/d1);
		// StringBuffer sb=new StringBuffer(-1); //java.lang.NegativeArraySizeException
		// System.out.println(sb);
		try {
			// exception(); //java.lang.NegativeArraySizeException
			int d = 10;
			int d1 = 0;
			System.out.println(d / d1);
		}
		// }catch(NegativeArraySizeException n) {
		// System.out.println("You have given invalid array size");}
		catch (ArithmeticException a) {
			System.out.println("number cannot be divided by 0");
			StringBuffer sb = new StringBuffer(-1);
			throw new NegativeArraySizeException("A");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void exception() {
		System.out.println("Before exception");
		StringBuffer sb = new StringBuffer(-1);
	}
	public static void exception1() {
		exception(); // shows the method heirarchy
		/*
		 * Exception in thread "main" java.lang.NegativeArraySizeException at
		 * java.lang.AbstractStringBuilder.<init>(Unknown Source) at
		 * java.lang.StringBuffer.<init>(Unknown Source) at
		 * com.dev.exceptions.ExceptionExample.exception(ExceptionExample.java:15) at
		 * com.dev.exceptions.ExceptionExample.main(ExceptionExample.java:11)
		 */
	}
}
