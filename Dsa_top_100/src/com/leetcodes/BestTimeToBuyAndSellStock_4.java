package com.leetcodes;

public class BestTimeToBuyAndSellStock_4 {
	 public static void main(String[] args) {
		 //121. https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	        // Test input: Expected output = 5 (Buy at 1, sell at 6)
	        int[] prices = {7, 1, 5, 3, 6, 4};
	        int maxProfit = maxProfit(prices);
	        System.out.println("Maximum Profit: " + maxProfit);
	        System.out.println(prices[maxProfit]);
	    }
	 
//	 static int maxProfit(int[] prices) {
//		    int minPrice = Integer.MAX_VALUE; //7 //1 
//		    int maxProfit =0;
//
//		    for(int i =0; i<prices.length; i++){
//		        if(prices[i]<minPrice){
//		            minPrice = prices[i];
//		        }else if (prices[i]-minPrice > maxProfit){
//		            maxProfit = (prices[i]-minPrice);
//		        }
//		    }
//		    return maxProfit;
//		}
	 
	 
	 static int maxProfit(int[] prices) {
		 int minPrice = Integer.MAX_VALUE; //7 //1 
		 int maxProfit =0;
		 for(int price : prices) {
			 if(price < minPrice) {
				 minPrice = price;
			 }else if(price-minPrice>maxProfit) {
				 maxProfit =price-minPrice;
				 
			 }
		 }
		 return maxProfit;
	 }
}
