package com.leetcodes;

import java.util.Arrays;

public class SetMatrixZeros31 {
 public static void main(String[] args) {
	 Solution sol = new Solution();
	 int[][] matrix = {
			 {1,2,3},
			 {4,0,6},
			 {7,8,9}
	 };
	 System.out.println("Original Matrix:");
	 printMatrix(matrix);
	 sol.setZeros(matrix);
	 System.out.println("\nMatrix After setZeros: ");
	 printMatrix(matrix);
}
 public static void printMatrix(int[][] matrix) {
	 for (int[] row : matrix) {
         System.out.println(Arrays.toString(row));
     }
 }
  static class Solution{
	  public void setZeros(int[][] matrix) {
		  int m = matrix.length;
		  int n = matrix[0].length;
		  boolean firstRowZero = false, firstColZero = false;
		  
		  // Check first row for zero
		  for(int j = 0; j<n;j++) {
			  if(matrix[0][j]==0) firstRowZero = true;
		  }
		// Check first column for zero
		  for(int i =0; i<m;i++) {
			  if(matrix[i][0]==0) firstColZero = true;
		  }
		  
		// Use first row and column as markers
       for(int i =1; i<m;i++) {
    	   for(int j = 1; j <n; j++) {
    		   if(matrix[i][j]==0) {
    			   matrix[i][0] =0;
    			   matrix[0][j] = 0;
    		   }
    	   }
       }
       // Set cells to 0 using markers 
       for(int i = 1; i<m;i++) {
    	   for(int j = 1; j<n;j++) {
    		   if(matrix[i][0]==0 || matrix[0][j]==0) {
    			   matrix[i][j] = 0;
    		   }
    	   }
       }
    // Set first row to 0 if needed
       if(firstRowZero) {
    	   for (int j = 0; j < n; j++) matrix[0][j] = 0; 
       }
    // Set first column to 0 if needed
       if (firstColZero) {
           for (int i = 0; i < m; i++) matrix[i][0] = 0;
       }
	  }
  }
  
  
}
