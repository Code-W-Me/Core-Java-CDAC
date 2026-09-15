package com.Met.bascis;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		int vovels= 0;
		int consonents=0;
		int numbers = 0;
		int special = 0;
		
		for(int i=0;i< str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
					ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') {
				vovels++;
			}else if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z') {
				consonents++;
			}else if(ch>='0' && ch<='9') {
				numbers++;
			}else {
				special++;
			}
		}
		System.out.println("Vovels = "+ vovels);
		System.out.println("consonents = "+ consonents);
		System.out.println("numbers = "+ numbers);
		System.out.println("special = "+ special);

		
	}

}
