package com.interviewpractice;

public class MissingAndRepeating {
    static void findMissingAndRepeating(int[] arr) {
        int n = arr.length;

        long sumN = (long) n * (n + 1) / 2;              // Expected sum
        long sumSqN = (long) n * (n + 1) * (2L * n + 1) / 6; // Expected sum of squares

        long sum = 0, sumSq = 0;
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        // Equations:
        // repeating - missing = sum - sumN
        // repeating^2 - missing^2 = sumSq - sumSqN
        long diff = sum - sumN;             // R - M
        long diffSq = sumSq - sumSqN;       // R^2 - M^2 = (R-M)(R+M)

        long sumRM = diffSq / diff;         // R + M

        long repeating = (diff + sumRM) / 2;
        long missing = repeating - diff;

        System.out.println("Repeating = " + repeating + ", Missing = " + missing);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(arr);
    }
}

