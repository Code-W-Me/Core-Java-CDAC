//Write a program to accept an array of integers and count how many 
//elements are even and how many are odd
package com.Day3.model;
import java.util.*;
public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter "+num+" numbers:");
		int even = 0;
		int odd = 0;
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			
			if(arr[i] % 2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println("Even Elements :"+ even);
		System.out.println("Odd Elements :"+ odd);

	}

}
