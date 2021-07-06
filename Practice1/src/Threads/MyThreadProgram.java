package Threads;

public class MyThreadProgram {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}

class MyThread extends Thread{
	
	public void run(){
		System.out.println("Start");
	}
}