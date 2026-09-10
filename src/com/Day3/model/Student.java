package com.Day3.model;

public class Student {
	private int studentId;
	private String name;
	private String emailId;
	private Course course;
	public Student(int studentId, String name, String emailId, Course course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.emailId = emailId;
		this.course = course;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void display() {
		System.out.println("Student ID:"+ studentId);
		System.out.println("Name:"+ name);
		System.out.println("EmailID:"+ emailId);
		System.out.println("Course ID:"+ course.getCourseId());
		System.out.println("Course Name:"+ course.getCourseName());
		
	}

	

}
