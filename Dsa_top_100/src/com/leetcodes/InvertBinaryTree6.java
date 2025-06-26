package com.leetcodes;

public class InvertBinaryTree6 {
	
	//Definition of a binary tree node
	//226.https://leetcode.com/problems/invert-binary-tree/description/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){ }
		
		TreeNode(int val){
			this.val = val;	
		}
		
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
			
		}
	}
	
	static class Solution{
		public TreeNode invertTree(TreeNode root) {
			if(root == null) {
				return root;
			}
			TreeNode left = invertTree(root.left);
			TreeNode right = invertTree(root.right);
			root.left = right;
			root.right = left;
			return root;
			}
		}
	
	public static void main(String[] args) {
		  /*
        Original Tree:
                4
               / \
              2   7
             / \ / \
            1  3 6  9

        Expected Output after invert:
                4
               / \
              7   2
             / \ / \
            9  6 3  1
    */

    // Construct original binary tree
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        System.out.println("Original Tree (Inorder):");
        printInOrder(root);
        Solution solution = new Solution();
        TreeNode invertedRoot = solution.invertTree(root);

        System.out.println("\n\nInverted Tree (Inorder):");
        printInOrder(invertedRoot);
		
	}
	 // Helper method to print tree in inorder traversal
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
}
}
