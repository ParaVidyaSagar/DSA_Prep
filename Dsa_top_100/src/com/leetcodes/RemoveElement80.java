package com.leetcodes;

import java.util.Arrays;

public class RemoveElement80 {
	static class Solution {
	    public int removeElement(int[] nums, int val) {
	        int index = 0; // pointer to overwrite non-val elements

	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }

	        return index;
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int newLength = sol.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        // Output: New length: 2, Modified array: [2, 2]
    }
}
