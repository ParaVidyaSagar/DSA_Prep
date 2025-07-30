package com.interviewpractice;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String s1 ="listen";
		String s2 ="silent";
		System.out.println(areAnagrams(s1,s2));
	}
	
	static boolean areAnagrams(String s , String t) {
		if(s.length() != t.length()) return false;
		
		char[] a1 = s.toCharArray();
		char[] a2 = t.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1,a2);
	}

}
