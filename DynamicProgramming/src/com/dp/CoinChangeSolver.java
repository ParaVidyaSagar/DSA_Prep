package com.dp;

import java.util.Arrays;

public class CoinChangeSolver {
	// Coin Change using Bottom-Up DP
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Fill with a value greater than possible answer
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    // Main method
    public static void main(String[] args) {
        CoinChangeSolver solver = new CoinChangeSolver();

        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = solver.coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
