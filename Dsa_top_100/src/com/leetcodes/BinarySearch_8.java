package com.leetcodes;

public class BinarySearch_8 {
	public static void main(String[] args) {
		//https://leetcode.com/problems/binary-search/submissions/1651666266/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
		 int [] nums = {-1,0,3,5,9,12}; //n at index 4
		 int target = 9;
		 System.out.println(binarySearch(nums,target));
	}
	
	static int binarySearch(int[] nums, int target) {
		if(nums.length == 1) return -1;
	    int left =0; // starting position of array
	    int right = nums.length-1; // array end index
	    
	    while(left <= right) {
	    	int midpoint = left+(right-left)/2;
	    	if(nums[midpoint] == target ) {
	    		return midpoint;
	    	}else if(nums[midpoint] > target) {
	    		right = midpoint-1;// it will search from right side
	    	} else {
	    		left = midpoint+1; // it will search from left side
	    	}
	    }
	    return -1;
		
	}

}
 