package com.leetcodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak58 {
	public static class Solution {

	    public boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> wordSet = new HashSet<>(wordDict);
	        boolean[] dp = new boolean[s.length() + 1];

	        dp[0] = true; // Empty string is always breakable

	        for (int i = 1; i <= s.length(); i++) {
	            for (int j = 0; j < i; j++) {
	                if (dp[j] && wordSet.contains(s.substring(j, i))) {
	                    dp[i] = true;
	                    break;
	                }
	            }
	        }

	        return dp[s.length()];
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        String s1 = "leetcode";
	        List<String> dict1 = Arrays.asList("leet", "code");

	        String s2 = "applepenapple";
	        List<String> dict2 = Arrays.asList("apple", "pen");

	        String s3 = "catsandog";
	        List<String> dict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");

	        System.out.println("Can break '" + s1 + "': " + solution.wordBreak(s1, dict1)); // true
	        System.out.println("Can break '" + s2 + "': " + solution.wordBreak(s2, dict2)); // true
	        System.out.println("Can break '" + s3 + "': " + solution.wordBreak(s3, dict3)); // false
	    }
	}

}
