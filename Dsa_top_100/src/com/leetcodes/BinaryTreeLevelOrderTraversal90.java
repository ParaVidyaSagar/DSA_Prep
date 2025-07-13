package com.leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal90 {
	
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
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> result = new ArrayList<>();
	        if (root == null) return result;

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            int levelSize = queue.size(); // Number of nodes at current level
	            List<Integer> currentLevel = new ArrayList<>();

	            for (int i = 0; i < levelSize; i++) {
	                TreeNode curr = queue.poll();
	                currentLevel.add(curr.val);

	                if (curr.left != null) queue.offer(curr.left);
	                if (curr.right != null) queue.offer(curr.right);
	            }

	            result.add(currentLevel);
	        }

	        return result;
	    }
	}
	
	public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        List<List<Integer>> result = sol.levelOrder(root);
        System.out.println("Level Order Traversal: " + result);
        // Output: [[3], [9, 20], [15, 7]]
    }
}
