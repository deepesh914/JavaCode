package Threads;

public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyJoinThread.mt = Thread.currentThread();
		MyJoinThread t = new MyJoinThread();
		t.start();
		//t.join(); //Both threads are waiting for each other(Infinite time) to release the lock.
		for (int i = 0; i <= 10; i++) {
			System.out.println("Parent : "+i);
			Thread.sleep(500);
		}

	}

}

class MyJoinThread extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int j = 0; j <=10; j++) {
			System.out.println("Child : "+j);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}