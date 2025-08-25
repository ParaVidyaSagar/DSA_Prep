package com.practice;

public class DecodeWays2Recursion {
    static final int MOD = 1000000007;

    public int numDecodings(String s) {
        return (int)(decode(s, 0) % MOD);
    }

    private long decode(String s, int i) {
        if (i == s.length()) return 1;   // reached end successfully
        if (s.charAt(i) == '0') return 0; // cannot start with '0'

        long ways = 0;

        char c = s.charAt(i);

        // 1-char decoding
        if (c == '*') {
            ways += 9 * decode(s, i + 1);
        } else {
            ways += decode(s, i + 1);
        }

        // 2-char decoding
        if (i + 1 < s.length()) {
            char c2 = s.charAt(i + 1);

            if (c == '*' && c2 == '*') {
                ways += 15 * decode(s, i + 2); // 11–19 (9 ways) + 21–26 (6 ways)
            } else if (c == '*') {
                if (c2 >= '0' && c2 <= '6') ways += 2 * decode(s, i + 2); // 10–16, 20–26
                else ways += 1 * decode(s, i + 2); // 17–19
            } else if (c2 == '*') {
                if (c == '1') ways += 9 * decode(s, i + 2); // 11–19
                else if (c == '2') ways += 6 * decode(s, i + 2); // 21–26
            } else {
                int num = (c - '0') * 10 + (c2 - '0');
                if (num >= 10 && num <= 26) {
                    ways += decode(s, i + 2);
                }
            }
        }

        return ways % MOD;
    }

    public static void main(String[] args) {
        DecodeWays2Recursion sol = new DecodeWays2Recursion();
        System.out.println(sol.numDecodings("*"));   // 9
        System.out.println(sol.numDecodings("1*"));  // 18
    }
}
