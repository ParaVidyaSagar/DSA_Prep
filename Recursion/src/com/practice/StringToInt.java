package com.practice;

public class StringToInt {
	public static void main(String[] args) {
		String input = "1234";
		int result = stringToInt(input);
		System.out.println("String: " + input);
		System.out.println("Integer: " + result);
	}

	static int stringToInt(String str) {
		// Base case: if string length is 1, return single digit
		if (str.length() == 1) {
			return str.charAt(0) - '0';
		}

		// Recursive Step
		int smallAns = stringToInt(str.substring(0, str.length() - 1));
		int lastDigit = str.charAt(str.length() - 1) - '0';

		// Combine result: shift previous digits left (×10) + last digit
		return smallAns * 10 + lastDigit;
	}

}
