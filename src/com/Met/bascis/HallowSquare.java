package com.Met.bascis;

public class HallowSquare {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				System.out.print("Java");
			}
//			System.out.println("  ");
			for(int j=1;j<=5;j++) {
//				System.out.println(" ");
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				
			}
			
			System.out.println();

		}

	}

} 
