package com.practice.java8.functional.binary;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

// Traditional way of implementing functional interfaces
public class BiFunctionDemo {



    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (t,u) -> t+u;
//        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        System.out.println("BiFunction Output: " + biFunction.apply(10,20));
        System.out.println("BiFunction Output: " + biFunction.apply(100,200));

        Function<Integer, Integer> square = n -> n*n;

        System.out.println(biFunction.andThen(square).apply(20,35));

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");
        map.put(4,"Go");
        map.put(5,"Spring");

        // map.forEach method takes BiConsumer Functional interface as parameter
        map.forEach((k,v) -> {
            System.out.println("Key: " + k);
            System.out.println("Value: " + v);
        });

    }
}
