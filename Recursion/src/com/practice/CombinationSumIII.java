package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int k, int target, int start,
                                  List<Integer> current, List<List<Integer>> result) {
        // Base case: if we selected k numbers
        if (current.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        // Try numbers from "start" to 9
        for (int i = start; i <= 9; i++) {
            if (i > target) break;  // pruning (no need to continue)

            current.add(i); // pick
            backtrack(k, target - i, i + 1, current, result);
            current.remove(current.size() - 1); // undo
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));
    }
}