package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveInvalidParentheses {
    Set<String> result = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        // Step 1: count how many extra left/right to remove
        int leftRem = 0, rightRem = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftRem++;
            } else if (c == ')') {
                if (leftRem > 0) leftRem--;
                else rightRem++;
            }
        }

        // Step 2: recursion
        backtrack(s, 0, 0, 0, leftRem, rightRem, new StringBuilder());
        return new ArrayList<>(result);
    }

    private void backtrack(String s, int index, int leftCount, int rightCount,
                           int leftRem, int rightRem, StringBuilder path) {
        if (index == s.length()) {
            if (leftRem == 0 && rightRem == 0) {
                result.add(path.toString());
            }
            return;
        }

        char c = s.charAt(index);
        int len = path.length();

        // Option 1: remove this char if it's '(' and we still need to remove some left
        if (c == '(' && leftRem > 0) {
            backtrack(s, index + 1, leftCount, rightCount, leftRem - 1, rightRem, path);
        }
        // Option 2: remove this char if it's ')' and we still need to remove some right
        if (c == ')' && rightRem > 0) {
            backtrack(s, index + 1, leftCount, rightCount, leftRem, rightRem - 1, path);
        }

        // Option 3: keep the char
        path.append(c);

        if (c != '(' && c != ')') {
            // just move forward
            backtrack(s, index + 1, leftCount, rightCount, leftRem, rightRem, path);
        } else if (c == '(') {
            backtrack(s, index + 1, leftCount + 1, rightCount, leftRem, rightRem, path);
        } else if (c == ')' && rightCount < leftCount) {
            backtrack(s, index + 1, leftCount, rightCount + 1, leftRem, rightRem, path);
        }

        // undo (backtrack)
        path.setLength(len);
    }

    public static void main(String[] args) {
        RemoveInvalidParentheses sol = new RemoveInvalidParentheses();
        System.out.println(sol.removeInvalidParentheses("()())()"));
    }
}
