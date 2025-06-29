package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {
  static class TreeNode{
	  int data;
	  TreeNode left;
	  TreeNode right;
	  public TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
		}
	  public TreeNode(int data, TreeNode left, TreeNode right) {
		  this.data = data;
		  this.left = left;
		  this.right = right;
	  }
	  
	  
  }
  
  static class BinaryTree{
	  TreeNode root;
	  public BinaryTree() {
		  root = null;
	  }
	  
	  //Tree traversal methods
	  public void preOrder(TreeNode node) {
		  if(node == null) return;
		  System.out.print(node.data + " ");
		  preOrder(node.left);
		  preOrder(node.right);
	  }
	  
	  public void inOrder(TreeNode node) {
		  if(node == null) return;
		  inOrder(node.left);
		  System.out.print(node.data+ " ");
		  inOrder(node.right);
	  }
	  public void postOrder(TreeNode node) {
		  if(node == null) return;
		  postOrder(node.left);
		  postOrder(node.right);
		  System.out.print(node.data+" ");
	  }
	  public void levelOrder() {
		  if(root == null) return;
		  Queue<TreeNode> queue = new LinkedList<>();
		  queue.add(root);
		  
		  while(!queue.isEmpty()) {
			  TreeNode current = queue.poll();
			  System.out.print(current.data+" ");
			  if(current.left != null) queue.add(current.left);
			  if(current.right != null) queue.add(current.right);
		  }
	  }
  }
  
  public static void main(String[] args) {
	  BinaryTree tree = new BinaryTree();
      tree.root = new TreeNode(1);
      tree.root.left = new TreeNode(2);
      tree.root.right = new TreeNode(3);
      tree.root.left.left = new TreeNode(4);
      tree.root.left.right = new TreeNode(5);
      System.out.println("Pre-order traversal:");
      tree.preOrder(tree.root);
      System.out.println("\nIn-order traversal:");
      tree.inOrder(tree.root);
      System.out.println("\nPost-order traversal:");
      tree.postOrder(tree.root);
      System.out.println("\nLevel-order traversal:");
      tree.levelOrder();
}
}
