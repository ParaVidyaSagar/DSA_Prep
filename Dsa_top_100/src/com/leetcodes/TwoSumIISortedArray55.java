package com.leetcodes;

import java.util.Arrays;

public class TwoSumIISortedArray55 {
	public static class Solution {

	    public int[] twoSum(int[] numbers, int target) {
	        int left = 0;
	        int right = numbers.length - 1;

	        while (left < right) {
	            int sum = numbers[left] + numbers[right];

	            if (sum == target) {
	                return new int[]{left + 1, right + 1}; // 1-based index
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }

	        return new int[]{-1, -1};
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] numbers1 = {2, 7, 11, 15};
	        int target1 = 9;

	        int[] result1 = solution.twoSum(numbers1, target1);
	        System.out.println("Indices: " + Arrays.toString(result1)); // [1, 2]

	        int[] numbers2 = {1, 2, 3, 4, 4, 9, 56, 90};
	        int target2 = 8;

	        int[] result2 = solution.twoSum(numbers2, target2);
	        System.out.println("Indices: " + Arrays.toString(result2)); // [4, 5]
	    }
	}
}
