package com.practice;

public class LastIndexofElement {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 8, 9 };
		int x = 3;
		int ans = findLastIndex(arr, arr.length - 1, x);
		System.out.println("Last index of " + x + " is: " + ans);
	}

	static int findLastIndex(int[] arr, int index, int x) {
		// Base case: if index becomes negative
		if (index < 0) {
			return -1;
		}
		// If current element matches x, return this index
		if (arr[index] == x) {
			return index;
		}
		// Else recursively check previous index
		return findLastIndex(arr, index - 1, x);
	}
}
