package com.leetcodes;

public class RemoveNthFromEndOfList48 {
	public static class Solution {

	    // Definition for singly-linked list
	    static class ListNode {
	        int val;
	        ListNode next;

	        ListNode() {}
	        ListNode(int val) { this.val = val; }
	        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    }

	    // Core LeetCode solution method
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;

	        ListNode first = dummy;
	        ListNode second = dummy;

	        // Move first pointer n+1 steps ahead
	        for (int i = 0; i <= n; i++) {
	            first = first.next;
	        }

	        // Move both until first reaches the end
	        while (first != null) {
	            first = first.next;
	            second = second.next;
	        }

	        // Remove nth from end
	        second.next = second.next.next;

	        return dummy.next;
	    }

	    // Helper method to build linked list from array
	    public static ListNode buildList(int[] nums) {
	        ListNode dummy = new ListNode(0);
	        ListNode current = dummy;
	        for (int num : nums) {
	            current.next = new ListNode(num);
	            current = current.next;
	        }
	        return dummy.next;
	    }

	    // Helper method to print linked list
	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val);
	            if (head.next != null) System.out.print(" -> ");
	            head = head.next;
	        }
	        System.out.println();
	    }

	    // Main method for local testing
	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        int[] input = {1, 2, 3, 4, 5};
	        int n = 2;

	        ListNode head = buildList(input);
	        System.out.print("Original List: ");
	        printList(head);

	        ListNode updated = solution.removeNthFromEnd(head, n);
	        System.out.print("After Removing " + n + "th Node From End: ");
	        printList(updated);
	    }
	}
}


 