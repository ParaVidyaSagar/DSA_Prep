package com.leetcodes;

import java.util.Arrays;

public class RotateArray81 {
	static class Solution {
	    public void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k % n;  // handle k > n

	        reverse(nums, 0, n - 1);      // Step 1: reverse whole array
	        reverse(nums, 0, k - 1);      // Step 2: reverse first k
	        reverse(nums, k, n - 1);      // Step 3: reverse remaining
	    }

	    private void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start++] = nums[end];
	            nums[end--] = temp;
	        }
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        sol.rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
