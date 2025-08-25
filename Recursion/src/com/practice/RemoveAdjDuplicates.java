package com.practice;

public class RemoveAdjDuplicates {
	static String removeDup(String s) {
        // Base case
        if (s.length() <= 1) return s;

        // Recurse for the rest of the string
        String smallAns = removeDup(s.substring(1));

        // Compare current char with the first char of result
        if (!smallAns.isEmpty() && s.charAt(0) == smallAns.charAt(0)) {
            // skip duplicate
            return smallAns.substring(1); 
        } else {
            return s.charAt(0) + smallAns;
        }
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDup(s)); // Output: "ca"
    }
}
