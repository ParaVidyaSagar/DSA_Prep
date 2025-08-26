package com.interviewpractice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				// First and last elements are always 1
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					// Sum of two numbers from previous row
					row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
				}
			}
			triangle.add(row);
		}

		return triangle;
	}

	public static void main(String[] args) {
		int n = 5;
		List<List<Integer>> result = generate(n);

		for (List<Integer> row : result) {
			System.out.println(row);
		}
	}
}
