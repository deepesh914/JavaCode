package com.test.t2;

public class ThreadMain {

    public static void main(String[] args) {
        int a = 2;
        int n = a + a * a - a;
        for (int i = 0; i < n; i++) {
            Thread obj = new Thread(new ABCD());
            obj.start();

        }

    }

}


class ABCD implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }

}
