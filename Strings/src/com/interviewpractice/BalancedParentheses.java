package com.interviewpractice;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty() &&
                      ((c == ')' && stack.peek() == '(') ||
                       (c == ']' && stack.peek() == '[') ||
                       (c == '}' && stack.peek() == '{'))) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
            "()[]{}",    // true
            "([{}])",    // true
            "(]",        // false
            "((())",     // false
            "{[()]()}"   // true
        };

        for (String test : testCases) {
            System.out.println(test + " -> " + isValid(test));
        }
    }
}
