package com.Met.service;

import java.util.ArrayList;

import com.Met.model.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);
	ArrayList<Employee> displayEmployees();
	Employee searchById(int id);
	ArrayList<Employee> searchByName(String name);
	boolean updateEmployee(int id, String name , Employee emp);
	boolean deleteEmployee(int id);
	ArrayList<Employee> searchByDep(String departmnet);
	void saveToFile() throws Exception;
	void readFromFile() throws Exception;
//	com.Met.test.ArrayList<Employee> getAllEmployees();
}
