package com.practice;
import java.util.*;

public class GrayCodeRecursive {

    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> base = new ArrayList<>();
            base.add(0);
            return base;
        }

        // Get gray code for n-1 bits
        List<Integer> prev = grayCode(n - 1);
        List<Integer> result = new ArrayList<>(prev);

        int addValue = 1 << (n - 1); // 2^(n-1)

        // Reflect and add offset
        for (int i = prev.size() - 1; i >= 0; i--) {
            result.add(prev.get(i) + addValue);
        }

        return result;
    }

    public static void main(String[] args) {
        GrayCodeRecursive g = new GrayCodeRecursive();
        System.out.println(g.grayCode(2)); // [0, 1, 3, 2]
        System.out.println(g.grayCode(3)); // [0, 1, 3, 2, 6, 7, 5, 4]
    }
}
