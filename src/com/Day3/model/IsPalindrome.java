//Write a program to check whether a given number is a palindrome. Example: 121 → Palindrome, 123 → Not Palindrome
package com.Day3.model;
import java.util.*;

public class IsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		int org = num;
		int rev = 0;
		
		while(num!=0) {
			int digit = num %10;
			rev = rev *10 + digit;
			num = num /10;
			
		}
		if (org == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
		
	}

}
