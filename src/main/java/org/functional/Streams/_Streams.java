package org.functional.Streams;

import org.functional.Students;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.functional.Students.Gender.FEMALE;
import static org.functional.Students.Gender.MALE;

public class _Streams {


    public static <R> void main(String[] args) {
        List<Students> studentsList = List.of(
                new Students("Alice", 20, FEMALE, 85.5),
                new Students("Bob", 21, MALE, 90.2),
                new Students("Catherine", 19, FEMALE, 92.3),
                new Students("David", 22, MALE, 88.7),
                new Students("Eva", 20, FEMALE, 81.1),
                new Students("Frank", 21, MALE, 87.5),
                new Students("Grace", 19, FEMALE, 89.8),
                new Students("Harry", 22, MALE, 93.0),
                new Students("Ivy", 20, FEMALE, 84.4),
                new Students("Jack", 21, MALE, 86.9)
        );

        studentsList.forEach(students -> {
            Double marks = students.getMarks();
            System.out.println(marks);

        });


        System.out.println("//-------------------------------1. Starts Here-------------------------------------------------------//");
        //1. Create a stream from a list of integers and filter out even numbers.
        System.out.println("1. Create a stream from a list of integers and filter out even numbers." +
                "Use filter to remove even numbers and collect the result in a list.");
        List<Integer> integerList = List.of(
                1, 2, 4, 7, 9, 10, 15, 21, 24, 32
        );

        integerList.stream().filter(num -> num % 2 == 0).toList()
                .forEach(System.out::println);
        System.out.println("//-------------------------------1. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------2. Starts Here-------------------------------------------------------//");
        System.out.println("Given a list of strings, filter out those that start with the letter \"a\" (case-insensitive), " +
                "convert them to uppercase, and collect the results in a list.");

        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "orange");

        words.stream()
                .filter(wordsList -> wordsList.startsWith("a"))
                .map(String::toUpperCase)
                .toList()
                .forEach(System.out::println);
        System.out.println("//-------------------------------2. Ends Here -------------------------------------------------------//");

        System.out.println();

        System.out.println("//-------------------------------3. Starts Here-------------------------------------------------------//");
        System.out.println(" Using the reduce function, find the sum of all even numbers in a list.");

        List<Integer> nums = Arrays.asList(3, 8, 15, 16, 23, 42);

     int sum =    nums.stream().filter(num -> num%2 == 0)
                        .toList()
                .stream().reduce(0 , (accumulatedSum, currentElement) -> accumulatedSum + currentElement)
                              ;
        System.out.println("Sum of Even numbers is "+ sum) ;

        System.out.println("//-------------------------------3. Ends Here -------------------------------------------------------//");

        System.out.println();

        System.out.println("//-------------------------------4. Starts Here-------------------------------------------------------//");
        System.out.println("Given a list of people, group them by age and count how many people belong to each age group.");


        List<Person> people = Arrays.asList(
                new Person("Alice", 23),
                new Person("Bob", 30),
                new Person("Charlie", 23),
                new Person("CharlieTwo", 28),
                new Person("David", 30),
                new Person("Eve", 25)
        );

        Map<Integer, Long> collect = people.stream().collect(Collectors.groupingBy(
                person -> person.age,
                Collectors.counting()
        ));

        collect.forEach((age,cont) ->System.out.println("For age - " + age + " Count is - " + cont));

        System.out.println("//-------------------------------4. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------5. Starts Here-------------------------------------------------------//");
        System.out.println("Find the person with the longest name in the list.");

        List<String> names = Arrays.asList("Samanthing", "AlexanderTing", "John", "Elizabet", "Charlieyi");

        Optional<String> longestName = names.stream().max((name1,name2)-> Integer.compare(name1.length() , name2.length()));

        System.out.println("Longest Name is : " + longestName + " With Size of " + longestName.get().length());

        System.out.println("Trying to find second largest name here ");


        Optional<String> secondLargest = names.stream().
                sorted((name3,name4) -> Integer.compare(name4.length(),name3.length()))
                        .skip(1)
                                .findFirst();


        System.out.println("Second largest name is : " + secondLargest + " With length -> " + secondLargest.get().length());
        System.out.println("Trying to find second largest name here ");
        System.out.println("//-------------------------------5. Ends Here -------------------------------------------------------//");

        System.out.println();

        System.out.println("//-------------------------------6. Starts Here-------------------------------------------------------//");
        System.out.println("Given a list of sentences, convert it to a list of all unique words (ignoring case).");

        List<String> sentences = Arrays.asList("Hello World", "Hello Java", "Stream API is powerful");

        Set<String> collect1 = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(collect1);

        System.out.println("//-------------------------------6. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------7. Start Here -------------------------------------------------------//");

        System.out.println("Partition a list of integers into two groups: even and odd numbers.");
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = numList.stream().filter(nu -> nu % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = numList.stream().filter(nu -> nu % 2 != 0).collect(Collectors.toList());
        System.out.println("Even = " + even);
        System.out.println("odd = " + odd);

        Map<Boolean, List<Integer>> collect2 = numList.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even numbers from Collect " + collect2.get(true));
        System.out.println("Odd numbers " + collect2.get(false));


        System.out.println("//-------------------------------7. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------8. Start Here -------------------------------------------------------//");

        System.out.println("Check if there is at least one person over the age of 18, and if all people are younger than 50.");

        List<Person> peopleTwo = Arrays.asList(
                new Person("Tom", 15),
                new Person("Jerry", 18),
                new Person("Spike", 20),
                new Person("Tyke", 12)
        );

        boolean b = peopleTwo.stream().anyMatch(person -> person.age > 18);
        System.out.println(b);

        boolean b1 = peopleTwo.stream().allMatch(person -> person.age < 50);

        System.out.println(b1);

        System.out.println("//-------------------------------8. Ends Here -------------------------------------------------------//");

        System.out.println();

        System.out.println("//-------------------------------9. Start Here -------------------------------------------------------//");
        System.out.println("Get the first three elements of a list after skipping the first two elements.");

        List<Integer> nu = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

         nu.stream().skip(2).limit(3)
        .forEach(System.out::println);
        System.out.println("//-------------------------------9. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------10. Starts Here -------------------------------------------------------//");

        System.out.println("Sort a list of strings based on their lengths in descending order.");

        List<String> fruits = Arrays.asList("apple", "kiwi", "banana", "grapefruit", "pear");

         fruits.stream().
                 sorted((num1, num2) -> Integer.compare(num2.length(), num1.length()))
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
         System.out.println("//-------------------------------10. Ends Here -------------------------------------------------------//");

        System.out.println();


        System.out.println("//-------------------------------Incedo Question Starts Here-------------------------------------------------------//");

        System.out.println("Merge Two list of Integers and remove duplicates using Steams");

        List<Integer> num1List = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> num2List = Arrays.asList(1, 2, 3, 4, 9, 10, 11, 12, 13, 14);

        List<Integer> newList = new ArrayList<>();

        newList = Stream.concat(num1List.stream(), num2List.stream()).distinct().toList();

        System.out.println(newList);

        System.out.println("//-------------------------------Incedo Question Ends Here -------------------------------------------------------//");


    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
