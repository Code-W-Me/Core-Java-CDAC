package com.Met.bascis;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String str = sc.nextLine();
		String[] words=str.split(" ") ;
		for(int i = 0; i<words.length;i++) {
			String rev="";
			for(int j=words[i].length()-1; j>=0;j--) {
				rev = rev +words[i].charAt(j);
			}
			System.out.print(rev+ " ");
		}
	}

}
