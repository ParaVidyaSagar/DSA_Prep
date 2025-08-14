package com.fixed;

public class MaximumAverageSubarrayofSizek {
	public static void main(String[] args) {
		int[] nums = {2,1,5,1,3,2};
		int k = 3;
		double result = maxAverageSubarray(nums, k);
		System.out.println(result);
	}
	
	static double maxAverageSubarray(int[] nums, int k) {
		if(nums.length < k) {
			throw new IllegalArgumentException("Array length must be out of bounds");
			
		}
		
		int windowSum = 0;
		int maxSum = 0;
		for(int end=0; end <nums.length; end++ ) {
			windowSum += nums[end]; // Add element to current window
			if(end >= k -1) {// When window size reaches k
				maxSum = Math.max(maxSum, windowSum);// Update max sum
				windowSum -= nums[end-k+1]; // Remove outgoing element
			}
		}
		return (double) maxSum/ k; // Convert to average
	}

}
