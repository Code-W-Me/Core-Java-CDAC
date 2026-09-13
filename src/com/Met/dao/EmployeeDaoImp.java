package com.Met.dao;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.Met.model.Employee;

public class EmployeeDaoImp implements EmployeeDao {
	
	ArrayList<Employee> empList = new ArrayList<Employee>();
	
//	empList.add(1,"yash", "232321","1232323","1312323",200000);

	@Override
	public void addEmployee(Employee emp) {
		empList.add(emp);
		
	}

	@Override
	public ArrayList<Employee> displayEmployees() {
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Employee searchById(int id) {
		for(Employee emp : empList) {
			if(emp.getId()== id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Employee> searchByName(String name) {
		ArrayList<Employee> nameSum = new ArrayList<>();
		for(Employee emp : empList) {
			if(emp.getName().equals(name)) {
				nameSum.add(emp);
			}
		}
		return nameSum;
	}

	@Override
	public boolean updateEmployee(int id,  Employee emp) {
		Employee oldEmp = searchById(id);
		if(oldEmp != null) {
			oldEmp.setName(emp.getName());
			oldEmp.setMobno(emp.getMobno());
			oldEmp.setEmail(emp.getEmail());
			oldEmp.setDepartment(emp.getDepartment());
			oldEmp.setDesignation(emp.getDesignation());
	        oldEmp.setSalary(emp.getSalary());
	        
	        return true;

		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		for(int i = 0; i< empList.size();i++) {
			if(empList.get(i).getId() == id) {
				empList.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public ArrayList<Employee> searchByDep(String departmnet) {
		ArrayList<Employee> addDep= new ArrayList<Employee>();
		for(Employee emp : empList) {
			if(emp.getDepartment().equals(departmnet)) {
				addDep.add(emp);
			}
		}
		return addDep;
	}

	

	@Override
	public void saveToFile() throws Exception {
		ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("employee.txt"));
		out.writeObject(empList);
		out.close();
	}

//	@SuppressWarnings("unchecked")
	@Override
	public void readFromFile() throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
		empList = (ArrayList<Employee>) in.readObject();
		in.close();
	}
	
}
