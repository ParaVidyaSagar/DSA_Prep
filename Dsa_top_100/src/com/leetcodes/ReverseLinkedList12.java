package com.leetcodes;

public class ReverseLinkedList12 {
   //Definition of singly Linked List
	static class ListNode{
		int val;
		ListNode next;
		ListNode(){
			
		}
		ListNode(int val){
			this.val = val;
		}
		
		ListNode(int val, ListNode next){
			this.val = val;
			this.next = next;
		}
	}
		
		static class Solution{
		 public ListNode reverseList(ListNode head) {
			 ListNode prev = null;
			 while(head != null) {
				 ListNode temp = head.next; // store next node
				 head.next = prev; // reverse pointer
				 prev = head; // move prev forward
				 head = temp; // move head forward
			 }
			 return prev;
		 }
		}
		
		
		public static void main(String[] args) {
			/*
	         Original List: 1 -> 2 -> 3 -> 4 -> 5
	         Reversed List: 5 -> 4 -> 3 -> 2 -> 1
	        */
			// Create the list: 1 -> 2 -> 3 -> 4 -> 5
			ListNode head = new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
			System.out.println("Orginal List: ");
			printList(head);
			Solution solution = new Solution();
	        ListNode reversed = solution.reverseList(head);
	        System.out.println("\nReversed List:");
	        printList(reversed);
		}
		
		//Helper method to print Linked list
		public static void printList(ListNode head) {
			while(head != null) {
				System.out.print(head.val);
				if(head.next != null) System.out.print(" -> ");
				head = head.next;
			}
			System.out.println();
		}
	    
	}

