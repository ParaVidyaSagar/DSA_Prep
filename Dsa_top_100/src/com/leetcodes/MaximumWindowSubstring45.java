package com.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class MaximumWindowSubstring45 {
	static class Solution {
		public String minWindow(String s, String t) {
			if (s.length() < t.length())
				return "";
			Map<Character, Integer> target = new HashMap<>();
			for (char c : t.toCharArray()) {
				target.put(c, target.getOrDefault(c, 0) + 1);
			}

			Map<Character, Integer> window = new HashMap<>();
			int left = 0, right = 0;
			int formed = 0, required = target.size();
			int minLen = Integer.MAX_VALUE;
			int minStart = 0;

			while (right < s.length()) {
				char c = s.charAt(right);
				window.put(c, window.getOrDefault(c, 0) + 1);
				if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
					formed++;
				}
				while (left <= right && formed == required) {
					if ((right - left + 1) < minLen) {
						minLen = right - left + 1;
						minStart = left;
					}
					char leftChar = s.charAt(left);
					window.put(leftChar, window.get(leftChar) - 1);

					if (target.containsKey(leftChar)
							&& window.get(leftChar).intValue() < target.get(leftChar).intValue()) {
						formed--;
					}
					left++;
				}
				right++;
			}
			return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
		}

		// Main method for local testing
		public static void main(String[] args) {
			Solution solution = new Solution();

			String s1 = "ADOBECODEBANC";
			String t1 = "ABC";

			String s2 = "a";
			String t2 = "a";

			String s3 = "a";
			String t3 = "aa";

			System.out.println("Min window (s1, t1): " + solution.minWindow(s1, t1)); // Output: "BANC"
			System.out.println("Min window (s2, t2): " + solution.minWindow(s2, t2)); // Output: "a"
			System.out.println("Min window (s3, t3): " + solution.minWindow(s3, t3)); // Output: ""
		}
	}

}
