package com.interviewpractice;

public class CheckTwoStringRotationsOfEachOther {
  public static void main(String[] args) {
	String s1 = "ABCD";
	String s2 = "CMAB";
	System.out.println(areRotations(s1, s2));
}
  
  static boolean areRotations(String s1, String s2) {
	  if(s1.length() != s2.length()) return false;
	  
	  String combined = s1 + s1;
	  System.out.println(combined);
	  return combined.contains(s2);
  }
}
