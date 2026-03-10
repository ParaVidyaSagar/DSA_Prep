package com.takeuforward.arrays;

public class LargestElement {
	
	public static void main(String[] args) {
		int[] nums = {7,85,56,4,1};
		int largest = largestElement(nums);
        System.out.println(largest);		
	}
	
	static int largestElement(int[] nums) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}
		return max;
	}

}
