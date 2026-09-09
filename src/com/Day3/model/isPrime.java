package com.Day3.model;
import java.util.*;
public class isPrime {
	
	
//	public boolean isPrime(boolean num ) {
//		if(num 1) {
//			return false;
//		}
//	}

	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
		 
//		 Print Prime Numbers in a Range Write a program to accept two numbers and
//		 print all prime numbers between them.
		 int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 for(int i=0; i<num.length;i++) {
			 int count = 0;
			 for(int j = 1;j <=num[i];j++) {
				 if(num[i] % j ==0) {
					 count ++;
				 }
			 }
			 if(count == 2) {
				 System.out.println("is Prime :" + num[i]);
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

//	        System.out.println("Enter number:");
//	        int num = sc.nextInt();
//
//	        int count = 0;
//
//	        for (int i = 1; i <= num; i++) {
//
//	            if (num % i == 0) {
//	                count++;
//	            }
//	        }
//
//	        if (count == 2) {
//	            System.out.println("Prime Number");
//	        } else {
//	            System.out.println("Not Prime Number");
//	        }
	   
		
		
//		if( num < 1) {
//			System.out.println("enter number greater than 1");
//			
//		}
		
		 
	}		

	}



