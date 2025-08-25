package com.practice;

public class SumOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int sum = findSum(arr, n);
		System.out.println("Sum of array elements: " + sum);
	}

	static int findSum(int[] arr, int n) {
		// Base case: if array has only one element
		if (n == 1) {
			return arr[0];
		}
		// Recursive case: sum of first n elements =
		// last element + sum of first (n-1) elements
		return arr[n - 1] + findSum(arr, n - 1);
	}

}
