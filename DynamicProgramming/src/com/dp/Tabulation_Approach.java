package com.dp;

public class Tabulation_Approach {
	// Bottom-Up (Tabulation) approach
	/*
	public int fibTabulation(int n) {
		if(n<=1) return n;
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] =1;
		for(int i =2; i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		return dp[n];
	} */
	
	//Optimized Space Approach:
	public int fibOpt(int n) {
	    if (n <= 1) return n;
	    int a = 0, b = 1;
	    for (int i = 2; i <= n; i++) {
	        int c = a + b;
	        a = b;
	        b = c;
	    }
	    return b;
	}
	// Time: O(n), Space: O(1)
	
	 public static void main(String[] args) {
		 Tabulation_Approach fibCalc = new Tabulation_Approach();
	        int n = 10; // You can change this value for testing
	      //  System.out.println("Fibonacci number at position " + n + " is: " + fibCalc.fibTabulation(n));
	        System.out.println("Fibonacci number at position " + n + " is: " + fibCalc.fibOpt(n));
	   }
}




