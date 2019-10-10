package com.dev.collection;

public class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + " ]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
	

	}
	@Override
	public int compareTo(Employee o) {
	return (this.id - o.id);			//sorts treeset in sorted format by referring id
	}

}
