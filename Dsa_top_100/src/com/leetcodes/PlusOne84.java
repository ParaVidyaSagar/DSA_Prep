package com.leetcodes;

import java.util.Arrays;

public class PlusOne84 {
	// Leetcode-style Solution class
    static class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] input1 = {1, 2, 3};
        int[] input2 = {9, 9, 9};
        int[] input3 = {4, 3, 2, 1};

        System.out.println("Input: [1, 2, 3] → Output: " + Arrays.toString(sol.plusOne(input1)));
        System.out.println("Input: [9, 9, 9] → Output: " + Arrays.toString(sol.plusOne(input2)));
        System.out.println("Input: [4, 3, 2, 1] → Output: " + Arrays.toString(sol.plusOne(input3)));
    }
}
