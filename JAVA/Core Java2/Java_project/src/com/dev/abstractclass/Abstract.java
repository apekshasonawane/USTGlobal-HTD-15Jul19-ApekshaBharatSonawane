package com.dev.abstractclass;

@FunctionalInterface
public interface Abstract {
void display();
//void show();		//functional interface contains only one abstract method


public static void print() {
	System.out.println("Print of classInterface");
}

public default void print1() {
	System.out.println("Print1 of classInterface");
}


}
