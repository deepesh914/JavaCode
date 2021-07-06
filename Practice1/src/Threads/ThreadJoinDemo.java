package Threads;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyJoin t = new MyJoin();
		t.start();
		t.join(); //Main Thread calls
		for (int i = 0; i <=10; i++) {
			System.out.println("Parent : "+i);
		}
		
	}

}

class MyJoin extends Thread{
	public void run(){
		for (int i = 0; i <=10; i++) {
			System.out.println("Child : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
