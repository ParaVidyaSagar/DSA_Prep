package com.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorder87 {
	static public class TreeNode {
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
	    private Map<Integer, Integer> inorderIndexMap;

	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	        inorderIndexMap = new HashMap<>();

	        // Build a hashmap for quick index lookup
	        for (int i = 0; i < inorder.length; i++) {
	            inorderIndexMap.put(inorder[i], i);
	        }

	        return build(
	            inorder, 0, inorder.length - 1,
	            postorder, 0, postorder.length - 1
	        );
	    }

	    private TreeNode build(
	        int[] inorder, int inStart, int inEnd,
	        int[] postorder, int postStart, int postEnd
	    ) {
	        if (inStart > inEnd || postStart > postEnd) return null;

	        int rootVal = postorder[postEnd];
	        TreeNode root = new TreeNode(rootVal);

	        int rootIndex = inorderIndexMap.get(rootVal);
	        int leftTreeSize = rootIndex - inStart;

	        root.left = build(
	            inorder, inStart, rootIndex - 1,
	            postorder, postStart, postStart + leftTreeSize - 1
	        );

	        root.right = build(
	            inorder, rootIndex + 1, inEnd,
	            postorder, postStart + leftTreeSize, postEnd - 1
	        );

	        return root;
	    }
	}
	
	 public static void main(String[] args) {
	        Solution sol = new Solution();

	        int[] inorder =   {9, 3, 15, 20, 7};
	        int[] postorder = {9, 15, 7, 20, 3};

	        TreeNode root = sol.buildTree(inorder, postorder);

	        System.out.print("Inorder Traversal of Constructed Tree: ");
	        printInOrder(root); // Should match the original inorder
	    }

	    // Utility method to print inorder traversal
	    static void printInOrder(TreeNode node) {
	        if (node == null) return;
	        printInOrder(node.left);
	        System.out.print(node.val + " ");
	        printInOrder(node.right);
	    }
}
