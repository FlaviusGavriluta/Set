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
    }
}