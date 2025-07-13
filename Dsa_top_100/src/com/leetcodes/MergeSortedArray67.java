package com.leetcodes;

import java.util.Arrays;

public class MergeSortedArray67 {
	public static class Solution {

	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int p1 = m - 1;
	        int p2 = n - 1;
	        int p = m + n - 1;

	        while (p1 >= 0 && p2 >= 0) {
	            if (nums1[p1] > nums2[p2])
	                nums1[p--] = nums1[p1--];
	            else
	                nums1[p--] = nums2[p2--];
	        }

	        while (p2 >= 0)
	            nums1[p--] = nums2[p2--];
	    }

	    public static void main(String[] args) {
	        Solution sol = new Solution();

	        int[] nums1 = {1, 2, 3, 0, 0, 0};
	        int[] nums2 = {2, 5, 6};
	        int m = 3, n = 3;

	        sol.merge(nums1, m, nums2, n);

	        System.out.println("Merged array: " + Arrays.toString(nums1));
	        // Output: [1, 2, 2, 3, 5, 6]
	    }
	}
}
