package com.leetcodes;

public class MidOfLinkedList17 {
   // Definition for singly-linked list
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val, ListNode next){
			this.val = val;
			this.next= next;
		}
		
		static class Solution{
			public ListNode middleNode(ListNode head) {
				ListNode slow = head;
				ListNode fast = head;
				while(fast != null && fast.next != null) {
					slow = slow.next;
					fast = fast.next.next;
					System.out.println( "Slow"+ " " +slow.val +" fast"+" " +fast.val );
				}
				return slow;
			}
		}
		public static void main(String[] args) {
			// Linked list: 1 -> 2 -> 3 -> 4 -> 5
			 ListNode head = new ListNode(1,
                     new ListNode(2,
                         new ListNode(3,
                             new ListNode(4,
                                 new ListNode(5)))));
			 Solution solution = new Solution();
			 ListNode mid = solution.middleNode(head);
			 System.out.println("Middle node value " + mid.val);// Output: 3
		}
	}
}
