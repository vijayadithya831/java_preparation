package com.practice.java8.functional.unary;

import java.time.LocalDateTime;
import java.util.function.*;

/*
class FunctionDemo implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
*/

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        /*Normal method
        Function<String, Integer> function = new FunctionDemo();
        System.out.println(function.apply("Hellow Brotha!"));*/
//        Lambda
        Function<String,Integer> function = s -> s.length();
        System.out.println(function.apply("This is a sentence!"));

        Consumer<String> consumer = s ->  System.out.println(s);
        consumer.accept("This is a sentence!");

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        Predicate<String> predicate = s -> s.length() > 5;
    }

}
