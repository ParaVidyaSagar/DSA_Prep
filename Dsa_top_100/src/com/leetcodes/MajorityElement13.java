package com.leetcodes;

public class MajorityElement13 {
  public static void main(String[] args) {
	Solution solution = new Solution();
	// Test case 1
    int[] nums1 = {3, 2, 3};
    System.out.println("Majority Element in nums1: " + solution.majorityElement(nums1)); // Output: 3
 // Test case 2
    int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
    System.out.println("Majority Element in nums2: " + solution.majorityElement(nums2)); // Output: 2

    // Test case 3
    int[] nums3 = {1, 1, 1, 2, 3, 4, 1};
    System.out.println("Majority Element in nums3: " + solution.majorityElement(nums3)); // Output: 1
}
  static class Solution{
	static int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = 0;
		for(int num: nums) {
			if(count == 0) {
				candidate = num;
			}
			count+=(num==candidate) ? 1 : -1;  
		}
		return candidate;
	}
  }
}
