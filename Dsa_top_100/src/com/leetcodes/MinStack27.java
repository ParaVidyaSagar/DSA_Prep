package com.leetcodes;

import java.util.Stack;

public class MinStack27 {
	
	static class MinStack{
		private Stack<Integer> stack;
		private Stack<Integer> minStack;
		
		public MinStack() {
			stack = new Stack<>();
			minStack = new Stack<>();
		}
		
		public void push(int val) {
			stack.push(val);
			// Push to minStack only if it's the smallest so far
			
			if(minStack.isEmpty() || val <= minStack.peek()) {
				minStack.push(val);
			}
		}
		
		public void pop() {
			int popped = stack.pop();
			if(popped == minStack.peek()) {
				minStack.pop();			}
		}
		
		public int top() {
			return stack.peek();
		}
		
		public int getMin() {
			return minStack.peek();		}
		
		
	}
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
        minStack.push(-3);
       
        System.out.println("Min: " + minStack.getMin()); // ➞ -3
        minStack.pop();
        System.out.println("Top: " + minStack.top());    // ➞ 0
        System.out.println("Min: " + minStack.getMin()); // ➞ -2
	}

}
