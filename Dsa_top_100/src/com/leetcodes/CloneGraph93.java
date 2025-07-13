package com.leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CloneGraph93 {
	static class Node {
	    public int val;
	    public List<Node> neighbors;

	    public Node() {
	        neighbors = new ArrayList<>();
	    }

	    public Node(int val) {
	        this.val = val;
	        neighbors = new ArrayList<>();
	    }

	    public Node(int val, List<Node> neighbors) {
	        this.val = val;
	        this.neighbors = neighbors;
	    }
	}

	static class Solution {
	    private Map<Node, Node> visited = new HashMap<>();

	    public Node cloneGraph(Node node) {
	        if (node == null) return null;

	        if (visited.containsKey(node)) {
	            return visited.get(node);
	        }

	        // Clone the node
	        Node clone = new Node(node.val);
	        visited.put(node, clone);

	        // Clone all neighbors recursively
	        for (Node neighbor : node.neighbors) {
	            clone.neighbors.add(cloneGraph(neighbor));
	        }

	        return clone;
	    }
	}
	public static void main(String[] args) {
        // Create a sample graph with 4 nodes: 1-2-3-4-1 (cycle)
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.addAll(Arrays.asList(node2, node4));
        node2.neighbors.addAll(Arrays.asList(node1, node3));
        node3.neighbors.addAll(Arrays.asList(node2, node4));
        node4.neighbors.addAll(Arrays.asList(node1, node3));

        Solution sol = new Solution();
        Node cloned = sol.cloneGraph(node1);

        // Optional: print cloned graph
        printGraph(cloned, new HashSet<>());
    }

    public static void printGraph(Node node, Set<Node> visited) {
        if (node == null || visited.contains(node)) return;
        visited.add(node);

        System.out.print("Node " + node.val + " -> ");
        for (Node neighbor : node.neighbors) {
            System.out.print(neighbor.val + " ");
        }
        System.out.println();

        for (Node neighbor : node.neighbors) {
            printGraph(neighbor, visited);
        }
    }
}
