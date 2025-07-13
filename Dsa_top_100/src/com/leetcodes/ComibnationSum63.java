package com.leetcodes;

import java.util.ArrayList;
import java.util.List;

public class ComibnationSum63 {
	public static class Solution {

	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(result, new ArrayList<>(), candidates, target, 0);
	        return result;
	    }

	    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
	        if (target == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < candidates.length; i++) {
	            if (candidates[i] <= target) {
	                current.add(candidates[i]);
	                backtrack(result, current, candidates, target - candidates[i], i);
	                current.remove(current.size() - 1);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] candidates1 = {2, 3, 6, 7};
	        int target1 = 7;
	        System.out.println("Combinations for 7: " + solution.combinationSum(candidates1, target1));
	        // Output: [[2, 2, 3], [7]]

	        int[] candidates2 = {2, 3, 5};
	        int target2 = 8;
	        System.out.println("Combinations for 8: " + solution.combinationSum(candidates2, target2));
	        // Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
	    }
	}
}
