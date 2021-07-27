package Threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {

    public static void main(String[] args) {

        ExecutorService exe = Executors.newFixedThreadPool(4);
        CountDownLatch latch = new CountDownLatch(3);
        exe.submit(new DependentServices(latch));
        exe.submit(new DependentServices(latch));
        exe.submit(new DependentServices(latch));

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exe.shutdown();
        System.out.println("All depedent service initialized");

    }
}


class DependentServices implements Runnable {
    private CountDownLatch latch;

    public DependentServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Hello Thread: ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        System.out.println("After Completing Task of thread ");
    }
}
