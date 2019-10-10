package com.dev.threads;

public class Thread4 extends Thread {
	Printer p=new Printer();
	public Thread4(Printer p1) {
		p=p1;
	}
	
	
	
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	p.printVal(10, "Thread 4");
}
}
