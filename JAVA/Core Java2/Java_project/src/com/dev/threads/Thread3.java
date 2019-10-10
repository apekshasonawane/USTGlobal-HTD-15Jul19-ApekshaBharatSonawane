package com.dev.threads;

public class Thread3 implements Runnable{



	@Override
	public void run() {
		System.out.println(" thread3 started");
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		System.out.println("Prints value of k");
		System.out.println(" thread3 terminated");
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
