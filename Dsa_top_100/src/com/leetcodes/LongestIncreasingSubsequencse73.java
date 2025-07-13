package com.leetcodes;

import java.util.Arrays;

public class LongestIncreasingSubsequencse73 {
	public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) {
    	LongestIncreasingSubsequencse73 sol = new LongestIncreasingSubsequencse73();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};

        System.out.println("LIS length (nums1): " + sol.lengthOfLIS(nums1)); // 4
        System.out.println("LIS length (nums2): " + sol.lengthOfLIS(nums2)); // 4
    }
}
