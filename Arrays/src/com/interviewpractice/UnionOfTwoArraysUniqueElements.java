package com.interviewpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArraysUniqueElements {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 2, 3, 4 };
		System.out.println(Arrays.toString(findUnion(arr1, arr2)));
	}

	public static int[] findUnion(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		// Add all elements from both arrays
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			set.add(num);
		}

		// Convert set to array
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}
		return result;
	}

}
