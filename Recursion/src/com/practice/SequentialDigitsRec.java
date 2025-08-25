package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigitsRec {
    static List<Integer> result = new ArrayList<>();

    public static List<Integer> sequentialDigits(int low, int high) {
        result.clear();
        // Start recursion from digits 1–9
        for (int i = 1; i <= 9; i++) {
            build(i, low, high);
        }
        Collections.sort(result);
        return result;
    }

    private static void build(int num, int low, int high) {
        if (num > high) return; // stop

        if (num >= low && num <= high) {
            result.add(num);
        }

        int lastDigit = num % 10;
        if (lastDigit < 9) {
            int next = num * 10 + (lastDigit + 1);
            build(next, low, high);
        }
    }

    public static void main(String[] args) {
        int low = 100, high = 300;
        System.out.println(sequentialDigits(low, high));
    }
}