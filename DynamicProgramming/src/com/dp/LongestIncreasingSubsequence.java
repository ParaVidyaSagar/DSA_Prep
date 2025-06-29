package com.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	// O(n^2) DP solution
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        return max;
    }

    // O(n log n) solution using binary search
    public int lengthOfLISOpt(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if (i == size) size++;
        }

        return size;
    }

    // Main method
    public static void main(String[] args) {
        LongestIncreasingSubsequence solver = new LongestIncreasingSubsequence();

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        int res1 = solver.lengthOfLIS(nums);
        int res2 = solver.lengthOfLISOpt(nums);

        System.out.println("Length of LIS (O(n^2) DP): " + res1);
        System.out.println("Length of LIS (O(n log n) Opt): " + res2);
    }
}
