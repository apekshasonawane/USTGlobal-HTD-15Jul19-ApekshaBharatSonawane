package com.ust.usttyspringboot.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ust.usttyspringboot.dto.Employee;

//@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	//@PersistenceUnit
	private EntityManagerFactory emf;
	private EntityTransaction et;

	@Override
	public boolean addEmployee(Employee employee) {
		
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		try {
			em.persist(employee);
			et.commit();
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}

	@Override
	public boolean removeEmployee(int id) {
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class, id);
		
		try {
			em.remove(emp);
			et.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class, employee.getId());
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDob(employee.getDob());
		et.commit();
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		return em.find(Employee.class,id);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		EntityManager em=emf.createEntityManager();
		String jpql="from Employee";
		javax.persistence.Query query= em.createQuery(jpql);
		List<Employee> resultList=(List<Employee>) query.getResultList();
		return resultList;
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		EntityManager em=emf.createEntityManager();
		String jpql="select name from Employee";
		javax.persistence.Query query= em.createQuery(jpql);
		List<Employee> resultList=(List<Employee>) query.getResultList();
		return resultList;
	}


}
