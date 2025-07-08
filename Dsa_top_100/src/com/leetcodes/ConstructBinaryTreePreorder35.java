package com.leetcodes;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorder35 {

    // ✅ Make TreeNode static so it can be used in static context
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // ✅ Static Solution class
    static class Solution {
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                inorderIndexMap.put(inorder[i], i);
            }
            return build(preorder, 0, preorder.length - 1, 0);
        }

        private TreeNode build(int[] preorder, int preStart, int preEnd, int inStart) {
            if (preStart > preEnd) return null;

            int rootVal = preorder[preStart];
            TreeNode root = new TreeNode(rootVal);

            int inIndex = inorderIndexMap.get(rootVal);
            int leftSize = inIndex - inStart;

            root.left = build(preorder, preStart + 1, preStart + leftSize, inStart);
            root.right = build(preorder, preStart + leftSize + 1, preEnd, inIndex + 1);

            return root;
        }
    }

    // ✅ main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = sol.buildTree(preorder, inorder);

        System.out.print("Inorder Traversal of constructed tree: ");
        printInOrder(root); // Expected: 9 3 15 20 7
    }

    // ✅ Helper method to print inorder traversal of the tree
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
