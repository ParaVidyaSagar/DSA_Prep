package com.practice;

public class CountWaysToReach {
	static int countWays(int n) {
        // Base cases
        if (n == 0) return 1;  // 1 way (stay there)
        if (n == 1) return 1;  // 1 way (single step)

        // Recursive relation
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Ways to reach stair " + n + " = " + countWays(n));
    }
}
