package com.leetcodes;

public class FindMinimuminRotatedSortedArray99 {
	static class Solution {
	    public int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length - 1;

	        // Binary search loop
	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            // If mid element is greater than right, min is in right half
	            if (nums[mid] > nums[right]) {
	                left = mid + 1;
	            } else {
	                // Min is in left half including mid
	                right = mid;
	            }
	        }

	        // left == right is the index of the smallest element
	        return nums[left];
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};

        System.out.println("Minimum: " + sol.findMin(nums1)); // 1
        System.out.println("Minimum: " + sol.findMin(nums2)); // 0
        System.out.println("Minimum: " + sol.findMin(nums3)); // 11
    }
}
