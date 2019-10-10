package com.dev.lambdaexp;

public class Test2 {

	public static void main(String[] args) {
		FunctionalInterface1 fi1= () -> {
			try {
				int i=10/0;
				System.out.println(i);
			} catch (Exception e) {
			System.out.println("This is arithmtic exception");
			}
		};
		fi1.print();
	}

}
