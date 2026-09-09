//Find Largest and Smallest Element in an Array Write a program
//to accept N integers into an array and find the
//largest and smallest elements without using built-in sorting methods.

package com.Day3.model;
import java.util.*;

public class LargestSmallest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("Enter "+num+ "numbers :");
		
		for(int i=0; i< arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("largest :"+largest);
		System.out.println("largest :"+smallest);


		
	}
}
