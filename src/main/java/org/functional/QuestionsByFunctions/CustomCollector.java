package org.functional.QuestionsByFunctions;

import java.util.*;
import java.util.stream.Collectors;

public class CustomCollector {

    public static void main(String[] args) {
        System.out.println("Problem: Write a custom collector to collect elements from a stream into a Map<String, List<Integer>>," +
                " where the key is the length of the string and the value is a list of all integers with that string length.");

        List<String> words = Arrays.asList("one", "three", "four", "seven", "eight", "ten");

        Map<Integer, List<String>> lengthToWordsMap = words.stream()
                .collect(Collectors.toMap(
                        String::length,          // Key: length of the string
                        word -> Collections.singletonList(word),
                        // Value: List containing the word
                        (existing, replacement) -> { // Merge function to handle duplicates
                            List<String> combined = new ArrayList<>(existing);
                            combined.addAll(replacement);
                            return combined;
                        }
                ));



        // Print the result
        System.out.println("Map of string lengths to words:");
        lengthToWordsMap.forEach((length, wordList) ->
                System.out.println("Length " + length + ": " + wordList)
        );

    }
}
