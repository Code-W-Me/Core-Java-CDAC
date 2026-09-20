package com.demo.Arrays;

import java.util.Scanner;

public class My2DArrays {
	private int[][] arr;
	public int rows;
	public int cols;
	
	public My2DArrays() {
		arr = new int[3][3];
		
	}
	public My2DArrays(int rows, int cols) {
		arr = new int[rows][cols];
	}
	// accept data from keyboard and store it in array
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[0].length;j++){
				System.out.print("Enter Number of Rows: "+i+"\n Enter Number of Cols "+j+": ");
				arr[i][j] = sc.nextInt();
			}
		}
	}
	// display Data
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t"); 
						 
			}
			System.out.println();
		}
	}
	// Addition
	public int[][] add2Arrays(My2DArrays obj){
		if((arr.length == obj.arr.length)
			&&(arr[0].length== obj.arr[0].length)) {
			int[][] result = new int[arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					result[i][j] = arr[i][j]+obj.arr[i][j];
				}
			}
			return result;
		}
		return null;
	}
	// Subtract 
	public int[][] sub2Arrays(My2DArrays obj){
		if((arr.length == obj.arr.length)
			&&(arr[0].length== obj.arr[0].length)) {
			int[][] result = new int[arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					result[i][j] = arr[i][j]-obj.arr[i][j];
				}
			}
			return result;
		}
		return null;
	}
	//multiply
	public int[][] multiply(My2DArrays obj){
		//check the col of arr1 matches with row of arr2
		if(arr[0].length != obj.arr.length) {
			return null;
		}
		
		int[][] result = new int[arr.length][obj.arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<obj.arr[0].length;j++) {
				for(int k = 0;k<arr[0].length;k++) {
					result[i][j] += arr[i][k]* obj.arr[k][j];
				}
			}
		}
		return result;
		
	}
	
	
	
	
	
	
}
