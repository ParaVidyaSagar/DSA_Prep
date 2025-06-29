package com.dp.matrix;

import java.util.Arrays;

public class uniquePaths {
	 // 2D DP approach (Time: O(m*n), Space: O(m*n))
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize first row and column to 1
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        // Fill the DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    // Space optimized approach (Time: O(m*n), Space: O(n))
    public int uniquePathsOpt(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // First row is all 1s

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    // Main method
    public static void main(String[] args) {
    	uniquePaths solver = new uniquePaths();

        int m = 3, n = 7; // Example grid size

        int result1 = solver.uniquePaths(m, n);
        int result2 = solver.uniquePathsOpt(m, n);

        System.out.println("Unique paths (2D DP): " + result1);
        System.out.println("Unique paths (Optimized 1D DP): " + result2);
    }
}
