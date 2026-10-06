package com.demo.SelfAssessment;

import java.util.Scanner;

//import com.sun.media.sound.EmergencySoundbank;

public class VasyaHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String target = "hello";
		int j=0;

		for(int i=0;i<s.length();i++) {
				if(j<target.length() && target.charAt(j)== s.charAt(i)) {
					j++;
				}
			
		}
		if(j== target.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
