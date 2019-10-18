package com.ustty.springcore.beans;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld implements InitializingBean,DisposableBean{		//another way to execute init and Destroy method

	private String msg;
	private int count;
	@Autowired										//2nd way of autowiring  by default it is byType
	@Qualifier("dog")								//autowire byName
	private Animal animal;
	private  Map<String,Integer> map;

	public HelloWorld() {
		System.out.println("This is HelloWorld Constructor object gets created");
	}
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void destroy() throws Exception {			//method gets executed once if the scope is prototype,destroy() of objects will not gets destroyed bcoz hellowoeld is stored in container and objexts are stored outside of constructor
	System.out.println("This is Destroy Method");		//destroy() used to perform some operation before destroy
	}

	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("This is AfterProperties Set Method which is after Initialization");	
	}
	
}
