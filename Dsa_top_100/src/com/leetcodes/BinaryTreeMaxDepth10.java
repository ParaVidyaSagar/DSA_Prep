package com.leetcodes;

public class BinaryTreeMaxDepth10 {
   //Defintion of a binary tree
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
			
		}
	
	
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right =right;
	}
	}
	
	static class Solution{
		public int maxDepth(TreeNode root) {
			if(root == null) return 0;
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			return Math.max(leftDepth, rightDepth)+1;
		}
	}
	
	
	public static void main(String[] args) {
		 /*
        Example tree:
                1
               / \
              2   3
             / \
            4   5
        Expected max depth = 3
    */
	TreeNode root = new TreeNode(1);
	root.left =  new TreeNode(2, new TreeNode(4), new TreeNode(5));
	root.right = new TreeNode(3);
	 Solution solution = new Solution();
     int depth = solution.maxDepth(root);	
     System.out.println("Maximum Depth of the Binary Tree: " + depth);
	}
}
