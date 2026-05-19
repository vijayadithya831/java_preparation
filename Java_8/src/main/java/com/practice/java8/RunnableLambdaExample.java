package com.practice.java8;

class ThreadDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Run method called at thread: " + Thread.currentThread().getName());
    }
}

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());
        Thread t3 = new Thread(new ThreadDemo());
        Thread t4 = new Thread(new ThreadDemo());
        Thread t5 = new Thread(new ThreadDemo());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
