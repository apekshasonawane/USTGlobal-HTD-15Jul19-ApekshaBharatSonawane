package com.dev.collection;

import java.util.HashMap;

public class HashMapEmployeeClass2{

	public static void main(String[] args) {
	

		HashMapEmployeeClass h1=new HashMapEmployeeClass();
		Employee e=new Employee();
		e.setId(1501);
		e.setEmail("alex@gmail");
		e.setName("Alex");
		e.setPassword("alex");
		
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

		
		boolean b=h1.addEmployee(e);
		h1.addEmployee(e1);
		h1.addEmployee(e2);
		h1.addEmployee(e3);
		
		e2.setEmail("apeksha123");
		h1.updateEmployee(e1);
h1.deleteEmployee(e);
		
		System.out.println(b);
	
		
		
	}

}
