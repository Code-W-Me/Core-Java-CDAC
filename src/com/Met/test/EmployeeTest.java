package com.Met.test;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Met.model.Employee;
import com.Met.service.EmployeeService;
import com.Met.service.EmployeeSreviceImp;


public class EmployeeTest {
	static  Scanner sc =  new Scanner(System.in);
	static  EmployeeService service = new EmployeeSreviceImp();

	public static void main(String[] args) {
		 
		
		 int choice =0;
		 do {
			 
			 System.out.println("1. Add Employee");
			 System.out.println("2. Display All Employee");
			 System.out.println("3. Search Employee by ID");
			 System.out.println("4. Search Employee by Name");
			 System.out.println("5. Modify Employee");
			 System.out.println("6. Delete Employee");
			 System.out.println("7. Display Employees by Department");
			 System.out.println("8. Save Employees to File");
			 System.out.println("9. Read Employees from File");
			 System.out.println("10. Exit");
			 
			 try {
				System.out.println("Enter your Choice: ");
				 choice = Integer.parseInt(sc.next());
				 switch(choice) {
				 case 1 -> {
					 addEmployee();
				 }
				 case 2 ->{displayEmployees();}
				 case 3 ->{searchEmpById();}
				 case 4 ->{searchEmpByName();}
				 case 5 ->{UpdateEmployee();}
				 case 6 ->{DeleteEmployee();}
				 case 7 -> {DisplayEmpByDep();}
				 case 8 ->{SaveEmpToFile();}
				 case 9 ->{ReadEmpFromFile();}
				 case 10 ->{System.out.println("Exiting Program..");}
				 default -> {System.out.println("Invalid Choice");}
				 
				 }
			} catch (NumberFormatException e) {
				System.out.println("Enter Valid choice:");
			}
		 
	}while(choice != 10);

}


	private static void addEmployee() {
		
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter MobNo: ");
		String mobno = sc.next();
		System.out.print("Enter Email: ");
		String email = sc.next();
		System.out.print("Enter Department: ");
		String department = sc.next();
		System.out.print("Enter Designation: ");
		String designation = sc.next();
		double salary = 0;
		while(true) {
			try {
				System.out.println("Enter salary");
				salary = Double.parseDouble(sc.next());
				break;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Enter valid Salary value");
			}
		}
		Employee emp = new Employee( 0, name , mobno, email, department, designation,
				 salary);
		service.addEmployee(emp);
		System.out.println("Emp Id"+ emp.getId());
	};
	

	private static void displayEmployees() {
		
		ArrayList<Employee> empList = service.displayEmployees();
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
	}
	private static void searchEmpById() {
		int id = 0;
		
		
			try {
				System.out.println("enter employee ID: ");
				id = Integer.parseInt( sc.next());
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Employee emp = service.searchById(id);
		System.out.println(emp);
		
	}
	private static void searchEmpByName() {
//		ArrayList<Employee> result= new ArrayList<>();

		System.out.print("Enter Employee name: ");
		String name = sc.next();
		ArrayList<Employee>empList = service.searchByName(name);
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
	}
	
	
	private static void UpdateEmployee() {
		int id = 0;
		try {
			System.out.println("Enter Employee Id to update");
			id = Integer.parseInt(sc.next());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter New Name: ");
		String name = sc.next();
		System.out.println("Enter MobNo: ");
		String mobno = sc.next();
		System.out.println("Enter Email: ");
		String email = sc.next();
		System.out.println("Enter Department: ");
		String department = sc.next();
		System.out.println("Enter Designation: ");
		String designation = sc.next();
		
		double salary;
		while(true) {
			try {
				System.out.println("Enter salary");
				salary = Double.parseDouble(sc.next());
				break;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Enter valid Salary value");
			}
		}
		Employee emp = new Employee( 0, name , mobno, email, department, designation,
				 salary);
		boolean res = service.updateEmployee(id, name, emp);
		
		
	}
	
	private static int DeleteEmployee() {
		int id=0;
		try {
			System.out.println("Enter Employee Id to Delete: ");
			id = Integer.parseInt(sc.next());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean res = service.deleteEmployee(id);
		return id;
		
		
	}
	
	private static void DisplayEmpByDep() {
		System.out.println("Enter the Deparment to display: ");
		String department = sc.next();
		
		ArrayList<Employee> empList = service.searchByDep(department);
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}

	
	private static void SaveEmpToFile() {
		try {
			service.saveToFile();
			System.out.println("Employee saved");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void ReadEmpFromFile() {
		
		try {
			service.readFromFile();
System.out.println("Employee done reading");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
}
