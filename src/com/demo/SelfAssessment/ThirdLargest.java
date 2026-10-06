package com.demo.SelfAssessment;

import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int  num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter the Array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int sLargest = arr[0];
		int thirdLargest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> largest) {
				thirdLargest = sLargest;
				sLargest = largest;
				largest = arr[i];
			}else if(arr[i]> sLargest) {
				thirdLargest = sLargest;
				sLargest = arr[i];
			}else if(arr[i]> thirdLargest ) {
				thirdLargest= arr[i];
			}
		}
		System.out.println("the third largest Number: "+thirdLargest );
	}

}
