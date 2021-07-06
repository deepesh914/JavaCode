package Threads;

public class MyRunnableProgram {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        Thread.currentThread().setPriority(8);
        t.start();
        System.out.println("Main Thread");
        System.out.println("Child thread: " + t.getPriority());
        System.out.println("Main Thread: " + Thread.currentThread().getPriority());
    }
}


class MyRunnable implements Runnable {

    public synchronized void run() {
        System.out.println("Runnable interface thread");
    }
}