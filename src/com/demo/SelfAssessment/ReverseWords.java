package com.demo.SelfAssessment;

public class ReverseWords {
	public static String reverseWords(String str) {
		String[] word = str.split("\\.");
		String result = "";
		for(int i= word.length-1;i>=0;i--) {
			if(!word[i].isEmpty()) {
				if(!result.isEmpty()) {
					result = result + ".";
				}
				result = result +word[i];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "..geeks..for.geeks.";

	        System.out.println(reverseWords(s));
	}

}
