package com.ustglobal.ustty.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustty.springcore.beans.Animal;
import com.ustty.springcore.beans.HelloWorld;
import com.ustty.springcore.config.BeanConfig;

public class AnnotationConfigApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloWorld obj=context.getBean(HelloWorld.class);
		System.out.println(obj.getMsg());
		System.out.println(obj.getCount());
		System.out.println(obj.getMap());
		obj.getAnimal().makeSound();
		
		
		
		  Animal animal1=(Animal) context.getBean("dog");
		  Animal  animal2=(Animal) context.getBean("dog"); System.out.println(animal1==animal2);    //for checking scope
		
		context.close();//close() used to destroy the object after that it will not be present in heap or anywhere,garbage collector will take care of it
		
	}
}
