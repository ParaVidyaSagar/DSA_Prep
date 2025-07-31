package com.interviewprep;

public class DetectCycle {
 static class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data= data;
	 }
 }
   public static void main(String[] args) {
	Node head1 = new Node(1);
	Node node2 = new Node(2);
	Node node3 = new Node(0);
	Node node4 = new Node(-4);
	head1.next = node2;
	node2.next = node3;
	node3.next = node4;
	node4.next = node2; // cycle here
	System.out.println("List 1 has cycle " + hasCycle(head1));
}
   static boolean hasCycle(Node head) {
	   if(head == null) return false;
	   Node slow = head;
	   Node fast = head.next;
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
