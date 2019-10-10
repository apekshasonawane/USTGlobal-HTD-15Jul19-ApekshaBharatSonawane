package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Apeksha Sonawane";
		String str1 = "Apeksha Sonawane";
		int length = str.length();
		System.out.println("String length=>" + length);

		char[] c = str.toCharArray();
		System.out.println("Result of toCharAt=>" + c[1]);

		char c1 = str.charAt(3); // consider range from 0 to length of str-1
		System.out.println("Char at index 3=>" + c1);

		boolean b = str.equals(str1); // 3 rules:str1 should not null,str should be of string datatype,str1 should
										// have same values as str,checks memory address if strings are same then memory
										// address will be same
		System.out.println("Result of equals=>" + b);

		if (str == str1) { // Checks contents of strings are equal or not
			System.out.println("Two strings are same");
		} else {
			System.out.println("Two strings are not same");
		}

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("Result of EqualIgnoreLength=>" + b1);

	}

}
