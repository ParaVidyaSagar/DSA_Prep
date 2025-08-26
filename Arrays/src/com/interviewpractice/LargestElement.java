package com.interviewpractice;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 9, 12, 78, 0, 85 };
		int largestElemnt = findLargestElement(arr);
		System.out.println("The largest element = " + largestElemnt);
	}

	static int findLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}

		}
		return max;

	}
}
