package com.Met.bascis;

public class IsArmstrong {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int digit = temp %10;
			sum = sum + digit * digit * digit;
			temp = temp/10;
		}
		if(sum==num) {
			System.out.println("Number is Armstrong Number: ");
			
		}else {
			System.out.println("Number is not armstrong number.");
		}
		System.out.println("Armstrong number between 1 to 1000");
		
		
		for(int i = 1;i<=1000;i++) {
			temp = i;
			sum=0;
			while(temp!=0) {
				int digit = temp %10;
				sum = sum + digit * digit * digit;
				temp = temp/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
