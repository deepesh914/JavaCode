package com.DS_StackAndQueue;

import java.util.Arrays;

public class CircularQueueImplementation {

    public static void main(String[] args) {

        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(8);
        circularQueue.enQueue(15);
        circularQueue.enQueue(16);
        circularQueue.enQueue(17);
        circularQueue.enQueue(18);
        circularQueue.enQueue(19);
        circularQueue.enQueue(20);
        circularQueue.enQueue(21);
        circularQueue.enQueue(22);
        System.out.println("Full circular queue" + circularQueue);
        System.out.println("Dequeued following elements from circular queue");
        System.out.println(circularQueue.deQueue() + " ");
        circularQueue.enQueue(23);
        System.out.println("After enqueuing circular queue with element having value 23");
        System.out.println(circularQueue);
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue);
        circularQueue.enQueue(24);
        System.out.println(circularQueue);
    }

}


class CircularQueue<E> {

    private int   currentSize;
    private int[] circularQueueElements;
    private int   maxSize;
    private int   front;
    private int   rear;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = new int[this.maxSize];
        currentSize = 0;
        front = 0;
        rear = 0;
    }

    // Enqueue element to rear
    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Circular Queue is full. Elements cannot be added");
        } else {
            circularQueueElements[rear] = item;
            rear = (rear + 1) % circularQueueElements.length;
            currentSize++;
        }
    }

    // Dequeue element from front
    public int deQueue() {
        int deQueueElement = 0;
        if (isEmpty()) {
            System.out.println("Circular Queue is empty, Elements cannot be retrieved");
        } else {
            deQueueElement = circularQueueElements[front];
            circularQueueElements[front] = -1;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
        }
        return deQueueElement;
    }

    // Check if queue is full
    public boolean isFull() {
        return (currentSize == circularQueueElements.length);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    @Override
    public String toString() {
        return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
    }

}
