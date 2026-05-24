package com.practice.java8;

//public class MultiThreadingFull extends Thread {
public class MultiThreadingFull implements Runnable {

    private int threadNo;
    public MultiThreadingFull(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNo);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Occured" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        for(int i=0;i<=3;i++) {
            MultiThreadingFull object1 = new MultiThreadingFull(i);
            Thread t1 = new Thread(object1);
            t1.start();
        }
//        throw new RuntimeException();

    }

    public int getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(int threadNo) {
        this.threadNo = threadNo;
    }
}
