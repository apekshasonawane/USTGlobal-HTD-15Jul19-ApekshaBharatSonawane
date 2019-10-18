package com.ustglobal.ustty.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustty.springcore.beans.Animal;
import com.ustty.springcore.beans.HelloWorld;
import com.ustty.springcore.beans.Pet;

public class XMLConfigApp {
	public static void main(String[] args) {
		HelloWorld obj1 = new HelloWorld(); // manually creation of object
		obj1.setMsg("Welcome");
		System.out.println(obj1.getMsg());

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj2 = context.getBean(HelloWorld.class); // creation of object using bean class
		System.out.println(obj2.getMsg());
		System.out.println(obj2.getCount());
		obj2.getAnimal().makeSound();
		System.out.println(obj2.getMap());
		context.close();

		// Animal animal=context.getBean(Animal.class); //for human it shows exception
		/*
		 * Animal animal = (Animal) context.getBean("dog"); animal.makeSound();
		 * 
		 * Animal animal1 = (Animal) context.getBean("human"); animal1.makeSound();
		 * 
		 * Pet pet=context.getBean(Pet.class); pet.getAnimal().makeSound();
		 * System.out.println(pet.getName());;
		 */
	
	}
}
