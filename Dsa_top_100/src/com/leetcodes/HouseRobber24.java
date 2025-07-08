package com.leetcodes;

public class HouseRobber24 {
 //https://leetcode.com/problems/house-robber/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {2,7,9,3,1};
		int maxAmount = sol.rob(nums);
		System.out.println("Maximum amount that can be robbed: " + maxAmount);  // Output: 12
	}
	
	static class Solution{
		public int rob(int[] nums) {
			if(nums.length == 0) return 0;
			if(nums.length == 1) return nums[0];
			int prev2 = 0;
			int prev1 = nums[0];
			for (int i =1; i<nums.length; i++) {
				int take = nums[i]+ prev2;
				int skip = prev1;
				int current = Math.max(take, skip);
				prev2 = prev1;
				prev1 = current;
				
			}
			return prev1;
		}
	}
}
