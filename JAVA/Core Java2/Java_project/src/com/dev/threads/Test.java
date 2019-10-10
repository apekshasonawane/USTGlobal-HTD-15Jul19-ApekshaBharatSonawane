package com.dev.threads;

public class Test {


		public static void main(String[] args) {
			System.out.println("MAin started");
			
			for(int i=1;i<=100;i++) {		//it will take lot of time to finish this for loop so to overcome this we can create another thread and write that conde in this thread
				System.out.println(i);
			}
		
			for(int i=1;i<=15;i++) {
				System.out.println(i);
			}
		
	
			System.out.println("MAin terminated");
			}


	}


