package com.dev.collection;

import java.util.TreeSet;

public class TressSetPracticeExample {

	public static void main(String[] args) {
	TreeSet<Employee> ts=new  TreeSet<Employee>();		//used to arrange element in sorted manner ,Employee should be implemented by comparable and CompareTo method should be present in Employee
	
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	e1.setName("John");
	e1.setEmail("john123gmail.com");
	e1.setId(1141);
	e1.setPassword("johnjohn");

	e2.setName("Alan");
	e2.setEmail("alan123gmail.com");
	e2.setId(1111);
	e2.setPassword("alanalan");
	
	e3.setName("Stephen");
	e3.setEmail("stephen123gmail.com");
	e3.setId(1101);
	e3.setPassword("stephen225");

	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	System.out.println(ts);
	}

}
