package com.demo.Arrays;

import java.util.Arrays;

public class MyArrays {
private int[] arr;
private int count;

public MyArrays() {
	arr = new int[10];
}
public MyArrays(int size) {
	arr = new int[size];
	count =0;
}
public MyArrays(int[] arr1, int cnt) {
	arr = arr1;
	count = cnt;
}
// add last number
public boolean add(int n) {
	if(count<arr.length) {
		arr[count]= n;
		count++;
		return true;
	}
	return false;
	//add n at given position
		
}

public boolean add(int n, int pos) {
	if(count<arr.length && pos<=count) {
		// right shift
		for(int i=count;i>pos;i--) {
			arr[i] = arr[i-1];
		} 
		arr[pos] = n;
		count++;
		return true;
	}
	return false;
}

//Search By Value

public int searchByVal(int num) {
	for(int i=0;i<count;i++) {
		if(arr[i]==num) {
			return i;
		}
	}
	return -1;
}
//deleteby given position
public boolean deleteByPos(int pos) {
	//if position is last element in array
	if(pos==arr.length-1) {
		arr[pos]=0;
		count--;
		return true;
	}else {
		// check given num is within limit
		if(pos<count) {
			for(int i = pos;i<count-1;i++) {
				arr[i] = arr[i+1];
			}
			count--;
			return true;
		}
	}
	return false;
}
//reverse an array just like swapping
public void reverseArray(){
//	int j;
	for(int i=0,j=count-1;i<j;i++,j--){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	} 
	
	
}
public int findMax() {
	int max = arr[0];
	for(int i=0;i<count;i++) {
		//jabtak less then rahegea zero se ab tak yahi run hoga 
		if(max<arr[i]) {
			max = arr[i];
		}
	}
	// jaise hi pehle max milega return max
	return max;
}
//Exchange the Endexes Values
public int[] exchangeIndexValue() {
	int max = findMax();
	int[] arr1 = new int[max+1];
	Arrays.fill(arr1, -1);
	for(int i=0;i<count;i++) {
		int index =arr[i];
		int value = i;
		arr1[index] = value;
	}
	return arr1;
}
public boolean isPrime(int num) {
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			return false;
		}
		
	}
	
	return true;
}
//find maximum prime number
public int findMaxPrime() {
	int i; int max =0;
	for( i=0;i<count;i++) {
		if(isPrime(arr[i])) {
			max = arr[i];
		}
	}
	
	for(int j=i+1;j<count;j++ ) {
		if(isPrime(arr[j]) && max<arr[j]) {
			max = arr[j];
		}
	}
	
	return max;
}
//rotate right if flag is true;
//else rotate left if flag is false;
public void rotateArray(boolean flag, int num) {
	if(flag) {
		for(int i=0;i<num;i++) {
//			make it happen
			int temp = arr[count-1];
			for(int j=count-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
	}else { // left rotation
		for(int i=0;i<num;i++) {
			int temp=arr[0];
			for(int j=0;j<count-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[count-1] = temp;
		}
	}
}
public int findSum() {
	int sum=0;
	for(int i=0;i<count;i++) {
		sum+= arr[i];
	}
	return sum;
}



@Override
public String toString() {
	return "MyArrays [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
}



}
