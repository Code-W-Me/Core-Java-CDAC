//Calculate Sum and Average of Array Elements Write a program to
//accept N numbers into an array and calculate their total sum
//and average
package com.Day3.model;
import java.util.*;

public class SumAvg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		System.out.println("Enter"+num+"Number");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		double avg = (double) sum/num;
		
		System.out.println("sum ="+ sum);
		System.out.println("Average ="+ avg);

		
			
		
	}

}
