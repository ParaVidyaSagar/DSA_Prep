package com.interviewpractice;

import java.util.LinkedHashMap;

public class SecondNonRepeatingCharacter {
 public static void main(String[] args) {
	 String input = "swiss";
     System.out.println(secondNonRepeatingChar(input)); // Output: 'i'
}
 static Character secondNonRepeatingChar(String str) {
	 LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
	 //Step 1: Count frequencies of each character
	 for(char c : str.toCharArray()) {
		 freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		 
	 }
	 // Step 2: Traverse in insertion order to find the second non-repeating
	 int count =0;
	 for(char c: freqMap.keySet()){
		 if(freqMap.get(c)==1) {
			 count++;
			 if(count==2) return c;
		 }
	 }
  return null;
 }
}
