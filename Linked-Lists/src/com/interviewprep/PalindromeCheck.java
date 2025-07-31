package com.interviewprep;

public class PalindromeCheck {
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
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);

		System.out.println("Is Palindrome: " + isPalindrome(head)); // Output: true
	}

	static boolean isPalindrome(Node head) {
		if (head == null || head.next == null)
			return true;
		// Step 1: Find middle
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// Step 2: Reverse second half
		Node secondHalf = reverse(slow.next);

		// Step 3: Compare both halves
		Node firstHalf = head;
		Node temp = secondHalf;
		boolean result = true;
		while (temp != null) {
			if (firstHalf.data != temp.data) {
				return false;

			}
			firstHalf = firstHalf.next;
			temp = temp.next;
		}

		// Optional: Restore the original list
		slow.next = reverse(secondHalf);

		return result;

	}

	static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}
}
