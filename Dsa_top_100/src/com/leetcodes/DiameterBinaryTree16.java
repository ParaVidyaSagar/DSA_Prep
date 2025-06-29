package com.leetcodes;
/*
   Input: root = [1,2,3,4,5]

        1
       / \
      2   3
     / \     
    4   5    

Output: 3  
Explanation: Path = 4 → 2 → 1 → 3 or 5 → 2 → 1 → 3
 */
public class DiameterBinaryTree16 {
 static class TreeNode {
	 int val;
	 TreeNode left, right;
	 
	 TreeNode(int val){
		 this.val = val;
	 }
 }
 
 static class Solution{
	 private int maxDiameter = 0;
	 public int diameterOfBinaryTree(TreeNode root) {
		 Dfs(root);
		 return maxDiameter;
	 }
	 
	 private int Dfs(TreeNode node) {
		 if(node == null) return 0;
		 int left = Dfs(node.left);
		 int right = Dfs(node.right);
		 maxDiameter = Math.max(maxDiameter, left+right);
		 return Math.max(left, right)+1;  // adding 1 is adding root node
	 }
	 
	 public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
            Solution sol = new Solution();
            System.out.println("Diameter of the tree: " + sol.diameterOfBinaryTree(root));
	}
 }
}
