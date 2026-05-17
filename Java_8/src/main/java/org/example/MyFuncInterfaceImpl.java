package org.example;

@FunctionalInterface
interface MyFuncInterface {
    void product(int a, int b);

    default void print() {
        System.out.println("Hello World");
    }

    static void  printStatic() {
        System.out.println("Hello, Static World");
    }
}

 public class MyFuncInterfaceImpl {
    public static void main(String[] args) {
        MyFuncInterface func = (a,b) -> { System.out.println(a*b); };
        func.product(10,23);
        func.print();
        MyFuncInterface.printStatic();
    }
 }