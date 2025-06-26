package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingSecondCharacter {
  public static void main(String[] args) {
	String input = "swiss";
	Character result = findSecondNonRepeatingCharacter(input);
	if (result != null) {
        System.out.println("Second non-repeating character is: " + result);
    } else {
        System.out.println("There is no second non-repeating character.");
    }
}
  
  public static Character findSecondNonRepeatingCharacter(String s) {
	  Map<Character, Integer> countMap = new LinkedHashMap<>();
	// Count character frequencies
	  for(char c : s.toCharArray()) {
		  countMap.put(c, countMap.getOrDefault(c, 0)+1);
	  }
	  // find the second non-repeating character
	  int nonRepeatingCharCount = 0;
	  for(char c:countMap.keySet()) {
		  if(countMap.get(c)==1) {
			  nonRepeatingCharCount++;
			if(nonRepeatingCharCount ==2 ) {
				return c;
			}
		  }
	  }
	  return null;
  }
}
