package com.Day5.model;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String = "+ rev);

	}

}
