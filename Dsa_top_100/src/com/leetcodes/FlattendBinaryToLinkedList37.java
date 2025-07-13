package com.leetcodes;

public class FlattendBinaryToLinkedList37 {
	static class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int x){
			val = x;
		}
	}
	
	static class Solution{
		private TreeNode prev = null;
		public void flatten(TreeNode root) {
			if(root == null) return;
			flatten(root.right);// Flatten right subtree
			flatten(root.left);// Flatten left subtree
			root.right = prev;  // Connect current node to previously visited node
			root.left = null; // Set left to null (as required)
			prev = root;  // Update prev to current
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		 // Construct the binary tree
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right =new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		 root.right.right = new TreeNode(6);
		 sol.flatten(root);
		// Print the flattened tree (right-skewed)
		 TreeNode curr = root;
		 while (curr != null) {
	            System.out.print(curr.val + " ");
	            curr = curr.right;
	        }
	        // Output: 1 2 3 4 5 6
		 /*
		  
		1
       / \
      2   5
     / \   \
    3   4   6
    
   
    
		  */
	}

}
