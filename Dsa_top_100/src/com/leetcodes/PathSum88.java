package com.leetcodes;

public class PathSum88 {
	static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;

	    TreeNode() {}
	    TreeNode(int val) { this.val = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	    }
	}

	static class Solution {
	    public boolean hasPathSum(TreeNode root, int targetSum) {
	        if (root == null) return false;

	        // If it's a leaf node
	        if (root.left == null && root.right == null) {
	            return root.val == targetSum;
	        }

	        // Recurse on left and right
	        int remainingSum = targetSum - root.val;

	        return hasPathSum(root.left, remainingSum) ||
	               hasPathSum(root.right, remainingSum);
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1)))
        );

        int targetSum = 22;
        System.out.println("Has path sum = " + targetSum + "? " + sol.hasPathSum(root, targetSum)); // true
    }
}
