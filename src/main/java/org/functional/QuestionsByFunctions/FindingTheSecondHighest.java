package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingTheSecondHighest {
    public static void main(String[] args) {

        System.out.println("Problem: Given a list of integers, find the second highest number using streams.");

        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 25, 30);

    Optional<Integer> secondHighest =       numbers.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .stream()
            .skip(1)
                    .findFirst();

        System.out.println(secondHighest);


    }
}
