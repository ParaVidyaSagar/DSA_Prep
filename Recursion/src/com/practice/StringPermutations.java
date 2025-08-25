package com.practice;

public class StringPermutations {

    static void printPermutations(char[] str, int index) {
        // Base case: if index reached end
        if (index == str.length - 1) {
            System.out.println(new String(str));
            return;
        }

        for (int i = index; i < str.length; i++) {
            // Swap current index with i
            swap(str, index, i);

            // Recurse for next index
            printPermutations(str, index + 1);

            // Backtrack (undo swap)
            swap(str, index, i);
        }
    }

    static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String s = "ABC";
        printPermutations(s.toCharArray(), 0);
    }
}