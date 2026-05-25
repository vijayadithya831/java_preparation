package com.practice.java8;

//class Class3 implements Runnable {
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Hi from Class3");
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//class Class4 implements Runnable {
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Hi from Class4");
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

// Commented out class3 and class4 coz we don't need them anymore after implementing lambda for runnable interface

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws  InterruptedException {

        Counter counter = new Counter();

        Runnable obj1 = () -> {
            System.out.println("Thread 1 started");
            for(int i=1;i<=10000;i++) {
                counter.increment();
            }
            System.out.println("Thread 1 finished");
        };
        Runnable obj2 = () -> {
            System.out.println("Thread 2 started");
            for(int i=1;i<=10000;i++) {
                counter.increment();
            }
            System.out.println("Thread 2 finished");
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count value: " + counter.count);

/*
        System.out.println("Thread priority for obj1: " + obj1.getPriority());
        System.out.println("Thread priority for obj2: " + obj2.getPriority());
        System.out.println("Thread priority constant: " + Thread.MAX_PRIORITY);
        System.out.println("Thread priority constant: " + Thread.MIN_PRIORITY);
        System.out.println("Thread priority constant: " + Thread.NORM_PRIORITY);
*/

    }



}
