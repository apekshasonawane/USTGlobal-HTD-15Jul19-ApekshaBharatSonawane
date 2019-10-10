package com.dev.threads;

public class ThreadPractice  {

	public void printvalue(int i,String thread) {
		for(int j=1;j<=5;j++) {
			System.out.println("Thread:"+thread+"Value=>"+j);
		}
	}

}
