package com.interviewpractice;

public class ConvertStringtoInt {
   public static void main(String[] args) {
	   System.out.println(parseInt("123"));    // Output: 123
       System.out.println(parseInt("-456"));   // Output: -456
       System.out.println(parseInt("12a3"));   // Output: Invalid input
}
   static int parseInt(String s) {
	   if(s == null || s.isEmpty()) {
		   throw new IllegalArgumentException("Invalid input: empty string");   
	   }
	   int num = 0;
	   int i = 0;
	   boolean isNegitive = false;
	// Handle negative sign
	   if (s.charAt(0) == '-') {
		   isNegitive = true;
           i++;
       }
	   for(;i<s.length();i++) {
		   char ch = s.charAt(i);
		   if(ch < '0' || ch > '9') {
			   throw new IllegalArgumentException("Invalid character: " + ch); 
		   }
		   
		   num = num * 10 +(ch - '0');
	   }
	   return isNegitive ? -num : num;
   }
}
