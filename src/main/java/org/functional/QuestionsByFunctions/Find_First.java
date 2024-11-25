package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_First {
    public static void main(String[] args) {

        System.out.println("Given a list of numbers, find the first number greater than 50.");

        List<Integer> numbers = Arrays.asList(10, 35, 47, 58, 63, 75, 23);

        Optional<Integer> firstNumberGreaterThan50InTheList =  numbers.stream().filter(num -> num >50).findFirst();

        System.out.println(firstNumberGreaterThan50InTheList);
    }
}
