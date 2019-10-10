package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo=new MethodOverloading();
	public void print() {
		System.out.println("no-arguments");
	}
//	public int  print() {						//duplicate method on method overloading error
		public int  print(int i) {
		System.out.println("one arguments");
		return 1;
	}
		private String print(String str,int a) {
			System.out.println("Print with string");
			return "A";
		}
		final String print(String str) {
			System.out.println("Print with string");
			return "A";
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mo.print("A");
	}

}
