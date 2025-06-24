package com.example;

/**
 * A Palindrome class that provides methods to check if strings and numbers are palindromes.
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same
 * forward and backward, ignoring spaces, punctuation, and capitalization.
 * 
 * @author Generated Code
 * @version 1.0
 */
public class Palindrome {
    
    /**
     * Checks if a string is a palindrome (case-sensitive, including spaces and punctuation).
     * 
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    /**
     * Checks if a string is a palindrome (case-insensitive, ignoring spaces and punctuation).
     * 
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindromeIgnoreCase(String str) {
        if (str == null) {
            return false;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindrome(cleaned);
    }
    
    /**
     * Checks if a number is a palindrome.
     * 
     * @param num the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public boolean isPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) {
            return false;
        }
        
        return isPalindrome(String.valueOf(num));
    }
    
    /**
     * Reverses a string and returns it.
     * 
     * @param str the string to reverse
     * @return the reversed string
     */
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
    
    /**
     * Main method to demonstrate the Palindrome functionality.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();
        
        System.out.println("=== Palindrome Checker Demo ===\n");
        
        // Test simple palindromes
        String[] testStrings = {"racecar", "hello", "madam", "A man a plan a canal Panama", "race a car"};
        
        System.out.println("1. Simple palindrome checks (case-sensitive):");
        for (String test : testStrings) {
            boolean result = palindromeChecker.isPalindrome(test);
            System.out.println("\"" + test + "\" -> " + result);
        }
        
        System.out.println("\n2. Advanced palindrome checks (case-insensitive, ignore punctuation):");
        for (String test : testStrings) {
            boolean result = palindromeChecker.isPalindromeIgnoreCase(test);
            System.out.println("\"" + test + "\" -> " + result);
        }
        
        // Test number palindromes
        System.out.println("\n3. Number palindrome checks:");
        int[] testNumbers = {121, 123, 12321, -121, 1001};
        for (int num : testNumbers) {
            boolean result = palindromeChecker.isPalindrome(num);
            System.out.println(num + " -> " + result);
        }
        
        // Test string reversal
        System.out.println("\n4. String reversal examples:");
        String[] reverseTests = {"hello", "world", "java"};
        for (String test : reverseTests) {
            String reversed = palindromeChecker.reverse(test);
            System.out.println("\"" + test + "\" reversed -> \"" + reversed + "\"");
        }
        
        System.out.println("\n--- Palindrome Demo Complete ---");
        System.out.println("Try modifying the test cases and recompiling to test more palindromes!");
    }
}