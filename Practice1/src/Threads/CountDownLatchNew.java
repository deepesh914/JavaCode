package Threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchNew {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(4);
        worker first = new worker(1000, latch, "Worker-1");
        worker second = new worker(1000, latch, "Worker-2");
        worker third = new worker(1000, latch, "Worker-3");
        worker fourth = new worker(1000, latch, "Worker-4");

        first.start();
        second.start();
        third.start();
        fourth.start();

        first.join();
        second.join();
        third.join();
        fourth.join();

        latch.await();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}


class worker extends Thread {
    private int            delay;
    private CountDownLatch latch;

    public worker(int delay, CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
