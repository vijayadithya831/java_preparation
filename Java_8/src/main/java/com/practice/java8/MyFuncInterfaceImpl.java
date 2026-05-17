package com.practice.java8;

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
        MyFuncInterface func = (a,b) -> {
            System.out.println("Product: " + a*b);
        };
        func.product(10,23);
        func.printHello();
        func.print("Hellow Brotha!");
        MyFuncInterface.printStatic();
    }
 }