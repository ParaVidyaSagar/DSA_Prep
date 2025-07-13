package com.leetcodes;

public class RemoveDuplicatesfromSortedArray100 {
	static class Solution {
	    public int removeDuplicates(int[] nums) {
	        if (nums.length == 0) return 0;

	        int i = 0; // Slow pointer
	        for (int j = 1; j < nums.length; j++) {
	            if (nums[j] != nums[i]) {
	                i++;           // Move forward when a unique value is found
	                nums[i] = nums[j]; // Overwrite with new unique value
	            }
	        }

	        return i + 1; // Length is index + 1
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = sol.removeDuplicates(nums);

        System.out.println("New length: " + length);
        System.out.print("Updated array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: New length: 5, Updated array: 0 1 2 3 4
    }
}
