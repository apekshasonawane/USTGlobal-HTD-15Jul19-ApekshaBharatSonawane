package com.ust.essportal.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Employee_Info")
public class EmployeeInfo {

	@Id
	@Column
	private int employee_ID;
	@Column
	private String employee_Name;
	@Column
	private String employee_Type;
	@Column
	private String email;
	@Column
	private String password;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EmployeeLeave",joinColumns= @JoinColumn(name="employee_ID"),
			inverseJoinColumns = @JoinColumn(name="empId"))
			private List<LeaveInfo> empId;
	public String getEmployee_Name() {
		return employee_Name;
	}
	public int getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Type() {
		return employee_Type;
	}
	public void setEmployee_Type(String employee_Type) {
		this.employee_Type = employee_Type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
