package com.practice;

class Node {
    public boolean val;        // true = 1, false = 0
    public boolean isLeaf;     
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
    }
}

public class QuadTreeConstruction {

    // Main method to test
    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };

        QuadTreeConstruction qtc = new QuadTreeConstruction();
        Node root = qtc.construct(grid);

        System.out.println("Quad Tree constructed!");
        qtc.printTree(root, 0); // Pretty print tree
    }

    // Recursive Quad Tree construction
    public Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length);
    }

    private Node build(int[][] grid, int row, int col, int size) {
        if (allSame(grid, row, col, size)) {
            return new Node(grid[row][col] == 1, true); // leaf
        }

        int newSize = size / 2;
        Node root = new Node(true, false); // internal node
        root.topLeft = build(grid, row, col, newSize);
        root.topRight = build(grid, row, col + newSize, newSize);
        root.bottomLeft = build(grid, row + newSize, col, newSize);
        root.bottomRight = build(grid, row + newSize, col + newSize, newSize);

        return root;
    }

    // Check if all values in this region are same
    private boolean allSame(int[][] grid, int row, int col, int size) {
        int val = grid[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (grid[i][j] != val) return false;
            }
        }
        return true;
    }

    // Helper to print Quad Tree structure
    private void printTree(Node node, int level) {
        if (node == null) return;
        String indent = " ".repeat(level * 2);
        if (node.isLeaf) {
            System.out.println(indent + "Leaf: " + (node.val ? "1" : "0"));
        } else {
            System.out.println(indent + "Internal Node");
            printTree(node.topLeft, level + 1);
            printTree(node.topRight, level + 1);
            printTree(node.bottomLeft, level + 1);
            printTree(node.bottomRight, level + 1);
        }
    }
}
