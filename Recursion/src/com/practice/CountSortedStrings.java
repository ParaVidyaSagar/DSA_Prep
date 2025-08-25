package com.practice;

public class CountSortedStrings {
	public static int countVowelStrings(int n) {
        return helper(n, 0); // start with vowel index=0 (a)
    }

    private static int helper(int n, int vowelIndex) {
        if (n == 0) return 1; // formed a valid string
        if (vowelIndex == 5) return 0; // no more vowels

        // Two choices:
        // 1. Use this vowel and stay here (can reuse same or higher vowel)
        // 2. Move to next vowel
        return helper(n - 1, vowelIndex)   // pick current vowel
             + helper(n, vowelIndex + 1); // skip to next vowel
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(2)); // Example
    }
}
