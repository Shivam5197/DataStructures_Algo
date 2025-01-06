package org.functional.Strings;

import java.util.Arrays;

public class StringChatGPTQuestions {
    // ANSI escape code constants for text colors
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String MAGENTA = "\u001B[35m";
    // Optionally, add a reset code to clear the color
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        reverseAString();
        checkPalindrome();
        findFirstNonRepeatingCharacter();
        countVowelsAndConsonants();
        checkAnagram();
        removeWhitespaces();
        countCharacterOccurrences();
        convertStringToTitleCase();
        findLongestSubstringWithoutRepeatingCharacters();
        findAllPermutationsOfString();
        reverseEachWordInString();
        findMostFrequentCharacter();
        checkRotationOfAnotherString();
        removeDuplicateCharacters();
        findAllSubstrings();
        checkIfStringContainsOnlyDigits();
        replaceCharacterInString();
        findWordCountInSentence();
        splitStringIntoBalancedStrings();
        findLongestPalindromeSubstring();
    }

    // 1. Reverse a String
    static void reverseAString() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "1. Reverse a String");
        String str = "Hello World";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(CYAN + "Output String: " + rev);
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 2. Check if a String is a Palindrome
    static void checkPalindrome() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "2. Check if a String is a Palindrome");
        String str = "madam";
        System.out.println(YELLOW + "String to check: " + str);
        // Solution here
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(CYAN + "Provided String " + str + " is Palindrome !");
        } else {
            System.out.println(CYAN + "Provided String " + str + " is not Palindrome !");
        }
        System.out.println(GREEN + "============================ SECOND WAY TO SOLVE ======================================");

        int left = 0;
        int right = str.length() - 1;
        boolean isPallindrome = true;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.isLowerCase(l) != Character.isLowerCase(r)) {
                isPallindrome = false;
            } else {
                left++;
                right--;
            }
        }
        if (isPallindrome) {
            System.out.println(CYAN + "Provided String " + str + " is Palindrome !");

        } else {
            System.out.println(MAGENTA + "Provided String " + str + "  is not Palindrome !");
        }
        System.out.println(GREEN + "============================ SECOND WAY TO SOLVE ======================================");
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 3. Find the First Non-Repeating Character in a String
    static void findFirstNonRepeatingCharacter() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "3. Find the First Non-Repeating Character in a String");
        String str = "swiss";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        char notRepeated = 0;
        for(int i=0;i<str.length();i++){
            boolean isRepeated = false;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                isRepeated = true;
                    break;
                }
            }
            if(!isRepeated){
                System.out.println(CYAN+"Not Repeated char is => " + str.charAt(i));
                notRepeated = str.charAt(i);
            }
        }
        System.out.println(CYAN+"Not Repeated char is => " + String.valueOf(notRepeated));
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 4. Count Vowels and Consonants in a String
    static void countVowelsAndConsonants() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "4. Count Vowels and Consonants in a String");
        String str = "Programming";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        int vowels = 0;
        int consonants = 0;
      str =  str.toLowerCase();
        for(int i = 0; i< str.length(); i++){
            //char ch = str.charAt(i);
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'  || str.charAt(i) == 'u' ){
                vowels++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                consonants++;
            }
        }
        System.out.println(CYAN+"Count of Vowels => " + vowels +" \n & Consonants => "+consonants);
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 5. Check if Two Strings are Anagrams
    static void checkAnagram() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "5. Check if Two Strings are Anagrams");
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(YELLOW + "String 1: " + str1);
        System.out.println(YELLOW + "String 2: " + str2);
        // Solution here
        int arr[] = new int[26];
        boolean isAnagram = true;
        if(str1.length() != str2.length()){
            isAnagram = false;
        }
// solution followed - LeetCode 242. Valid Anagram Solution Explained - Java   by  Engineering Digest
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i) - 'a']++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i) - 'a']--;
            if( arr[str2.charAt(i) - 'a'] < 0){
                isAnagram = false;
            }
        }
        if(isAnagram){
            System.out.println(CYAN+"String" +str1 + " & " + str2 +" are anagrams ");
        }else {
            System.out.println(CYAN+"String" +str1 + " & " + str2 +" are not anagrams ");
        }

        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 6. Remove Whitespace from a String
    static void removeWhitespaces() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "6. Remove Whitespace from a String");
        String str = "Java Programming Language";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        int index = 0;
        char arr[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                arr[index] = str.charAt(i);
                index++;
            }
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
        System.out.println(CYAN + String.valueOf(arr));
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 7. Count Occurrences of Each Character in a String
    static void countCharacterOccurrences() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "7. Count Occurrences of Each Character in a String");
        String str = "success";
        System.out.println(YELLOW + "String: " + str);
        // Solution here

        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 8. Convert a String to Title Case
    static void convertStringToTitleCase() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "8. Convert a String to Title Case");
        String str = "java programming language";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
     str.toLowerCase().replace()


        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 9. Find the Longest Substring Without Repeating Characters
    static void findLongestSubstringWithoutRepeatingCharacters() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "9. Find the Longest Substring Without Repeating Characters");
        String str = "abcabcbb";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 10. Find All Permutations of a String
    static void findAllPermutationsOfString() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "10. Find All Permutations of a String");
        String str = "abc";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 11. Reverse Each Word in a String
    static void reverseEachWordInString() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "11. Reverse Each Word in a String");
        String str = "Hello World";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 12. Find the Most Frequent Character in a String
    static void findMostFrequentCharacter() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "12. Find the Most Frequent Character in a String");
        String str = "programming";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 13. Check if One String is a Rotation of Another
    static void checkRotationOfAnotherString() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "13. Check if One String is a Rotation of Another");
        String str1 = "abcd";
        String str2 = "dabc";
        System.out.println(YELLOW + "String 1: " + str1);
        System.out.println(YELLOW + "String 2: " + str2);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 14. Remove Duplicate Characters from a String
    static void removeDuplicateCharacters() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "14. Remove Duplicate Characters from a String");
        String str = "banana";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 15. Find All Substrings of a String
    static void findAllSubstrings() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "15. Find All Substrings of a String");
        String str = "abcd";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }


    // 16. Check if a String Contains Only Digits
    static void checkIfStringContainsOnlyDigits() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "16. Check if a String Contains Only Digits");
        String str = "12345";
        System.out.println(YELLOW + "String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 17. Replace a Character in a String
    static void replaceCharacterInString() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "17. Replace a Character in a String");
        String str = "hello";
        char oldChar = 'l';
        char newChar = 'p';
        System.out.println(YELLOW + "Original String: " + str);
        System.out.println(YELLOW + "Character to replace: " + oldChar);
        System.out.println(YELLOW + "New character: " + newChar);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 18. Find the Word Count in a Sentence
    static void findWordCountInSentence() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "18. Find the Word Count in a Sentence");
        String sentence = "Java is a programming language";
        System.out.println(YELLOW + "Sentence: " + sentence);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 19. Split a String into Balanced Strings
    static void splitStringIntoBalancedStrings() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "19. Split a String into Balanced Strings");
        String str = "RLRRLLRLRL";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }

    // 20. Find the Longest Palindrome Substring in a String
    static void findLongestPalindromeSubstring() {
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println(RED + "20. Find the Longest Palindrome Substring in a String");
        String str = "babad";
        System.out.println(YELLOW + "Original String: " + str);
        // Solution here
        System.out.println(WHITE + "************************************************************************-------------");
        System.out.println();
    }


}