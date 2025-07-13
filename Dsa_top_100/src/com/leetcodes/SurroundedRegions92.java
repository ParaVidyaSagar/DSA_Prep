package com.leetcodes;

import java.util.Arrays;

public class SurroundedRegions92 {
	static class Solution {
	    public void solve(char[][] board) {
	        int rows = board.length;
	        if (rows == 0) return;
	        int cols = board[0].length;

	        // Step 1: Mark all border-connected 'O's with temporary symbol '#'
	        for (int i = 0; i < rows; i++) {
	            dfs(board, i, 0);
	            dfs(board, i, cols - 1);
	        }
	        for (int j = 0; j < cols; j++) {
	            dfs(board, 0, j);
	            dfs(board, rows - 1, j);
	        }

	        // Step 2: Flip all remaining 'O' to 'X' (they are surrounded)
	        // And revert '#' back to 'O'
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (board[i][j] == 'O') board[i][j] = 'X';
	                else if (board[i][j] == '#') board[i][j] = 'O';
	            }
	        }
	    }

	    private void dfs(char[][] board, int i, int j) {
	        int rows = board.length;
	        int cols = board[0].length;

	        if (i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] != 'O')
	            return;

	        board[i][j] = '#'; // Temporarily mark as safe

	        dfs(board, i + 1, j);
	        dfs(board, i - 1, j);
	        dfs(board, i, j + 1);
	        dfs(board, i, j - 1);
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        sol.solve(board);

        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
        // Expected Output:
        // [X, X, X, X]
        // [X, X, X, X]
        // [X, X, X, X]
        // [X, O, X, X]
    }
}
