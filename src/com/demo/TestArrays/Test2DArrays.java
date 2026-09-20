package com.demo.TestArrays;

import java.util.Arrays;

import com.demo.Arrays.My2DArrays;

public class Test2DArrays {

	public static void main(String[] args) {
		My2DArrays ob = new My2DArrays();
//		My2DArrays ob1 = new My2DArrays();

//		ob.acceptData();
//		ob.displayData();
//		ob.acceptData();
//		ob1.acceptData();
//		ob.displayData();
//		System.out.println("--------------------");
//
//		ob1.displayData();
//		System.out.println("--------------------");

//		int[][] ans = ob.sub2Arrays(ob1);
//		for(int i = 0; i<ans.length;i++) {
//			for(int j=0; j<ans[0].length;j++) {
//				System.out.print(ans[i][j]+" \t");
//			}
//			System.out.println();
//		}
		 My2DArrays ob1 = new My2DArrays();
	        My2DArrays ob2 = new My2DArrays();

	        // Accept first matrix
	        System.out.println("Enter first matrix:");
	        ob1.acceptData();

	        // Accept second matrix
	        System.out.println("Enter second matrix:");
	        ob2.acceptData();

	        // Display first matrix
	        System.out.println("First Matrix:");
	        ob1.displayData();

	        // Display second matrix
	        System.out.println("Second Matrix:");
	        ob2.displayData();

	        // Multiply
	        int[][] result = ob1.multiply(ob2);

	        // Check whether multiplication is possible
	        if(result == null) {

	            System.out.println("Matrix multiplication not possible.");

	        } else {

	            System.out.println("Multiplication Result:");

	            for(int i = 0; i < result.length; i++) {

	                for(int j = 0; j < result[i].length; j++) {

	                    System.out.print(result[i][j] + "\t");
	                }

	                System.out.println();
	            }
	        }
		

//		System.out.println(ans);
//		System.out.print(Arrays.deepToString(ans));
		

	}

}
