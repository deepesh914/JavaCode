package Threads;

public class StopThread {

    public static void main(String[] args) throws InterruptedException {
        MyThreadStop t = new MyThreadStop();
        t.start();
        // Thread.currentThread().sleep(1);
        // Thread.currentThread().stop();
    }

}


class MyThreadStop extends Thread {

    static StopThread stopThread;

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " start " + i);
            if (i == 500) {
                Thread.currentThread().stop();
            }
        }
    }
}
