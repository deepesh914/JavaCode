package com.DS_StackAndQueue;

public class Queue {

	int front;
	int rear;
	int[] arr;
	int maxSize;
	
	Queue(int size){
		this.front=0;
		this.rear=-1;
		this.arr = new int[size];
		this.maxSize = size;
	}
	
	public void enQueue(int data){
		if(!isFull()){
			arr[++rear] = data;
		}
		else{
			System.out.println("Queue is Full");
		}
	}
	public int deQueue(){
		int data=0;
		if(!isEmpty()){
			data = arr[rear--];
		}
		else{
			System.out.println("Queue is Empty");
		}
		return data;
	}
	public boolean isEmpty(){
		return (front>rear);
	}
	public boolean isFull(){
		return (rear==(maxSize-1));
	}
}
