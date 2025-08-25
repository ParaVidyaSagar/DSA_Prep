package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsPhone {

    // Map of digits to letters
    static String[] mapping = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    static List<String> result = new ArrayList<>();

    static void backtrack(String digits, int index, String current) {
        // Base case: when we reach end of digits
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters for current digit
        String letters = mapping[digits.charAt(index) - '0'];

        // Try all possibilities
        for (char c : letters.toCharArray()) {
            backtrack(digits, index + 1, current + c);
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return result;
        backtrack(digits, 0, "");
        return result;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combos = letterCombinations(digits);

        System.out.println("Digits: " + digits);
        System.out.println("Combinations: " + combos);
    }
}
