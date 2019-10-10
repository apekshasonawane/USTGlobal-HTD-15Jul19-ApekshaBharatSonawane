package com.dev.threads;

public class Thread2 extends Thread {

@Override
public void run() {
	System.out.println("Thread2 run method started");
	for(int j=1;j<=10;j++) {
		System.out.println(j);
	}
	System.out.println("Ptints value of j");
	System.out.println("Thread2 run method terminated");
}
}
