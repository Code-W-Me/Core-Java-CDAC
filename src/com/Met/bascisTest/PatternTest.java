package com.Met.bascisTest;

public class PatternTest {

	public static void main(String[] args) {
		int num = 1;
		char ch = 'A';
		
		for(int i =1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
					System.out.print(num+" ");
					num++;
				}else {
					System.out.print(ch+" ");
					ch++;
				}
					
			}
			System.out.println();
		}

	}

}
