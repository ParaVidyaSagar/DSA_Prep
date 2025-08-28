package com.dp.topic;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicProgrammingWithMemoization {
    static int[] dp; // DP array to store already computed results

    static int fib(int n) {
        // Base case
        if (n <= 1) return n;

        // If already computed, return from dp
        if (dp[n] != -1) return dp[n];

        // Otherwise compute and store in dp
        return dp[n] = fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt(); // Take input for Fibonacci term

        dp = new int[n + 1]; // DP array size n+1 (to include dp[n])

        Arrays.fill(dp, -1); // Fill with -1 (uncomputed)

        System.out.println(fib(n)); // Print nth Fibonacci number

        sc.close();
    }
}
