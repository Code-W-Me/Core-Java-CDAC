package com.Met.bascis;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int perfect = 0;
		for(int i=1;i<num;i++) {
			if(num %i==0) {
				perfect = perfect +i;
			}

		}
//		System.out.println(perfect);
		if(perfect ==num) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a perfect Number");
		}
		sc.close();
		
	}

}
