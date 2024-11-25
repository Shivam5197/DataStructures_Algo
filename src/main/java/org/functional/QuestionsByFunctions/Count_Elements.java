package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;

public class Count_Elements {

    public static void main(String[] args) {

        System.out.println("Problem: Given a list of words, count the number of words that start with the letter \"A\".");

        List<String> words = Arrays.asList("Apple", "banana", "Avocado", "Grape", "apricot", "orange", "Almond");

        long count = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.startsWith("A")).count();
        System.out.println(count);

        long count2 = words.stream()
                .filter(word -> word.toLowerCase().startsWith("a")) // Case-insensitive filtering
                .count();

        System.out.println(count2);

    }
}
