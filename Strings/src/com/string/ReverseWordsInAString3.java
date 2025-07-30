package com.string;

public class ReverseWordsInAString3 {
 public static void main(String[] args) {
	System.out.println(reverseWords("fly to blue  moon"));
}
 static String reverseWords(String s) {
	 String[] words = s.split(" +"); //removes any number of spaces
	 StringBuilder sb = new StringBuilder();
	 for(int i=words.length-1; i>=0;i--) {
		 sb.append(words[i]);
		 sb.append(" ");
	 }
	 return sb.toString();
  }
}
