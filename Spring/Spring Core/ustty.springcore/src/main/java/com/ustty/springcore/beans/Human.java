package com.ustty.springcore.beans;

import org.springframework.stereotype.Component;

@Component("human")								//when we want tocreate object of spring then Component is used
public class Human implements Animal{

	@Override
	public void makeSound() {
		System.out.println("HaHaHAaaaa");
	}

}
