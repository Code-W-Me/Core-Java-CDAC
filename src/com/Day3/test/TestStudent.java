package com.Day3.test;
import com.Day3.model.*;


public class TestStudent {

	public static void main(String[] args) {
		
		String str = "100";
		int num = Integer.parseInt(str);
		System.out.println("String :"+ num);
		System.out.println(str);
		//parseDouble()
		double num1 =  Double.parseDouble(str);
		System.out.println(num1);
		//valueOf
		Integer obj = Integer.valueOf(num);
		System.out.println(obj);
		
		//toString
		String str1 = Integer.toString(num);
		System.out.println(str1);
		
		//compareTo
		Integer a = 10;
		Integer b = 20;
		int res = a.compareTo(b);
		System.out.println(res);
		
		//subString
		String str2 = "Hello Raja";
		System.out.println(str2.substring(1,4));
		// StringBuffer
	//		append()
	//		insert()
	//		delete()
	//		replace()
	//		reverse()
		
		
		
		
		
		
		
		
		
		// boxing
//		int num =10;
//		Integer obj = num;
//		System.out.println("primitive value:"+num);
//		System.out.println("Object value:"+ obj);
//		//Unboxing
//		Integer obj1 = 20;
//		int num1 = obj1;
//		System.out.println("Objective"+ obj1);
//		System.out.println("Primitive"+ num1);
		
//		Course c = new Course(10, "Java");
//		Student s = new Student(1,"yash","yash@gmail.com",c);
//		s.display();
		
	}

}
