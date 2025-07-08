package com.leetcodes;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate28 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums1 = {1, 2, 3, 1};
		int[] nums2 ={1, 2, 3, 4};
		System.out.println("Test 1: " + sol.containsDuplicate(nums1)); // true
        System.out.println("Test 2: " + sol.containsDuplicate(nums2)); // false
    }
	
	static class Solution{
		public boolean containsDuplicate(int[] nums) {
			Set<Integer> seen = new HashSet<>();
			for(int num : nums) {
				if(seen.contains(num)) return true;
				seen.add(num);
			}
			return false;
		}
	}
}
