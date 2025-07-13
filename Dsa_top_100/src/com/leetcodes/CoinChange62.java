package com.leetcodes;

import java.util.Arrays;

public class CoinChange62 {
	public static class Solution {

	    public int coinChange(int[] coins, int amount) {
	        int max = amount + 1;
	        int[] dp = new int[amount + 1];
	        Arrays.fill(dp, max); // Fill with a large number
	        dp[0] = 0;

	        for (int i = 1; i <= amount; i++) {
	            for (int coin : coins) {
	                if (coin <= i) {
	                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	                }
	            }
	        }

	        return dp[amount] == max ? -1 : dp[amount];
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] coins1 = {1, 2, 5};
	        int amount1 = 11;
	        System.out.println("Minimum coins for amount 11: " + solution.coinChange(coins1, amount1)); // Output: 3

	        int[] coins2 = {2};
	        int amount2 = 3;
	        System.out.println("Minimum coins for amount 3: " + solution.coinChange(coins2, amount2)); // Output: -1

	        int[] coins3 = {1};
	        int amount3 = 0;
	        System.out.println("Minimum coins for amount 0: " + solution.coinChange(coins3, amount3)); // Output: 0
	    }
	}
}
