package com.Met.bascisTest;

import com.Met.basics.Emplyoee;
import com.Met.basics.contractEmp;
import com.Met.basics.salariedEmp;

public class EmployeeTest {

	public static void main(String[] args) {
		Emplyoee e = new Emplyoee();
		e.calcSal();
		salariedEmp se = new salariedEmp();
		se.calcSal();
		contractEmp ce = new contractEmp();
		ce.calcSal();

	}

}
