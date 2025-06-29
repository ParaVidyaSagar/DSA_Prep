package com.dp;

public class LongestCommonSubsequence {
	// LCS using bottom-up DP (Tabulation)
    public int lcs(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    // Main method
    public static void main(String[] args) {
        LongestCommonSubsequence solver = new LongestCommonSubsequence();

        String text1 = "abcde";
        String text2 = "ace";

        int result = solver.lcs(text1, text2);
        System.out.println("Length of Longest Common Subsequence: " + result);
    }

}
