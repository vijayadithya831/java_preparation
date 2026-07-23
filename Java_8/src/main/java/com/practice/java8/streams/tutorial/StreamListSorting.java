package com.practice.java8.streams.tutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamListSorting {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        // Using Comparator.naturalOrder()/reverseOrder() methods
        fruits.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        // Using Lambda to define Comparable functional interface
        fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .forEach(System.out::println);

    }

}
