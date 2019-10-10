package com.dev.collection;

import java.util.HashSet;

public class HashSetPracticeExample {

	public static void main(String[] args) {
		HashSet<Employee> hs=new HashSet<Employee>();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.setName("John");
		e1.setEmail("john123gmail.com");
		e1.setId(1101);
		e1.setPassword("johnjohn");

		e2.setName("Alan");
		e2.setEmail("alan123gmail.com");
		e2.setId(1102);
		e2.setPassword("alanalan");
		
		e3.setName("Stephen");
		e3.setEmail("stephen123gmail.com");
		e3.setId(1103);
		e3.setPassword("stephen225");


		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		e2.setEmail("alan225@yahoo.com");
		e1.setEmail("john225@gmail.com");
		System.out.println(hs);
		hs.contains(e1);
		boolean b=e1.getName()=="John";
		System.out.println(b);
		}

}
