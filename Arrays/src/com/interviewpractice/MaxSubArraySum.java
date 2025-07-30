package com.interviewpractice;

public class MaxSubArraySum {
public static void main(String[] args) {
	int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(arr)); // Output: 6
}
public static int maxSubArray(int[] nums) {
	int maxSum = nums[0];
	int currentSum = nums[0];
	for(int i =0; i<nums.length; i++) {
		 // either continue the subarray or start fresh from current element
		currentSum = Math.max(nums[i], currentSum+nums[i]);
		maxSum = Math.max(maxSum, currentSum);
	}
	return maxSum;
}
}
