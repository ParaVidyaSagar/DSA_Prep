package com.leetcodes;

public class ContainerWithMostWater36 {
	// Core logic to solve the problem
	static class Solution{
		public int maxArea(int[] height) {
			int left = 0;
			int right = height.length - 1;
			int maxWater = 0;
			
			while(left < right) {
				int h = Math.min(height[left], height[right]);
				int w = right- left;
				int area = h*w;
				maxWater = Math.max(maxWater, area);
				
				// Move the shorter line inward
				if(height[left] < height[right]) {
					left++;
				} else {
					right --;
				}
			}
			return maxWater;
		}
	}
	// Main method to test the solution
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int result = solution.maxArea(height);
		System.out.println("Maximum water that can be trapped: " + result); // Expected: 49System.out.println("Maximum water that can be trapped: " + result); // Expected: 49
	}
}
