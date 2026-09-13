package com.Met.dao;
import java.util.ArrayList;

import com.Met.model.Employee;

public  interface EmployeeDao {
	
	void addEmployee(Employee emp);
	ArrayList<Employee> displayEmployees();
	Employee searchById(int id);
	ArrayList<Employee> searchByName(String name);
	boolean updateEmployee(int id,  Employee emp);
	boolean deleteEmployee(int id);
	ArrayList<Employee> searchByDep(String departmnet);
	void saveToFile() throws Exception;
	void readFromFile() throws Exception;



	
}
