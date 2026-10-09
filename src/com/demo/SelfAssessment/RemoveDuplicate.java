package com.demo.SelfAssessment;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static int removeDuplicates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int num = sc.nextInt();
		int[] n = new int[num];
		int j=0;
		System.out.println("Enter Array elements");
		for(int i=0;i<n.length;i++) {
			n[i] = sc.nextInt();
		}
		for(int i=1; i<n.length;i++) {
			if(n[j]!= n[i]) {
				j++;
				n[j] = n[i];
			}
		}
		return j+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		removeDuplicates dup = new removeDuplicates();
//		System.out.println(removeDuplicates());
		  int length = removeDuplicates();

        System.out.println("Length of array is  = " + length);
		
//        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
//        int length = removeDuplicates(arr);
//
//        for(int i=0;i<length;i++) {
//        	System.out.println(arr[i]+ " ");
//        }

	}

}
