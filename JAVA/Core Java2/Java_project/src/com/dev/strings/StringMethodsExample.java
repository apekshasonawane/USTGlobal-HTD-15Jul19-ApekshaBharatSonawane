package com.dev.strings;

public class StringMethodsExample {

	public static void main(String[] args) {
	String movieName="Kabir Singh";
	String movieName2="kaBiR siNgH";
	
	int length=movieName.length();
	System.out.println("Length=>"+length);
	
	char c2=movieName.charAt(4);
	System.out.println("Character at 4 index=>"+c2);
	
	char c1[]=movieName.toCharArray();
	System.out.println("ToCharArrayOutput=>"+c1[3]);
	
	boolean b1=movieName.equals(movieName2);
	System.out.println("Whether strings are equals=>"+b1);
	
	boolean b2=movieName.equalsIgnoreCase(movieName2);
	System.out.println("Whether strings are equal after ignoring case=>"+b2);
	
	boolean b3=movieName.contains("sin");//return type is boolean(used to check particular string)consider case
	System.out.println("Sin is present??"+b3);
	
	String NewMovieName=movieName.replace("Kabir", "KABIR");//we can replace character as well as string also(consider case)
	System.out.println(NewMovieName);
	
	int index=movieName.indexOf('S');//case sensitive and returns integer value of first occurance
	System.out.println("Index of S is=>"+index);
	
	System.out.println(movieName.toUpperCase());
	System.out.println(movieName.toLowerCase());
	
	String str1= movieName.substring(5);
	System.out.println("Output for (int)=>"+str1);
	
	String str2=movieName.substring(2, 8);//(start index,end index) where beginning index in included but last  index is excluded
	System.out.println("Output for (int,int)=>"+str2);
	
	
	
	
	
	
	
	
	
	
	}

}
