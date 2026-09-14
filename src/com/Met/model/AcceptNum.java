package com.Met.model;

public class AcceptNum {

	public static void main(String[] args) {
		for(int i = 0 ;i <3; i++) {
			int num = Integer.parseInt(args[i]);
			boolean prime = true;
			for(int j = 2; j<num;j++) {
				if(num %j ==0) {
					prime = false;
					
					break;
					
				}
				if(prime) {
					System.out.println(num+"x"+ j+ "="+num*j);
				}else {
					System.out.println(num/10.0);
				}
			}
			
		}

	}

}
			
			
//			int sum = num*i;
//			if(i%2==0) {
//				System.out.println(num +"x"+ i+"="+sum);
//				num++;
//			}
//				else if(i%2 !=0) {
//				int n = i/10;
//				System.out.println(n);
//			}
		
