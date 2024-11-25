package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prime_Number_Filtering {

    public static void main(String[] args) {

        System.out.println("Problem: Given a list of integers, filter out only prime numbers");

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 19, 20);


        numbers.stream()
                .filter(Prime_Number_Filtering::isPrime)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

    static boolean isPrime(int num ){
        if (num <= 1) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true; // The number is prime
    }
}
