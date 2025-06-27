package com.leetcodes;

public class SingleNumber11 {
   //https://leetcode.com/problems/single-number/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	
	static class Solution{
		public int singleNumber(int[] nums) {
			int result = 0;
			for (int num : nums) {
				result ^= num;
				
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {2,2,1};
		System.out.println("Single number in nums1: "+ solution.singleNumber(nums));
	    //Test Case: 2
		int[] nums2 = {4, 1 , 2, 1 , 2};
		System.out.println("Single number in nums2: "+ solution.singleNumber(nums2));
		
		//Test case:3
		int[] nums3 = {7};
		System.out.println("Single number in nums3: "+ solution.singleNumber(nums3));
	}
}
