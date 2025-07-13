package com.leetcodes;

public class MaximalSquare43 {
  static class Solution{
	  public int maximalSquare(char[][] matrix) {
		  if(matrix == null || matrix.length == 0) return 0;
		  int rows = matrix.length, cols = matrix[0].length;
		  int[][] dp = new int[rows+1] [cols+1]; // Extra row & column to avoid boundary checks
          int maxLen = 0;
          for(int i =1; i <= rows; i++ ) {
        	  for(int j =1; j<= cols; j++) {
        		  if(matrix[i-1][j-1] == '1') {
        			  dp[i][j] = 1+Math.min(
        			  Math.min(dp[i-1][j], dp[i][j-1]),		  
        			  dp[i-1][j-1]);
        			  
        			  maxLen = Math.max(maxLen, dp[i][j]);
        		  }
        	  }
          }
          return maxLen * maxLen;// Return area
}
  }
  
  public static void main(String[] args) {
	  Solution solution = new Solution();

      char[][] matrix1 = {
          {'1', '0', '1', '0', '0'},
          {'1', '0', '1', '1', '1'},
          {'1', '1', '1', '1', '1'},
          {'1', '0', '0', '1', '0'}
      };

      char[][] matrix2 = {
          {'0', '1'},
          {'1', '0'}
      };

      char[][] matrix3 = {
          {'0'}
      };

      System.out.println("Maximal square area (matrix1): " + solution.maximalSquare(matrix1)); // Output: 4
      System.out.println("Maximal square area (matrix2): " + solution.maximalSquare(matrix2)); // Output: 1
      System.out.println("Maximal square area (matrix3): " + solution.maximalSquare(matrix3)); // Output: 0
 
}
}
