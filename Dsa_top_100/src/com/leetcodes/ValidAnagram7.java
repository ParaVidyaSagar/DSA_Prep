package com.leetcodes;

public class ValidAnagram7 {
	//242.https://leetcode.com/problems/valid-anagram/description/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	
	static class Solution{
		public boolean isAnagram(String s, String t) {
			if(s.length() != t.length()) return false;
			int[] char_count = new int[26];
			for(int i = 0; i<s.length();i++) {
				// Increment the count of the character from string 's'
			    // (s.charAt(i) - 'a') gives index between 0 and 25 for lowercase a-z
				char_count[s.charAt(i) - 'a']++;
				 // Decrement the count of the character from string 't'
			    // The idea is if both strings have the same letters with same frequency,
			    // the array should be filled with all zeros after this loop
				char_count[s.charAt(i)- 'a']--;
			}
			
			for(int count : char_count) {
				if(count!=0) {
					return false;
				}
			}
		return true;	
		}
	}
	
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		// Test cases
		String s1 = "anagram";
		String t1 = "nagaram";
		String s2 = "rat";
		String t2 ="car";
		String s3 = "listen";
		String t3 = "silent";
		System.out.println("\"" + s1 + "\", \"" + t1 + "\" -> " + solution.isAnagram(s1, t1)); // true
        System.out.println("\"" + s2 + "\", \"" + t2 + "\" -> " + solution.isAnagram(s2, t2)); // false
        System.out.println("\"" + s3 + "\", \"" + t3 + "\" -> " + solution.isAnagram(s3, t3)); // true
   
		
	}

}
