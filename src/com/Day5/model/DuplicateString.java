package com.Day5.model;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			boolean isChecked = false;
			for(int k=0;k<i;k++) {
				if(str.charAt(i)== str.charAt(k)) {
					isChecked = true;
					break;
				}
			}
			if(isChecked) {
				continue;
			}
			int count =0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
			}
			if(count >1) {
				System.out.println("Duplicate Character = " + str.charAt(i));
			}
		}
	}

}
