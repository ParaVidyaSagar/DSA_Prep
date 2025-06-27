package com.binaryTree;

/*
🌳 Depth-First Search (DFS) in Trees
DFS explores as far as possible along each branch before backtracking.

Types of DFS Traversals:

Preorder (Node → Left → Right)

Inorder (Left → Node → Right) → Only for Binary Trees

Postorder (Left → Right → Node)
*/
public class DFS {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class DFSTree {
        public void preOrder(TreeNode root) {
            if (root == null) return;
            System.out.print(root.val + " "); // process current node
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(TreeNode root) {
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.val + " "); // process current node
            inOrder(root.right);
        }

        public void postOrder(TreeNode root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " "); // process current node
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            DFSTree dfs = new DFSTree();
            
            System.out.print("Preorder: ");
            dfs.preOrder(root); // Output: 1 2 4 5 3
            System.out.println();
            
            System.out.print("Inorder: ");
            dfs.inOrder(root); // Output: 4 2 5 1 3
            System.out.println();
            
            System.out.print("Postorder: ");
            dfs.postOrder(root); // Output: 4 5 2 3 1
        }
    }
}