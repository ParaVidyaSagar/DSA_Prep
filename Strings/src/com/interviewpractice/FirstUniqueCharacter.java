package com.interviewpractice;

import java.util.LinkedHashMap;

public class FirstUniqueCharacter {
public static void main(String[] args) {
	String input = "sssi";
	System.out.println(firstNonRepeatingChar(input));
}
 static Character firstNonRepeatingChar(String s) {
	 LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
	// 1st pass: count frequencies
	 for(char c : s.toCharArray()) {
		 freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		 
	 }
	// 2nd pass: return first character with freq 1
	 for(char c: freqMap.keySet()) {
		 if(freqMap.get(c) == 1) return c;
	 }
	 return null;
 }

}
