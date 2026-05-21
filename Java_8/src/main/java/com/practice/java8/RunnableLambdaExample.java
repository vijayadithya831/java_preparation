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

// Commented out class3 and class4 coz we dont need them anymore after implementing lambda for runnable interface

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hi from Class3");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hi from Class4");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

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
