package com.leetcodes;

public class AddTwoNumbers60 {
	// Definition for singly-linked list
	static class ListNode {
	    int val;
	    ListNode next;

	    ListNode() {}

	    ListNode(int val) { this.val = val; }

	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static class Solution {

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0); 
	        ListNode current = dummyHead;
	        int carry = 0;

	        while (l1 != null || l2 != null || carry != 0) {
	            int sum = carry;

	            if (l1 != null) {
	                sum += l1.val;
	                l1 = l1.next;
	            }

	            if (l2 != null) {
	                sum += l2.val;
	                l2 = l2.next;
	            }

	            carry = sum / 10;
	            current.next = new ListNode(sum % 10);
	            current = current.next;
	        }

	        return dummyHead.next;
	    }

	    // Utility method to convert array to ListNode
	    public static ListNode createList(int[] nums) {
	        ListNode dummy = new ListNode(0);
	        ListNode current = dummy;
	        for (int n : nums) {
	            current.next = new ListNode(n);
	            current = current.next;
	        }
	        return dummy.next;
	    }

	    // Utility method to print a ListNode
	    public static void printList(ListNode node) {
	        while (node != null) {
	            System.out.print(node.val);
	            if (node.next != null) System.out.print(" -> ");
	            node = node.next;
	        }
	        System.out.println();
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        // Example: (2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8
	        ListNode l1 = createList(new int[]{2, 4, 3});
	        ListNode l2 = createList(new int[]{5, 6, 4});

	        ListNode result = solution.addTwoNumbers(l1, l2);

	        System.out.print("Result: ");
	        printList(result);
	    }
	}

}
