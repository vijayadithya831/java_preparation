package com.practice.java8;

import java.util.function.Function;

@FunctionalInterface
interface MyFuncInterface {
    void product(int a, int b);

    default void printHello() {
        System.out.println("Hello!");
    }

    default void print(String text) {
        System.out.println("Printing Text: " + text);
    }

    static void  printStatic() {
        System.out.println("Hello, Static World");
    }
}

 public class MyFuncInterfaceImpl {
    public static void main(String[] args) {
        MyFuncInterface func1 = (a,b) -> {
            System.out.println("Inside func1 Lambda!");
            System.out.println("Product: " + a*b);
        };
        func1.product(10,23);
        func1.print("Hellow Brotha!");
        printFunction(func1);

        MyFuncInterface func2 = (a,b) -> {
            System.out.println("Inside func2 Lambda!");
            System.out.println("Product: " + a*b);
        };
        func2.product(29,17);
        func2.print("Hellow Sista!");

        printFunction((a,b) -> {
            System.out.println("Inside func2 Lambda!");
            System.out.println("Product: " + a*b);
        }); // passing an entire lambda expression as method parameter.
    }


    public static void printFunction(MyFuncInterface func) {
        func.printHello();
        MyFuncInterface.printStatic();
    }
 }