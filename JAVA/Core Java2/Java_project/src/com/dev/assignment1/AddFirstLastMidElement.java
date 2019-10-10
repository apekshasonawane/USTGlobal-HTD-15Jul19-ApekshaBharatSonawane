package com.dev.assignment1;

import java.util.Scanner;

public class AddFirstLastMidElement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] a=new int[7];
		int first=0;
		int f=a[0];
		int l=a[a.length-2];
		int m=((first+(a.length-1))/2);

		System.out.println("Enter 7 elemnts into array=>");
		for(int i=0;i<7;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Addition of first,mid and last=>");
		System.out.println(f+m+l);



	}

}
