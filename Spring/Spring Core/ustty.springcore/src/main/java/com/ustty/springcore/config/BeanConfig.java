package com.ustty.springcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustty.springcore.beans.Dog;
import com.ustty.springcore.beans.HelloWorld;
import com.ustty.springcore.beans.Human;

@Configuration
public class BeanConfig {

	//@Bean(name = "obj1",autowire = Autowire.BY_TYPE)			//one way of autowire bytype,generally we dont use this we use annotion AutoWired
	
	@Bean(name = "obj1")
	public HelloWorld getHelloWorld() { // method to configure helloWorld bean class
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMsg("Hello world msg in bean Config");
		helloWorld.setCount(150);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("pqr", 456);
		helloWorld.setMap(map);
		
//		helloWorld.setAnimal(getDog());            //same as Animal animal=getDog();helloWorld.setAnimal(animal);
		return helloWorld; // we r returning object so this is factory method but it is normal to make it
							// spring factory method use@Bean
	}

	@Bean(name = "dog")			//it is not mandatory to specify name but it is good practice
	@Scope("prototype")	
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name="human")					//we can write any name   to execute human use @Qualifier in HelloWorld
	public Human getHuman() {
		return new Human();
	}

}
