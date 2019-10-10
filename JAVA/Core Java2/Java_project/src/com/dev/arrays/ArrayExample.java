package com.dev.arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] prime= {2,3,5,7,11,13,78,90,56};
				
		int index,indexToPrint,mid=prime.length/2;
		System.out.println("Enter index=>");
		index=sc.nextInt();
		indexToPrint=sc.nextInt();

		if(index>=prime.length)
		{
			System.out.println("Array index is not present");
		}else
		{
			System.out.println("Valid");
			for(int i=index;i<=index;i++) {
				System.out.println("Element at"+i+"  is"+prime[i]);
			}
		}
		if(index<=prime.length)
		{

			System.out.println("Valid");
			for(int i=0;i<=indexToPrint;i++)
			{
				System.out.println("Array from 0 to"+prime[i]);
			}
		}
		
		System.out.println("Middle index  "+mid+"  value is=>");
		for(int i=mid;i<=mid;i++) {
			System.out.println(prime[mid]);
		}




		}
}
