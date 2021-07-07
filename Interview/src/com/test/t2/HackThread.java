package com.test.t2;

public class HackThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Hello");
            }
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        HackThread h1 = new HackThread();
        HackThread h2 = new HackThread();
        h1.start();
        try {
            h1.join();
        } catch (Exception e) {
            System.out.println("hi");
        }
        h2.start();
    }

}
