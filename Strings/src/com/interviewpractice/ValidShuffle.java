package com.interviewpractice;

public class ValidShuffle {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String result = "adbcef";

        System.out.println(isValidShuffle(str1, str2, result)); // true
    }

    public static boolean isValidShuffle(String str1, String str2, String result) {
        if (str1.length() + str2.length() != result.length()) {
            return false;
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (k < result.length()) {
            if (i < str1.length() && result.charAt(k) == str1.charAt(i)) {
                i++;
            } else if (j < str2.length() && result.charAt(k) == str2.charAt(j)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        return (i == str1.length() && j == str2.length());
    }
}
