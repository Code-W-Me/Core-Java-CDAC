package com.Day5.model;

import java.util.Scanner;

public class numCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("Positive Number");
		}else if(num<0) {
			System.out.println("Negative Nubmer");
		}else {
			System.out.println("Absolute Zero");
		}

	}

}
