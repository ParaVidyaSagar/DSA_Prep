package com.queue.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeOperationsDemo {
	 public static void main(String[] args) {

	        // ===== LinkedList as Deque =====
	        System.out.println("=== LinkedList as Deque ===");
	        LinkedList<String> linkedList = new LinkedList<>();

	        // Add operations
	        linkedList.addFirst("Apple");
	        linkedList.offerFirst("Banana");
	        linkedList.addLast("Cherry");
	        linkedList.offerLast("Date");
	        System.out.println("After additions: " + linkedList);

	        // Retrieve operations
	        System.out.println("First (getFirst): " + linkedList.getFirst());
	        System.out.println("First (peekFirst): " + linkedList.peekFirst());
	        System.out.println("Last (getLast): " + linkedList.getLast());
	        System.out.println("Last (peekLast): " + linkedList.peekLast());

	        // Remove operations
	        System.out.println("Removed First (removeFirst): " + linkedList.removeFirst());
	        System.out.println("Removed First (pollFirst): " + linkedList.pollFirst());
	        System.out.println("Removed Last (removeLast): " + linkedList.removeLast());
	        System.out.println("Removed Last (pollLast): " + linkedList.pollLast());
	        System.out.println("After removals: " + linkedList);


	        // ===== ArrayDeque as Deque =====
	        System.out.println("\n=== ArrayDeque as Deque ===");
	        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

	        // Add operations
	        arrayDeque.addFirst("One");
	        arrayDeque.offerFirst("Two");
	        arrayDeque.addLast("Three");
	        arrayDeque.offerLast("Four");
	        System.out.println("After additions: " + arrayDeque);

	        // Retrieve operations
	        System.out.println("First (getFirst): " + arrayDeque.getFirst());
	        System.out.println("First (peekFirst): " + arrayDeque.peekFirst());
	        System.out.println("Last (getLast): " + arrayDeque.getLast());
	        System.out.println("Last (peekLast): " + arrayDeque.peekLast());

	        // Remove operations
	        System.out.println("Removed First (removeFirst): " + arrayDeque.removeFirst());
	        System.out.println("Removed First (pollFirst): " + arrayDeque.pollFirst());
	        System.out.println("Removed Last (removeLast): " + arrayDeque.removeLast());
	        System.out.println("Removed Last (pollLast): " + arrayDeque.pollLast());
	        System.out.println("After removals: " + arrayDeque);
	    }
}
