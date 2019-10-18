package com.ustty.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal{

	@Override
	public void makeSound() {
	System.out.println("Baoooooooo");
		
	}
	public Dog() {
		System.out.println("Dog object created");
	}
	@PostConstruct
	public void init() {
		System.out.println("Dog Init method");

	}
	@PreDestroy
	public void destroy() {
		System.out.println("Dog Destroy method");			//it will not print this method in annotation bcoz scope is prototype so object will not be destroyes when we close application context,prototype object will not have destroy phase

	}
}
