package com.practice;

public class PairStar {
	public static void main(String[] args) {
		String input = "aabbcc";
		String output = pairStar(input);
		System.out.println("Original: " + input);
		System.out.println("Modified: " + output);
	}
	
	static String pairStar(String str) {
		 // Base case: if string has 0 or 1 char, nothing to insert
		if(str.length() <= 1) {
			return str;
		}
		// Check first two chars
		if(str.charAt(0)==str.charAt(1)) {
			return str.charAt(0)+ "*"+pairStar(str.substring(1));
		} else {
			// No match → keep first char and recurse on rest
			return str.charAt(0)+pairStar(str.substring(1));
		}
	}
}
