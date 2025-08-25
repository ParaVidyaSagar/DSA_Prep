package com.practice;

public class PrintAllSubsetsOfArray {
	static void printSubsets(int[] arr, int index, String current) {
		// Base case: reached end of array
		if (index == arr.length) {
			System.out.println(current);
			return;
		}

		// Choice 1: Exclude current element
		printSubsets(arr, index + 1, current);

		// Choice 2: Include current element
		printSubsets(arr, index + 1, current + arr[index] + " ");
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println("All subsets:");
		printSubsets(arr, 0, "");
	}
}
