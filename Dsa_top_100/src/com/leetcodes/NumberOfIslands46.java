package com.leetcodes;

public class NumberOfIslands46 {

    public static class Solution {

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) return 0;

            int numIslands = 0;
            int rows = grid.length;
            int cols = grid[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '1') {
                        numIslands++;
                        dfs(grid, i, j);
                    }
                }
            }

            return numIslands;
        }

        private void dfs(char[][] grid, int i, int j) {
            int rows = grid.length;
            int cols = grid[0].length;

            if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') return;

            grid[i][j] = '0';

            dfs(grid, i + 1, j); // down
            dfs(grid, i - 1, j); // up
            dfs(grid, i, j + 1); // right
            dfs(grid, i, j - 1); // left
        }
    }

    // Move copyGrid outside Solution so main() can access it
    public static char[][] copyGrid(char[][] original) {
        char[][] copy = new char[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, original[0].length);
        }
        return copy;
    }

    // Main method for local testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands in grid1: " + solution.numIslands(copyGrid(grid1))); // 1
        System.out.println("Number of islands in grid2: " + solution.numIslands(copyGrid(grid2))); // 3
    }
}
