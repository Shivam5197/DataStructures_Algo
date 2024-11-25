package org.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.functional.Students.Gender;

import static org.functional.Students.Gender.MALE;
import static org.functional.Students.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


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

        System.out.println("//Impreitive approcah to print females");
        //Impreitive approcah to print females

        List<Students> females = new ArrayList<>();
            for(Students students : studentsList ){
                if(FEMALE == students.getGender()){
                    females.add(students);
                }
            }
        for(Students female : females ){
            System.out.println(female);
            }



        System.out.println("//Declarative approach too Print Females");

        studentsList.stream().filter(students -> FEMALE == students.getGender())
                .toList()
                .forEach(System.out::println);


    }
}

