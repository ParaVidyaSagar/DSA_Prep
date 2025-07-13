package com.leetcodes;

public class Pow86 {
	static class Solution {
	    public double myPow(double x, int n) {
	        long N = n; // Use long to handle Integer.MIN_VALUE

	        if (N < 0) {
	            x = 1 / x;
	            N = -N;
	        }

	        return fastPow(x, N);
	    }

	    private double fastPow(double x, long n) {
	        if (n == 0) return 1.0;

	        double half = fastPow(x, n / 2);
	        if (n % 2 == 0)
	            return half * half;
	        else
	            return half * half * x;
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println("2^10 = " + sol.myPow(2.0, 10));    // 1024.0
        System.out.println("2^-2 = " + sol.myPow(2.0, -2));    // 0.25
        System.out.println("3^0 = " + sol.myPow(3.0, 0));      // 1.0
    }
}
