package com.dev.arrays;

public class CreateArray {

	public static void main(String[] args) {
	int []array;		//array declaration in 3 ways
	char[] array1;
	char[] ch1=new char[5];
	byte array2[];
	int array4[]=new int[5];		//array declaration and creation
	int[] array5= {1,2,3,4,5};		//array declaration,creation and initialization
	System.out.println(array5[4]);
	System.out.println("Length of array=>"+array5.length);
	
	array=new int[3];		//array creation
	array1=new char[5];
	array2=new byte[4];
	
	array[0]=21;			//array Initialization
	array[1]=22;
	array[2]=23;
	
	array1[0]='A';
	array1[1]='P';
	array1[2]='L';
	array1[3]='T';
	array1[4]='S';
	
	array2[0]=12;
	array2[1]=22;
	array2[2]=32;
	array2[3]=42;
	
	int res=array[0]*2;
	System.out.println(res);
	int res1=array[1]+2;
	System.out.println(res1);
	int res2=array[2]/3;
	System.out.println(res2);
	int res3=array2[3]%2;
	System.out.println(res3);
	int res4=array2[1]-2;
	System.out.println(res4);
	
//	System.out.println(array2);   //it returns physical address of array i.e [B@10dea4e
	
	System.out.println(" "+ch1); //String is mandatory to print the physical address
	
	}

}
