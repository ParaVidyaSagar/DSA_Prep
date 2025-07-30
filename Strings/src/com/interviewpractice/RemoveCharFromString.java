package com.interviewpractice;

public class RemoveCharFromString {
  public static void main(String[] args) {
	  String input = "banana";
      char remove = 'n';
      System.out.println(removeCharacter(input, remove)); // Output: "bnn"
}
  
  public static String removeCharacter(String s, char ch) {
	  StringBuilder result = new StringBuilder();
	  for(char c: s.toCharArray()) {
		  if(c!=ch) {
			  result.append(c);
		  }
	  }
	  return result.toString();
  }
}
