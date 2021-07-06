package Threads;

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		Display1 d = new Display1();
		MySynchronized1 t1 = new MySynchronized1(d);
		MySynchronized2 t2 = new MySynchronized2(d);
		t1.start();
		t2.start();
	}

}

class Display1{
	public synchronized void dispalyn(){
		for (int i = 1; i <=10; i++) {
			System.out.println("Thread1: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void dispalyc(){
		for (int i = 65; i <=74; i++) {
			System.out.println("Thread2: "+(char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MySynchronized1 extends Thread{
	Display1 d;

	public MySynchronized1(Display1 d) {
		super();
		this.d = d;
	}
	public void run(){
		d.dispalyn();
	}
}

class MySynchronized2 extends Thread{
	Display1 d;

	public MySynchronized2(Display1 d) {
		super();
		this.d = d;
	}
	public void run(){
		d.dispalyc();
	}
}
