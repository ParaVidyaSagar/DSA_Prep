package com.leetcodes;

public class UniquePaths56 {
	public static class Solution {

	    public int uniquePaths(int m, int n) {
	        int[][] dp = new int[m][n];

	        // First row and first column = 1
	        for (int i = 0; i < m; i++) dp[i][0] = 1;
	        for (int j = 0; j < n; j++) dp[0][j] = 1;

	        // Fill the rest of the DP table
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // From top + left
	            }
	        }

	        return dp[m - 1][n - 1];
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int m1 = 3, n1 = 7;
	        System.out.println("Unique Paths (3x7): " + solution.uniquePaths(m1, n1)); // Output: 28

	        int m2 = 3, n2 = 2;
	        System.out.println("Unique Paths (3x2): " + solution.uniquePaths(m2, n2)); // Output: 3
	    }
	}

}
