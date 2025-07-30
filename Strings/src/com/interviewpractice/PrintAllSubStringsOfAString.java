package com.interviewpractice;

public class PrintAllSubStringsOfAString {
  public static void main(String[] args) {
	String input = "abc";
	printAllSubstrings(input);
}
  static void printAllSubstrings(String str) {
	  int n = str.length();
	  for(int i =0; i < n; i++) {
		  for(int j = i+1; j<=n;j++) {
			  System.out.println(str.substring(i,j));
		  }
	  }
  }
}
