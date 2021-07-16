package Threads;

import java.util.LinkedList;

public class ProducerConsumer {

    public static void main(String[] args) {
        final PCDemo1 demo = new PCDemo1();

        Thread demo1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    demo.produce();
                } catch (Exception e) {
                    System.out.println("Exception");
                }

            }
        });

        Thread demo2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    demo.consume();
                } catch (Exception e) {
                    System.out.println("Exception occurred");
                }

            }
        });

        demo1.start();
        demo2.start();

    }

}


class PCDemo1 {
    static LinkedList<Integer> list     = new LinkedList<>();

    int                        capacity = 2;

    public void produce() {
        int value = 0;
        while (true) { // NOSONAR
            synchronized (this) {

                while (list.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producer produced value: " + value);

                list.add(value++);

                notify();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void consume() {

        while (true) { // NOSONAR
            synchronized (this) {
                while (list.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int val = list.removeFirst();
                System.out.println("Consumed Value: " + val);
                notify();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
