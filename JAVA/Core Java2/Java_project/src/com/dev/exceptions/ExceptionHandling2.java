package com.dev.exceptions;

public class ExceptionHandling2 extends CustomException {

	public static void main(String[] args) {
		try {
			test();
			System.out.println("No exception for test");
			int res = divide(10, 0);
			System.out.println("No exception for divide");
			System.out.println(res);

		}
		// catch(NegativeArraySizeException n) {
		// System.out.println("negative array Exception in catch block");
		// System.out.println("getMessage()=>"+n.getMessage());
		// n.printStackTrace();
		// }
		catch (ArithmeticException e) {
			System.out.println("Exception in catch");
			System.out.println("getMessahe()" + e.getMessage());
			System.out.println("getLocaliazedMessage=>" + e.getLocalizedMessage());
		} finally {
			System.out.println("Finally block");
		}

	}

	private void CustomException(int i) {
		// TODO Auto-generated method stub

	}

	public static int divide(int i, int j) {
		int res = 10 / 0;
		System.out.println("result=" + res);
		return 1;
	}

	public static void test() {
		int i = -1;
		// StringBuffer sb=new StringBuffer(-1);
		// throw new NegativeArraySizeException();

		try {
			if (i < 0) {
				throw new CustomException("a"); // throw is used to display user defined exception
			}

			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
