package com.practice.java8.methodreference;

import java.util.*;
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
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferencesDemo.add(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

//        BiFunction Method Reference implementation
        BiFunction<Integer, Integer, Integer> biFunctionRef = MethodReferencesDemo::add;
        System.out.println(biFunctionRef.apply(30, 50));

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

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        // sorting using lambda
//        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // using method reference.
        Arrays.sort(strArray, String::compareToIgnoreCase);


        for (String str : strArray) {
            System.out.print(str + ", ");
        }
        System.out.println();

        // 4. Reference to a constructor.
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Watermelon");

        Function<List<String>, Set<String>> setFunction = (input) -> new HashSet<>(input);
        setFunction.apply(fruits);

        System.out.println("fruits: " + setFunction.apply(fruits).getClass());

        Function<List<String>, LinkedList<String>> setFunction1 = LinkedList::new;

        setFunction1.apply(fruits);
        System.out.println("fruits: " + setFunction1.apply(fruits).getClass());

    }
}
