package com.test.t1;

class TestSeven extends Thread {

    private static int x;

    public synchronized void doThings() {
        int current = x;
        current++;
        x = current;
        System.out.println("2");
    }

    public void run() {
        doThings();
        System.out.println("1");
    }
}


public class TestThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.run();
        // t.start();
    }
}
