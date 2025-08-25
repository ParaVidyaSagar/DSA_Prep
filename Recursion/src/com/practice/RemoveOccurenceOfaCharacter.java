package com.practice;

public class RemoveOccurenceOfaCharacter {

	public static void main(String[] args) {
		String input = "banana";
		char ch = 'a';
		String output = removeChar(input, ch);
		System.out.println("Original: " + input);
		System.out.println("After removing '" + ch + "': " + output);
	}

	static String removeChar(String str, char ch) {
		// Base case: if string is empty
		if (str.isEmpty()) {
			return " ";
		}
		// process first character
		char first = str.charAt(0);
		if (first == ch) {
			// skip this character , check first
			return removeChar(str.substring(1), ch);
		} else {
			// keep this character, add recursion result
			return first + removeChar(str.substring(1), ch);
		}
	}
}
