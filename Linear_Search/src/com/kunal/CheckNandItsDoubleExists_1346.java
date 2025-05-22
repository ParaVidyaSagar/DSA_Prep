package com.kunal;

import java.util.HashSet;

public class CheckNandItsDoubleExists_1346 {
	
	public static void main(String[] args) {
		int [] nums = {10,2,5,3};
		System.out.println(doubleCheck(nums));
	}

	// brute - force
	/*static boolean doubleCheck(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if( i != j && nums[i]== 2* nums[j]) {
					System.out.println(nums[i]+"-"+nums[j]);
					return true;
				}
			}
		}
		return false;
	}*/
	
	// Optimized Approach
	static boolean doubleCheck(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		System.out.println(set.toString());
		for(int num : nums) {
			if(set.contains(2*num)|| (num% 2 == 0 && set.contains(num/2))) {
				System.out.println(num/2);
				System.out.println(num%2);
				System.out.println(set.toString());
				return true;
			}
			set.add(num);
		}
		return false;
	}
}
