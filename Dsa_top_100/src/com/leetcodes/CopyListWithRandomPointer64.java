package com.leetcodes;

public class CopyListWithRandomPointer64 {
	static class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	    }
	}

	public static class Solution {

	    public Node copyRandomList(Node head) {
	        if (head == null) return null;

	        // Step 1: Interleave nodes
	        Node curr = head;
	        while (curr != null) {
	            Node copy = new Node(curr.val);
	            copy.next = curr.next;
	            curr.next = copy;
	            curr = copy.next;
	        }

	        // Step 2: Set random pointers
	        curr = head;
	        while (curr != null) {
	            if (curr.random != null)
	                curr.next.random = curr.random.next;
	            curr = curr.next.next;
	        }

	        // Step 3: Separate the lists
	        Node dummyHead = new Node(0);
	        Node copyCurr = dummyHead;
	        curr = head;

	        while (curr != null) {
	            copyCurr.next = curr.next;
	            curr.next = curr.next.next;
	            curr = curr.next;
	            copyCurr = copyCurr.next;
	        }

	        return dummyHead.next;
	    }

	    // Utility to print list
	    public static void printList(Node head) {
	        Node curr = head;
	        while (curr != null) {
	            int randomVal = (curr.random != null) ? curr.random.val : -1;
	            System.out.println("Node: " + curr.val + ", Random: " + randomVal);
	            curr = curr.next;
	        }
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Create original list: 7 -> 13 -> 11 -> 10 -> 1
	        Node n1 = new Node(7);
	        Node n2 = new Node(13);
	        Node n3 = new Node(11);
	        Node n4 = new Node(10);
	        Node n5 = new Node(1);

	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;

	        n2.random = n1;
	        n3.random = n5;
	        n4.random = n3;
	        n5.random = n1;

	        Solution solution = new Solution();
	        Node copiedHead = solution.copyRandomList(n1);

	        System.out.println("Original list:");
	        printList(n1);

	        System.out.println("\nCopied list:");
	        printList(copiedHead);
	    }
	}
}
