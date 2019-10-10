package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("MAin started");

		new Thread2().start(); // calling thread2 by creating object of thread2 bcoz start() is nonstatic
		Thread.currentThread().setName("Main Thread"); // setting the name of main thread
		for (int i = 1; i <= 15; i++) {
			System.out.println(i);
		}
		Thread2 t2 = new Thread2();
		t2.setPriority(1); // priority value should be in between 1 to 10 else it will give
							// IllegalArgumentException

		Thread3 t3 = new Thread3(); // creation of object of class
		Thread t = new Thread(t3); // object of class is given as input to thread class
		t.start();
		t.setPriority(7);// calling the start method
		// t.start(); //starting two threads at the same time gives exception
		t3.setName("Third thread");
		System.out.println(t.getName());
		// new Thread(new Thread3()).start(); //creating object of thread
		System.out.println(t.getName());
		System.out.println("NAme of main thread=>" + Thread.currentThread().getName());

		System.out.println("Thread 3 id=>" + t.getId());
		System.out.println("Thread 2 id" + t2.getId());
		System.out.println("Priority of thread 2=>" + t2.getPriority());
		System.out.println("Priority of thread 3=>" + t.getPriority());

		System.out.println("MAin terminated");
	}

}
