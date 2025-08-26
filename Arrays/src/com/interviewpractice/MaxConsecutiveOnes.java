package com.interviewpractice;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        System.out.println("Max Consecutive Ones = " + findMaxConsecutiveOnes(arr));
	}
	
	static int findMaxConsecutiveOnes(int[] nums) {
		int maxCount =0;
		int currentCount = 0;
		for(int num:nums) {
			if(num == 1) {
				currentCount++;
				maxCount= Math.max(maxCount, currentCount);
			}else {
				currentCount = 0; // reset when 0 comes
			}
		}
		return maxCount;
	}
}
