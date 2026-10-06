package com.demo.SelfAssessment;

import java.util.Scanner;

public class ZeroShift {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter arr size: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int j=0;
		System.out.println("enter the nUmbers: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= 0) {
				arr[j] = arr[i];
				j++;
			}
		}while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
