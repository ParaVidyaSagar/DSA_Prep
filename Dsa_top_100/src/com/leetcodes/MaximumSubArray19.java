package com.leetcodes;

public class MaximumSubArray19 {
   static class Solution{
	   public int maxSubArray(int[] nums) {
		   int currentSum = nums[0];
		   int globalSum = nums[0];
		   for(int i = 1; i< nums.length; i++) {
			   currentSum = Math.max(nums[i], currentSum+nums[i]);
			   globalSum = Math.max(globalSum, currentSum);
		   }
		   return globalSum;
	   }
	   
   }
   
   public static void main(String[] args) {
	Solution solution = new Solution();
	int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	int result = solution.maxSubArray(nums);
	System.out.println("MAximum SubArray sum: " + result);  // Output: 6
}
}
