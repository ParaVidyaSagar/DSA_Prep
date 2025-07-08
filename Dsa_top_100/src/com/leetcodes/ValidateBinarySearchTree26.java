package com.leetcodes;

public class ValidateBinarySearchTree26 {
  static class TreeNode{
	  int val;
	  TreeNode left, right;
	  TreeNode(int val){
		  this.val = val;
		  
	  }
  }
  
  static class Solution{
	  public boolean isValidBST(TreeNode root) {
		  return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
		  
			  
		  }
	  
	  private boolean validate(TreeNode node, long min, long max) {
		  if(node == null ) return true;
		  if(node.val <= min || node.val >= max) return false;
		  
		  return validate(node.left, min, node.val) && validate(node.right, node.val,max);
	  }
  }
  
  public static void main(String[] args) {
	Solution sol = new Solution();
	
	// Valid BST
	TreeNode root = new TreeNode(2);
	root.left = new TreeNode(1);
	root.right = new TreeNode(3);
	
	System.out.println("Is valid BST: "+sol.isValidBST(root));
	
	//Invalid BST
	TreeNode invalid = new TreeNode(5);
	invalid.left = new TreeNode(1);
    invalid.right = new TreeNode(4);
    invalid.right.left = new TreeNode(3);
    invalid.right.right = new TreeNode(6);

    System.out.println("Is valid BST: " + sol.isValidBST(invalid)); // Output: false
}
  
}
