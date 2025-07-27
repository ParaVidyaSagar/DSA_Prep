package com.string;

public class indexOfFirstOccurenceOfString {
	public static void main(String[] args) {
		System.out.println(StrStr("leetcode","leeto"));
	}
	static int StrStr(String haystack, String needle) {
		for(int i =0; i<haystack.length()-needle.length()+1;i++) {
			
				if(haystack.charAt(i)==needle.charAt(0)) {
					if(haystack.substring(i, needle.length()+i).equals(needle)) {
						return i;
					}
				}
			
		}
		return -1;
	}

}
