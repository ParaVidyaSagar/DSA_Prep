package com.interviewpractice;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {
	  String input = "abcabcbb";
      String result = longestUniqueSubstr(input);
      System.out.println("Longest substring: " + result);           // Output: abc
      System.out.println("Length: " + result.length());    
}
  
  static String longestUniqueSubstr(String s) {
	  int n = s.length();
	  int left =0;
	  int right = 0;
	  int maxLen = 0;
	  int start = 0;
	  HashSet<Character> seen = new HashSet<>();
	  while(right<n) {
		  if(!seen.contains(s.charAt(right))) {
			  seen.add(s.charAt(right));
			  if(right-left+1 >maxLen) {
				  maxLen = right - left+1;
				  start = left;
			  }
			  right++;
		  } else {
			  seen.remove(s.charAt(left));
			  left++;
		  }
	  }
	  return s.substring(start,start+maxLen);
  }
}
