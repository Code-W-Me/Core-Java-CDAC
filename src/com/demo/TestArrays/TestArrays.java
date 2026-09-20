package com.demo.TestArrays;

import java.util.Arrays;

import com.demo.Arrays.MyArrays;

public class TestArrays {

	public static void main(String[] args) {
		
		MyArrays ob=new MyArrays();
		ob.add(4);
		System.out.println(ob);
		ob.add(10);
		System.out.println(ob);
		

		MyArrays ob1=new MyArrays(12);
		int[] arr= {12,3,1,2,4,5,23,45,67};
//		System.out.println(ob1);
		

		MyArrays ob2=new MyArrays(arr,arr.length);
//		System.out.println(ob2);
		ob.add(2,1);
		System.out.println(ob2);
		
		ob2.searchByVal(4);
		System.out.println(ob2);
		ob2.deleteByPos(2);
		System.out.println(ob2);
		ob2.reverseArray();
		System.out.println(ob2);
		
		System.out.println("Max Value is");

		System.out.println("Max is "+ob2.findMax());
		
//		System.out.println("Max Value is");
		
//		ob2.reverseArray(arr1);
////		System.out.println(ob2);

		int[] arr1 = {1,2,3,4};
		MyArrays ob3 = new MyArrays(arr1, arr1.length);
		
		System.out.println(Arrays.toString(ob3.exchangeIndexValue()));
//		
//		boolean result = ob2.isPrime(12);
		int num = 13;
		
			if(ob2.isPrime(num)) {
				System.out.println(num+": the number is prime");
				
			}else {
				System.out.println(num+": the number is not prime");
			}
			ob2.rotateArray(true, 1);
			System.out.println(ob2);
			
			
			
		
		
		
//		MyArrays arr = new MyArrays();
		
//		arr.display();
//		System.out.println(arr);

	}

}
