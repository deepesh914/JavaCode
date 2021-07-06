package com.DS_StackAndQueue;

public class QueueTest {

	public static void main(String[] args) {

		Queue que = new Queue(5);
		que.enQueue(1);
		que.enQueue(2);
		que.enQueue(3);
		que.enQueue(4);
		que.enQueue(5);
		que.enQueue(6); // Queue is Full
		
		while(!que.isEmpty())
		System.out.println(que.deQueue());
		
		que.deQueue(); // Queue is Empty
	}
}
