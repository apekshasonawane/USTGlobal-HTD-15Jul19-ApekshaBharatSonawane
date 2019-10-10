package com.dev.assignment1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter elemnts of array=>");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
	System.out.println("Reverse array of original array is=>");
	for(int i=(a.length-1);i>=0;i--) {
		System.out.println(a[i]);
	}
	
			
	}

}
