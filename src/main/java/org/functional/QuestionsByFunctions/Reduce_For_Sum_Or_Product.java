package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;

public class Reduce_For_Sum_Or_Product {

    public static void main(String[] args) {

        System.out.println("Problem: Given a list of integers, use the reduce method to calculate the product of all the numbers.");

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

    Integer sum =  numbers.stream().reduce(1,(element1,element2)-> element1 * element2);
        System.out.println(sum);

    }
}
