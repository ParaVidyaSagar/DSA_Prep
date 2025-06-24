package com.leetcodes;

public class ValidPalindrome5 {
	 static class Solution {
	        public boolean isPalindrome(String s) {
	            // Convert to lowercase and remove non-alphanumeric characters
	            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

	            int i = 0;
	            int j = s.length() - 1;

	            while (i <= j) {
	                if (s.charAt(i) != s.charAt(j)) {
	                    return false;
	                }
	                i++;
	                j--;
	            }
	            return true;
	        }
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        // Test cases
	        String test1 = "A man, a plan, a canal: Panama";
	        String test2 = "racecar";
	        String test3 = "hello";
	        String test4 = " ";
	        String test5 = "0P";

	        System.out.println("\"" + test1 + "\" -> " + solution.isPalindrome(test1)); // true
	        System.out.println("\"" + test2 + "\" -> " + solution.isPalindrome(test2)); // true
	        System.out.println("\"" + test3 + "\" -> " + solution.isPalindrome(test3)); // false
	        System.out.println("\"" + test4 + "\" -> " + solution.isPalindrome(test4)); // true
	        System.out.println("\"" + test5 + "\" -> " + solution.isPalindrome(test5)); // false
	    }
	}
