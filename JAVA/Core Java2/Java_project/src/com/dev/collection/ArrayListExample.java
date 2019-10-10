package com.dev.collection;

import java.util.ArrayList;

import div.com.encapsulation.Cat;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Cat> al=new ArrayList<Cat>(2);
		
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
		
		al.add(c);
		al.add(c1);
		al.add(c2);
		System.out.println(al);
		
		System.out.println("Size before trimming"+al.size());
		al.trimToSize();
		System.out.println("Size after trimming"+al.size());
	}

}
