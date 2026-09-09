//Write a program to reverse the digits of a given number using a loop. Example: 12345 → 54321
package com.Day3.model;
import java.util.*;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int rev = 0;
		while(num !=0) {
			int digit = num % 10;
			rev = 	rev *10 +digit;
			num = num /10;
			
		}
		System.out.println("Reverse :"+ rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num = 12345;
//		for(int i =0; i<num;i++ ) {
//			for(int j=num;j<i;j--) {
//				num ++;
//			}
//			System.out.print(num);
//		}
//System.out.println();
	}

}
