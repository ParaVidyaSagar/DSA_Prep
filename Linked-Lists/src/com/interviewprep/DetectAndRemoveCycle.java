package com.interviewprep;

public class DetectAndRemoveCycle {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head.next.next;

		detectAndRemoveLoop(head);
		// List after loop removal
		printList(head); // Output: 1 2 3 4 5

	}

	static void detectAndRemoveLoop(Node head) {
		Node slow = head;
		Node fast = head;
		// Step 1: Detect Loop
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				removeLoop(head, slow);
				return;
			}
		}
	}

	static void removeLoop(Node head, Node slow) {
		Node ptr1 = head;
		Node ptr2 = slow;
		// Find start of loop
		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		// Now ptr1 and ptr2 both point to loop start node
		// Find the node just before loop start
		Node prev = ptr2;
		while (prev.next != ptr2) {
			prev = prev.next;
		}
		// Break the loop
		prev.next = null;
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

}
