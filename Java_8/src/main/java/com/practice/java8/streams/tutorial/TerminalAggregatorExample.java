package com.practice.java8.streams.tutorial;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalAggregatorExample {
    public static void main(String[] args) {

        Stream<Integer> numberStream = Stream.of(1,2,3,4,5,6,7,8,9);

//        long count = numberStream.count();
//        System.out.println("count: " + count);

//        Optional<Integer> minNumber = numberStream.min(Integer::compareTo);
//
//        minNumber.ifPresentOrElse((x) -> System.out.println("minNumber: " + x), () -> System.out.println("No Elements Present"));

        Optional<Integer> maxNumber = numberStream.max(Integer::compareTo);

        maxNumber.ifPresentOrElse((x) -> System.out.println("minNumber: " + x), () -> System.out.println("No Elements Present"));

    }
}
