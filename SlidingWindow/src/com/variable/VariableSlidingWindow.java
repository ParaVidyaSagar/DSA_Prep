package com.variable;

import java.util.HashMap;
import java.util.Map;

public class VariableSlidingWindow {
	
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		int requiredDistinctChars = 3;
		int result = variableWindow(s, requiredDistinctChars);
		System.out.println("Minimum window length: " + result);
	}
	
	public static int variableWindow(String s, int requiredDistinctChars ) {
		Map<Character, Integer> window = new HashMap<>();
		int left =0;
		int right = 0;
		int result = Integer.MAX_VALUE;
		
		while(right < s.length()) {
			char c = s.charAt(right);
			window.put(c, window.getOrDefault(c, 0)+1);
			right++;
			// Condition: current window has all required distinct characters
		while (window.size() >= requiredDistinctChars) {
			result = Math.min(result, right - left);
			// Shrink window
			char leftChar = s.charAt(left);
			window.put(leftChar,window.get(leftChar)-1);
			if(window.get(leftChar) == 0) {
				window.remove(leftChar);
			}
			left++;
		}
		}
		return result == Integer.MAX_VALUE ? 0 : result;
	}

}



