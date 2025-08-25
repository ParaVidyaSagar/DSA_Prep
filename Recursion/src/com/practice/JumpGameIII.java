package com.practice;

public class JumpGameIII {
    public static boolean canReach(int[] arr, int start) {
        return dfs(arr, start, new boolean[arr.length]);
    }

    private static boolean dfs(int[] arr, int pos, boolean[] visited) {
        // Base cases
        if (pos < 0 || pos >= arr.length) return false;
        if (arr[pos] == 0) return true;
        if (visited[pos]) return false;

        // Mark visited
        visited[pos] = true;

        // Recurse: forward or backward
        int jump = arr[pos];
        return dfs(arr, pos + jump, visited) || dfs(arr, pos - jump, visited);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        System.out.println(canReach(arr, start)); // true
    }
}
