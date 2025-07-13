package com.leetcodes;

public class SearchInRotatedSortedArray51 {
	public static class Solution {

	    public int search(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (nums[mid] == target) return mid;

	            if (nums[left] <= nums[mid]) {
	                // Left part is sorted
	                if (nums[left] <= target && target < nums[mid])
	                    right = mid - 1;
	                else
	                    left = mid + 1;
	            } else {
	                // Right part is sorted
	                if (nums[mid] < target && target <= nums[right])
	                    left = mid + 1;
	                else
	                    right = mid - 1;
	            }
	        }

	        return -1;
	    }

	   
}
	 public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] nums1 = {4,5,6,7,0,1,2};
	        int target1 = 0;
	        int target2 = 3;

	        System.out.println("Index of " + target1 + ": " + solution.search(nums1, target1)); // Output: 4
	        System.out.println("Index of " + target2 + ": " + solution.search(nums1, target2)); // Output: -1
	    }
}
