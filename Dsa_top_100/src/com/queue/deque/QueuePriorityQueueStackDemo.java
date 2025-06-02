package com.queue.deque;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueuePriorityQueueStackDemo {
	public static void main(String[] args) {

        System.out.println("=== Queue with LinkedList ===");
        Queue<String> queue = new LinkedList<>();

        // add() and offer()
        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Queue after add/offer: " + queue);

        // element() and peek()
        System.out.println("Head using element(): " + queue.element()); // throws exception if empty
        System.out.println("Head using peek(): " + queue.peek());       // null if empty

        // remove() and poll()
        System.out.println("Removed using remove(): " + queue.remove()); // throws exception if empty
        System.out.println("Removed using poll(): " + queue.poll());     // null if empty
        System.out.println("Queue after remove/poll: " + queue);

        // size() and isEmpty()
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty? " + queue.isEmpty());

        System.out.println("\n=== PriorityQueue (Min-Heap) ===");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(30);
        minHeap.offer(20);
        minHeap.add(10);
        System.out.println("Min-Heap: " + minHeap);

        // element, peek, remove, poll
        System.out.println("Peek: " + minHeap.peek());
        System.out.println("Poll: " + minHeap.poll());
        System.out.println("After poll: " + minHeap);

        System.out.println("\n=== PriorityQueue (Max-Heap) ===");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);
        System.out.println("Max-Heap: " + maxHeap);
        System.out.println("Poll max: " + maxHeap.poll());

        System.out.println("\n=== Stack Demo ===");
        Stack<String> stack = new Stack<>();

        // push()
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Stack after push: " + stack);

        // peek()
        System.out.println("Top using peek(): " + stack.peek());

        // pop()
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // search()
        System.out.println("Search 'One': " + stack.search("One"));   // 2 (1-based)
        System.out.println("Search 'Four': " + stack.search("Four")); // -1

        // empty()
        System.out.println("Is stack empty? " + stack.empty());

        // empty the stack
        while (!stack.empty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
