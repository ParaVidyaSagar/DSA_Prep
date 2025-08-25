package com.practice;

public class PhoneDigitCombinations {
	static String[] mapping = { "", // 0
			"", // 1
			"abc", // 2
			"def", // 3
			"ghi", // 4
			"jkl", // 5
			"mno", // 6
			"pqrs", // 7
			"tuv", // 8
			"wxyz" // 9
	};

	static void printCombinations(String digits, int index, String current) {
		// Base case: reached end
		if (index == digits.length()) {
			System.out.println(current);
			return;
		}

		// Get letters for this digit
		String letters = mapping[digits.charAt(index) - '0'];

		// Recurse for each possible letter
		for (char ch : letters.toCharArray()) {
			printCombinations(digits, index + 1, current + ch);
		}
	}

	public static void main(String[] args) {
		String digits = "23";
		System.out.println("All combinations:");
		printCombinations(digits, 0, "");
	}

}
