package com.dp;

public class KnapsackExample {
	 // 0/1 Knapsack - Tabulation (2D DP)
	public int knapsack(int W, int[] weight, int[] values, int n) {
		int[][] dp = new int[n+1][W+1];
		for(int i =1; i <= n; i++) {
			for(int j=1; j <= W; j++) {
				if(weight[i-1] <= j) {
					dp[i][j] = Math.max(
							values[i-1]+dp[i-1][W-weight[i-1]], 
							dp[i-1][j]);
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][W];
	}
	
	//0/1 Knapsack - Space Optimized (1D DP)
	public int knapsackOpt(int W, int[] weights, int[] values, int n) {
		int[] dp = new int[W+1];
		for(int i=0;i<n;i++) {
			for(int w= W; w>= weights[i]; w--) {
				dp[w] = Math.max(dp[w], values[i]+dp[w - weights[i]]);
			}
		}
		return dp[W];
	}
	
	// Main method
	public static void main(String[] args) {
		KnapsackExample knapsackSolver = new KnapsackExample();
		int[] weights = {2,3,4,5};
		int[] values = {3,4,5, 6};
		int W = 5;
		int n = weights.length;
		// Using 2D DP
		int maxVal = knapsackSolver.knapsack(W, weights, values, n);
		System.out.println("Maximum value (2D DP): " + maxVal);
		
		// Using 1D space optimized DP
		int maxValOpt = knapsackSolver.knapsackOpt(W, weights, values, n);
		System.out.println("Maximum value (Optimized): " + maxValOpt);
	}
}
