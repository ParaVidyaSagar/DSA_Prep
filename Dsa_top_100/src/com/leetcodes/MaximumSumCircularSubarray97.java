package com.leetcodes;

public class MaximumSumCircularSubarray97 {
	static class Solution {
	    public int maxSubarraySumCircular(int[] nums) {
	        int totalSum = 0;
	        int maxSum = nums[0], curMax = 0;
	        int minSum = nums[0], curMin = 0;

	        for (int num : nums) {
	            totalSum += num;

	            // Kadane's for max subarray
	            curMax = Math.max(num, curMax + num);
	            maxSum = Math.max(maxSum, curMax);

	            // Kadane's for min subarray
	            curMin = Math.min(num, curMin + num);
	            minSum = Math.min(minSum, curMin);
	        }

	        // If all numbers are negative, maxSum is the answer (can't wrap)
	        if (maxSum < 0) return maxSum;

	        // Otherwise, max of (non-circular, circular subarray sum)
	        return Math.max(maxSum, totalSum - minSum);
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, -2, 3, -2};
        int[] nums2 = {5, -3, 5};
        int[] nums3 = {-3, -2, -3};

        System.out.println("Max Circular Subarray Sum: " + sol.maxSubarraySumCircular(nums1)); // 3
        System.out.println("Max Circular Subarray Sum: " + sol.maxSubarraySumCircular(nums2)); // 10
        System.out.println("Max Circular Subarray Sum: " + sol.maxSubarraySumCircular(nums3)); // -2
    }
}
