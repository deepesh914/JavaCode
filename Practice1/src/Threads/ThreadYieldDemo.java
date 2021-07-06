package Threads;

public class ThreadYieldDemo {

    public static void main(String[] args) throws InterruptedException {

        MyYield t = new MyYield();
        Thread.currentThread().setPriority(8);
        t.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Parent Thread : " + i);
        }
    }

}


class MyYield extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child Thread : " + i);
            Thread.yield();
        }
    }

}
