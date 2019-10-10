package com.dev.strings;

public class CreateStrings {

	public static void main(String[] args) {
		String str="Hello";		//String creation,str will store address of Hello
		String str1;
		String str5="Hello";
		str1="Welcome";
	
		String str2=new String("Good Morning");
		StringBuffer sb=new  StringBuffer("Hello");
		StringBuilder sb1=new StringBuilder("Language");
		
		//StringBuffer sb2=new StringBuffer(-1);			//throws exception NegativeArraySizeException
		System.out.println(sb.equals(str5));
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(sb);		//stringbuffer object prinnting,it is immutable
		System.out.println(sb+" "+sb1);  //stringbuilder object prinnting
		System.out.println(sb.length());		//gives length only
		System.out.println(sb.capacity());		//length+16
		
		
	}

}
