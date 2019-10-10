package com.dev.collection;

import java.util.HashSet;

import div.com.encapsulation.Cat;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<Cat> hs= new HashSet<Cat>();
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
		
		boolean b=hs.add(c);
		boolean b1=hs.add(c1);
		boolean b3=hs.add(c2);
		System.out.println(b);
		System.out.println(hs);
		System.out.println("Size of HashSet=>"+hs.size());
		
		boolean b2=hs.remove(c);
		System.out.println("Output of remove:"+b2);
		System.out.println(hs);
		
		boolean b4=hs.contains(c);
		System.out.println("output of contains=>"+b4);
		
		System.out.println("Size of HashSet=>"+hs.size());
		System.out.println("Is hashset empty??=>"+hs.isEmpty());
		//hs.clear();
		System.out.println("Size of HashSet=>"+hs.size());
		
		//Foreach used to iterate through collections except hashMap 
				for (Cat cat : hs) {
					System.out.println(cat);
				}

	}

}
