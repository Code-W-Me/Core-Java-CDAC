package com.Met.model;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private String mobno;
	private String email;
	private String department;
	private String designation;
	private double salary;
	private static int counter =1;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String mobno, String email, String department, String designation,
			double salary) {
		super();
		this.id = counter++;
		this.name = name;
		this.mobno = mobno;
		this.email = email;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[ id=" + id + ", name=" + name + ", mobno=" + mobno + ", email=" + email + ", department="
				+ department + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	
}
