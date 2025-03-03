package org.functional.Streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractise {

    public static void main(String[] args) {

//        Check if a number is even
//        Test Data: 4, 7, 10, 13, 16
        Predicate<Integer> isEven = x -> x %2 ==0 ;
        System.out.println(isEven.test(10));

//        Check if a string starts with "J"
//        Test Data: "Java", "Python", "JavaScript", "C++", "JVM"
        Predicate<String> startsWithJ = x -> x.startsWith("J") ;
        System.out.println(startsWithJ.test("Java"));

//        Check if a list contains a number greater than 50
//        Test Data: [10, 20, 30, 40, 55, 60]
        List<Integer> ara = Arrays.asList(10, 20, 30, 40, 55, 60);
        Predicate<Integer> containsNumberGraterThan50 = x ->  x >50;
        System.out.println(ara.stream().anyMatch(containsNumberGraterThan50));

//        Filter out all names that have more than 5 characters
//        Test Data: ["John", "Michael", "Sara", "Alex", "Christopher"]


 //       Check if a given number is a prime number
 //       Test Data: 2, 4, 7, 9, 11, 13, 15, 17

 //       Check if a string contains only lowercase letters
 //      Test Data: "hello", "WORLD", "Java8", "predicate", "lambda"

//        Check if a person is eligible to vote (age >= 18)
//        Test Data: [15, 18, 21, 17, 35, 16]

//        Check if an email is valid (contains '@' and '.' and length > 5)
//        Test Data: "test@gmail.com", "user@domain", "abc@xyz.com", "invalidEmail", "hello@world.com"

//        Check if an integer array has at least one negative number
//        Test Data: [1, 2, 3, -4, 5], [10, 20, 30, 40, 50], [-1, -2, -3, 4, 5]


    }


}
