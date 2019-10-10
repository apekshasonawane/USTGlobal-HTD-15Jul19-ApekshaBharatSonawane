package com.dev.practice;

public class EmployeeData {

	public static void main(String[] args) {
		InterfaceImpl i1=new InterfaceImpl();
		
		Employee e1=new Employee();
		e1.setName("Apeksha");
		e1.setId(1101);
		Employee e2=new Employee();
		e2.setName("Aishwarya");
		e2.setId(1102);
		
		boolean b1=i1.addEmployee(e1);
		
		i1.addEmployee(e2);
		System.out.println(b1);
		

	}

}
