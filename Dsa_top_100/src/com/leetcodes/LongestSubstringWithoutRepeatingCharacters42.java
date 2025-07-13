package com.leetcodes;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters42 {
   static class Solution{
	   public int lenghtOfLongestSubstring(String s) {
		   Set<Character> string1 = new HashSet<>();
		   int result = 0;
		   int left = 0;
		   for(int right = 0; right < s.length(); right++) {
			   if(string1.contains(s.charAt(right))) {
				   while(s.charAt(right) != s.charAt(left)) {
					   string1.remove(s.charAt(left));
					   left++;
				   }
				   left++; // skip the duplicate
			   }else {
				   string1.add(s.charAt(right));
				   result = Math.max(result, right-left+1);
				   
			   }
		   }
		   return result;
	   }
   }
   public static void main(String[] args) {
	Solution sol = new Solution();
	String input1 = "abcabcbb";
    String input2 = "bbbbb";
    String input3 = "pwwkew";
    String input4 = "";
    String input5 = "dvdf";
    System.out.println("Length of longest substring in '" + input1 + "': " + sol.lenghtOfLongestSubstring(input1)); // 3
    System.out.println("Length of longest substring in '" + input2 + "': " + sol.lenghtOfLongestSubstring(input2)); // 1
    System.out.println("Length of longest substring in '" + input3 + "': " + sol.lenghtOfLongestSubstring(input3)); // 3
    System.out.println("Length of longest substring in '" + input4 + "': " + sol.lenghtOfLongestSubstring(input4)); // 0
    System.out.println("Length of longest substring in '" + input5 + "': " + sol.lenghtOfLongestSubstring(input5)); // 3

}
}
