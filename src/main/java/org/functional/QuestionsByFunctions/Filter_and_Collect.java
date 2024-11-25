package org.functional.QuestionsByFunctions;

import java.util.List;
import java.util.stream.Collectors;

public class Filter_and_Collect {

    public static void main(String[] args) {

        System.out.println("Given a list of integers, filter out all even numbers and collect them into a new list.");

        List<Integer> integerList = List.of(
                1, 2, 4, 7, 9, 10, 15, 21, 24, 32
        );

      List<Integer> newList  =  integerList.stream().filter(num -> num%2 ==0)
                .toList();

        System.out.println(newList);
    }
}
