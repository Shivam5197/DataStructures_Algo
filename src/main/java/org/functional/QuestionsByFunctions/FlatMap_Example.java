package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Example {
    public static void main(String[] args) {

        System.out.println("Given a list of lists of integers, flatten it into a single list of integers.");

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        listOfLists.stream().flatMap(List::stream).toList().forEach(System.out::println);
    }
}
