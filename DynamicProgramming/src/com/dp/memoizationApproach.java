package com.dp;

public class memoizationApproach {
	
	//Public method to initiate memoized Fibonacci calculation
	public int fibMemo(int n) {
		return fibMemo(n, new Integer[n+1]);
			
		}
	
	//// Private helper method with memoization
	private int fibMemo(int n, Integer[] memo) {
		if(n <= 1) return n;
		if(memo[n] != null) return memo[n];
		memo[n] = fibMemo(n-1, memo)+fibMemo(n-2,memo);
		return memo[n];
	}
	
	//main method
	public static void main(String[] args) {
		memoizationApproach fibMemo = new memoizationApproach();
		int n = 10;
		System.out.println("Fibonacci number at position " + n + " is: " + fibMemo.fibMemo(n));
	}

}



