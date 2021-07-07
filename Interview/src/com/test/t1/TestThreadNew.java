package com.test.t1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadNew {

    public static void main(String[] args) throws InterruptedException {

        // ExecutorService e = Executors.newCachedThreadPool();
        // e.submit(new ThreadRun());
        // e.execute(new ThreadRun());
        // e.shutdown();
        ExecutorService e1 = Executors.newFixedThreadPool(5);
        e1.submit(new ThreadRun());
        e1.execute(new ThreadRun());
        e1.submit(new ThreadRun());
        e1.execute(new ThreadRun());
        e1.submit(new ThreadRun());
        e1.execute(new ThreadRun());
        e1.submit(new ThreadRun());
        e1.execute(new ThreadRun());
        e1.shutdown();

    }
}


class ThreadRun implements Runnable {

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " : Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


class ThreadRun1 implements Callable {

    @Override
    public Object call() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
