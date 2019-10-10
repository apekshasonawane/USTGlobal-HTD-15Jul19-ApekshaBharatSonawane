package com.dev.javaassessment;

public interface EmployeeInterface {
	public boolean addEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
	public void searchEmployee(Employee e);
	public void updateEmployee(Employee e);
	public double totalPayableTax(Employee e);
	public void netPay(Employee e);
	public void salGrade(Employee e);
	
	
}
