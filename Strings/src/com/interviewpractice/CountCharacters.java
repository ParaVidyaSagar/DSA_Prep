package com.interviewpractice;

import java.util.HashMap;

public class CountCharacters {
	public static void main(String[] args) {
		String s = "banana";
		countCharacters(s);
	}
	static void countCharacters(String s) {
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for(char c:s.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
			
		}
		System.out.println(freqMap);
	}

}
