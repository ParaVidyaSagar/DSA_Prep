package com.takeuforward.arrays;

public class CheckSortedArray {
	public static void main(String[] args) {
		//int[] nums = { 7, 85, 56, 4, 1 };
		int[] nums = {1,2,3};
		boolean sorted = sortedArrayCheck(nums);
		System.out.println(sorted); // Output: false
	}

	static boolean sortedArrayCheck(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				return false; // If any element is greater than the next, not sorted
			}
		}
		return true; // If loop finishes, array is sorted
	}
}
