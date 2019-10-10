package com.dev.objectmethods;

public class CatData{

	public static void main(String[] args) {
		Cat c1=new Cat();
		Cat c2=new Cat();
		Cat c3=new Cat();
		Cat c4=new Cat();
		
		Cat[] cat= {c1,c2,c3,c4};
		
		c1.setName("Rani");
		c1.setAge(2);
		c1.setColor("black");
		
		c2.setName("sweetie");
		c2.setAge(1);
		c2.setColor("white");
		
		c3.setName("sonu");
		c3.setAge(2);
		c3.setColor("black and white");
		
		c4.setName("sweetie");
		c4.setAge(1);
		c4.setColor("white");
		
		
		for(int i=0;i<cat.length;i++) {
//			System.out.println("Name=  "+cat[i].getName());
//			System.out.println("Age=  "+cat[i].getAge());
//			System.out.println("Color=  "+cat[i].getColor());
			System.out.println(cat[i]);		//tostring output  Cat [name=sweetie, color=white, age=1]
			System.out.println("****************************************");
		}
	System.out.println(c1.equals(c4));
		System.out.println(c4.equals(c2));
		System.out.println(c4.hashCode());		//refers to same addres ocz values are same
		System.out.println(c2.hashCode());
		
	}
}
