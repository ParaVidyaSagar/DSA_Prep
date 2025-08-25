package com.practice;

public class ReplacePi {
	public static void main(String[] args) {
		String input = "xpipixpi";
		String output = replacePi(input);
		System.out.println("Original: "+ input);
		System.out.println("Modified: "+ output);
	}
	
	static String replacePi(String str) {
		 // Base case: if string is empty or has only 1 character
		if(str.length() <=1) {
			return str;
		}
		// If first two chars are "pi"
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
            // Replace with "3.14" and recurse on the rest (after 2 chars)
           return "3.14" + replacePi(str.substring(2));
           
		}else {
			// Keep first char and recurse on rest
			return str.charAt(0)+replacePi(str.substring(1));
		}
	}
	
	

}
