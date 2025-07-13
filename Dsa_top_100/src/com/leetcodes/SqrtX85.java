package com.leetcodes;

public class SqrtX85 {
	static class Solution {
	    public int mySqrt(int x) {
	        if (x == 0 || x == 1) return x;

	        int left = 1, right = x;
	        int result = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if ((long) mid * mid <= x) {
	                result = mid;
	                left = mid + 1; // Try to go higher
	            } else {
	                right = mid - 1; // Go lower
	            }
	        }

	        return result;
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int x1 = 8;
        int x2 = 16;
        int x3 = 1;

        System.out.println("Sqrt of " + x1 + " = " + sol.mySqrt(x1)); // 2
        System.out.println("Sqrt of " + x2 + " = " + sol.mySqrt(x2)); // 4
        System.out.println("Sqrt of " + x3 + " = " + sol.mySqrt(x3)); // 1
    }
}
