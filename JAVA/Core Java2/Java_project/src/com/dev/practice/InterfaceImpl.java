package com.dev.practice;

import java.util.HashMap;

public class InterfaceImpl implements EmployeeInterface{

HashMap<String,Employee> hm=new HashMap<String,Employee>(2);

	@Override
	public boolean addEmployee(Employee e) {
		if(e!=null) {
			hm.put("1", e);
		hm.put("2", e);
//			hm.put("3", e);
//			hm.put("4", e);
			
			System.out.println(hm);
		}
		return false;
	}

}
