package com.interviewprep;

public class ReverseLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		System.out.println("Original: ");
		printList(head);
		
		Node reversed = reverseLinkedList(head);
		printList(reversed);
	}
	
	static Node reverseLinkedList(Node head) {
		Node prev=null;
		Node curr = head;
		while(curr != null) {
			Node next= curr.next;
			curr.next = prev;
			prev= curr;
			curr = next;
		}
		return prev;
	}
	private static void printList(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		 System.out.println("null");
	}

}
