package com.leetcodes;

import java.util.Arrays;

public class ProductOfArrayExceptSelf22 {
	static class Solution{
		public int[] produtcExceptSelf(int[] nums) {
			int productRight = 1;
			int productLeft =1;
			int[] answer = new int[nums.length];
			
			// step1: Build right product array in reverse
			for(int i=nums.length-1;i>=0;i--) {
				
				answer[i] = productRight;
				System.out.println("answer[i] =" + answer[i]);
				//productRight *= nums[i];
				productRight = productRight * nums[i];
				System.out.println("productRight * = " + productRight);
			}
			System.out.println(Arrays.toString(answer));
			//[24, 12, 4, 1]
			//Step:2 Multiply left product while traversing left to right
				for(int i=0; i<nums.length; i++) {
					answer[i] = answer[i] * productLeft;
					System.out.println("answer-2[i] =" + answer[i]);
					productLeft = productLeft * nums[i];
					System.out.println("productLeft * = " + productLeft);
				}
				return answer;
			}
		}
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] nums = {1,2,3,4};
		int[] result = sol.produtcExceptSelf(nums);
		System.out.println("Input: "+ Arrays.toString(nums));
		System.out.println("Output: "+ Arrays.toString(result)); // Expected: [24, 12, 8, 6]
	}

}
