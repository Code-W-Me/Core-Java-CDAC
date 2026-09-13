package com.Met.service;

import java.util.ArrayList;

import com.Met.dao.EmployeeDao;
import com.Met.dao.EmployeeDaoImp;
import com.Met.model.Employee;

public class EmployeeSreviceImp implements EmployeeService{
	private EmployeeDao dao = new EmployeeDaoImp();
	@Override
	public void addEmployee(Employee emp) {
		
		dao.addEmployee(emp);
	}

	@Override
	public ArrayList<Employee> displayEmployees() {
		
		return dao.displayEmployees();
	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return dao.searchById(id);
	}

	@Override
	public ArrayList<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		return dao.searchByName(name);
	}

	@Override
	public boolean updateEmployee(int id, String name, Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(id, emp);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public ArrayList<Employee> searchByDep(String departmnet) {
		// TODO Auto-generated method stub
		return dao.searchByDep(departmnet);
	}

	@Override
	public void saveToFile() throws Exception {
		// TODO Auto-generated method stub
		 dao.saveToFile();
	}

	@Override
	public void readFromFile() throws Exception {
		// TODO Auto-generated method stub
		dao.readFromFile();
	}

}
