package com.leetcodes;

public class ReverseNodesinKgroup78 {
	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	static class  Solution {
	    public ListNode reverseKGroup(ListNode head, int k) {
	        if (head == null || k == 1) return head;

	        // Dummy node to simplify head operations
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;

	        ListNode prevGroup = dummy;

	        while (true) {
	            // Find the kth node from prevGroup
	            ListNode kth = getKthNode(prevGroup, k);
	            if (kth == null) break;

	            ListNode groupNext = kth.next;

	            // Reverse the group
	            ListNode prev = kth.next;
	            ListNode curr = prevGroup.next;

	            while (curr != groupNext) {
	                ListNode tmp = curr.next;
	                curr.next = prev;
	                prev = curr;
	                curr = tmp;
	            }

	            // Reconnect the reversed group
	            ListNode tmp = prevGroup.next;
	            prevGroup.next = kth;
	            prevGroup = tmp;
	        }

	        return dummy.next;
	    }

	    private ListNode getKthNode(ListNode curr, int k) {
	        while (curr != null && k > 0) {
	            curr = curr.next;
	            k--;
	        }
	        return curr;
	    }
	}
	 public static void main(String[] args) {
	        Solution sol = new Solution();

	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);

	        int k = 2;
	        ListNode result = sol.reverseKGroup(head, k);
	        printList(result); // Output: 2 -> 1 -> 4 -> 3 -> 5
	    }

	    private static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + (head.next != null ? " -> " : ""));
	            head = head.next;
	        }
	        System.out.println();
	    }
}
