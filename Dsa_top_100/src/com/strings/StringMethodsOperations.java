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
        //1.length() - Returns the length of the string
        System.out.println("Length: " + original.length());
        
        //2.charAt(int index) - Returns the character at the specified index
        System.out.println("Character at 1: " + original.charAt(1));
        
        //3.substring(int beginIndex) - Returns substring from beginIndex to end
        System.out.println("Substring from 2: " + original.substring(2));
        
        //4.substring(int beginIndex, int endIndex) - Returns substring from beginIndex to endIndex-1
        System.out.println("Substring from 2 to 8: " + original.substring(2, 8));
        
        //5.isEmpty() - Checks if string length is 0
        System.out.println("Is Empty: " + original.isEmpty());
        
        //6. toCharArray() - Converts string to character array
        System.out.println("Char Array: " + Arrays.toString(original.toCharArray()));

        // String Comparison
        //1.equals(Object obj) - Case-sensitive comparison with another string
        System.out.println("Equals: " + original.equals(another));
        
        //2.equalsIgnoreCase(String str) - Case-insensitive comparison
        System.out.println("Equals Ignore Case: " + original.trim().equalsIgnoreCase(another));
        
        //3. compareTo(String str) - Lexicographical comparison (returns int)
        System.out.println("Compare To: " + original.compareTo(another));
        
        //4.startsWith(String prefix) - Checks if string starts with prefix
        System.out.println("Starts With '  He': " + original.startsWith("  He"));
        
        //5.endsWith(String suffix) - Checks if string ends with suffix
        System.out.println("Ends With '!  ': " + original.endsWith("!  "));
        
        //6.contains(CharSequence seq) - Checks if string contains sequence 
        System.out.println("Contains 'World': " + original.contains("World"));

        // String Modification
        //1.toLowerCase() - Converts to lowercase
        System.out.println("To Lowercase: " + original.toLowerCase());
        
        //2.toUpperCase() - Converts to uppercase
        System.out.println("To Uppercase: " + original.toUpperCase());
        
        //3.trim() - Removes whitespace from both ends
        System.out.println("Trimmed: " + original.trim());
        
        //4.replace(char oldChar, char newChar) - Replaces all occurrences of a character 
        System.out.println("Replace 'l' with 'x': " + original.replace('l', 'x'));
        
        //5.replace(CharSequence target, CharSequence replacement) - Replaces sequence
        System.out.println("Replace 'Hello' with 'Hi': " + original.replace("Hello", "Hi"));
        
        //6.replaceAll(String regex, String replacement) - Replaces by regex pattern 
        System.out.println("ReplaceAll \\s+: " + original.replaceAll("\\s+", "-"));

        // Searching
        //1.indexOf(String str) - First occurrence of specified string
        System.out.println("Index of 'o': " + original.indexOf("o"));
        
        //2.indexOf(String str, int fromIndex) - First occurrence from index
        System.out.println("Index of 'o' from index 5: " + original.indexOf("o", 5));
        
        //3.lastIndexOf(String str) - Last occurrence of specified string
        System.out.println("Last Index of 'o': " + original.lastIndexOf("o"));
        
        //4.lastIndexOf(String str, int fromIndex) - Last occurrence before index
        System.out.println("Last Index of 'o' before index 8: " + original.lastIndexOf("o", 8));
        
        //5.matches(String regex) - Tells if string matches regex pattern
        System.out.println("Matches regex '.*World.*': " + original.matches(".*World.*"));

        // Splitting and Joining
        //1. split(String regex) - Splits string based on regex, returns array
        String[] parts = sample.split(" ");
        System.out.println("Split by space: " + Arrays.toString(parts));
        
        //2.split(String regex, int limit) - Splits with limit on array size
        String[] limitedSplit = sample.split(" ", 2);
        System.out.println("Split by space with limit 2: " + Arrays.toString(limitedSplit));
        
        //3.join(CharSequence delimiter, CharSequence... elements) - Joins elements with delimiter (static method)
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);
        
        //4.concat(String str) - Concatenates another string
        System.out.println("Concat with '!!!': " + original.concat("!!!"));

        // Extra: Convert to list (if needed for join operation)
        List<String> wordList = Arrays.asList("Data", "Structures", "Algorithms");
        System.out.println("Joined List: " + String.join(" -> ", wordList));
    }
}
