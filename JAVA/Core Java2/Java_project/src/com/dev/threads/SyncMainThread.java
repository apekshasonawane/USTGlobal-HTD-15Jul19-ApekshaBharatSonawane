package com.dev.threads;

public class SyncMainThread {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("Sync main thread started");
	
	Printer p=new Printer();
	
	//new Thread4(p).start();
	Thread4 t4=new Thread4(p);
	t4.start();
	t4.join();
	new Thread5(p).start();
	
	
	
	
	
		/*
		 * for(int i=1;i<=20;i++) { System.out.println("Value of i="+i); i++; }
		 */
	
	
	System.out.println("Sync main thread terminated");
	}
	

}
