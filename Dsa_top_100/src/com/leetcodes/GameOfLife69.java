package com.leetcodes;

import java.util.Arrays;

public class GameOfLife69 {
	 public static class Solution {
	        public void gameOfLife(int[][] board) {
	            int m = board.length;
	            int n = board[0].length;

	            int[][] directions = {
	                {0, 1}, {1, 0}, {-1, 0}, {0, -1},
	                {1, 1}, {-1, -1}, {1, -1}, {-1, 1}
	            };

	            for (int i = 0; i < m; i++) {
	                for (int j = 0; j < n; j++) {
	                    int liveNeighbors = 0;
	                    for (int[] dir : directions) {
	                        int x = i + dir[0], y = j + dir[1];
	                        if (x >= 0 && x < m && y >= 0 && y < n && Math.abs(board[x][y]) == 1) {
	                            liveNeighbors++;
	                        }
	                    }

	                    if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
	                        board[i][j] = -1;
	                    }
	                    if (board[i][j] == 0 && liveNeighbors == 3) {
	                        board[i][j] = 2;
	                    }
	                }
	            }

	            for (int i = 0; i < m; i++) {
	                for (int j = 0; j < n; j++) {
	                    board[i][j] = board[i][j] > 0 ? 1 : 0;
	                }
	            }
	        }
	    }

	    public static void printBoard(int[][] board) {
	        for (int[] row : board) {
	            System.out.println(Arrays.toString(row));
	        }
	    }

	    public static void main(String[] args) {
	        Solution sol = new Solution();

	        int[][] board = {
	            {0, 1, 0},
	            {0, 0, 1},
	            {1, 1, 1},
	            {0, 0, 0}
	        };

	        System.out.println("Before:");
	        printBoard(board);

	        sol.gameOfLife(board);

	        System.out.println("After:");
	        printBoard(board);
	    }
}
