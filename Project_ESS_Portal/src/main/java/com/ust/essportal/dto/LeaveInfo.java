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
@Table(name="Leave_Info")
public class LeaveInfo {

	@Id
	@Column
	private int empId;
	@Column
	private String date;
	@Column
	private String leave_Status;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EmployeeLeave",joinColumns= @JoinColumn(name="empId"),
	inverseJoinColumns = @JoinColumn(name="employee_ID"))
	private List<EmployeeInfo> employee_ID;
	
	public List<EmployeeInfo> getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(List<EmployeeInfo> employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getDate() {
		return date;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}

}
