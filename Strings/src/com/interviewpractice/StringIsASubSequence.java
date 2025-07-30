package com.interviewpractice;

public class StringIsASubSequence {
  public static void main(String[] args) {
	  String s1 = "abc";
      String s2 = "aebdc";
      System.out.println(isSubsequence(s1, s2)); 
}
  static boolean isSubsequence(String s1, String s2) {
	  int i =0;
	  int j =0;
	  while(i < s1.length() && j < s2.length()) {
		  if(s1.charAt(i)==s2.charAt(j)) {
			  i++;// move in s1 only when match found
		  }
		  j++;// always move in s2
	  }
	  return i == s1.length();  // all characters of s1 matched in order
  }
}
