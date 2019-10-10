package com.dev.lambdaexp;

@FunctionalInterface
public interface FunctionalInterface1 {
	
	public void print();
	public default void display() {
		System.out.println("This is display");
	}
}
