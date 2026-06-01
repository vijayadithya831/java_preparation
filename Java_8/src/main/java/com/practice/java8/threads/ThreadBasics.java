package com.practice.java8.threads;

class Class1 implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hi from Class1");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Class2 implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hi from Class2");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadBasics {

    public static void main(String[] args) {

        Runnable obj1 = new Class1();
        Runnable obj2 = new Class2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();

//        System.out.println("Thread priority for obj1: " + obj1.getPriority());
//        System.out.println("Thread priority for obj2: " + obj2.getPriority());
//        System.out.println("Thread priority constant: " + Thread.MAX_PRIORITY);
//        System.out.println("Thread priority constant: " + Thread.MIN_PRIORITY);
//        System.out.println("Thread priority constant: " + Thread.NORM_PRIORITY);

    }
    
}
