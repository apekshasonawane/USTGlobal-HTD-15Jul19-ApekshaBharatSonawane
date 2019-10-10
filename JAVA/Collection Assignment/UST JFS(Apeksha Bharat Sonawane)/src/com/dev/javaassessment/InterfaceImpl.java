package com.dev.javaassessment;

import java.util.HashMap;

public class InterfaceImpl implements EmployeeInterface {

	HashMap<String, Employee> hm = new HashMap<String, Employee>(5);
	static InterfaceImpl i2 = new InterfaceImpl();

	@Override
	public boolean addEmployee(Employee e) {
		if (e != null) {
			hm.put("1", e);

			System.out.println(hm);
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		int id = e.getEmpid();
		if (id != 0) {
			hm.remove(e);
			System.out.println(id + "Deleted SuccessFully" + e.getEname());
		} else {
			System.out.println("Employee is not present to delete ");
		}
		System.out.println(hm);
		return false;
	}

	@Override
	public void searchEmployee(Employee e) {
		int id = e.getEmpid();
		if (e != null) {
			System.out.println("Details of searched employee=>" + "Employee [empid=" + e.getEmpid() + ", ename="
					+ e.getEname() + ", email=" + e.getEmail() + ", salary=" + e.getSalary() + "]");
		} else {
			System.out.println("Employee is not present");
		}
	}

	@Override
	public void updateEmployee(Employee e) {
		if (e != null) {
			hm.put("1", e);
			System.out.println("Details of updated employee=>" + "Employee [empid=" + e.getEmpid() + ", ename="
					+ e.getEname() + ", email=" + e.getEmail() + ", salary=" + e.getSalary() + "]");
		}

	}

	@Override
	public double totalPayableTax(Employee e) {
		double tax = 0;
		double totalSal = e.getSalary();

		if (totalSal >= 5.4 && totalSal <= 8.6) {
			tax = ((totalSal * 8.19) / 100) * 10000;
			System.out.println("Tax=" + tax);
		} else if (totalSal >= 3.8 && totalSal <= 5.4) {
			tax = ((totalSal * 7.34) / 100) * 100000;
			System.out.println("Tax=" + tax);
		}
		return tax;

	}

	@Override
	public void netPay(Employee e) {
		double deduction;
		double totalSal = e.getSalary();
		double tax = i2.totalPayableTax(e);

		if (totalSal >= 5.4 && totalSal <= 8.6) {
			deduction = 4321;
			System.out.println("NetPay=" + (totalSal - (tax + deduction)) * 10000);
		} else if (totalSal >= 3.8 && totalSal <= 5.4) {
			deduction = 3765;
			System.out.println("NetPay=" + (totalSal * 10000 - (tax + deduction)));
		}
	}

	@Override
	public void salGrade(Employee e) {
		double tax;
		double totalSal = e.getSalary();
		if (totalSal >= 5.4 && totalSal <= 8.6) {

			System.out.println("Grade is B");
		}
		if (totalSal >= 3.8 && totalSal < 5.4) {

			System.out.println("Grade is c");
		}
	}

}
