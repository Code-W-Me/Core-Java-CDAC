package com.Day5.model;

import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int special = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))) {
				special++;
			}
		}
		System.out.println("Special Character Is :"+ special);
	}

}
