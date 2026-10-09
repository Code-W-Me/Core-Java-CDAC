package com.demo.SelfAssessment;

import java.util.Scanner;

public class CardsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			int ans = 0;
			int suneetWins = 0;
			int slavicWins = 0;
			if(a1>b1) {
				suneetWins++;
			}else if(a1<b1) {
				slavicWins++;
			}
			if(a2>b2) {
				suneetWins++;
			}else if(a2<b2) {
				slavicWins++;
			}
			if(suneetWins > slavicWins) {
				ans++;
			}
			suneetWins = 0;
			slavicWins = 0;
			if(a1>b2) {
				suneetWins++;
			}else if(a1<b2) {
				slavicWins++;
			}
			if(a2>b1) {
				suneetWins++;
			}else if(a2<b1) {
				slavicWins++;
			}
			if(suneetWins > slavicWins) {
				ans++;
			}
			System.out.println(ans);
			t--;
		}
	}

}
