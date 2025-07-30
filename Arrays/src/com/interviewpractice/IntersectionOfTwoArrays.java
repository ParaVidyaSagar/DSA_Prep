package com.interviewpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		// Store all elements from nums1
		for(int num : nums1) {
			set1.add(num);
		}
		
		 // Check for common elements
		for(int num : nums2) {
			if(set1.contains(num)) {
				result.add(num); // Add only once (no duplicates)
			}
		}
		// Convert result set to array
		int[]  output = new int[result.size()];
		int i =0;
		for(int num : result) {
			output[i++] = num;
		}
		return output;
	}

}
