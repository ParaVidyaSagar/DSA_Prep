package com.leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView89 {
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
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        if (root == null) return result;

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            int levelSize = queue.size();
	            TreeNode rightmost = null;

	            for (int i = 0; i < levelSize; i++) {
	                TreeNode curr = queue.poll();
	                rightmost = curr;

	                if (curr.left != null) queue.offer(curr.left);
	                if (curr.right != null) queue.offer(curr.right);
	            }

	            // Add the last node in this level (rightmost one)
	            if (rightmost != null)
	                result.add(rightmost.val);
	        }

	        return result;
	    }
	}
	public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(5)),
            new TreeNode(3, null, new TreeNode(4))
        );

        List<Integer> view = sol.rightSideView(root);
        System.out.println("Right Side View: " + view); // [1, 3, 4]
    }
}
