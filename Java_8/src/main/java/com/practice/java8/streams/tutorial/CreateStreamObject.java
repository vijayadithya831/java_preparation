package com.practice.java8.streams.tutorial;

import java.util.*;
import java.util.stream.*;

public class CreateStreamObject {

    public static void main(String[] args) {
//        Create a stream
        Stream<String> stream1 = Stream.of("a", "b", "c");
        stream1.forEach(System.out::println);

//        Create a stream from source
        Collection<String> collection = Arrays.asList("Java", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("Java 8", "Jakarta", "Spring Boot", "JPA Repository");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        String[] strArray = {"d", "e", "f"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);

    }

}
