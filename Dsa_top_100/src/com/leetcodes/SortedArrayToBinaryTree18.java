package com.leetcodes;
/*
 * Input: nums = [-10, -3, 0, 5, 9]

Output:
       0
      / \
    -3   9
   /     /
 -10   5
 */
public class SortedArrayToBinaryTree18 {
    //TreeNode definition
	static class TreeNode{
		int val;
		TreeNode left,right;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	static class Solution{
		public TreeNode sortedArrayToBinaryTree(int[] nums){
			return buildBST(nums, 0, nums.length-1);
		}
		
		private TreeNode buildBST(int[] nums, int left, int right) {
			if(left > right) return null;
			int mid = left+(right-left)/2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = buildBST(nums, left, mid-1);
			root.right = buildBST(nums, mid+1, right);
			return root;
		}
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {-10,-3,0,5,9};
		TreeNode root = solution.sortedArrayToBinaryTree(nums);
		System.out.println("Inorder Traversal of BST: ");
		printInOrder(root); // Should print in sorted order
	}
	
	public static void printInOrder(TreeNode root) {
		if(root == null) return;
		printInOrder(root.left);
		System.out.print(root.val+" ");
		printInOrder(root.right);
	}
}
