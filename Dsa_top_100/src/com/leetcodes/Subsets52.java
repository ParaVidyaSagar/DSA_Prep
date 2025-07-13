package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets52 {
	public static class Solution {

	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(nums, 0, new ArrayList<>(), result);
	        return result;
	    }

	    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
	        result.add(new ArrayList<>(current)); // Add a copy of current subset

	        for (int i = start; i < nums.length; i++) {
	            current.add(nums[i]);               // Choose
	            backtrack(nums, i + 1, current, result); // Explore
	            current.remove(current.size() - 1); // Backtrack
	        }
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        int[] nums = {1, 2, 3};

	        List<List<Integer>> subsets = solution.subsets(nums);
	        System.out.println("All subsets of " + Arrays.toString(nums) + ":");
	        for (List<Integer> subset : subsets) {
	            System.out.println(subset);
	        }
	    }
	}
}
