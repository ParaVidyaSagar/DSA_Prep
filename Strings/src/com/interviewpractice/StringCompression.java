package com.interviewpractice;

public class StringCompression {
	public static void main(String[] args) {
		String input = "aaabbccc";
		String compressed = compressedString(input);
		System.out.println(compressed);
	}

	static String compressedString(String s) {
		if (s == null || s.isEmpty())
			return "";
		StringBuilder result = new StringBuilder();
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;

			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1; // reset count
			}
		}
		// Append last character and its count
		result.append(s.charAt(s.length()-1)).append(count);
		return result.toString();
	}
}
