package com.leetcodes;

public class FindPeakElement98 {
	static class Solution {
	    public int findPeakElement(int[] nums) {
	        int left = 0, right = nums.length - 1;

	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            // If mid element is less than its next, move right
	            if (nums[mid] < nums[mid + 1]) {
	                left = mid + 1;
	            } else {
	                // Otherwise, move left
	                right = mid;
	            }
	        }

	        return left; // or right (they are equal)
	    }
	}
	 public static void main(String[] args) {
	        Solution sol = new Solution();

	        int[] nums1 = {1, 2, 3, 1};
	        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

	        System.out.println("Peak index: " + sol.findPeakElement(nums1)); // Output: 2
	        System.out.println("Peak index: " + sol.findPeakElement(nums2)); // Output: 1 or 5
	    }
}
