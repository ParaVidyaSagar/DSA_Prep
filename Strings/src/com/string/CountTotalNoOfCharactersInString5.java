package com.string;

public class CountTotalNoOfCharactersInString5 {
  public static void main(String[] args) {
	System.out.println(totalNoOfCharcters("Sagar Para"));
	
}
  static int totalNoOfCharcters(String s) {
	  int count = 0;
	  for(int i =0; i< s.length(); i++) {
		  if(s.charAt(i) != ' ') {
			  count++;
		  }
	  }
	  return count;
  }
}
