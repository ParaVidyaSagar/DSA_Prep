package com.string;

public class PalindromeString4 {
public static void main(String[] args) {
	String str = "level";
	System.out.println(palindromeCheck(str));
}
 static boolean palindromeCheck(String s) {
  int left = 0;
  int right = s.length()-1;
  while(left<right) {
	  if(s.charAt(left) != s.charAt(right)) {
		  return false;
	  }
	  left++;
	  right--;
  }
  return true;
 }
}
