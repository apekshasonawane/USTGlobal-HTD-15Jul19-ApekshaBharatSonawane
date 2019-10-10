package com.dev.threads;

public class Printer {
 public void printVal(int i,String thread) {			//to make data consistent we use synchronized or join()
		for(int k=1;k<=10;k++) {
			System.out.println("Thread=>"+thread+ "   " +"Value of k=>"+k);
		}
	}
}
