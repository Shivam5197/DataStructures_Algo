package org.functional.QuestionsByFunctions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_with_Streams {

    public static void main(String[] args) {

        System.out.println("Problem: Given a list of employee objects (with fields like name, age, and salary), sort the list by age and then by name.");


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 25, 55000),
                new Employee("Charlie", 30, 70000),
                new Employee("David", 22, 50000),
                new Employee("Eve", 25, 65000)
        );

List<Employee> sorted  = employees.stream()
                .sorted(
                Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
// Getters, toString(), etc.


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
