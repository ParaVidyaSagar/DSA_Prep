package com.strings;

import java.util.Arrays;
import java.util.List;

public class StringMethodsOperations {
    public static void main(String[] args) {
        String original = "  Hello World!  ";
        String another = "hello world!";
        String sample = "Java Programming Language";
        String[] words = {"Java", "Python", "C++"};

        // Basic Operations
        System.out.println("Length: " + original.length());
        System.out.println("Character at 1: " + original.charAt(1));
        System.out.println("Substring from 2: " + original.substring(2));
        System.out.println("Substring from 2 to 8: " + original.substring(2, 8));
        System.out.println("Is Empty: " + original.isEmpty());
        System.out.println("Char Array: " + Arrays.toString(original.toCharArray()));

        // String Comparison
        System.out.println("Equals: " + original.equals(another));
        System.out.println("Equals Ignore Case: " + original.trim().equalsIgnoreCase(another));
        System.out.println("Compare To: " + original.compareTo(another));
        System.out.println("Starts With '  He': " + original.startsWith("  He"));
        System.out.println("Ends With '!  ': " + original.endsWith("!  "));
        System.out.println("Contains 'World': " + original.contains("World"));

        // String Modification
        System.out.println("To Lowercase: " + original.toLowerCase());
        System.out.println("To Uppercase: " + original.toUpperCase());
        System.out.println("Trimmed: " + original.trim());
        System.out.println("Replace 'l' with 'x': " + original.replace('l', 'x'));
        System.out.println("Replace 'Hello' with 'Hi': " + original.replace("Hello", "Hi"));
        System.out.println("ReplaceAll \\s+: " + original.replaceAll("\\s+", "-"));

        // Searching
        System.out.println("Index of 'o': " + original.indexOf("o"));
        System.out.println("Index of 'o' from index 5: " + original.indexOf("o", 5));
        System.out.println("Last Index of 'o': " + original.lastIndexOf("o"));
        System.out.println("Last Index of 'o' before index 8: " + original.lastIndexOf("o", 8));
        System.out.println("Matches regex '.*World.*': " + original.matches(".*World.*"));

        // Splitting and Joining
        String[] parts = sample.split(" ");
        System.out.println("Split by space: " + Arrays.toString(parts));
        String[] limitedSplit = sample.split(" ", 2);
        System.out.println("Split by space with limit 2: " + Arrays.toString(limitedSplit));
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);
        System.out.println("Concat with '!!!': " + original.concat("!!!"));

        // Extra: Convert to list (if needed for join operation)
        List<String> wordList = Arrays.asList("Data", "Structures", "Algorithms");
        System.out.println("Joined List: " + String.join(" -> ", wordList));
    }
}
