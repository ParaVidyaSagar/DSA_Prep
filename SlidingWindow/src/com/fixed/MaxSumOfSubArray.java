package com.fixed;

public class MaxSumOfSubArray {
	public static void main(String[] args) {
		int[] nums = {2, 1, 5, 1, 3, 2};
		int k = 3;
		int result = maxSumOfSubArray(nums, k);
		System.out.println(result);
	
	}
	static int maxSumOfSubArray(int[] nums, int k) {
		int maxSum =0;
		int windowSum =0;
		for(int end = 0; end< nums.length; end++) {
			windowSum += nums[end];
			if(end >= k -1) {
				maxSum= Math.max(maxSum, windowSum);
				windowSum -= nums[end-k+1];
			}
		}
		return maxSum;
	}

}
