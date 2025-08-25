package com.practice;

public class MaxNumberKSwaps {
    static String maxNumber;

    static void findMaximum(String str, int k, int index) {
        if (str.compareTo(maxNumber) > 0) {
            maxNumber = str;
        }
        if (k == 0 || index == str.length()) return;

        char maxDigit = str.charAt(index);
        for (int i = index + 1; i < str.length(); i++) {
            if (str.charAt(i) > maxDigit) {
                maxDigit = str.charAt(i);
            }
        }

        // If there's no greater digit ahead, no need to swap
        if (maxDigit != str.charAt(index)) {
            for (int i = index + 1; i < str.length(); i++) {
                if (str.charAt(i) == maxDigit) {
                    // swap index and i
                    char[] arr = str.toCharArray();
                    char temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;

                    // recurse with k-1
                    findMaximum(new String(arr), k - 1, index + 1);
                }
            }
        } else {
            // just move to next index without swap
            findMaximum(str, k, index + 1);
        }
    }

    public static void main(String[] args) {
        String num = "129814999";
        int k = 4;
        maxNumber = num;
        findMaximum(num, k, 0);
        System.out.println("Maximum number after " + k + " swaps: " + maxNumber);
    }
}
