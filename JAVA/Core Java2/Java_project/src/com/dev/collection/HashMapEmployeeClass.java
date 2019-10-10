package com.dev.collection;

import java.util.HashMap;

public class HashMapEmployeeClass implements EmployeeInterface{

	

	 HashMap<String,Employee> hm=new HashMap<String,Employee>(2);
	@Override
	public boolean addEmployee(Employee e) {
	if(e!=null) {
		hm.put("1", e);
		hm.put("2", e);
		hm.put("3", e);
		hm.put("4", e);
		
		System.out.println(hm);
		return true;
	}
		return false;
	}
	
	@Override
	public void deleteEmployee(Employee e) {
	boolean b=hm.remove("1", e);
	if(b) {
		System.out.println("deleted successfully");
		System.out.println(hm);
		System.out.println(b);
	}
	
	}

	@Override
	public void updateEmployee(Employee e) {
hm.put("2", e);
System.out.println("Updated SuccessFully"+hm);
	}

	@Override
	public void retrieveEmployee(Employee e) {
		boolean b3=hm.containsValue( "2" );		//we have deleted c2 so output should be false
		System.out.println(hm);
		System.out.println("Output of containsValue=>"+b3);
		
		
	}

	

}



