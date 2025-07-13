package com.leetcodes;

public class SortList96 {
	static class ListNode {
	    int val;
	    ListNode next;

	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) {
	        this.val = val;
	        this.next = next;
	    }
	}

	static class Solution {
	    public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null) return head;

	        // Step 1: Split the list into halves
	        ListNode mid = getMiddle(head);
	        ListNode right = mid.next;
	        mid.next = null;

	        // Step 2: Recursively sort both halves
	        ListNode leftSorted = sortList(head);
	        ListNode rightSorted = sortList(right);

	        // Step 3: Merge sorted halves
	        return merge(leftSorted, rightSorted);
	    }

	    private ListNode getMiddle(ListNode head) {
	        ListNode slow = head, fast = head;

	        // Find the middle using slow-fast pointer technique
	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }

	    private ListNode merge(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(0), tail = dummy;

	        while (l1 != null && l2 != null) {
	            if (l1.val < l2.val) {
	                tail.next = l1;
	                l1 = l1.next;
	            } else {
	                tail.next = l2;
	                l2 = l2.next;
	            }
	            tail = tail.next;
	        }

	        // Append remaining
	        tail.next = (l1 != null) ? l1 : l2;

	        return dummy.next;
	    }
	}
	public static void main(String[] args) {
        // Create list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4,
                            new ListNode(2,
                                new ListNode(1,
                                    new ListNode(3))));

        Solution sol = new Solution();
        ListNode sorted = sol.sortList(head);

        // Print sorted list
        while (sorted != null) {
            System.out.print(sorted.val + " ");
            sorted = sorted.next;
        }
        // Output: 1 2 3 4
    }
}
