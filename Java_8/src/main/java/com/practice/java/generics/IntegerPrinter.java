package com.practice.java.generics;

public class IntegerPrinter {

    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(45);
        printer.print();

    }


}
