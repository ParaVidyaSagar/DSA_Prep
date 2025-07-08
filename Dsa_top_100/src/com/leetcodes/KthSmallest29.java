package com.leetcodes;

public class KthSmallest29 {
 static class TreeNode{
	 int val;
	 TreeNode left, right;
	 TreeNode(int val){
		 this.val = val; 
	 }
	
	 static class Solution {
		 private int count = 0;
		 private int result = -1;
		
		 public int kthSmallest(TreeNode root, int k) {
			 inorder(root, k);
			 return result;
		 }
		private void inorder(TreeNode node, int k) {
			if(node == null) return;
			inorder(node.left, k);
			count++;
			if(count == k) {
				result = node.val;
				return;
			}
			inorder(node.right, k);
		}
		 
	 }
	 
	 public static void main(String[] args) {
			Solution sol = new Solution();
			/*
            3
           / \
          1   4
           \
            2
      */
			TreeNode root = new TreeNode(3);
	        root.left = new TreeNode(1);
	        root.right = new TreeNode(4);
	        root.left.right = new TreeNode(2);

	        System.out.println("Kth Smallest (k=1): " + sol.kthSmallest(root, 1)); // Output: 1
	    	
		}
 
 }
}
