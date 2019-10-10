package com.dev.collection;

import java.util.HashMap;


import div.com.encapsulation.Cat;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<String,Cat> hm=new HashMap<String,Cat>();

	Cat c=new Cat();
	c.setAge(2);
	c.setColor("brown");
	c.setName("sonu");
	
	Cat c1=new Cat();
	c1.setAge(1);
	c1.setColor("white");
	c1.setName("mani");
	
	Cat c2=new Cat();
	c2.setAge(1);
	c2.setColor("black");
	c2.setName("sweetie");
	
	hm.put("1", c);				//when we invoke put() for first time then it will return null value,key returns  previous associated value 
	//hm.put("1", null);			//value is set to null so it will return null
	Cat b=hm.put("3", c1);
	System.out.println(b);
	hm.put("2", c2);
	System.out.println(hm);   //shows output with unique key
	hm.remove("2");
	System.out.println(hm);
	boolean b1=hm.containsKey("1");
	System.out.println("Output of containsKey=>"+b1);
	boolean b3=hm.containsValue(c2);		//we have deleted c2 so output should be false
	System.out.println(hm);
	System.out.println("Output of containsValue=>"+b3);
	
	
			
			
	}

}
