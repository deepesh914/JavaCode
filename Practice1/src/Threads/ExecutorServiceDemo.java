package Threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    private static final int MAX_T = 2;

    public static void main(String[] args) {

        Runnable task1 = new Executer("Thread 1");
        Runnable task2 = new Executer("Thread 2");
        Runnable task3 = new Executer("Thread 3");
        Runnable task4 = new Executer("Thread 4");
        Runnable task5 = new Executer("Thread 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);

        pool.shutdown();

    }

}


class Executer implements Runnable {

    private String name;

    public Executer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    Date d = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for " + name + " = " + sd.format(d));
                } else {
                    Date d = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Excution Time for " + name + " = " + sd.format(d));
                }
                Thread.sleep(2000);
            }
            System.out.println(name + ":Task Completed");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }

}
