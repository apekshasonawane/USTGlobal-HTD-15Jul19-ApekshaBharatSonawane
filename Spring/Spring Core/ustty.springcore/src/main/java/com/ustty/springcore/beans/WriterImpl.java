package com.ustty.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WriterImpl {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		Author author=context.getBean(Author.class);		//for author scope is singleton bcoz it is bean,if we create another variable of Author then author1 and author 2 are same
		System.out.println(author.getName());
		author.getWriter().write();
		
		HelloWorld obj=context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
		
		/*
		 * Writer pen=context.getBean(Pen.class); pen.write();
		 * 
		 * 
		 * Writer pencil=context.getBean(Pencil.class);
		 */
		
		
		}
	
}
