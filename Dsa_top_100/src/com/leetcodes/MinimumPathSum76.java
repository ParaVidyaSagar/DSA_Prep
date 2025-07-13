package com.leetcodes;

public class MinimumPathSum76 {
	public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Initialize first row
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        // Initialize first column
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // DP computation
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
    	MinimumPathSum76 sol = new MinimumPathSum76();

        int[][] grid1 = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        int[][] grid2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Min Path Sum (grid1): " + sol.minPathSum(grid1)); // Output: 7
        System.out.println("Min Path Sum (grid2): " + sol.minPathSum(grid2)); // Output: 12
    }
}
