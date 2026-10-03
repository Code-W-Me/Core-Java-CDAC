package com.demo.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
	public static <T> void bubblsort(T[] arr,Comparator<T> comp) {
		for(int i=0;i<arr.length-1;i++) {
			int swap=0;
			for(int j=1;j<arr.length-i;j++) {
				if(comp.compare(arr[j-1],arr[j])>0) {
					swap++;
					//swap
					T temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}
			}
			System.out.println("iteration : "+i+" Swap count : "+swap);
			System.out.println(Arrays.toString(arr));
			if(swap==0) {
				break;
			}
		}
		
	}
	
	
}
