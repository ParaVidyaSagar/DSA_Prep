package com.leetcodes;

public class BitwiseAndNumbersOfRange82 {
	static class Solution {
	    public int rangeBitwiseAnd(int left, int right) {
	        int shift = 0;

	        // Find the common leftmost bits
	        while (left < right) {
	            left >>= 1;
	            right >>= 1;
	            shift++;
	        }

	        // Shift back to original position
	        return left << shift;
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        int left = 5, right = 7;
        System.out.println("Bitwise AND from " + left + " to " + right + ": " + sol.rangeBitwiseAnd(left, right));
        // Output: 4
    }
}
