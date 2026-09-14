package com.Met.bascis;

import java.util.Scanner;

public class ArrayAccept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Array:  ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			System.out.println("Enter Number: ");
			arr[i] = sc.nextInt();	
		}
		
		// prime Check
		for(int j=0;j<n;j++) {
			int num = arr[j];
			boolean prime = true;
			if(num < 2) {
				prime = false;
			}
			for(int k=2;k<num;k++) {
				if(num%k==0) {
					prime = false;
					break;
				}
				
			}
			if(prime) {
				System.out.println(num+", isPrime");
				
			}else {
				System.out.println(num+", is not Prime");
			}
			
			
		}
		int largest=arr[0];
		int Slargest = arr[0];
		for(int l=1;l<n;l++) {
			if(arr[l] > largest) {
				Slargest = largest;
				largest=arr[l];
			}else if(arr[l] > Slargest && arr[l]!= largest) {
				Slargest = arr[l];
			}
		}
		System.out.println("Largest = "+largest);
		System.out.println("Second Largest  = "+Slargest);

	}

}
