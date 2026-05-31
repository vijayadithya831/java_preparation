package com.practice.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferencesDemo {
    
    @FunctionalInterface
    interface Printable {
        void print(String msg);
    }

    public void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {

//        1. Method reference to a static method.
//        Lambda implementation first
        Function<Integer, Double> function = input -> Math.sqrt(input);
        System.out.println(function.apply(25));
//        change into method reference later
        Function<Integer, Double> functionMethodReference = Math::sqrt;
        System.out.println(functionMethodReference.apply(49));

//        BiFunction Lambda example
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.add(a,b);
        System.out.println(biFunctionLambda.apply(10,20));

//        BiFunction Method Reference implementation
        BiFunction<Integer, Integer, Integer> biFunctionRef = MethodReferencesDemo::add;
        System.out.println(biFunctionRef.apply(30,50));

//        2. Method reference to an instance method of a particular object.
        MethodReferencesDemo object1 = new MethodReferencesDemo();

//        Implement lambda first using a printable interface.
        Printable printable = s -> object1.display(s);
        printable.print("hello mother father");

//        Convert to method refernce.
        Printable printable1 = object1::display;
        printable1.print("surprise mother father");

//        3. Reference to an instance method of an arbitrary object of specific type
//        lambda implementation
        Function<String, String> stringFunction = input -> input.toLowerCase();
        System.out.println(stringFunction.apply("HELLO MOTHERF*CKER!!"));

//        Method reference try
        Function<String, String> stringMethodRef = String::toLowerCase;
        System.out.println(stringMethodRef.apply("SURPRISE MOTHERF*CKER!!"));



    }

}
