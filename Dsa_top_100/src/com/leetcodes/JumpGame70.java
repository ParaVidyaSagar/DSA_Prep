package com.leetcodes;

public class JumpGame70 {
	public static class Solution {

	    public boolean canJump(int[] nums) {
	        int maxReach = 0;

	        for (int i = 0; i < nums.length; i++) {
	            if (i > maxReach)
	                return false;

	            maxReach = Math.max(maxReach, i + nums[i]);
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Solution sol = new Solution();

	        int[] nums1 = {2, 3, 1, 1, 4};
	        int[] nums2 = {3, 2, 1, 0, 4};

	        System.out.println("Can reach end in nums1: " + sol.canJump(nums1)); // true
	        System.out.println("Can reach end in nums2: " + sol.canJump(nums2)); // false
	    }
	}
}
