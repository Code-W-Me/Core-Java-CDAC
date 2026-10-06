package com.demo.SelfAssessment;

import java.util.Scanner;

public class PlaindromeString {
	public static boolean isPalindrome(String  s) {
		
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
		
		
		
		
//		int org = num;
//		int rev = 0;
//		while(num>0) {
//			int digit = num %10;
//			rev  = rev*10+ digit;
//			num = num/10;
//		}
//		return org==rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = sc.nextLine();
		if(isPalindrome(s)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
