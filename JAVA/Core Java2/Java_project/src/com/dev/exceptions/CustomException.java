package com.dev.exceptions;

public class CustomException extends Exception {
	public CustomException() {
		System.out.println("Custom Exception");
	}

	public CustomException(int i) {
		System.out.println("Custom Exception with integer");
	}

	public CustomException(String str) {
		System.out.println("Custom Exception with string");
	}
}
