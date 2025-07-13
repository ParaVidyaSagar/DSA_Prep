package com.leetcodes;

public class WordSearch59 {
	public static class Solution {

	    public boolean exist(char[][] board, String word) {
	        int rows = board.length;
	        int cols = board[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (dfs(board, i, j, word, 0)) return true;
	            }
	        }

	        return false;
	    }

	    private boolean dfs(char[][] board, int i, int j, String word, int index) {
	        if (index == word.length()) return true;

	        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
	            board[i][j] != word.charAt(index)) return false;

	        char temp = board[i][j];
	        board[i][j] = '#'; // mark visited

	        boolean found = dfs(board, i + 1, j, word, index + 1) ||
	                        dfs(board, i - 1, j, word, index + 1) ||
	                        dfs(board, i, j + 1, word, index + 1) ||
	                        dfs(board, i, j - 1, word, index + 1);

	        board[i][j] = temp; // backtrack
	        return found;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        char[][] board = {
	            {'A','B','C','E'},
	            {'S','F','C','S'},
	            {'A','D','E','E'}
	        };

	        String word1 = "ABCCED"; // true
	        String word2 = "SEE";    // true
	        String word3 = "ABCB";   // false

	        System.out.println("Exists (ABCCED)? " + solution.exist(board, word1));
	        System.out.println("Exists (SEE)? " + solution.exist(board, word2));
	        System.out.println("Exists (ABCB)? " + solution.exist(board, word3));
	    }
	}

}
