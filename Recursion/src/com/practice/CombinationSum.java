package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int index,
                                  List<Integer> current, List<List<Integer>> result) {
        // Base case: target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Out of range or overshoot
        if (target < 0 || index >= candidates.length) {
            return;
        }

        // Choice 1: Pick candidates[index]
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1); // undo

        // Choice 2: Skip candidates[index]
        backtrack(candidates, target, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
