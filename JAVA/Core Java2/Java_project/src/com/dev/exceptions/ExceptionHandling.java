package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) throws CustomException { // throws tells that it may or may not throw an
																	// exception
		try {
			test();
			throw new CustomException("A");
			// System.out.println("Code after the try");
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace(); // Shows details about occurred exception (information about the exception
									// called as stack trace)
			e.getMessage(); // prints msg of catch block
			System.out.println("catch block");
		} finally {
			System.out.println("This is finally block"); // even though error is occurred or not we can execute finally
															// block
		}
		System.out.println("Code after exception");
	}

	// public static void test() throws Exception,NegativeArraySizeException{
	public static void test() throws CustomException {
		StringBuffer s = new StringBuffer(1); // throws exception
		throw new CustomException();
		// StringBuffer s=new StringBuffer(10);
	}

}
