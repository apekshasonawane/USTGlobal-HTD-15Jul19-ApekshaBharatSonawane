package com.dev.threads;

public class Thread5 extends Thread {
	Printer p=new Printer();
	public Thread5(Printer p1) {
		p=p1;
	}
	
	
	
	@Override
	public void run() {
		/*
		 * for(int j=1;j<=10;j++) { System.out.println("Value of j="+j);
		 * 
		 * 
		 * }
		 */
	p.printVal(10, "Thread 5");
	}
}
