package com.leetcodes;

public class PalindromeNumber83 {
	 static class Solution {
	        public boolean isPalindrome(int x) {
	            if (x < 0) {
	                return false;
	            }

	            int original = x;
	            int reversed = 0;

	            while (x != 0) {
	                int remainder = x % 10;
	                reversed = reversed * 10 + remainder;
	                x = x / 10;
	            }

	            return original == reversed;
	        }
	    }

	    // Main method for local testing
	    public static void main(String[] args) {
	        Solution sol = new Solution();

	        int test1 = 121;
	        int test2 = -121;
	        int test3 = 10;

	        System.out.println(test1 + " is palindrome? " + sol.isPalindrome(test1)); // true
	        System.out.println(test2 + " is palindrome? " + sol.isPalindrome(test2)); // false
	        System.out.println(test3 + " is palindrome? " + sol.isPalindrome(test3)); // false
	    }
}
