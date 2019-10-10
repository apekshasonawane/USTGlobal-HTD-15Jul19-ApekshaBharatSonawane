package com.dev.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	int b=10;
	//byte i=b;			//giving error so do casting
	byte i=(byte) b;
	short s=20;
	byte i1=(byte) s;
	char c='A';
	float f=c;
	double d=c;
	System.out.println(i);
	System.out.println(i1);
	System.out.println(f);
	System.out.println(d);
	
	List<String>  l=new ArrayList<String>();		//List is parent of ArrayList
	}

}
