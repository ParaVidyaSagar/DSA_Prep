package com.fixed;
/*
 * For minimum problems, you should start with Integer.MAX_VALUE so that any first computed sum will replace it.
 * */
public class MinSumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = minSumOfSubArray(nums, k);
        System.out.println(result); // Expected: 6
    }

    static int minSumOfSubArray(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("Array length must be >= k");
        }

        int minSum = Integer.MAX_VALUE; // Start with largest possible value
        int windowSum = 0;

        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];

            if (end >= k - 1) { // Once window size reached
                minSum = Math.min(minSum, windowSum); // Update min
                windowSum -= nums[end - k + 1]; // Slide window
            }
        }

        return minSum;
    }
}
