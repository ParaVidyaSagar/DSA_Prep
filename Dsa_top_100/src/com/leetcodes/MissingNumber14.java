package com.leetcodes;

public class MissingNumber14 {
 //https://leetcode.com/problems/missing-number/description/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	  static class Solution{
		  public int missingNumber(int[] nums) {
			int n= nums.length;
			int expectedSum = n*(n+1)/2;
			int actualSum =0;
			
			for(int num: nums) {
				actualSum += num;
			}
			return expectedSum - actualSum;
	  }
	  
	  public static void main(String[] args) {
		  Solution solution = new Solution();
		// Test case 1
	        int[] nums1 = {3, 0, 1};
	        System.out.println("Missing number in nums1: " + solution.missingNumber(nums1)); // Output: 2

	        // Test case 2
	        int[] nums2 = {0, 1};
	        System.out.println("Missing number in nums2: " + solution.missingNumber(nums2)); // Output: 2

	        // Test case 3
	        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
	        System.out.println("Missing number in nums3: " + solution.missingNumber(nums3)); // Output: 8
	    }
	}
}
