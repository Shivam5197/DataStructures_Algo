package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByPredicate {

    public static void main(String[] args) {
        System.out.println("Problem: Given a list of numbers, partition them into two lists: one with even numbers and one with odd numbers.");

        List<Integer> numbers = Arrays.asList(12, 17, 19, 24, 32, 45, 55, 68, 73, 88);

        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(num-> num%2 ==0));

        List<Integer> even = partitionedNumbers.get(true);
        List<Integer> odd = partitionedNumbers.get(false);


        System.out.println("Even Number are = " + even);
        System.out.println("Odd Number are = " + odd);

    }
}
