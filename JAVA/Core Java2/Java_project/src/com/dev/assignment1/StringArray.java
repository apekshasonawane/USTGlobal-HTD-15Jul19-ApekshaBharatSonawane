package com.dev.assignment1;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		String str="Stephen"; String str2;

		Scanner sc=new Scanner(System.in);

		System.out.println("Reverse String=>");
		for(int i=(str.length()-1);i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\nEnter String=>");
		str2=sc.nextLine();		//for int nextInt() is used ,for string nextLine is used
		System.out.println(str2);
		System.out.println("Reverse String=>");
		for(int i=(str2.length()-1);i>=0;i--) {
			System.out.print(str2.charAt(i));
		}
	}

}
