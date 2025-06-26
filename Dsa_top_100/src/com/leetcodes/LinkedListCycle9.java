package com.leetcodes;

public class LinkedListCycle9 {
	// Defnition for Singly-Linked List
	//https://leetcode.com/problems/linked-list-cycle/?utm_source=instabyte.io&utm_medium=referral&utm_campaign=interview-master-100
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	static class Solution {
		public boolean hasCycle(ListNode head) {
			if(head == null) return false;
			ListNode slow = head;
			ListNode fast = head.next;
			
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return true;
		}
	}
	public static void main(String[] args) {
		// Example 1: List with a cycle: 3 -> 2 -> 0 -> -4 -> points back to node 2
		ListNode head1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;// cycle here
        
     // Example 2: List without a cycle: 1 -> 2 -> 3 -> null
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        Solution solution = new Solution();

        System.out.println("List 1 has cycle: " + solution.hasCycle(head1)); // true
        System.out.println("List 2 has cycle: " + solution.hasCycle(head2)); // false
   
        
        
		
	}

}
