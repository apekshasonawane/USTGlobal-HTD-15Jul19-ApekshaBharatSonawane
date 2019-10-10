package com.dev.lambdaexp;

public class Test1 {

	public static void main(String[] args) {
		FunctionalInterface1 fi = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};				//lambda expression is treated as method
		FuncInt2 f1 = (int i) ->{			//passing parameter to expression
			System.out.println("passing parameter to expression");
			for( i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		fi.print();
		f1.print(5);
		fi.display();
		
	}

}
