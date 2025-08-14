package com.fixed;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstringOfSizeK {
	public static void main(String[] args) {
		String s = "abcabcbb";
		int k =3;
		String result = longestUniqueSubstringOfSizeK(s, k);
		System.out.println(result);
	}
	
	static String longestUniqueSubstringOfSizeK(String s , int k) {
		if(s.length() < k) {
			return " ";
		}
		
		Set<Character> set = new HashSet<>();
		int start =0;
		String answer = "";
		for(int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			// If duplicate found, shrink window from start until removed
			while(set.contains(ch)) {
				set.remove(s.charAt(start));
				start++;
			}
			set.add(ch);
			 // Check only when window size == k
			if(end - start+1 == k) {
				// If all characters are unique in this k-length window
				if(set.size() == k) {
					answer = s.substring(start, end+1);
					return answer; // First found, since length is fixed
					
				}
				 // Slide window forward
				set.remove(s.charAt(start));
				start++;
				
			}
		}
		return answer;
		
	}

}
