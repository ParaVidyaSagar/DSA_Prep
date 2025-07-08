package com.leetcodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrder34 {
   
	 // TreeNode class definition
	static class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	 // Solution class with zigzagLevelOrder method
	static class Solution{
		public List<List<Integer>> zigzagLevelOrder(TreeNode root){
			List<List<Integer>> result = new ArrayList<>();
			if(root == null) return result;
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			boolean leftToRight = true;
			while(!queue.isEmpty()) {
				int levelSize = queue.size();
				LinkedList<Integer> level = new LinkedList<>();
				
				for(int i =0; i < levelSize; i++) {
					TreeNode node = queue.poll();
					if(leftToRight) {
						level.addLast(node.val);// left to right
						
					}else {
						level.addFirst(node.val); // right to left
					}
					
					if(node.left != null) queue.offer(node.left);
					if(node.right != null) queue.offer(node.right);
				}
				
				result.add(level);
				leftToRight = !leftToRight;
			}
			return result;
		}
	}
	 // Main method to test
	public static void main(String[] args) {
		/*
        Tree:
             3
            / \
           9  20
              / \
             15  7

       Expected Output: [[3], [20, 9], [15, 7]]
   */
	TreeNode root = new TreeNode(3);
	root.left = new TreeNode(9);
	root.right = new TreeNode(20);
	root.right.left = new TreeNode(15);
	root.right.right = new TreeNode(7);
	
	Solution sol = new Solution();
	List<List<Integer>> result = sol.zigzagLevelOrder(root);
	System.out.println("Zigzag Level Order Traversal:");
     for (List<Integer> level:result) {
    	 System.out.println(level);
     }
	}
}
