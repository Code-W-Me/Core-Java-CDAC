package com.demo.Searching;

public class Searching {
	public static int seqSearch(int[]arr,int num) {
		for(int i=0;i<arr.length;i++) {
			return i;
		}
	
	return -1;
	}
	public static int binarySearch(int[]arr,int num) {
		int low=0;
		int high = arr.length-1;
		int count=0;
		while(low<=high) {
			int mid = (low+high)/2;
			System.out.println(low+mid+high);
			count++;
			if(arr[mid]==count) {
				System.out.println("number of camp"+count);
				return mid;
			}if(arr[mid]<num) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
}
