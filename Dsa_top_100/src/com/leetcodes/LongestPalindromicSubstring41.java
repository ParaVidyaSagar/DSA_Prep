package com.leetcodes;

public class LongestPalindromicSubstring41 {
    static class Solution{
    	public String longestPalindrome(String s) {
    		if(s == null || s.length() <1) return "";
    	int start = 0, end = 0;
    	for(int i =0; i < s.length(); i++) {
    		int len1 = expandAroundCenter(s,i,i);
    		int len2 = expandAroundCenter(s,i,i+1);
    		int len = Math.max(len1, len2);
    		
    		if(len > end - start) {
    			 // Update start and end to the new bounds
    			start = i- (len-1) / 2;
    			end = i + len /2;
    		}
    		
    	}
    	 return s.substring(start, end+1);
    	}
    	
    	private int expandAroundCenter(String s, int left, int right) {
    		while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
    			left--;
    			right++;
    		}
    		return right - left - 1;// length of the palindrome
    	}
    	
    }
    public static void main(String[] args) {
		Solution sol = new Solution();
		String input1 = "babad";
        String input2 = "cbbd";
        String input3 = "a";
        String input4 = "ac";
        
        System.out.println("Longest palindrome in '" + input1 + "' is: " + sol.longestPalindrome(input1)); // "bab" or "aba"
        System.out.println("Longest palindrome in '" + input2 + "' is: " + sol.longestPalindrome(input2)); // "bb"
        System.out.println("Longest palindrome in '" + input3 + "' is: " + sol.longestPalindrome(input3)); // "a"
        System.out.println("Longest palindrome in '" + input4 + "' is: " + sol.longestPalindrome(input4)); // "a" or "c"
 
	}
}
