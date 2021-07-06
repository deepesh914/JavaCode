package Threads;

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread start");
		//Display d = new Display();
		Display d1 = new Display();
		Display d2 = new Display();
		MySynchronizedThread t1 = new MySynchronizedThread(d1, "T1");
		MySynchronizedThread t2 = new MySynchronizedThread(d2, "T2");
		t1.start();
		t2.start();
		//System.out.println("Main Thread end");
	}

}

class MySynchronizedThread extends Thread{
	Display d;
	String name;
	public MySynchronizedThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}

class Display{

	public synchronized void wish(String name) {
		for (int i = 0; i <=10; i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
}