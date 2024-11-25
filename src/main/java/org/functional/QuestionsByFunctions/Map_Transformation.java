package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Transformation {

    public static void main(String[] args) {
        System.out.println("Given a list of strings, convert each string to uppercase using the map function.");

        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "orange");

        words.stream()
                .map(word -> word.toUpperCase())
                .forEach(System.out::println);

    }
}
