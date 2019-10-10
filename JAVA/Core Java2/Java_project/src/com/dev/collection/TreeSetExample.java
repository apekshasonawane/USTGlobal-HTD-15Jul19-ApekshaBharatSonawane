package com.dev.collection;

import java.util.TreeSet;

import div.com.encapsulation.Cat;

public class TreeSetExample {

	public static void main(String[] args) {
	TreeSet<Cat> ts=new TreeSet<Cat>();			//treeset uses comparator interface

	Cat c=new Cat();
	c.setAge(2);
	c.setColor("brown");
	c.setName("sonu");
	
	Cat c1=new Cat();
	c1.setAge(1);
	c1.setColor("white");
	c1.setName("mani");
	
	Cat c2=new Cat();
	c2.setAge(7);
	c2.setColor("black");
	c2.setName("sweetie");
	
	ts.add(c);
	ts.add(c1);
	ts.add(c2);				//it must implement comparable interface which uses compareTo()
	System.out.println(ts);
	}

}
