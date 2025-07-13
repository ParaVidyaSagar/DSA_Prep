package com.leetcodes;

import java.util.Stack;

public class BasicCaluculator61 {
	public static class Solution {

	    public int calculate(String s) {
	        Stack<Integer> stack = new Stack<>();
	        int num = 0, result = 0, sign = 1;

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (Character.isDigit(ch)) {
	                num = num * 10 + (ch - '0');
	            }
	            else if (ch == '+') {
	                result += sign * num;
	                num = 0;
	                sign = 1;
	            }
	            else if (ch == '-') {
	                result += sign * num;
	                num = 0;
	                sign = -1;
	            }
	            else if (ch == '(') {
	                stack.push(result);
	                stack.push(sign);
	                result = 0;
	                sign = 1;
	            }
	            else if (ch == ')') {
	                result += sign * num;
	                num = 0;
	                result *= stack.pop(); // sign
	                result += stack.pop(); // result
	            }
	        }

	        result += sign * num;
	        return result;
	    }

	    public static void main(String[] args) {
	        Solution solution = new Solution();

	        String expr1 = "1 + 1";
	        String expr2 = " 2-1 + 2 ";
	        String expr3 = "(1+(4+5+2)-3)+(6+8)";
	        String expr4 = "- (3 + (2 - 1))";

	        System.out.println("Expression: " + expr1 + " = " + solution.calculate(expr1));  // 2
	        System.out.println("Expression: " + expr2 + " = " + solution.calculate(expr2));  // 3
	        System.out.println("Expression: " + expr3 + " = " + solution.calculate(expr3));  // 23
	        System.out.println("Expression: " + expr4 + " = " + solution.calculate(expr4));  // -4
	    }
	}
}
