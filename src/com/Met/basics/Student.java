package com.Met.basics;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	double m1;
	double m2;
	double m3;
	public double calcGPA() {

		return (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		id = sc.nextInt();
		System.out.println("Enter Student name: ");
		name = sc.next();
		System.out.println("Enter Student Marks1: ");
		m1 = sc.nextDouble();
		System.out.println("Enter Student Marks2: ");
		 m2 = sc.nextDouble();
		System.out.println("Enter Student Marks3: ");
		 m3 = sc.nextDouble();
		
	}
	public void display() {
		System.out.println("Student Id: "+ id);
		System.out.println("Student name: "+ name);
		System.out.println("Student marks 1: "+ m1);
		System.out.println("Student marks 2: "+ m2);
		System.out.println("Student marks 3: "+m3);
		
	}
	
}
