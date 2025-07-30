package com.interviewpractice;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(reverseString(s));
	}

	static String reverseString(String s) {
		char[] chars = s.toCharArray();
		int left = 0;
		int right = chars.length-1;
		while(left < right) {
			char temp = chars[right];
			chars[right] = chars[left];
			chars[left] = temp;
			left++;
			right--;
			
		}
		return new String(chars);
	}
}
