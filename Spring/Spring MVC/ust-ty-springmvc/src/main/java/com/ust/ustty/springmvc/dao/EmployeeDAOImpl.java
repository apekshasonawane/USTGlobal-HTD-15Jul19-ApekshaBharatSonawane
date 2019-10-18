package com.ust.ustty.springmvc.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.ustty.springmvc.dto.Employee;


@Repository								//always use @repository to make it component @component is also fine
public class EmployeeDAOImpl implements EmployeeDAO{

	@PersistenceUnit
	private EntityManagerFactory emf;			//if we create object in normal way then it may create multiple object so use localEnitityManagerFactory bean it is must

	EntityTransaction et=null;
	@Override
	public Employee auth(String email, String password) {
		EntityManager em=emf.createEntityManager();
		String jpql="from Employee where email=:email and password=:pass";
		Query query=em.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pass", password);
		try {
	return (Employee) query.getSingleResult();
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if(checkEmail(employee.getEmail())) {
			return false;
		}
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
		return true;
	}

	private boolean checkEmail(String email) {
		EntityManager em=emf.createEntityManager();
		String jpql="from Employee where email=:email ";
		Query query=em.createQuery(jpql);
		query.setParameter("email", email);
		try {
		 query.getSingleResult();
		return true;
		}catch (Exception e) {
			return false;
		}
		
	
	}
	
	@Override
	public boolean deleteEmployee(int id) {
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class, id);
		if(emp==null) {
			return false;
		}
		em.remove(emp);
		et.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager em=emf.createEntityManager();
		et=em.getTransaction();
		et.begin();
		Employee emp=em.find(Employee.class, employee.getId());
		if(emp==null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDob(employee.getDob());
		et.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		EntityManager em=emf.createEntityManager();
		String jpql="from Employee";
		Query query=em.createQuery(jpql);
		List<Employee> resultList=query.getResultList();
		
		return resultList;
	}

	
}
