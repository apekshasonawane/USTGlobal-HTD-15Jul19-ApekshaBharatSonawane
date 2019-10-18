package com.ust.ustty.springmvc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustty.springmvc.dao.EmployeeDAO;
import com.ust.ustty.springmvc.dto.Employee;


@Service							//used forjust to indicate service implementation class same as @component & @rep0sitory
public class EmployeeServiceImpl implements EmployeeService{

	//private EmployeeDAO dao=new EmployeeDAOImpl();		or do autowiring
	@Autowired
	private EmployeeDAO dao;			//spring will create object and gives
	//in service give validation for each and every method
	@Override
	public Employee auth(String email, String password) {
		
		return dao.auth(email, password);
	}

	@Override
	public boolean registerEmployee(Employee employee) {
	if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null)
		return false;
	return dao.registerEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		if(employee.getName()==null||employee.getEmail()==null||employee.getPassword()==null)
		return false;
		return dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return 	dao.getAllEmployee();
	}
	

}
