package com.interviewpractice;

import java.util.HashSet;

public class RemoveDuplicates {
  public static void main(String[] args) {
	String input = "programming";
	System.out.println(removeDuplicates(input));
}
  
  public static String removeDuplicates(String s) {
	  StringBuilder result = new StringBuilder();
	  HashSet<Character> seen = new HashSet<>();
	  for(char c : s.toCharArray()) {
		  if(!seen.contains(c)) {
			  seen.add(c);
			  result.append(c);
		  }
	  }
		return result.toString();	  
  }
}
