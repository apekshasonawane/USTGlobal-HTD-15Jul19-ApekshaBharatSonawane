package com.ustty.springcore.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustty.springcore.config.SpringConfig;

public class ComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj=context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	
		
		
	}
}
