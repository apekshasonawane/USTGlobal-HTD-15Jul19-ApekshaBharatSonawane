package com.ust.usttyspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.usttyspringboot.dto.Employee;
import com.ust.usttyspringboot.repository.EmployeeRepositoty;

@Service("jpa")
public class EmployeeServiceJPAImpl implements EmployeeService{

	@Autowired
	EmployeeRepositoty repository;
	@Override
	public boolean addEmployee(Employee employee) {
		repository.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		repository.update(employee.getName(), employee.getPassword(),employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		return	repository.findById(id).get();
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		return	repository.findAll();
		
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		
		return repository.findByName(name);
	}

}
