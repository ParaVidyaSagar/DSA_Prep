package com.interviewpractice;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] arr = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println(longestCommonPrefix(arr));
	}
	
	static String longestCommonPrefix(String[] arr) {
		Arrays.sort(arr);
		
		String first = arr[0];
		String last = arr[arr.length-1];
		int minLength = Math.min(first.length(),last.length());
		
		int i =0;
		while(i < minLength && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
	}
}
