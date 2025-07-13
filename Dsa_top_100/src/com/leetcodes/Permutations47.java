package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations47 {
	public static class Solution {

	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
	        return result;
	    }

	    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
	        if (current.size() == nums.length) {
	            result.add(new ArrayList<>(current)); // Add a deep copy
	            return;
	        }

	        for (int i = 0; i < nums.length; i++) {
	            if (used[i]) continue;

	            current.add(nums[i]);
	            used[i] = true;
	            backtrack(nums, used, current, result);
	            current.remove(current.size() - 1); // backtrack
	            used[i] = false;
	        }
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] nums1 = {1, 2, 3};
	        List<List<Integer>> result = solution.permute(nums1);

	        System.out.println("Permutations of " + Arrays.toString(nums1) + ":");
	        for (List<Integer> perm : result) {
	            System.out.println(perm);
	            /*
	             *  [1, 2, 3]
[1, 3, 2]
[2, 1, 3]
[2, 3, 1]
[3, 1, 2]
[3, 2, 1]
	             * */
	        }
	    }
	}
}
