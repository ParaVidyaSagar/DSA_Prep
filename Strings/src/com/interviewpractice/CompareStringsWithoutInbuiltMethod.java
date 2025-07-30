package com.interviewpractice;

public class CompareStringsWithoutInbuiltMethod {
  public static void main(String[] args) {
	  String str1 = "abc";
      String str2 = "abc";
      boolean isEqual = compareStrings(str1, str2);
      System.out.println("Are strings equal? " + isEqual);
}
  
  static boolean compareStrings(String s1, String s2) {
	// If lengths are not equal, strings can't be equal
      if (s1.length() != s2.length()) {
          return false;
      }
      
   // Compare each character
      for(int i = 0; i<s1.length(); i++) {
    	  if(s1.charAt(i) != s2.charAt(i)){
    		  return false;
    	  }
      }
      return true;
  }
}
