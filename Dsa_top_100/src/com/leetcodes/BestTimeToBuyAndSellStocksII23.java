package com.leetcodes;

public class BestTimeToBuyAndSellStocksII23 {
	static class Solution {
		public int maxxProfit(int[] prices) {
			int profit = 0;
			for(int i =1; i< prices.length; i++) {
				if(prices[i] > prices[i-1]) {
					profit += prices[i] - prices[i-1];
				}
				
			}
			return profit;
		}
		
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] prices = {7,1,5,3,6,4};   // Buy at 1, sell at 5; buy at 3, sell at 6
		int maxProfit = sol.maxxProfit(prices);
		System.out.println("Maximum Profit: " + maxProfit); // Output: 7
	}

}
