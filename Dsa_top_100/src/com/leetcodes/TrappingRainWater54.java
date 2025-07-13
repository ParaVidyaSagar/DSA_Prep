package com.leetcodes;

public class TrappingRainWater54 {
	

	public static class Solution {

	    public int trap(int[] height) {
	        int max_height = 0;
	        int max_index = 0;

	        // Find the index of the tallest bar
	        for (int i = 0; i < height.length; i++) {
	            if (height[i] > max_height) {
	                max_height = height[i];
	                max_index = i;
	            }
	        }

	        int total = 0;
	        int leftMax = 0, rightMax = 0;

	        // Traverse from left to tallest bar
	        for (int i = 0; i < max_index; i++) {
	            if (height[i] >= leftMax) {
	                leftMax = height[i];
	            } else {
	                total += (leftMax - height[i]);
	            }
	        }

	        // Traverse from right to tallest bar
	        for (int i = height.length - 1; i > max_index; i--) {
	            if (height[i] >= rightMax) {
	                rightMax = height[i];
	            } else {
	                total += (rightMax - height[i]);
	            }
	        }

	        return total;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	        int[] height2 = {4, 2, 0, 3, 2, 5};

	        System.out.println("Water trapped (Example 1): " + solution.trap(height1)); // Expected: 6
	        System.out.println("Water trapped (Example 2): " + solution.trap(height2)); // Expected: 9
	    }
	}

}
