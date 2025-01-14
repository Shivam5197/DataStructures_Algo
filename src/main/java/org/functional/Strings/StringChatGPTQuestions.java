package org.functional.Strings;

import org.functional.TerminalColors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // BASIC STRING MANIPULATIONS
        System.out.println(GREEN + "=== Basic String Manipulations ===" + RESET);
        reverseAString();
        checkPalindrome();
        countVowelsAndConsonants();
        removeDuplicateCharacters();
        checkRotationOfAnotherString();
        countCharacterOccurrences();
        replaceSpacesWith20();
        removeAllOccurrencesOfCharacter();
        checkIfStringContainsOnlyDigits();
        reverseEachWordInString();

        // PATTERN MATCHING AND SUBSTRING PROBLEMS
        System.out.println(GREEN + "=== Pattern Matching and Substring Problems ===" + RESET);
        findLongestSubstringWithoutRepeatingCharacters();
        checkAnagram();
        findFirstNonRepeatingCharacter();
        countSubstringOccurrences();
        findLongestPalindromeSubstring();
        searchPatternInString();
        findAllPermutationsOfString();
        findAllPalindromicSubstrings();
        findSmallestWindowContainingAllCharacters();
        checkIfStringFollowsPattern();

        // STRING TRANSFORMATIONS
        System.out.println(GREEN + "=== String Transformations ===" + RESET);
        compressString();
        expandCompressedString();
        convertCamelCaseToSnakeCase();
        convertSnakeCaseToCamelCase();
        transformToLexicographicallySmallestRotation();
        rearrangeStringWithoutAdjacentDuplicates();
        convertToTitleCase();
        performRunLengthEncoding();
        reverseWordsInSentence();
        replaceCharacterInString();

        // STRING PARSING
        System.out.println(GREEN + "=== String Parsing ===" + RESET);
        extractNumbersFromString();
        validateEmailUsingRegex();
        evaluateNestedBrackets();
        convertRomanToInteger();
        validatePalindromeIgnoringSpecialCharacters();
        parseStringToGenerateJSON();
        matchWildcardPattern();
        parseMathematicalExpression();
        splitStringIntoBalancedStrings();
        validateIPAddress();

        // STRING AND DATA STRUCTURES
        System.out.println(GREEN + "=== String and Data Structures ===" + RESET);
        groupAnagrams();
        findSmallestWindowContainingAnotherString();
        sortCharactersByFrequency();
        findKMostFrequentCharacters();
        implementTrieAndPrefixMatching();
        checkIfStringsAreIsomorphic();
        findLongestRepeatedSubstring();
        determineMinDeletionsForAnagram();
        generateAllValidIPAddresses();
        findMostFrequentCharacter();
    }

    // BASIC STRING MANIPULATIONS
    static void reverseAString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "1. Reverse a String");
        // Your code here
        String str = "Shivam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
         rev = rev + str.charAt(i);
        }
        System.out.println(CYAN+" Reverse of "+str+ " is => " + rev);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkPalindrome() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "2. Check if a String is a Palindrome");
        // Your code here
        String str = "madam";
        Boolean isPalindrome =false;
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+ str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(CYAN+" Provided String "+ GREEN +str+ CYAN+" is Palindrome !");
        }else{
            System.out.println(CYAN+" Provided String "+str+ " is not Palindrome !");
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
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void countVowelsAndConsonants() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "3. Count Vowels and Consonants in a String");
        // Your code here
        String str = "Programming";
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vowels++;
            }else{
                consonants++;
            }
        }

        System.out.println(CYAN+" The count of Vowels are => "+BLUE + vowels);
        System.out.println(CYAN+" The count of Consonants are => "+BLUE + consonants);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void removeDuplicateCharacters() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "4. Remove Duplicate Characters from a String");
        // Your code here
        String s = "geEksforGEeks";
        StringBuffer S =  new StringBuffer();
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!seen.contains(current)) {
                seen.add(current);
                S.append(current);
            }
        }
        System.out.println(CYAN+"String after removing duplicates is => " + S.toString());
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkRotationOfAnotherString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "5. Check if One String is a Rotation of Another");
        // Your code here
        String s1 = "abcd", s2 = "cdab";

        if (s1.length() != s2.length()) {
            System.out.println(" False ! ");
        }

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of concatenated
        if(concatenated.contains(s2)){
            System.out.println(CYAN+"String is a Rotation of Another");
        }else{
            System.out.println(CYAN+"String is not a Rotation of Another");
        }


        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void countCharacterOccurrences() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "6. Count Occurrences of Each Character in a String");
        // Your code here
        Map<Character,Integer> response = new HashMap<>();
      String  s = "abc123abc";
        // Iterate through the string and count occurrences of each character
        for (char c : s.toCharArray()) {
            response.put(c, response.getOrDefault(c, 0) + 1);
        }
        //Print results
        for (Map.Entry<Character, Integer> entry : response.entrySet()) {
            System.out.println(CYAN+""+entry.getKey() + ": "+ GREEN + entry.getValue());
        }

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void replaceSpacesWith20() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "7. Replace All Spaces in a String with '%20'");
        // Your code here
          String  Input=     "Mr John Smith";
        StringBuilder st = new StringBuilder();
        String Rep = "%20";
        for(int i=0;i<Input.length();i++){
            if(Input.charAt(i) == ' ' ){
                st.append(Rep);
            }else{
                st.append(Input.charAt(i));
            }


        }
        System.out.println(CYAN+" String "+Input+ " After replaced Space with %20 is => "  + st);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void removeAllOccurrencesOfCharacter() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "8. Remove All Occurrences of a Given Character from a String");
        // Your code here
        String str = "Hi My Name is Shivam Sharma";
        char ch = 'h';
        str =  str.toLowerCase();
        StringBuilder stb = new StringBuilder();

        for(int i = 0 ; i <str.length();i++){
            if(str.charAt(i) != ch){
                stb.append(str.charAt(i));
            }
        }
        System.out.println(CYAN+" The Output after removing the Occurrences is => " + stb.toString());
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkIfStringContainsOnlyDigits() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "9. Check if a String Contains Only Digits");
        // Your code here
        String s1 = "123456";
        String s2 = "Abc1245";

        for(Character c: s1.toCharArray()){
            if(!Character.isDigit(c)){
                System.out.println(CYAN+" String "+s1+" only contains Digits !");
            }else{
                System.out.println(YELLOW+" String "+s1+" Not only contains Digits !");
            }
        }
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void reverseEachWordInString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "10. Reverse Each Word in a String");
        // Your code here
        String str = "Java Programming";
        String st[] = str.split(" ");
        String rv = "";

        for(int i=0;i<st.length;i++){
            String word = st[i];
            String revWord = "";
            for(int j = word.length()-1;j>=0;j--){
                revWord = revWord+ word.charAt(j);
            }
            rv = rv + revWord;
            if (i < st.length - 1) {
                rv += " ";
            }
        }
        System.out.println(CYAN+"Reversed words are => " + rv);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    // PATTERN MATCHING AND SUBSTRING PROBLEMS
    static void findLongestSubstringWithoutRepeatingCharacters() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "11. Find the Longest Substring Without Repeating Characters");
        // Your code here
        String str = "geeksforgeeks";

        Set<Character> s = new HashSet<>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }

        System.out.println(CYAN+"Longest String without repeating characters are =>" + s.size());
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkAnagram() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "12. Check if Two Strings are Anagrams");
        // Your code here
        String str1= "shivam";
        String str2 = "vamshi";

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams !");
        }
     //   StringBuilder st = new StringBuilder(str1);
        Set<Character> set = new HashSet<>();
        for (char c : str1.toCharArray()){
            set.add(c);
        }
        for(int i=0;i<str2.length();i++){
            if(set.contains(str2.charAt(i))){
                set.remove(str2.charAt(i));
            }
        }
        if(set.isEmpty()){
            System.out.println("Anagrams ");
        }else{
            System.out.println("Not Anagrams");
        }
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findFirstNonRepeatingCharacter() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "13. Find the First Non-Repeating Character in a String");
        // Your code here
        String str = "This is a Non repeting checketer test";
        char notRepeated = '$';
        for(int i=0;i<str.length();i++){
            boolean isRepeted = false;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    isRepeted = true;
                    break;
                }
            }
            if(!isRepeted){
                System.out.println("Non repteting charcter is =>" + str.charAt(i));
            }
            System.out.println("No non repeting char found");
        }

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void countSubstringOccurrences() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "14. Count the Occurrences of a Substring in a String");
        // Your code here


        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findLongestPalindromeSubstring() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "15. Find the Longest Palindrome Substring in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void searchPatternInString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "16. Search for a Pattern in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findAllPermutationsOfString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "17. Find All Permutations of a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findAllPalindromicSubstrings() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "18. Find All Palindromic Substrings in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findSmallestWindowContainingAllCharacters() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "19. Find the Smallest Window Containing All Characters of Another String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkIfStringFollowsPattern() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "20. Check if a String Follows a Specific Pattern");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    // STRING TRANSFORMATIONS
    static void compressString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "21. Compress a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void expandCompressedString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "22. Expand a Compressed String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void convertCamelCaseToSnakeCase() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "23. Convert CamelCase to Snake_Case");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void convertSnakeCaseToCamelCase() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "24. Convert Snake_Case to CamelCase");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void transformToLexicographicallySmallestRotation() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "25. Transform a String to its Lexicographically Smallest Rotation");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    // STRING TRANSFORMATIONS (Continued)
    static void rearrangeStringWithoutAdjacentDuplicates() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "26. Rearrange String to Avoid Adjacent Duplicates");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void convertToTitleCase() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "27. Convert a String to Title Case");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void performRunLengthEncoding() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "28. Perform Run-Length Encoding on a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void reverseWordsInSentence() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "29. Reverse Words in a Sentence");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void replaceCharacterInString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "30. Replace a Character in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    // STRING PARSING (Continued)
    static void extractNumbersFromString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "31. Extract All Numbers from a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void validateEmailUsingRegex() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "32. Validate Email Addresses Using Regex");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void evaluateNestedBrackets() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "33. Evaluate Nested Brackets in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void convertRomanToInteger() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "34. Convert Roman Numerals to an Integer");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void validatePalindromeIgnoringSpecialCharacters() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "35. Validate Palindrome Ignoring Special Characters");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void parseStringToGenerateJSON() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "36. Parse a String to Generate a JSON Representation");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void matchWildcardPattern() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "37. Match a String with a Wildcard Pattern");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void parseMathematicalExpression() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "38. Parse and Evaluate a Mathematical Expression from a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void splitStringIntoBalancedStrings() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "39. Split a String into Balanced Strings");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void validateIPAddress() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "40. Validate if a String is a Valid IPv4 or IPv6 Address");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    // STRING AND DATA STRUCTURES (Continued)
    static void groupAnagrams() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "41. Group Anagrams from a List of Strings");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findSmallestWindowContainingAnotherString() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "42. Find the Smallest Window Containing Another String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void sortCharactersByFrequency() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "43. Sort Characters in a String by Frequency");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findKMostFrequentCharacters() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "44. Find the K Most Frequent Characters in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void implementTrieAndPrefixMatching() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "45. Implement a Trie and Perform Prefix Matching");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void checkIfStringsAreIsomorphic() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "46. Check if Two Strings are Isomorphic");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findLongestRepeatedSubstring() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "47. Find the Longest Repeated Substring in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void determineMinDeletionsForAnagram() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "48. Determine Minimum Deletions to Make Two Strings Anagrams");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void generateAllValidIPAddresses() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "49. Generate All Valid IP Addresses from a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    static void findMostFrequentCharacter() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "50. Find the Most Frequent Character in a String");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


}

