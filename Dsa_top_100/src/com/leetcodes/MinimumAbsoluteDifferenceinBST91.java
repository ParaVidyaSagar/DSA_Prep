package com.leetcodes;

public class MinimumAbsoluteDifferenceinBST91 {
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
	    private Integer prev = null;
	    private int minDiff = Integer.MAX_VALUE;

	    public int getMinimumDifference(TreeNode root) {
	        inorder(root);
	        return minDiff;
	    }

	    private void inorder(TreeNode node) {
	        if (node == null) return;

	        inorder(node.left);

	        if (prev != null) {
	            minDiff = Math.min(minDiff, node.val - prev);
	        }
	        prev = node.val;

	        inorder(node.right);
	    }
	}
	
	public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(6)
        );

        System.out.println("Minimum Absolute Difference: " + sol.getMinimumDifference(root));
        // Output: 1
    }
}
