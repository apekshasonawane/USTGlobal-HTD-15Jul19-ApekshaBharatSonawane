package com.dev.javaassessment;

public class EmployeeData {

	public static void main(String[] args) {
		InterfaceImpl i1 = new InterfaceImpl();

		Employee e1 = new Employee();
		e1.setEmpid(1201);
		e1.setEname("Alan");
		e1.setEmail("alan123@gmail.com");
		e1.setPassword("alan");
		e1.setSalary(4.5);

		Employee e2 = new Employee();
		e2.setEmpid(1202);
		e2.setEname("Stephen");
		e2.setEmail("stephen123@gmail.com");
		e2.setPassword("stephen");
		e2.setSalary(5.5);

		Employee e3 = new Employee();
		e3.setEmpid(1203);
		e3.setEname("John");
		e3.setEmail("john123@gmail.com");
		e3.setPassword("john");
		e3.setSalary(3.00);

		i1.addEmployee(e1);
		i1.addEmployee(e2);
		i1.addEmployee(e3);

		i1.searchEmployee(e3);

		i1.deleteEmployee(e2);

		e1.setEmail("sssss225@gmail.com");
		i1.updateEmployee(e1);

		i1.totalPayableTax(e1);
		i1.salGrade(e2);

		i1.netPay(e1);

	}

}
