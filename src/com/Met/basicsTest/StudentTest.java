package com.Met.basicsTest;
import java.util.Scanner;

import com.Met.basics.Student;
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		
		
		s.accept();
		s.display();
		System.out.println(s.calcGPA());

	}

}
