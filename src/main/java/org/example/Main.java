package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Create a new HashSet
        Set<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(1);
        numbers.add(112);
        numbers.add(11);
        numbers.add(3);
        numbers.add(14);

        // Try to add a duplicate
        numbers.add(1);

        // List the Set
        System.out.println(numbers);

        // ----------------------------------------

        // Create a new HashSet
        Set<Student> students = new HashSet<>();

        // Add some students
        students.add(new Student("Luke", 16));
        students.add(new Student("Evan", 10));
        students.add(new Student("Jayson", 12));
        students.add(new Student("Jonathan", 14));
        students.add(new Student("Elizabeth", 19));
        students.add(new Student("Levi", 21));

        // Try to add a duplicate
        students.add(new Student("Jayson", 12));

        // Print the Set
        students.stream().forEach(student -> System.out.println(student));
    }
}