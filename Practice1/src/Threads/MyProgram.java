package Threads;

public class MyProgram {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		//t.start(); //RTE: java.lang.IllegalThreadStateException
		System.out.println("main");
	}

}

class MyThread1 extends Thread{
	
	public void start(){
		super.start();
		System.out.println("start");
	}
	
	public void run(){
		System.out.println("Run");
	}
}