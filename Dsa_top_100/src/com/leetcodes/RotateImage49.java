package com.leetcodes;

import java.util.Arrays;

public class RotateImage49 {
	public static class Solution {

	    public void rotate(int[][] matrix) {
	        int n = matrix.length;

	        // Step 1: Transpose the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        // Step 2: Reverse each row
	        for (int[] row : matrix) {
	            int left = 0, right = n - 1;
	            while (left < right) {
	                int tmp = row[left];
	                row[left] = row[right];
	                row[right] = tmp;
	                left++;
	                right--;
	            }
	        }
	    }

	    // Utility to print the matrix
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        solution.rotate(matrix);

	        System.out.println("\nRotated Matrix (90 degrees clockwise):");
	        printMatrix(matrix);
	    }
	}
}
